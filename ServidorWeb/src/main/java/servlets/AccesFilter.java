/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */
package servlets;

import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

/**
 *
 * @author dokgo
 */
@WebFilter(filterName = "AccesFilter", urlPatterns = {"/*"})
public class AccesFilter implements Filter {
    
    
    private ServicioWeb sys;

    
    private static final boolean debug = true; 
    
    private static long lastCleanupTime;
    private static final long CLEANUP_INTERVAL = 30L * 24L * 60L * 60L * 1000L;
    private static final int MAX_RECORDS = 10000;
    
    private FilterConfig filterConfig = null;
    
    public AccesFilter() {
        
        ServicioWeb_Service service = new ServicioWeb_Service();
        this.sys = service.getServicioWebPort();
    }
    
    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        if (debug) {
            log("AccesFilter:DoBeforeProcessing");
        }
    }
    
    private void doAfterProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        if (debug) {
            log("AccesFilter:DoAfterProcessing");
        }
    }
    
    private String getClientIp(HttpServletRequest request) {
        String ip = null;
        
        // Buscar en headers comunes de proxy
        String[] headerNames = {
            "X-Forwarded-For",
            "Proxy-Client-IP",
            "WL-Proxy-Client-IP",
            "HTTP_X_FORWARDED_FOR",
            "HTTP_X_FORWARDED",
            "HTTP_X_CLUSTER_CLIENT_IP",
            "HTTP_CLIENT_IP",
            "HTTP_FORWARDED_FOR",
            "HTTP_FORWARDED",
            "X-Real-IP"
        };
        
        for (String header : headerNames) {
            ip = request.getHeader(header);
            if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
                // X-Forwarded-For puede contener multiple IPs (cliente,proxy1,proxy2,...), tomar la primera
                if (ip.contains(",")) {
                    ip = ip.split(",")[0].trim();
                }
                break;
            }
        }
        
        // Si no se encontró en los headers, usar remoteAddr
        if (ip == null) {
            ip = request.getRemoteAddr();
        }
        
        // Normalizar localhost IPv6 a IPv4
        if (ip.equals("0:0:0:0:0:0:0:1") || ip.equals("::1")) {
            ip = "127.0.0.1";
        }
        
        return ip;
    }
    
    private boolean shouldRunCleanup() {
        long currentTime = System.currentTimeMillis();
        if (lastCleanupTime == 0) {
            // Si es la primera vez, establecemos el tiempo inicial
            // para que la primera limpieza ocurra en 30 días
            lastCleanupTime = currentTime;
            return false;
        }
        
        if (currentTime - lastCleanupTime >= CLEANUP_INTERVAL) {
            lastCleanupTime = currentTime;
            if (debug) {
                log("Iniciando limpieza programada de 30 días en: " + new java.util.Date());
            }
            return true;
        }
        return false;
    }
    
    private void cleanupOldRecords() {
        try {
            sys.borrarRegistrosAcceso();
            if (debug) {
                log("Limpieza de registros completada en: " + new java.util.Date());
            }
        } catch (Exception e) {
            if (debug) {
                log("Error al limpiar registros antiguos: " + e.getMessage());
            }
        }
    }
    

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        
//        String ip = httpRequest.getRemoteAddr();
        
        boolean canAddRecord = true;
        try {
            sys.obtenerTotalRegistros();
            // Si la cantidad de registros es mayor o igual a 10000, no agregamos más
            if (sys.obtenerTotalRegistros() >= MAX_RECORDS) {
                canAddRecord = false;
                if (debug) {
                    log("Límite de registros alcanzado (" + MAX_RECORDS + "). No se agregarán más registros hasta la próxima limpieza.");
                }
            }
        } catch (Exception e) {
            if (debug) {
                log("Error al verificar total de registros: " + e.getMessage());
            }
            // En caso de error, permitimos agregar el registro por seguridad
            canAddRecord = true;
        }
        
        if(canAddRecord){
            String ip = getClientIp(httpRequest);

            String url = httpRequest.getRequestURL().toString();

            String userAgent = httpRequest.getHeader("User-Agent");

            String browser = "Desconocido";
            String os = "Desconocido";
            if(userAgent != null){

                if(userAgent.contains("Edg/")) {
                    browser = "Edge";
                } else if(userAgent.contains("Chrome/") && !userAgent.contains("Edg")) {
                    browser = "Chrome";
                } else if(userAgent.contains("Firefox/")) {
                    browser = "Firefox";
                } else if(userAgent.contains("Safari/") && !userAgent.contains("Chrome")) {
                    browser = "Safari";
                } else if(userAgent.contains("OPR/") || userAgent.contains("Opera/")) {
                    browser = "Opera";
                }

                if(userAgent.contains("Windows")){
                    os = "Windows";
                }
                if(userAgent.contains("Mac")){
                    os = "Mac";
                }
                if(userAgent.contains("Linux")){
                    os = "Linux";
                }
                if(userAgent.contains("Android")){
                    os = "Android";
                }
            }

            sys.altaRegistro(ip, url, browser, os);
        }
        
        if (shouldRunCleanup()) {
            cleanupOldRecords();
        }
        
        chain.doFilter(request, response);
        
    }

    /**
     * Return the filter configuration object for this filter.
     */
    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }

    /**
     * Set the filter configuration object for this filter.
     *
     * @param filterConfig The filter configuration object
     */
    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    /**
     * Destroy method for this filter
     */
    public void destroy() {
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
        if (filterConfig != null) {
            if (debug) {
//                log("AccesFilter:Initializing filter");
                log("AccesFilter: Filtro inicializado en: " + new java.util.Date());
                log("Primera limpieza programada para: " + 
                new java.util.Date(System.currentTimeMillis() + CLEANUP_INTERVAL));
            }
        }

        
    }

    /**
     * Return a String representation of this object.
     */
    @Override
    public String toString() {
        if (filterConfig == null) {
            return ("AccesFilter()");
        }
        StringBuffer sb = new StringBuffer("AccesFilter(");
        sb.append(filterConfig);
        sb.append(")");
        return (sb.toString());
    }
    
    private void sendProcessingError(Throwable t, ServletResponse response) {
        String stackTrace = getStackTrace(t);
        
        if (stackTrace != null && !stackTrace.equals("")) {
            try {
                response.setContentType("text/html");
                PrintStream ps = new PrintStream(response.getOutputStream());
                PrintWriter pw = new PrintWriter(ps);
                pw.print("<html>\n<head>\n<title>Error</title>\n</head>\n<body>\n"); //NOI18N

                // PENDING! Localize this for next official release
                pw.print("<h1>The resource did not process correctly</h1>\n<pre>\n");
                pw.print(stackTrace);
                pw.print("</pre></body>\n</html>"); //NOI18N
                pw.close();
                ps.close();
                response.getOutputStream().close();
            } catch (Exception ex) {
            }
        } else {
            try {
                PrintStream ps = new PrintStream(response.getOutputStream());
                t.printStackTrace(ps);
                ps.close();
                response.getOutputStream().close();
            } catch (Exception ex) {
            }
        }
    }
    
    public static String getStackTrace(Throwable t) {
        String stackTrace = null;
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            t.printStackTrace(pw);
            pw.close();
            sw.close();
            stackTrace = sw.getBuffer().toString();
        } catch (Exception ex) {
        }
        return stackTrace;
    }
    
    public void log(String msg) {
        filterConfig.getServletContext().log(msg);
    }
    
}

package filters;

import java.io.IOException;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter(filterName = "DeviceRedirectFilter", urlPatterns = {"/*"})
public class DeviceRedirectFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Inicialización del filtro si es necesario (no es obligatorio)
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {


        HttpServletRequest httpRequest = (HttpServletRequest) request;  
        HttpServletResponse httpResponse = (HttpServletResponse) response;  


        String userAgent = httpRequest.getHeader("User-Agent");  

        if (userAgent != null && esDispositivoMovil(userAgent)) {
            
            
            if (httpRequest.getRequestURI().endsWith("index.jsp")) {
                httpRequest.getRequestDispatcher("/indexMovil.jsp").forward(httpRequest, httpResponse);
                return; 
            }
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }


    private boolean esDispositivoMovil(String userAgent) {
        return userAgent.matches(".*(Mobile|Android|iPhone|iPad|iPod|Opera Mini|IEMobile|BlackBerry|Kindle|webOS).*");
    }
}
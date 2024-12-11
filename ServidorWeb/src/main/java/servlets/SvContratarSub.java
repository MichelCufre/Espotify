
package servlets;

import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet(name = "SvContratarSub", urlPatterns = {"/SvContratarSub"})
public class SvContratarSub extends HttpServlet {
//    ControladorPersistencia cpu = new ControladorPersistencia();
//    iSistema sys = new Fabrica().getSistema(cpu);

    private ServicioWeb sys;

    @Override
    public void init() throws ServletException {
        try {
            ServicioWeb_Service service = new ServicioWeb_Service();
            this.sys = service.getServicioWebPort();
        } catch (Exception e) {
            System.err.println("Error inicializando ServicioWeb_Service: " + e.getMessage());
            throw new ServletException("No se pudo inicializar el servicio web", e);
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String nick = (String) request.getParameter("nombre");
        String tipo = (String) request.getParameter("tipo");
        
        
        switch (tipo) {
            case "anual": sys.altaSubscripcion(nick, "Anual");
                          response.sendRedirect("index.jsp?msg=subcomprada");
                          response.setStatus(202);
                          break;
            case "semanal" : sys.altaSubscripcion(nick, "Semanal");
                             response.sendRedirect("index.jsp?msg=subcomprada");
                             response.setStatus(202);
                             break;
            case "mensual" :  sys.altaSubscripcion(nick, "Mensual");
                              response.sendRedirect("index.jsp?msg=subcomprada");
                              response.setStatus(202);
                              break;
            default: response.sendRedirect("index.jsp?msg=subcomprada"); 
                     response.setStatus(500);
                     break;
        }
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import com.servicios.Artista;
import com.servicios.Cliente;
import com.servicios.DataUsuario;
import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;
import com.servicios.Usuario;

import jakarta.ejb.EJB;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.lang.String;
/**
 *
 * @author Usuario
 */
@WebServlet(name = "SvPerfilVisitado", urlPatterns = {"/SvPerfilVisitado"})
public class SvPerfilVisitado extends HttpServlet {
//    ControladorPersistencia cpu = new ControladorPersistencia();  
//    
//    @EJB
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
        
        response.setContentType("text/plain"); // texto plano
    response.setCharacterEncoding("UTF-8");
    Usuario usuario = null;
        HttpSession session = request.getSession();
        String username = request.getParameter("nombre01").toString();
      
        usuario = sys.obtenerUsuario(username);
        
                
                
                DataUsuario dataUsuario;
                if(usuario instanceof Artista){
                    
                    
                    Artista artista = (Artista) usuario;
                    dataUsuario = sys.dataUsuarioArtistaCompleto(
                        artista.getNickname(),
                        artista.getNombre(),
                        artista.getApellido(),
                        artista.getEmail(),
                        //artista.getFechaNac(),
                        artista.getImagenPerfil(),
                        artista.getBiografia(),
                        artista.getSitioWeb(),
                        artista.getTipo()
                    );
                }else{
                    
                    Cliente cliente = (Cliente) usuario;
                    dataUsuario = sys.dataUsuarioClienteCompleto(
                        cliente.getNickname(),
                        cliente.getNombre(),
                        cliente.getApellido(),
                        cliente.getEmail(),
                        //cliente.getFechaNac(),
                        cliente.getImagenPerfil(),
                        cliente.getTipo()
                    ); 
                }
     
                
                session.setAttribute("dataUsuarioVisitado", dataUsuario);
                
                session.setAttribute("sistema", sys);
                
                response.setStatus(HttpServletResponse.SC_OK);
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

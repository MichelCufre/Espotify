/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

//import controladores.Sistema;
//import controladores.iSistema;
//import controladores.Fabrica;
//import datatypes.DataUsuario;

import com.servicios.Artista;
import com.servicios.Cliente;
import com.servicios.DataUsuario;
import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;
import com.servicios.Usuario;
//import controladores.ServicioWebConsumo;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
//import logica.Artista;
//import logica.Cliente;
//import logica.Usuario;
//import persistencia.ControladorPersistencia;


/**
 *
 * @author dokgo
 */
@WebServlet(name = "SvLogin", urlPatterns = {"/SvLogin"})
public class SvLogin extends HttpServlet {
    
    
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
    
 
    String tipoUsuario;
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
        //processRequest(request, response);
        
        String username = request.getParameter("username");
    String password = request.getParameter("password");
    
    response.setContentType("text/plain"); // texto plano
    response.setCharacterEncoding("UTF-8");
    
    try {
        Usuario usuario = null;
        
        
        if (sys.existeMail(username)) {
            System.out.println("Buscando usuario por correo: " + username);
            usuario = sys.obtenerUsuarioMail(username);
        } else {
            System.out.println("Buscando usuario por nickname: " + username);
            usuario = sys.obtenerUsuario(username);
        }
        
        if (usuario != null) {
            System.out.println("Usuario encontrado: " + usuario.getNickname());
            if (verificarPassword(password, usuario.getPassword())) {
                HttpSession session = request.getSession();
                
                DataUsuario dataUsuario;
                if(usuario instanceof Artista){
                    tipoUsuario = "Artista";
                    session.setAttribute("tipologia", tipoUsuario);
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
                    tipoUsuario = "Cliente";
                    session.setAttribute("tipologia", tipoUsuario);
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
     
                
                session.setAttribute("dataUsuario", dataUsuario);
                session.setAttribute("nickname", usuario.getNickname());
                //session.setAttribute("sistema", sys);
                
              
              response.getWriter().write("success");
                
                
            } else {
                
            }
            
        } else {
            System.out.println("entra al else de si el usuario es null");
        }
    } catch (Exception e) {
        System.out.println("Excepción: " + e.getMessage());
        e.printStackTrace();
    }
    
    //response.sendRedirect("perfil.jsp");
}

    private boolean verificarPassword(String inputPassword, String storedPassword) {
        boolean ismatch;
        ismatch =  inputPassword.equals(storedPassword);
        System.out.println("Verificando contraseña: " + inputPassword + " == " + storedPassword + " ? " + ismatch);
        return ismatch;
    }
        
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

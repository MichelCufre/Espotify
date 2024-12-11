/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import com.servicios.DataUsuario;
import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;

import jakarta.ejb.EJB;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 *
 * @author Usuario
 */
@WebServlet(name = "SvSeguir_Dejar_Usuario", urlPatterns = {"/SvSeguir_Dejar_Usuario"})
public class SvSeguir_Dejar_Usuario extends HttpServlet {
    
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
        
        DataUsuario dataUsuario;
        
        HttpSession session = request.getSession();
        dataUsuario = (DataUsuario)session.getAttribute("dataUsuario");
        String nick_Cliente = dataUsuario.getNick();
        String username = request.getParameter("nickUsuario").toString();
        String tipo = request.getParameter("tipo").toString();
        if(tipo.equals("Seguir")){
        sys.seguirUsuario(nick_Cliente, username);
        }else{
            sys.dejarDeSeguirUsuario(nick_Cliente, username);
        }
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import com.servicios.DataUsuario;
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

/**
 *
 * @author dokgo
 */
@WebServlet(name = "SvSeguirLista", urlPatterns = {"/SvSeguirLista"})
public class SvSeguirLista extends HttpServlet {

    
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
        DataUsuario usu = (DataUsuario)session.getAttribute("dataUsuario");
        String tipo = request.getParameter("tipo").toString();
        String nickUsuario = usu.getNick();
        String idListaF = request.getParameter("id");
       
        int idLista = Integer.parseInt(idListaF);
        String nombreLista = request.getParameter("nombreLista") +" "+ request.getParameter("id");
        System.out.println("tipo:"+ tipo);
        
        if(tipo.equals("Seguir")){
            
           sys.seguirLISTA(nickUsuario,nombreLista);
             response.setStatus(HttpServletResponse.SC_OK);
        }else{
            
            sys.eliminarListaFavoritaCliente(nickUsuario, idLista);
             response.setStatus(HttpServletResponse.SC_OK);
              
        }
        
        response.setStatus(HttpServletResponse.SC_OK);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

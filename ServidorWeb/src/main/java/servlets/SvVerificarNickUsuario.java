/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import controladores.iSistema;
import controladores.Fabrica;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author dokgo
 */
@WebServlet(name = "SvVerificarNickUsuario", urlPatterns = {"/SvVerificarNickUsuario"})
public class SvVerificarNickUsuario extends HttpServlet {
    
    iSistema sys = new Fabrica().getSistema();
    
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
        processRequest(request, response);
        
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        
        String nick = request.getParameter("nick");
        if (nick != null) {
            boolean existe = sys.existeUsuario(nick);
            out.print(existe ? "El nick ya esta en uso" : "Nick disponible");
            out.close();
        } else {
            String mail = request.getParameter("mail");
            boolean existe = false;
            try {
                existe = sys.existeMail(mail);
            } catch (Exception ex) {}
            out.print(existe ? "El emmail ya esta en uso" : "Email disponible");
            out.close();
        }

    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

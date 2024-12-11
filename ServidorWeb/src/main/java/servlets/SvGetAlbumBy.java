/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.servicios.AlbumNoExisteException;
import com.servicios.AlbumNoExisteException_Exception;
import com.servicios.DataAlbum;
import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


@WebServlet(name = "SvGetAlbumBy", urlPatterns = {"/SvGetAlbumBy"})
@MultipartConfig
public class SvGetAlbumBy extends HttpServlet {
    
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
        processRequest(request, response);

            String action = request.getParameter("action");
            String value = request.getParameter("value");
            System.out.println("accion:" + action);
            System.out.println("valor: "+value);
            ObjectMapper mapper = new ObjectMapper();
            if ("Genero".equals(action)) {
                //DataAlbum[] albumsGen = sys.getAlbumsByGenero(value);
                DataAlbum[] albumsGen = null;
            try {
                albumsGen = sys.getAlbumsByGenero(value).toArray(new DataAlbum[0]);
            } catch (AlbumNoExisteException_Exception ex) {
                Logger.getLogger(SvGetAlbumBy.class.getName()).log(Level.SEVERE, null, ex);
            }
                String albumsGenJson = mapper.writeValueAsString(albumsGen);
                response.getWriter().write(albumsGenJson);
                
                
            } else if ("Artista".equals(action)) {
                //DataAlbum[] albumsArt = sys.getAlbumsByArtista(value);
                DataAlbum[] albumsArt = null;
            try {
                albumsArt = sys.getAlbumsByArtista(value).toArray(new DataAlbum[0]);
            } catch (AlbumNoExisteException_Exception ex) {
                Logger.getLogger(SvGetAlbumBy.class.getName()).log(Level.SEVERE, null, ex);
            }
                String albumsArtJson = mapper.writeValueAsString(albumsArt);
                response.getWriter().write(albumsArtJson);
                
            }
            return;

}
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}


package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import controladores.iSistema;
import controladores.Fabrica;
import jakarta.servlet.http.HttpSession;


@WebServlet(name = "SvAltaAlbum", urlPatterns = {"/SvAltaAlbum"})
public class SvAltaAlbum extends HttpServlet {
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
        
        //Album 
        HttpSession session = request.getSession();
        String nickname = session.getAttribute("nickname").toString();
        String nombreA = request.getParameter("nombreA");
        Integer anio = Integer.parseInt(request.getParameter("anio"));
        String imagen = request.getParameter("imagen");
        
        //Genero
        String nombreG = request.getParameter("nombreG");
        
        //Tema
        String nombreT = request.getParameter("nombreT");
        String duracion = request.getParameter("duracion");
        Integer pos = Integer.parseInt(request.getParameter("pos"));
        String direccionWeb = request.getParameter("direccionWeb");
        String archivo = request.getParameter("archivo");
        
        sys.cargarDatosAlbum(nombreA, nickname, anio, imagen);
        sys.altaTema(nombreT, duracion, pos, direccionWeb, archivo);
        sys.addGeneroAlbum(nombreG);
        sys.altaAlbum();
        response.sendRedirect("altaAlbum.jsp");
    }
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

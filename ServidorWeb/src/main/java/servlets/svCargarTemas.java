/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;


import com.servicios.DataTema;
import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/svCargarTemas")
public class svCargarTemas extends HttpServlet {

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
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        int id = Integer.parseInt(idStr); // Convertir a entero
        long idL= (long)id;
        
        
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        
        List<DataTema> temas = null;

        // Determinar de dónde cargar los temas
        if (request.getParameter("tipo").equals("album")) {
            temas = sys.traerTemasPorIdAlbum(idL); // Cargar temas de álbum
        } else if (request.getParameter("tipo").equals("publica")) {
            temas = sys.traerTemasPorIdListaReproduccion(id); // Cargar temas de lista pública
        } else if (request.getParameter("tipo").equals("defecto")) {
            temas = sys.traerTemasPorListasPorDefectoId(id); // Cargar temas de lista por defecto
        }

        StringBuilder jsonBuilder = new StringBuilder("[");
        
        for (int i = 0; i < temas.size(); i++) {
            DataTema tema = temas.get(i);
            jsonBuilder.append("{\"id\":").append(tema.getId()).append(",\"nombre\":\"").append(tema.getNombre()).append("\",\"duracion\":\"").append(tema.getDuracion()).append("\"}");
            if (i < temas.size() - 1) jsonBuilder.append(",");
        }

        jsonBuilder.append("]");
        out.print(jsonBuilder.toString());
        out.flush();
    }
}

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
import java.util.HashSet;
import datatypes.DataAlbum;
import com.fasterxml.jackson.databind.ObjectMapper;
import datatypes.DataTema;
import java.util.Collection;
import logica.Tema;



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
        sys.cargarGenerosSys();
        HashSet<String> generosS = sys.getGeneros();
        
        //Album 
        HttpSession session = request.getSession();
String nickname = session.getAttribute("nickname").toString();
System.out.println("Nickname: " + nickname); // Imprimir el nickname

String nombreA = request.getParameter("nombreA");
System.out.println("Nombre Álbum: " + nombreA); // Imprimir el nombre del álbum

try {
    boolean existe = sys.verificaAlbum(nombreA, nickname);
    if (existe) {
        response.sendError(HttpServletResponse.SC_CONFLICT, "nombre");
        return;
    }
} catch (Exception ex) {
    response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error en el servidor.");
}

String anioStr = request.getParameter("anio"); // Cambiado a String para evitar NullPointerException
Integer anio = null;
if (anioStr != null && !anioStr.isEmpty()) {
    anio = Integer.parseInt(anioStr);
} else {
    System.out.println("Año: No se recibió el año."); // Imprimir mensaje si anio es null
}
System.out.println("Año: " + anio); // Imprimir el año

String imagen = request.getParameter("imagen");
System.out.println("Imagen: " + imagen); // Imprimir la imagen

String action = request.getParameter("action");
System.out.println("Action: " + action); // Imprimir la acción

String value = request.getParameter("value");
System.out.println("Value: " + value); // Imprimir el valor
        ObjectMapper mapper = new ObjectMapper();
        DataAlbum albumData = mapper.readValue(request.getInputStream(), DataAlbum.class);

        // Obtener los géneros y temas desde el JSON
        Collection<String> generos = albumData.getGeneros();
        Collection<DataTema> temas = albumData.getTemas();

//        // Lógica de ejemplo: verificar si ya existe algún género o tema duplicado
//        for (String genero : generos) {
//            if (sys.encontrarGenero(nombreG)) {
//                response.sendError(HttpServletResponse.SC_CONFLICT, "El género " + genero + " ya existe.");
//                return;
//            }
//        }
//
//        for (DataTema tema : temas) {
//            if (tema.getNombre() == nombreT) {
//                response.sendError(HttpServletResponse.SC_CONFLICT, "El tema " + tema.getNombre() + " ya existe.");
//                return;
//            }
//        }

        // Responder con éxito
        response.setStatus(HttpServletResponse.SC_OK);
    
        
        
        if (action.equals("checkAlbumName")) {
            boolean exists = sys.verificaAlbum(value, nickname);
            response.getWriter().write(exists ? "exists" : "available");
        } else if (action.equals("checkGenre")) {
            boolean exists = sys.encontrarGenero(value);
            response.getWriter().write(exists ? "exists" : "available");
        }
    
        
        sys.cargarDatosAlbum(nombreA, nickname, anio, imagen);
        for (DataTema dtT : temas){
            sys.altaTema(dtT.getNombre(), dtT.getDuracion(), dtT.getPosicion(), dtT.getDireccionWeb(), dtT.getArchivo());
        }
        for (String gen : generos){
            sys.addGeneroAlbum(gen);
        }
        sys.altaAlbum();
        response.sendRedirect("altaAlbum.jsp");
    }
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

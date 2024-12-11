
package servlets;

import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashSet;
import java.util.Set;
import rutaP.rutaProyecto;

@WebServlet(name = "SvAgregarTemaAlbum", urlPatterns = {"/SvAgregarTemaAlbum"})
@MultipartConfig
public class SvAgregarTemaAlbum extends HttpServlet {
    
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

    String nombreT = request.getParameter("nombreT");
    String duracion = request.getParameter("duracion");
    String posStr = request.getParameter("pos"); 
    String dirW = request.getParameter("direccionWeb");
    String album = request.getParameter("nombreA");
    HttpSession session = request.getSession();

        System.out.println("album: "+album);
// Carga del archivo
String uploadPath = null;
String filePath = null;
String rutaArchivo = null;
Part filePart = request.getPart("archivo");

if (filePart != null && filePart.getSize() > 0) {
    uploadPath = rutaProyecto.getRuta() + "archivos_musica";

    String contentType = filePart.getContentType();
    // Validar y definir la extensión correcta para archivos .mp3 y .mpeg
    if (contentType.equals("audio/mpeg") || contentType.equals("audio/mp3")) {
        String originalFileName = filePart.getSubmittedFileName();
        String[] contentParts = contentType.split("/");
        String fileFormat = contentParts[1].equals("mpeg") ? "mp3" : contentParts[1];
        
        String fileName = originalFileName.substring(0, originalFileName.lastIndexOf('.')) + "." + fileFormat;
        
        filePath = uploadPath + File.separator + fileName;

        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }

        rutaArchivo = fileName;

        try (InputStream input = filePart.getInputStream()) {
            Files.copy(input, new File(filePath).toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("error catch");
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al guardar el archivo.");
            return;
        }
    } else {
        System.out.println("Tipo de archivo no soportado. Solo se permiten archivos MP3.");
        response.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, "Tipo de archivo no soportado.");
        return;
    }
} else {
    System.out.println("No se ha subido ningún archivo o el archivo está vacío");
}
    
    
    Set<String> temas = (Set<String>) session.getAttribute("temas");
        if (temas == null) {
            temas = new HashSet<>(); // Si no existe, crear una nueva
        }
        
    Set<String> temasPos = (Set<String>) session.getAttribute("temasPos");
        if (temasPos == null) {
            temasPos = new HashSet<>(); // Si no existe, crear una nueva
        }
    
    String action = request.getParameter("action");
    if ("".equals(posStr)) {
           response.sendError(HttpServletResponse.SC_BAD_REQUEST, "La posicion es requerida.");
            return; 
        }
    
    try {
        if ("checkTema".equals(action) || "checkTemaPos".equals(action)) {
            String value = request.getParameter("value");
            boolean exists = false;

            if ("checkTema".equals(action)) {
                if (temas.contains(value)) {
                    exists = true;
                } else {
                    temas.add(nombreT); // Solo se agrega si no existe
                }
            } else if ("checkTemaPos".equals(action)) {
               
                if (temasPos.contains(posStr)) {
                    exists = true;
                } else {
                    temasPos.add(posStr); // Solo se agrega si no existe
                }
            }

            response.getWriter().write(exists ? "exists" : "available");
            return; 
        }

        Integer pos = Integer.valueOf(posStr);
        
        
        String nickname = session.getAttribute("nickname").toString();
        // Verificar si el álbum existe
        if (!sys.verificaAlbum(album, nickname)) {
            System.out.println("archivo: "+rutaArchivo);
            sys.altaTema(nombreT, duracion, pos, dirW, rutaArchivo);
            session.setAttribute("temas", temas);
            session.setAttribute("temasPos", temasPos);
            response.setStatus(HttpServletResponse.SC_OK); // Cambiar a OK al éxito
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    } catch (NumberFormatException e) {
        // Manejo de la excepción si hay un error al convertir a número
        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error en los datos proporcionados.");
    } catch (Exception ex) {
        // Manejo de otras excepciones
        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error en el servidor.");
    }
}

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
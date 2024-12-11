package servlets;



import com.servicios.DataAlbum;
import com.servicios.DataLista;
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

@WebServlet("/svCargarOrigenTema")
public class svCargarOrigenTema extends HttpServlet {

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
        String tipo = request.getParameter("tipo"); // Obtener el tipo desde la solicitud
        
        
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        
        StringBuilder jsonBuilder = new StringBuilder("[");
        
        switch (tipo) {
            case "defecto":
                List<DataLista> listasDefecto = sys.traerListasPorDefecto(); // Método para obtener listas por defecto
                for (int i = 0; i < listasDefecto.size(); i++) {
                    DataLista lista = listasDefecto.get(i);
                    jsonBuilder.append("{\"id\":").append(lista.getId()).append(",\"nombre\":\"").append(lista.getNombre()).append("\"}");
                    if (i < listasDefecto.size() - 1) jsonBuilder.append(",");
                }
                break;

            case "publica":
                List<DataLista> listasPublicas = sys.traerListasParticularesPublicas(); // Método para obtener listas públicas
                for (int i = 0; i < listasPublicas.size(); i++) {
                    DataLista lista = listasPublicas.get(i);
                    jsonBuilder.append("{\"id\":").append(lista.getId()).append(",\"nombre\":\"").append(lista.getNombre()).append("\"}");
                    if (i < listasPublicas.size() - 1) jsonBuilder.append(",");
                }
                break;

            case "album":
                List<DataAlbum> albumes = sys.traerAlbumes(); // Método para obtener álbumes
                for (int i = 0; i < albumes.size(); i++) {
                    DataAlbum album = albumes.get(i);
                    jsonBuilder.append("{\"id\":").append(album.getId()).append(",\"nombre\":\"").append(album.getNombre()).append("\"}");
                    if (i < albumes.size() - 1) jsonBuilder.append(",");
                }
                break;

            default:
                break; 
        }

        jsonBuilder.append("]");
        out.print(jsonBuilder.toString());
        out.flush();
    }
}
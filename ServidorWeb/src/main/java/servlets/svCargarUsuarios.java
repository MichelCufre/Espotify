package servlets;

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


@WebServlet("/svCargarUsuarios")
public class svCargarUsuarios extends HttpServlet {
    private static final long serialVersionUID = 1L;

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
        
        List<String> usuarios = sys.traerNickNamesClientes(); // Método para obtener usuarios

        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        
        // Convertir la lista de usuarios a formato JSON
        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < usuarios.size(); i++) {
            json.append("\"").append(usuarios.get(i)).append("\"");
            if (i < usuarios.size() - 1) {
                json.append(",");
            }
        }
        json.append("]");

        out.print(json.toString());
        out.flush();
    }
}
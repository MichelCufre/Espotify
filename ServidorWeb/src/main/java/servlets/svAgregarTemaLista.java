package servlets;

import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.json.JSONObject;



@WebServlet("/svAgregarTemaLista")
public class svAgregarTemaLista extends HttpServlet {
    
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
    
    private static final long serialVersionUID = 1L;

//    @Override
//    public void init() throws ServletException {
//        // Inicializa tu controladora (sys) si es necesario
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener el ID de la lista y el ID del tema desde la solicitud
        
       
        String listaIdStr = request.getParameter("listaId");
        String temaIdStr = request.getParameter("temaId");
        
        // Crear un objeto para la respuesta
        JSONObject jsonResponse = new JSONObject();

        // Validar los parámetros recibidos
        if (listaIdStr != null && !listaIdStr.isEmpty() && temaIdStr != null && !temaIdStr.isEmpty()) {
           
                int listaId = Integer.parseInt(listaIdStr);
                long temaId = Long.parseLong(temaIdStr);

                // Llamar a la operación para agregar el tema a la lista
                if(sys.existeTemaLista(temaId, listaId)){
                  response.setStatus(HttpServletResponse.SC_CONFLICT);
                  response.getWriter().write("El tema ya existe en la lista.");

                }else{
                    sys.agregarTemaLista(listaId, temaId);
                      response.setStatus(HttpServletResponse.SC_OK);
                      response.getWriter().write("Tema agregado exitosamente.");
                }
                
        }
           
            

       
    }
}

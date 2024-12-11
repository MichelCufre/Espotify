package servlets;

import com.servicios.DataLista;
import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


// Anotación que define la URL de acceso al servlet
@WebServlet("/svModificarLista")
public class svModificarLista extends HttpServlet {
    
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

    private static final long serialVersionUID = 1L; // Serialización para el servlet

//    @Override
//    public void init() throws ServletException {
//        // Inicializa cualquier recurso necesario para el servlet
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener el ID de la lista desde la solicitud HTTP
        String listaIdStr = request.getParameter("listaId");

        // Verificar que el ID no sea nulo ni vacío
        if (listaIdStr != null && !listaIdStr.isEmpty()) {
            try {
                int idLista = Integer.parseInt(listaIdStr); // Convertir a entero

                // Comprobar si la lista fue encontrada y si es pública
                if (sys.esPublicaLista(idLista)) {
                    request.getSession().setAttribute("mensajeError", "¡Error, la lista seleccionada ya es pública! Seleccione otra.");
                } else {
                    // Lógica para publicar la lista si no es pública
                    sys.modificarListaParticularPorId(idLista);
                    request.getSession().setAttribute("mensajeExito", "Lista publicada exitosamente.");
                }
            } catch (NumberFormatException e) {
                request.getSession().setAttribute("mensajeError", "ID de lista no válido.");
            }
        } else {
            // Manejar el caso donde no se proporciona un ID
            request.getSession().setAttribute("mensajeError", "No se proporcionó el ID de la lista.");
        }

        // Cargar usuarios y listas después de procesar la solicitud
        List<String> listaUsuarios = sys.traerNickNamesClientes();
        request.setAttribute("listaUsuarios", listaUsuarios);

        String nickname = request.getParameter("usuario");
        List<DataLista> listas = sys.traerListasParticularesPorClientes(nickname);
        
        // Setea las listas como atributo para la página JSP
        request.setAttribute("listas", listas);
        
        // Redirigir a la página de publicación de listas después de procesar la solicitud
        request.getRequestDispatcher("publicarLista.jsp").forward(request, response);
    }
}
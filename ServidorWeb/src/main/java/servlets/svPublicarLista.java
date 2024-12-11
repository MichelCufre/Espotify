package servlets;

import com.google.gson.Gson;
import com.servicios.DataLista;
import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "svPublicarLista", urlPatterns = {"/svPublicarLista"})
public class svPublicarLista extends HttpServlet {
    
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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nickname = request.getParameter("usuario");

        // Si el nickname está presente, es una solicitud AJAX
        if (nickname != null && !nickname.isEmpty()) {
            // Obtiene las listas para el usuario seleccionado
            List<DataLista> listas1 = sys.traerListasParticularesPorClientes(nickname);
            List<DataLista> listas = new ArrayList();
            for(DataLista list : listas1 ){
                if(!sys.esPublicaLista(list.getId())){
                listas.add(list);
                
            }
        }
            
            // Usa Gson para convertir la lista a JSON
            Gson gson = new Gson();
            String jsonListas = gson.toJson(listas);

            // Establece el tipo de contenido y devuelve el JSON
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(jsonListas);
        } else {
            // Si no es una solicitud AJAX, simplemente carga la lista de usuarios para el JSP
            List<String> listaUsuarios = sys.traerNickNamesClientes();

            // Verifica que la lista no esté vacía
            if (listaUsuarios != null && !listaUsuarios.isEmpty()) {
                System.out.println("Lista de usuarios: " + listaUsuarios);
            } else {
                System.out.println("No se encontraron usuarios.");
            }

            // Seteas la lista de usuarios como atributo para la página JSP
            request.setAttribute("listaUsuarios", listaUsuarios);

            // Redireccionas a la página JSP
            request.getRequestDispatcher("publicarLista.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Si necesitas manejar solicitudes POST, implementa la lógica aquí
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}

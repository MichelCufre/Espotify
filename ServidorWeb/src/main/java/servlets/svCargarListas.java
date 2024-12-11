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
import java.io.PrintWriter;

import java.util.List;
import javax.swing.JOptionPane;

@WebServlet("/svCargarListas")
public class svCargarListas extends HttpServlet {

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
        String usuarioSeleccionado = request.getParameter("usuario");
        
        
        List<DataLista> listasUsuario = sys.traerListasParticularesPorClientes(usuarioSeleccionado); // Método que debes implementar
        
        response.setContentType("application/json");
        
        PrintWriter out = response.getWriter();
        
        // Convertir la lista a JSON
        StringBuilder jsonBuilder = new StringBuilder("[");
        
        for (int i = 0; i < listasUsuario.size(); i++) {
           DataLista lista = listasUsuario.get(i);
           jsonBuilder.append("{\"id\":").append(lista.getId()).append(",\"nombre\":\"").append(lista.getNombre()).append("\"}");
           if (i < listasUsuario.size() - 1) jsonBuilder.append(",");
       }

       jsonBuilder.append("]");
       out.print(jsonBuilder.toString());
       out.flush();
    }
}
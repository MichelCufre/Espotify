package servlets;

import com.servicios.DataLista;
import com.servicios.DataUsuario;
import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;
import com.servicios.UsuarioNoExisteException;
import com.servicios.UsuarioNoExisteException_Exception;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

@WebServlet(name = "svRankingUsuarios", urlPatterns = {"/svRankingUsuarios"})
public class svRankingUsuarios extends HttpServlet {

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
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Obtener la lista de clientes desde la base de datos o cualquier fuente
        List<DataUsuario> artistas = new ArrayList<>();
        Map<String, Integer> seguidoresMap = new HashMap<>(); // Mapa para almacenar número de seguidores
        
        List<DataUsuario> clientes = new ArrayList<>();
        Map<String, Integer> seguidoresClientesMap = new HashMap<>(); // Mapa para almacenar número de seguidores
        
        Map<String, List<DataLista> > listasPublicasClienteMap = new HashMap<>();
        
        try {
            DataUsuario[] artistasArray = sys.getArtistas().toArray(new DataUsuario[0]);
            List<DataUsuario> artistasList = Arrays.asList(artistasArray);
            
            DataUsuario[] clientesArray = sys.getClientes().toArray(new DataUsuario[0]);
            List<DataUsuario> clientesList = Arrays.asList(clientesArray);
            
            for (DataUsuario user : artistasList) {
                int numeroSeguidores = sys.getSeguidores(user.getNick()).size(); // Obtener número de seguidores
                
                if (numeroSeguidores > 0) { 
                    artistas.add(user);
                    seguidoresMap.put(user.getNick(), numeroSeguidores); // Guardar en el mapa
                }
            }
            
            
            for (DataUsuario user2 : clientesList) {
                int numeroSeguidores2 = sys.getSeguidores(user2.getNick()).size(); // Obtener número de seguidores
                
                if (numeroSeguidores2 > 0) { // Solo agregar si tiene más de 0 seguidor
                    clientes.add(user2);
                    seguidoresClientesMap.put(user2.getNick(), numeroSeguidores2); // Guardar en el mapa
                    
                    List <DataLista> listasParticularesCliente= sys.traerListasParticularesPorClientes(user2.getNick());
                    List <DataLista> listasParticularesPublicasCliente= new ArrayList<>();
                    
                    for(DataLista lista: listasParticularesCliente){
                        if(lista.isPublica()==true){ //si es publica la lista
                            listasParticularesPublicasCliente.add(lista);
                            
                        }
                    }
                    
                    
                    
                    listasPublicasClienteMap.put(user2.getNick(),listasParticularesPublicasCliente);
                    
                    
                }
            }
            
            
            
            // Ordenar la lista de clientes en base al número de seguidores, de mayor a menor
            artistas.sort((artista1, artista2) -> seguidoresMap.get(artista2.getNick()) - seguidoresMap.get(artista1.getNick()));
            clientes.sort((cliente1, cliente2) -> seguidoresClientesMap.get(cliente2.getNick()) - seguidoresClientesMap.get(cliente1.getNick()));
            
        } catch (UsuarioNoExisteException_Exception ex) {
            Logger.getLogger(svRankingUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Pasar la lista de clientes y el mapa de seguidores al JSP
        request.setAttribute("artistas", artistas);
        request.setAttribute("seguidoresMap", seguidoresMap); // Pasar mapa
        
        request.setAttribute("clientes", clientes);
        request.setAttribute("seguidoresClientesMap", seguidoresClientesMap); // Pasar mapa
        request.setAttribute("listasPublicasClienteMap", listasPublicasClienteMap);
        
        // Redirigir a la página JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("rankingUsuarios.jsp");
        dispatcher.forward(request, response);
    }
}

package servlets;

import controladores.Fabrica;
import controladores.iSistema;
import datatypes.DataTema;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import logica.Tema;
import persistencia.ControladorPersistencia;


@WebServlet(name = "SvEditarParametros", urlPatterns = {"/SvEditarParametros"})
@MultipartConfig
public class SvEditarParametros extends HttpServlet {
ControladorPersistencia cpu = new ControladorPersistencia();
    iSistema sys = new Fabrica().getSistema(cpu);
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
        
        
            String action = request.getParameter("action");
            Long idTema =  Long.valueOf(request.getParameter("value"));
            Tema nuevoTema = new Tema();
            if(nuevoTema.getNroReproducciones() == null){
                nuevoTema.setNroReproducciones(0);
            }
            
            if(nuevoTema.getNroDescargas() == null){
                nuevoTema.setNroDescargas(0);
            }
            
        if ("descarga".equals(action)) {
            nuevoTema = cpu.traerTemaPorId(idTema);
            nuevoTema.setNroDescargas(nuevoTema.getNroDescargas()+1);
            cpu.editarTema(nuevoTema);
            
            
        } else if ("load".equals(action)) {
            nuevoTema = cpu.traerTemaPorId(idTema);
            nuevoTema.setNroReproducciones(nuevoTema.getNroReproducciones()+1);
            cpu.editarTema(nuevoTema);
        }
    
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import com.servicios.DataLista;
import com.servicios.ListaRepetidaException_Exception;
import com.servicios.ServicioWeb;
import com.servicios.ServicioWeb_Service;

import java.io.IOException;
import java.io.PrintWriter;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import rutaP.rutaProyecto;

/**
 *
 * @author miche
 */
@WebServlet(name = "SvCrearLista", urlPatterns = {"/SvCrearLista"})
@MultipartConfig
public class SvCrearLista extends HttpServlet {
    
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
         HttpSession session = request.getSession();
        
        String action = request.getParameter("action");
        String cliente = (String) session.getAttribute("nickname");
        if ("checkNombre".equals(action)) {
            String value = request.getParameter("value");
            try {
                boolean exists = false;
                exists = sys.encontrarListaParticular(cliente, value);

                response.getWriter().write(exists ? "exists" : "available");
            } catch (Exception ex) {
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error en el servidor.");
            }
            return;
        }
        //resto del codigo
        System.out.println("Nombre libre");
        String nombre = request.getParameter("nombreLista");
        if(nombre != null){
            
            //imagen
        System.out.println("Lllega a la imagen");
        
        String uploadPath = null;
        String filePath = null;
        String rutaimg = null;
        Part filePart = request.getPart("imagen");
        if (filePart != null && filePart.getSize() > 0){
            uploadPath = rutaProyecto.getRuta() + "imagenes_lista";
            String fileName = nombre;

            String contentType = filePart.getContentType();
            String[] contentParts = contentType.split("/");
            String imageFormat = contentParts[1];
            System.out.println("entra al if de la imagen:" + filePart);

            fileName = fileName + "." + imageFormat;

            filePath = uploadPath + File.separator + fileName;

            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            rutaimg = "imagenes_lista/" + nombre + "." + imageFormat;
            System.out.println("Llega al try de la imagen: " + fileName + filePath);

            try (InputStream input = filePart.getInputStream()) {
                Files.copy(input, new File(filePath).toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("paso el try de la imagen");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se ha subido ninguna imagen o el archivo esta vacio");
        }
        //fin imagen
        
        System.out.println("Pasa la imagen y estoy afuera del try de altaLista");
        
        DataLista dtl = sys.dataListaRIC(nombre, rutaimg, cliente);//new DataLista(nombre,rutaimg,cliente);
        System.out.println("Entrando al alta");
            try {
                sys.altaListaPart(dtl);
            } catch (ListaRepetidaException_Exception ex) {
                Logger.getLogger(SvCrearLista.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println("Paso el alta");
        response.setStatus(202);
        response.sendRedirect("index.jsp?msg=lstcreado");
        //response.getWriter().write("ok");
        System.out.println("correcto");
    }

    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

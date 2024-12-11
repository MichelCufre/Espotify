/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import controladores.Fabrica;
import controladores.iSistema;
import datatypes.DataAlbum;
import datatypes.DataLista;
import datatypes.DataTema;
import datatypes.DataUsuario;
import excepciones.AlbumNoExisteException;
import excepciones.UsuarioNoExisteException;
import jakarta.ejb.EJB;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.ArrayList;
import persistencia.ControladorPersistencia;
import java.util.List;
import logica.Album;
import logica.AlbumEliminado;
import logica.Artista;
import logica.ArtistaEliminado;
import logica.TemaEliminado;

/**
 *
 * @author dokgo
 */
@WebServlet(name = "SvEliminarCuenta", urlPatterns = {"/SvEliminarCuenta"})
public class SvEliminarCuenta extends HttpServlet {

    ControladorPersistencia cpu = new ControladorPersistencia();  
    
    @EJB
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
        
        String nicknameArtista = request.getParameter("idUsuario");
        
        if(nicknameArtista != null){
            
            //Remover seguidores del artista
            List<DataUsuario> seguidores = sys.getSeguidores(nicknameArtista);
            for(DataUsuario seguidor : seguidores){
                sys.Dejar_De_Seguir_Usuario(seguidor.getNick(), nicknameArtista);
            }

                // Obtener los álbumes del artista
                DataAlbum[] albumesArtista;
                try {
                    albumesArtista = sys.getAlbumsByArtista(nicknameArtista);
                } catch (AlbumNoExisteException e) {
                    response.sendRedirect("eliminarCuenta.jsp?error=No se encontraron álbumes para el artista.");
                    return;
                }

                // Obtener temas del artista
                List<DataTema> temasDelArtista = new ArrayList<>();
                for (DataAlbum dataAlbum : albumesArtista) {
                    Album album = sys.getAlbum(dataAlbum.getNombre());
                    temasDelArtista.addAll(sys.traerTemasPorIdAlbum(album.getId()));
                }
                
                Artista ar = sys.ObtenerArtista(nicknameArtista);
                //ArtistaEliminado agregarArtista = new ArtistaEliminado(nicknameArtista, ar.getNombre(), ar.getApellido(), ar.getEmail(), ar.getFechaNac(), ar.getImagenPerfil(),ar.getBiografia(), ar.getSitioWeb());
                
                //guardo los datos del artis antes del eliminarlo
                sys.AltaArtistaEliminado(nicknameArtista, ar.getNombre(), ar.getApellido(), ar.getEmail(), ar.getFechaNac(), ar.getImagenPerfil(),ar.getBiografia(), ar.getSitioWeb());
                
                ArtistaEliminado agregarArtista = sys.getArtistaEliminado(nicknameArtista);
                //guardar los albumes eliminados del artista
                for (DataAlbum albumArtista : albumesArtista) {
                    Album albun = sys.getAlbum(albumArtista.getNombre());
                    try {
                        sys.AltaAlbumEliminado(albumArtista.getNombre(), albumArtista.getFechaCreacion(), albumArtista.getImagenAlbum());

                        AlbumEliminado albumE = sys.getAlbumEliminado(albumArtista.getNombre());
                        System.out.println("Nombre del album para setear el artista: " + albumArtista.getNombre());
                        albumE.setArtista(agregarArtista);
                        System.out.println("nombre del artista seteado: " + albumE.getArtista().getNickname());
                        cpu.actualizarAlbumEliminado(albumE);

                        System.out.println("ID del álbum a buscar: " + albumArtista.getId());
                        List<DataTema> temasDelAlbum = sys.traerTemasPorIdAlbum(albun.getId());

                        // Debuggeando la lista de temas
                        System.out.println("=== DEBUG TEMAS ===");
                        System.out.println("Cantidad de temas encontrados: " + (temasDelAlbum != null ? temasDelAlbum.size() : "lista null"));
                        if (temasDelAlbum != null && !temasDelAlbum.isEmpty()) {
                            System.out.println("Lista de temas encontrados:");
                            for (DataTema t : temasDelAlbum) {
                                System.out.println("- Tema: " + t.getNombre() + ", ID: " + t.getId());
                            }
                        } else {
                            System.out.println("No se encontraron temas para el álbum");
                        }
                        System.out.println("=== FIN DEBUG TEMAS ===");

                        // Ahora el for original
                        for (DataTema tema : temasDelAlbum) {
                            System.out.println("Procesando tema: " + tema.getNombre());
                            sys.AltaTemaEliminado(tema.getNombre(), tema.getDuracion(), tema.getPosicion(), tema.getDireccionWeb(), tema.getArchivo());
                            TemaEliminado Te = sys.getTemaEliminado(tema.getNombre());
                            System.out.println("nombre del tema obtenido: " + Te.getNombre());
                            Te.setAlbum(albumE);  // Descomentado esta línea
                            System.out.println("nombre del album seteado: " + albumE.getNombre());
                            cpu.actualizarTemaEliminado(Te);
                        }

                    } catch (Exception e) {
                        System.out.println("Error al procesar album: " + e.getMessage());
                        e.printStackTrace();
                        response.sendRedirect("eliminarCuenta.jsp?error=Error al procesar album: " + e.getMessage());
                        return;
                    }

                }

                
                
                // Obtener todos los clientes
                DataUsuario[] clientes;
                try {
                    clientes = sys.getClientes();
                } catch (UsuarioNoExisteException e) {
                    response.sendRedirect("eliminarCuenta.jsp?error=No se encontraron clientes para verificar.");
                    return;
                }

                // Verificar y eliminar temas y álbumes favoritos de cada cliente
                for (DataUsuario cliente : clientes) {
                    String nickCliente = cliente.getNick();

                    // Eliminar temas favoritos
                    List<DataTema> temasFavoritosCliente = sys.traerTemasFavoritosPorIdCliente(nickCliente);
                    for (DataTema temaFavorito : temasFavoritosCliente) {
                        for (DataTema temaDelArtista : temasDelArtista) {
                            if (temaFavorito.getId().equals(temaDelArtista.getId())) {
                                sys.eliminarTemasFavoritosCliente(nickCliente, temaFavorito.getId());
                            }
                        }
                    }

                    // Eliminar álbumes favoritos
                    List<DataAlbum> albumesFavoritosCliente = sys.traerAlbumesFavoritosPorIdCliente(nickCliente);
                    for (DataAlbum albumFavorito : albumesFavoritosCliente) {
                        for (DataAlbum albumArtista : albumesArtista) {
                            Album album = sys.getAlbum(albumArtista.getNombre());
                            if (albumFavorito.getId().equals(album.getId())) {
                                sys.eliminarAlbumesFavoritosCliente(nickCliente, album.getId());
                            }
                        }
                    }

                    // Verificar y eliminar temas del artista en listas particulares del cliente
                    List<DataLista> listasParticulares = sys.getListasParticulares(nickCliente);
                    for (DataLista listaParticular : listasParticulares) {
                        for (DataTema temaDelArtista : temasDelArtista) {
                            if (sys.existeTemaLista(temaDelArtista.getId(), listaParticular.getId())) {
                                sys.eliminarTemasListaPart(nickCliente, listaParticular.getNombre(), temaDelArtista.getId());
                            }
                        }
                    }
                }

                // Verificar y eliminar temas del artista en listas por defecto
                List<DataLista> listasPorDefecto = sys.traerListasPorDefecto();
                for (DataLista listaDefecto : listasPorDefecto) {
                    for (DataTema temaDelArtista : temasDelArtista) {
                        if (sys.existeTemaLista(temaDelArtista.getId(), listaDefecto.getId())) {
                            sys.eliminarTemaListaDef(listaDefecto.getNombre(), temaDelArtista.getId());
                        }
                    }
                }
                
                //elimino los temas
                for (DataTema tema : temasDelArtista) {
                    sys.EliminarTemaPorNombre(tema.getNombre());
                }

                //elimino los albums
                for (DataAlbum album : albumesArtista) {
                    Album al = sys.getAlbum(album.getNombre());
                    al.eliminarGeneros();
                    sys.EliminarAlbumPorNombre(album.getNombre());
                }
                //elimino el artista
                sys.EliminarArtistaPorNickname(nicknameArtista);
                sys.EliminarUsuarioTest(nicknameArtista);
                ArtistaEliminado AE = sys.getArtistaEliminado(nicknameArtista);
                AE.setFechaEliminado(LocalDate.now());
                cpu.actualizarArtistaEliminado(AE);
                
                //hago un logout del artista
                HttpSession session = request.getSession();
                session.invalidate();
            }
        
        
        
        
        response.sendRedirect("index.jsp");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
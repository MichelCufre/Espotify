/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.servicios;

import controladores.Fabrica;
import controladores.UsuariosSeguidosResponse;
import controladores.iSistema;
import datatypes.DataAlbum;
import datatypes.DataGenero;
import datatypes.DataLista;
import datatypes.DataRegistro;
import datatypes.DataSub;
import datatypes.DataTema;
import datatypes.DataUsuario;
import excepciones.AlbumNoExisteException;
import excepciones.GeneroNoExisteException;
import excepciones.ListaRepetidaException;
import excepciones.UsuarioNoExisteException;
import excepciones.UsuarioRepetidoException;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import logica.Album;
import logica.AlbumEliminado;
import logica.Artista;
import logica.ArtistaEliminado;
import logica.Cliente;
import logica.TemaEliminado;
import logica.Usuario;
import persistencia.ControladorPersistencia;

/**
 *
 * @author dokgo
 */
@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {
     
    ControladorPersistencia cpu = new ControladorPersistencia();
    iSistema sys = new Fabrica().getSistema(cpu);
    

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
//    @WebMethod(operationName = "UsuarioSeguidosWeb")
//    public UsuariosSeguidosResponse UsuarioSeguidosWeb(
//            @WebParam(name = "cliente_seleccionado") String cliente_seleccionado
//    ) {
//        Map<String, ArrayList<DataUsuario>> resultado = (Map<String, ArrayList<DataUsuario>>) sys.UsuarioSeguidosWeb(cliente_seleccionado);
//
//        // Transformar el mapa en un objeto serializable
//        UsuariosSeguidosResponse response = new UsuariosSeguidosResponse();
//        response.setClientes(resultado.get("clientes"));
//        response.setArtistas(resultado.get("artistas"));
//
//        return response;
//    }
    
    @WebMethod(operationName = "UsuarioSeguidosWeb")
    public UsuariosSeguidosResponse UsuarioSeguidosWeb(
            @WebParam(name = "cliente_seleccionado") String cliente_seleccionado
    ) {
        return sys.UsuarioSeguidosWeb(cliente_seleccionado);
    }

    @WebMethod(operationName = "traerAlbumesArtista")
    public List<String> traerAlbumesArtista(
            @WebParam(name = "artista") String artista
    ){
        return sys.traerAlbumesArtista(artista);
    }
    
    //OPERACIONES CONSTRUCTOR DATATYPE PUBLICADOS USUARIO
    
    @WebMethod(operationName = "DataUsuarioArtistaCompleto")
    public DataUsuario DataUsuarioArtistaCompleto(
            @WebParam(name = "nick") String nick, 
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "apellido") String apellido, 
            @WebParam(name = "correo") String correo, 
            @WebParam(name = "imagenP") String imagenP, 
            @WebParam(name = "biografia") String biografia,
            @WebParam(name = "sitioWeb") String sitioWeb, 
            @WebParam(name = "tipo") String tipo
    ){
        return sys.DataUsuarioArtistaCompleto(nick, nombre, apellido, correo, imagenP, biografia, sitioWeb, tipo);
    }
    
    @WebMethod(operationName = "DataUsuarioClienteCompleto")
    public DataUsuario DataUsuarioClienteCompleto(
            @WebParam(name = "nick") String nick, 
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "apellido") String apellido, 
            @WebParam(name = "correo") String correo, 
            @WebParam(name = "imagenP") String imagenP, 
            @WebParam(name = "tipo") String tipo
    ){
        return sys.DataUsuarioClienteCompleto(nick, nombre, apellido, correo, imagenP, tipo);
    }
    
    //OPERACIONES CONSTRUCTOR DATATYPE PUBLICADOS LISTA
    @WebMethod(operationName = "DataListaRIC")
    public DataLista DataListaRIC(
            @WebParam(name = "nombre") String nombre, 
            @WebParam(name = "rutaimg") String rutaimg, 
            @WebParam(name = "cliente") String cliente
    ){
        return sys.DataListaRIC(nombre, rutaimg, cliente);
    }
    
    //ACTUALIZAR
    @WebMethod(operationName = "actualizarAlbumEliminadoSistema")
    public void actualizarAlbumEliminadoSistema(
            @WebParam(name = "AlbumE") AlbumEliminado AlbumE
    ){
        sys.actualizarAlbumEliminadoSistema(AlbumE);
    }
         
    @WebMethod(operationName = "actualizarTemaEliminadoSistema")
    public void actualizarTemaEliminadoSistema(
            @WebParam(name = "TemaE") TemaEliminado TemaE
    ){
        sys.actualizarTemaEliminadoSistema(TemaE);
    }
            
    @WebMethod(operationName = "actualizarArtistaEliminado")        
    public void actualizarArtistaEliminado(
            @WebParam(name = "ArtistaE") ArtistaEliminado ArtistaE
    ){
        sys.actualizarArtistaEliminado(ArtistaE);
    }
    
    //eliminar generos de album
    @WebMethod(operationName = "eliminarGenerosDeAlbum") 
    public void eliminarGenerosDeAlbum(
            @WebParam(name = "album") Album album
    ){
        sys.eliminarGenerosDeAlbum(album);
    }
    
    
    
    //OPERACIONES USUARIOS PUBLICADAS
    
    @WebMethod(operationName = "altaPerfil")
    public void altaPerfil(
            @WebParam(name = "nickname") String nickname,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "apellido") String apellido,
            @WebParam(name = "password") String password,
            @WebParam(name = "email") String email,
            @WebParam(name = "fechaNac") String fechaNac,
            @WebParam(name = "imagen") String imagen,
            @WebParam(name = "biografia") String biografia,
            @WebParam(name = "sitioWeb") String sitioWeb,
            @WebParam(name = "tipo") String tipo
            
    ) throws UsuarioRepetidoException{
        LocalDate fechanac = LocalDate.parse(fechaNac);
        sys.altaPerfil(nickname, nombre, apellido, password, email, fechanac, imagen, sitioWeb, biografia, tipo);
    }
    
    @WebMethod(operationName = "ObtenerCliente")
    public Cliente obtenerCliente(
            @WebParam(name = "nick") String nick) {
        return sys.ObtenerCliente(nick);
    }
    
    @WebMethod(operationName = "getArtistas")
    public DataUsuario[] getArtistas() throws UsuarioNoExisteException{
        return sys.getArtistas();
    }
    
    @WebMethod(operationName = "ObtenerArtista")
    public Artista ObtenerArtista(
            @WebParam(name = "nick") String nick
    ){
       return sys.ObtenerArtista(nick);
    }
    
    @WebMethod(operationName = "AltaArtistaEliminado")
    public void AltaArtistaEliminado(
            @WebParam(name = "nickname") String nickname,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "apellido") String apellido,
            @WebParam(name = "email") String email,
            @WebParam(name = "imagen") String imagen,
            @WebParam(name = "biografia") String biografia,
            @WebParam(name = "sitioWeb") String sitioWeb
    ){ 
        sys.AltaArtistaEliminado(nickname, nombre, apellido, email, imagen, biografia, sitioWeb);
        
    }
    
    @WebMethod(operationName = "getClientes")
    public DataUsuario[] getClientes(
    ) throws UsuarioNoExisteException{
        return sys.getClientes();
    }
    
    @WebMethod(operationName = "getClientes2")
    public List<DataUsuario> getClientes2(
    ) throws UsuarioNoExisteException{
        return sys.getClientes2();
    }
    
    @WebMethod(operationName = "EliminarArtistaPorNickname")
    public void EliminarArtistaPorNickname(
            @WebParam(name = "nickname") String nickname
    ){
        sys.EliminarArtistaPorNickname(nickname);
    }
    
    @WebMethod(operationName = "EliminarUsuarioTest")
    public void EliminarUsuarioTest(
            @WebParam(name = "nickname") String nickname
    ){
        sys.EliminarUsuarioTest(nickname);
    }
    
    @WebMethod(operationName = "getArtistaEliminado")
    public ArtistaEliminado getArtistaEliminado(
            @WebParam(name = "nickname") String nickname
    ){
        return sys.getArtistaEliminado(nickname);
    }
    
    @WebMethod(operationName = "obtenerUsuarioMail")
    public Usuario obtenerUsuarioMail(
            @WebParam(name = "email") String email
    ){
        return sys.obtenerUsuarioMail(email);
    }
    
    @WebMethod(operationName = "obtenerUsuario")
    public Usuario obtenerUsuario(
            @WebParam(name = "nick") String nick
    ){
        return sys.obtenerUsuario(nick);
    }
    
    @WebMethod(operationName = "existeMail")
    public boolean existeMail(
            @WebParam(name = "email") String email
    ){
        return sys.existeMail(email);
    }
    
    @WebMethod(operationName = "existeUsuario")
    public boolean existeUsuario(
            @WebParam(name = "nickname") String nickname
    ){
        return sys.existeUsuario(nickname);
    }
    
    @WebMethod(operationName = "getDataUsuariosAjax")
    public List<DataUsuario> getDataUsuariosAjax(
            @WebParam(name = "s") String s,
            @WebParam(name = "tipo") String tipo
    ){
        return sys.getDataUsuariosAjax(s, tipo);
    }
    
    @WebMethod(operationName = "traerNickNamesClientes")
    public List<String> traerNickNamesClientes(
    
    ){
        return sys.traerNickNamesClientes();
    }
    
    //OPERACIONES LISTA PUBLICADAS
    
    @WebMethod(operationName = "traerListasParticularesPublicas")
    public Vector<DataLista> traerListasParticularesPublicas(
    
    ){
        return sys.traerListasParticularesPublicas();
    }
    
    @WebMethod(operationName = "traerListasParticularesPorClientes")
    public List<DataLista> traerListasParticularesPorClientes(
            @WebParam(name = "nickname") String nickname 
    ){
        return sys.traerListasParticularesPorClientes(nickname);
    }
    
    @WebMethod(operationName = "traerListasPorDefecto")
    public List<DataLista> traerListasPorDefecto(
    
    ){
        return sys.traerListasPorDefecto();
    }
    
    @WebMethod(operationName = "Encontrar_Lista_Particular")
    public boolean Encontrar_Lista_Particular(
           @WebParam(name = "nombre_cliente") String nombre_cliente,
           @WebParam(name = "nombre_lista") String nombre_lista
    ){
        return sys.Encontrar_Lista_Particular(nombre_cliente, nombre_lista);
    }
    
    @WebMethod(operationName = "altaListaPart")
    public void altaListaPart(
            @WebParam(name = "dtl") DataLista dtl
    ) throws ListaRepetidaException{
        sys.altaListaPart(dtl);
    }
    
    @WebMethod(operationName = "getListasParticulares")
    public List<DataLista> getListasParticulares(
            @WebParam(name = "nickname") String nickname
    ){
        return sys.getListasParticulares(nickname);
    }
    
    @WebMethod(operationName = "getDataListasReproduccionAjax")
    public List<DataLista> getDataListasReproduccionAjax(
            @WebParam(name = "s") String s,
            @WebParam(name = "tipo") String tipo
    ){
        return sys.getDataListasReproduccionAjax(s, tipo);
    }
    
    @WebMethod(operationName = "esPublicaLista")
    public boolean esPublicaLista(
            @WebParam(name = "idLista") int idLista
    ){
        return sys.esPublicaLista(idLista);
    }
    
    @WebMethod(operationName = "modificarListaParticularPorId")
    public void modificarListaParticularPorId(
            @WebParam(name = "listaId") int listaId
    ){
        sys.modificarListaParticularPorId(listaId);
    }
    
    @WebMethod(operationName = "getGeneros")
    public HashSet<String> getGeneros(
    ){
        return sys.getGeneros();
    }
    
    @WebMethod(operationName = "getGeneros2")
    public DataGenero[] getGeneros2(
    ) throws GeneroNoExisteException{
        return sys.getGeneros2();
    }
    
    @WebMethod(operationName = "getPadre")
    public String getPadre(
            @WebParam(name = "nombreGenero") String nombreGenero
    ){
        return sys.getPadre(nombreGenero);
    }
    
    @WebMethod(operationName = "getAllAlbums")
    public List<DataAlbum> getAllAlbums(
    ){
        return sys.getAllAlbums();
    }
    
    @WebMethod(operationName = "verificaAlbum")
    public boolean verificaAlbum(
           @WebParam(name = "nombreA") String nombreA, 
           @WebParam(name = "nombreArtista") String nombreArtista
    ){
        return sys.verificaAlbum(nombreA, nombreArtista);
    }
    
    @WebMethod(operationName = "addGeneroAlbum")
    public void addGeneroAlbum(
           @WebParam(name = "nombreGenero") String nombreGenero
    ){
        sys.addGeneroAlbum(nombreGenero);
    }
    
    @WebMethod(operationName = "cargarDatosAlbum")
    public void cargarDatosAlbum(
            @WebParam(name = "nombre") String nombre, 
            @WebParam(name = "nombreArtista") String nombreArtista, 
            @WebParam(name = "fechaCreacion") Integer fechaCreacion, 
            @WebParam(name = "imagen") String imagen
    ){
        sys.cargarDatosAlbum(nombre, nombreArtista, fechaCreacion, imagen);
    }
    
    @WebMethod(operationName = "altaAlbum")
    public void altaAlbum(
    ){
        sys.altaAlbum();
    }
    
    @WebMethod(operationName = "getAlbumsByArtista")
    public DataAlbum[] getAlbumsByArtista(
           @WebParam(name = "artista") String artista
    ) throws AlbumNoExisteException{
        return sys.getAlbumsByArtista(artista);
    }
    
    @WebMethod(operationName = "getAlbumsByArtista2")
    public List<DataAlbum> getAlbumsByArtista2(
           @WebParam(name = "artista") String artista
    ) throws AlbumNoExisteException{
        return sys.getAlbumsByArtista2(artista);
    }
    
    @WebMethod(operationName = "getAlbum")
    public Album getAlbum(
            @WebParam(name = "nombreA") String nombreA
    ){
        return sys.getAlbum(nombreA);
    }
    
    @WebMethod(operationName = "AltaAlbumEliminado")
    public void AltaAlbumEliminado(
            @WebParam(name = "nombre") String nombre, 
            @WebParam(name = "fechaCreacion") Integer fechaCreacion, 
            @WebParam(name = "imagenAlbum") String imagenAlbum
    ){
        sys.AltaAlbumEliminado(nombre, fechaCreacion, imagenAlbum);
    }
    
    @WebMethod(operationName = "getAlbumEliminado")
    public AlbumEliminado getAlbumEliminado(
            @WebParam(name = "nombre") String nombre
    ){
        return sys.getAlbumEliminado(nombre);
    }
    
    @WebMethod(operationName = "EliminarAlbumPorNombre")
    public void EliminarAlbumPorNombre(
            @WebParam(name = "nombre") String nombre
    ){
        sys.EliminarAlbumPorNombre(nombre);
    }
    
    @WebMethod(operationName = "getAlbumsByGenero")
    public DataAlbum[] getAlbumsByGenero(
            @WebParam(name = "genero") String genero
    ) throws AlbumNoExisteException{
        return sys.getAlbumsByGenero(genero);
    }
    
    @WebMethod(operationName = "getDataAlbumsAjax")
    public List<DataAlbum> getDataAlbumsAjax(
            @WebParam(name = "genero") String s
    ){
        return sys.getDataAlbumsAjax(s);
    }
    
    @WebMethod(operationName = "traerAlbumes")
    public Vector<DataAlbum> traerAlbumes(
    ){
        return sys.traerAlbumes();
    }
    
    @WebMethod(operationName = "altaTema")
    public void altaTema(
           @WebParam(name = "nombreT") String nombreT, 
           @WebParam(name = "duracion") String duracion, 
           @WebParam(name = "posicion") Integer posicion, 
           @WebParam(name = "direccionWeb") String direccionWeb, 
           @WebParam(name = "archivo") String archivo
    ){
        sys.altaTema(nombreT, duracion, posicion, direccionWeb, archivo);
    }
    
    @WebMethod(operationName = "traerTemasPorIdAlbum")
    public List<DataTema> traerTemasPorIdAlbum(
            @WebParam(name = "id") Long id
    ){
        return sys.traerTemasPorIdAlbum(id);
    }
    
    @WebMethod(operationName = "AltaTemaEliminado")
    public void AltaTemaEliminado(
            @WebParam(name = "nombre") String nombre, 
            @WebParam(name = "duracion") String duracion, 
            @WebParam(name = "posicion") int posicion, 
            @WebParam(name = "direccionWeb") String direccionWeb, 
            @WebParam(name = "archivo") String archivo
    ){
        sys.AltaTemaEliminado(nombre, duracion, posicion, direccionWeb, archivo);
    }
    
    @WebMethod(operationName = "getTemaEliminado")
    public TemaEliminado getTemaEliminado(
            @WebParam(name = "nombre") String nombre
    ){
        return sys.getTemaEliminado(nombre);
    }
    
    @WebMethod(operationName = "existeTemaLista")
    public boolean existeTemaLista(
            @WebParam(name = "idTema") Long idTema, 
            @WebParam(name = "idLista") int idLista
    ){
        return sys.existeTemaLista(idTema, idLista);
    }
    
    @WebMethod(operationName = "eliminarTemasListaPart")
    public void eliminarTemasListaPart(
            @WebParam(name = "nombre") String nombre, 
            @WebParam(name = "nombreL") String nombreL, 
            @WebParam(name = "idTema") Long idTema
    ){
        sys.eliminarTemasListaPart(nombre, nombreL, idTema);
    }
    
    @WebMethod(operationName = "eliminarTemaListaDef")
    public void eliminarTemaListaDef(
            @WebParam(name = "nombre") String nombre, 
            @WebParam(name = "idTema") Long idTema
    ){
        sys.eliminarTemaListaDef(nombre, idTema);
    }
    
    @WebMethod(operationName = "EliminarTemaPorNombre")
    public void EliminarTemaPorNombre(
            @WebParam(name = "nombre") String nombre
    ){
        sys.EliminarTemaPorNombre(nombre);
    }
    
    @WebMethod(operationName = "getDataTemasAjax")
    public List<DataTema> getDataTemasAjax(
            @WebParam(name = "s") String s
    ){
        return sys.getDataTemasAjax(s);
    }
    
    @WebMethod(operationName = "agregarTemaLista")
    public void agregarTemaLista(
            @WebParam(name = "idLista") int idLista, 
            @WebParam(name = "idTema") Long idTema
    ){
        sys.agregarTemaLista(idLista, idTema);
    }
    
    @WebMethod(operationName = "traerTemasPorIdListaReproduccion")
    public List<DataTema> traerTemasPorIdListaReproduccion(
            @WebParam(name = "id") int id
    ){
        return sys.traerTemasPorIdListaReproduccion(id);
    }
    
    @WebMethod(operationName = "traerTemasPorListasPorDefectoId")
    public List<DataTema> traerTemasPorListasPorDefectoId(
            @WebParam(name = "listaid") int listaid
    ){
        return sys.traerTemasPorListasPorDefectoId(listaid);
    }
    
    @WebMethod(operationName = "getAllTemas")
    public List<DataTema> getAllTemas(
    ){
        return sys.getAllTemas();
    }
    
    //OPERACIONES FAVORITOS PUBLICADAS
    
    @WebMethod(operationName = "traerTemasFavoritosPorIdCliente")
    public List<DataTema> traerTemasFavoritosPorIdCliente(
            @WebParam(name = "nickname") String nickname
    ){
        return sys.traerTemasFavoritosPorIdCliente(nickname);
    }
    
    @WebMethod(operationName = "eliminarTemasFavoritosCliente")
    public void eliminarTemasFavoritosCliente(
            @WebParam(name = "nickname") String nickname, 
            @WebParam(name = "idTema") Long idTema
    ){
        sys.eliminarTemasFavoritosCliente(nickname, idTema);
    }
    
    @WebMethod(operationName = "traerAlbumesFavoritosPorIdCliente")
    public List<DataAlbum> traerAlbumesFavoritosPorIdCliente(
            @WebParam(name = "nickname") String nickname
    ){
        return sys.traerAlbumesFavoritosPorIdCliente(nickname);
    }
    
    @WebMethod(operationName = "eliminarAlbumesFavoritosCliente")
    public void eliminarAlbumesFavoritosCliente(
            @WebParam(name = "nickname") String nickname, 
            @WebParam(name = "idAlbum") Long idAlbum
    ){
        sys.eliminarAlbumesFavoritosCliente(nickname, idAlbum);
    }
    
    @WebMethod(operationName = "eliminarListaFavoritaCliente")
    public void eliminarListaFavoritaCliente(
           @WebParam(name = "nickname") String nickname, 
           @WebParam(name = "idLista") int idLista
    ){
        sys.eliminarListaFavoritaCliente(nickname, idLista);
    }
    
    @WebMethod(operationName = "traerListasFavoritasPorIdCliente")
    public List<DataLista> traerListasFavoritasPorIdCliente(
            @WebParam(name = "nickname") String nickname
    ){
        return sys.traerListasFavoritasPorIdCliente(nickname);
    }
    
    //OPERACIONES SEGUIR PUBLICADAS
    
    @WebMethod(operationName = "getSeguidores")
    public List<DataUsuario> getSeguidores(
            @WebParam(name = "nicknameArtista") String nicknameArtista
    ){
        return sys.getSeguidores(nicknameArtista);
    }
            
    @WebMethod(operationName = "Dejar_De_Seguir_Usuario")
    public void Dejar_De_Seguir_Usuario(
            @WebParam(name = "cliente") String cliente, 
            @WebParam(name = "usuario") String usuario
    ){
        sys.Dejar_De_Seguir_Usuario(cliente, usuario);
    }
            
    @WebMethod(operationName = "Seguir_ALBUM")
    public void Seguir_ALBUM(
            @WebParam(name = "cliente_seleccionado") String cliente_seleccionado,
            @WebParam(name = "album_seleccionado") String album_seleccionado
    ){
        sys.Seguir_ALBUM(cliente_seleccionado, album_seleccionado);
    }

    
    @WebMethod(operationName = "Seguir_LISTA")
    public void Seguir_LISTA(
            @WebParam(name = "cliente_seleccionado") String cliente_seleccionado, 
            @WebParam(name = "lista_seleccionada") String lista_seleccionada
    ){
        sys.Seguir_LISTA(cliente_seleccionado, lista_seleccionada);
    }
            
    @WebMethod(operationName = "Seguir_TEMA")
    public void Seguir_TEMA(
            @WebParam(name = "cliente_seleccionado") String cliente_seleccionado, 
            @WebParam(name = "tema_seleccionado") String tema_seleccionado
    ){
        sys.Seguir_TEMA(cliente_seleccionado, tema_seleccionado);
    }
    
    @WebMethod(operationName = "Seguir_Usuario")
    public  void Seguir_Usuario(
            @WebParam(name = "cliente_seleccionado") String cliente_seleccionado, 
            @WebParam(name = "nickname_usuario") String nickname_usuario
    ){
        sys.Seguir_Usuario(cliente_seleccionado, nickname_usuario);
    }
    
    
    
    //Operaciones registro publicadas
    @WebMethod(operationName = "borrarRegistrosAcceso")
    public void borrarRegistrosAcceso(
    ){
        sys.borrarRegistrosAcceso();
    }
    
    @WebMethod(operationName = "obtenerTotalRegistros")
    public int obtenerTotalRegistros(
    ){
        return sys.obtenerTotalRegistros();
    }
    
    @WebMethod(operationName = "obtenerRegistros")
    public List<DataRegistro> obtenerRegistros(
    ){
        return sys.obtenerRegistros();
    }
    
    @WebMethod(operationName = "altaRegistro")
    public void altaRegistro(
            @WebParam(name = "ip") String ip, 
            @WebParam(name = "url") String url, 
            @WebParam(name = "userAgent") String userAgent, 
            @WebParam(name = "os") String os
    ){
        sys.altaRegistro(ip, url, userAgent, os);
    }
    
    @WebMethod(operationName = "altaSubscripcion")
    public void altaSubscripcion (
            @WebParam(name = "nick") String nick, 
            @WebParam(name = "tipo") String tipo
    ){
        sys.altaSubscripcion(nick, tipo);
    }
    
    @WebMethod(operationName = "darSubUsuario")
    public DataSub darSubUsuario(
            @WebParam(name = "nick") String nick
    ){
        return sys.darSubUsuario(nick);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

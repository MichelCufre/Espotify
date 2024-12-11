///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controladores;
//
//import com.servicios.Album;
//import com.servicios.AlbumEliminado;
//import com.servicios.AlbumNoExisteException_Exception;
//import com.servicios.Artista;
//import com.servicios.ArtistaEliminado;
//import com.servicios.Cliente;
//import com.servicios.DataAlbum;
//import com.servicios.DataGenero;
//import com.servicios.DataLista;
//import com.servicios.DataRegistro;
//import com.servicios.DataSub;
//import com.servicios.DataTema;
//import com.servicios.DataUsuario;
//import com.servicios.GeneroNoExisteException_Exception;
//import com.servicios.ListaRepetidaException_Exception;
//
//import com.servicios.LocalDate;
////import java.time.LocalDate;
//import com.servicios.TemaEliminado;
//import com.servicios.Usuario;
//import com.servicios.UsuarioNoExisteException_Exception;
//import com.servicios.UsuarioRepetidoException_Exception;
//import java.time.format.DateTimeFormatter;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Vector;
////import java.time.LocalDate;
//
///**
// *
// * @author dokgo
// */
//public class ServicioWebConsumo {
//
//    private static String hello(String name) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.hello(name);
//    }
//    
//    //Operaciones DATATYPE consumo
//    public static DataUsuario DataUsuarioArtistaCompleto(String nick, String nombre, String apellido, String correo, LocalDate fechaNac, String imagenP, String biografia, String sitioWeb, String tipo){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.dataUsuarioArtistaCompleto(nick, nombre, apellido, correo, fechaNac, imagenP, biografia, sitioWeb, tipo);
//    }
//    
//    public static DataUsuario DataUsuarioClienteCompleto(String nick, String nombre, String apellido, String correo, LocalDate fechaNac, String imagenP, String tipo){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.dataUsuarioClienteCompleto(nick, nombre, apellido, correo, fechaNac, imagenP, tipo);
//    }
//    
//
//
//    //Operaciones USUARIOS consumo
//    public static void altaPerfil(String nickname, String nombre, String apellido, String password, String email, LocalDate fechaNac, String imagen, String sitioWeb, String biografia, String tipo) throws UsuarioRepetidoException_Exception {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        String fechaNacStr;
//        if(fechaNac != null){
//        fechaNacStr = fechaNac.toString();
//        }else{ fechaNacStr = "";}
//        
//        port.altaPerfil(nickname, nombre, apellido, password, email, fechaNacStr, imagen, biografia, sitioWeb, tipo);
//    }
//
//    public static Cliente ObtenerCliente(String nick) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.obtenerCliente(nick);
//    }
//
////    public static DataUsuario[] getArtistas() throws UsuarioNoExisteException_Exception {
////        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
////        com.servicios.ServicioWeb port = service.getServicioWebPort();
////        return port.getArtistas();
////    }
//
//    public static Artista ObtenerArtista(String nick) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.obtenerArtista(nick);
//    }
//
//    public static void AltaArtistaEliminado(String nickname, String nombre, String apellido, String email, LocalDate fechaNac, String imagen, String biografia, String sitioWeb) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.altaArtistaEliminado(nickname, nombre, apellido, email, fechaNac, imagen, biografia, sitioWeb);
//    }
//
////    public static List<DataUsuario> getClientes() throws UsuarioNoExisteException_Exception {
////        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
////        com.servicios.ServicioWeb port = service.getServicioWebPort();
////        return port.getClientes();
////    }
//
//    public static void EliminarArtistaPorNickname(String nickname) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.eliminarArtistaPorNickname(nickname);
//    }
//
//    public static void EliminarUsuarioTest(String nickname) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.eliminarUsuarioTest(nickname);
//    }
//
//    public static ArtistaEliminado getArtistaEliminado(String nombre) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getArtistaEliminado(nombre);
//    }
//
//    public static Usuario obtenerUsuarioMail(String email) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.obtenerUsuarioMail(email);
//    }
//
//    public static Usuario obtenerUsuario(String nick) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.obtenerUsuario(nick);
//    }
//
//    public static boolean existeMail(String email) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.existeMail(email);
//    }
//
//    public static boolean existeUsuario(String nickname) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.existeUsuario(nickname);
//    }
//
//    public static List<DataUsuario> getDataUsuariosAjax(String s, String tipo) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getDataUsuariosAjax(s, tipo);
//    }
//
//    public static List<String> traerNickNamesClientes() {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.traerNickNamesClientes();
//    }
//
//    //Operaciones LISTA CONSUMO
//    public static Vector<DataLista> traerListasParticularesPublicas() {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return (Vector<DataLista>) port.traerListasParticularesPublicas();
//    }
//
//    public static List<DataLista> traerListasParticularesPorClientes(String nickname) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.traerListasParticularesPorClientes(nickname);
//    }
//
//    public static List<DataLista> traerListasPorDefecto() {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.traerListasPorDefecto();
//    }
//
//    public static boolean Encontrar_Lista_Particular(String nombre_cliente, String nombre_lista) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.encontrarListaParticular(nombre_cliente, nombre_lista);
//    }
//
//    public static void altaListaPart(DataLista dtl) throws ListaRepetidaException_Exception {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.altaListaPart(dtl);
//    }
//
//    public static List<DataLista> getListasParticulares(String nickname) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getListasParticulares(nickname);
//    }
//
//    public static List<DataLista> getDataListasReproduccionAjax(String s, String tipo) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getDataListasReproduccionAjax(s, tipo);
//    }
//
//    public static boolean esPublicaLista(int idLista) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.esPublicaLista(idLista);
//    }
//
//    public static void modificarListaParticularPorId(int listaId) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.modificarListaParticularPorId(listaId);
//    }
//
//    //Operaciones ALBUM-GENERO CONSUMO
//    public static HashSet<String> getGeneros() {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return (HashSet<String>) port.getGeneros();
//    }
//
//    public static List<DataGenero> getGeneros2() throws GeneroNoExisteException_Exception {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getGeneros2();
//    }
//
//    public static String getPadre(String nombreGenero) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getPadre(nombreGenero);
//    }
//
//    public static List<DataAlbum> getAllAlbums() {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getAllAlbums();
//    }
//
//    public static boolean verificaAlbum(String nombreA, String nombreArtista) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.verificaAlbum(nombreA, nombreArtista);
//    }
//
//    public static void addGeneroAlbum(String nombreGenero) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.addGeneroAlbum(nombreGenero);
//    }
//
//    public static void cargarDatosAlbum(String nombre, String nombreArtista, Integer fechaCreacion, String imagen) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.cargarDatosAlbum(nombre, nombreArtista, fechaCreacion, imagen);
//    }
//
//    public static void altaAlbum() {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.altaAlbum();
//    }
//
////    public static List<DataAlbum> getAlbumsByArtista(String artista) throws AlbumNoExisteException_Exception {
////        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
////        com.servicios.ServicioWeb port = service.getServicioWebPort();
////        return port.getAlbumsByArtista(artista);
////    }
//
//    public static Album getAlbum(String nombreA) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getAlbum(nombreA);
//    }
//
//    public static void AltaAlbumEliminado(String nombre, Integer fechaCreacion, String imagenAlbum) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.altaAlbumEliminado(nombre, fechaCreacion, imagenAlbum);
//    }
//
//    public static AlbumEliminado getAlbumEliminado(String nombre) {
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getAlbumEliminado(nombre);
//    }
//
//    public static void EliminarAlbumPorNombre(String nombre){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.eliminarAlbumPorNombre(nombre);
//    }
//    
//    public static List<DataAlbum> getAlbumsByGenero(String genero) throws AlbumNoExisteException_Exception{
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getAlbumsByGenero(genero);
//    }
//    
//    public static List<DataAlbum> getDataAlbumsAjax(String s){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getDataAlbumsAjax(s);
//    }
//    
//    public static Vector<DataAlbum> traerAlbumes(){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return (Vector<DataAlbum>) port.traerAlbumes();
//    }
//    
//    //Operaciones TEMA CONSUMO
//    
//    public static void altaTema(String nombreT, String duracion, Integer posicion, String direccionWeb, String archivo){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.altaTema(nombreT, duracion, posicion, direccionWeb, archivo);
//    }
//    
//    public static List<DataTema> traerTemasPorIdAlbum(Long id){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.traerTemasPorIdAlbum(id);
//    }
//    
//    public static void AltaTemaEliminado(String nombre, String duracion, int posicion, String direccionWeb, String archivo){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.altaTemaEliminado(nombre, duracion, posicion, direccionWeb, archivo);
//    }
//    
//    public static TemaEliminado getTemaEliminado(String nombre){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getTemaEliminado(nombre);
//    }
//    
//    public static boolean existeTemaLista(Long idTema, int idLista){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.existeTemaLista(idTema, idLista);
//    }
//    
//    public static void eliminarTemasListaPart(String nombre, String nombreL, Long idTema){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.eliminarTemasListaPart(nombre, nombreL, idTema);
//    }
//    
//    public static void eliminarTemaListaDef(String nombre, Long idTema){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.eliminarTemaListaDef(nombre, idTema);
//    }
//    
//    public static void EliminarTemaPorNombre(String nombre){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.eliminarTemaPorNombre(nombre);
//    }
//    
//    public static List<DataTema> getDataTemasAjax(String s){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getDataTemasAjax(s);
//    }
//    
//    public static void agregarTemaLista(int idLista, Long idTema){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.agregarTemaLista(idLista, idTema);
//    }
//    
//    public static List<DataTema> traerTemasPorIdListaReproduccion(int id){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.traerTemasPorIdListaReproduccion(id);
//    }
//    
//    public static List<DataTema> traerTemasPorListasPorDefectoId(int listaid){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.traerTemasPorListasPorDefectoId(listaid);
//    }
//    
//    //Operaciones FAVORITOS CONSUMO
//    
//    public static List<DataTema> traerTemasFavoritosPorIdCliente(String nickname){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.traerTemasFavoritosPorIdCliente(nickname);
//    }
//    
//    public static void eliminarTemasFavoritosCliente(String nickname, Long idTema){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.eliminarTemasFavoritosCliente(nickname, idTema);
//    }
//    
//    public static List<DataAlbum> traerAlbumesFavoritosPorIdCliente(String nickname){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.traerAlbumesFavoritosPorIdCliente(nickname);
//    }
//    
//    public static void eliminarAlbumesFavoritosCliente(String nickname, Long idAlbum){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.eliminarAlbumesFavoritosCliente(nickname, idAlbum);
//    }
//    
//    public static void eliminarListaFavoritaCliente(String nickname, int idLista){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.eliminarListaFavoritaCliente(nickname, idLista);
//    }
//    
//    public static List<DataLista> traerListasFavoritasPorIdCliente(String nickname){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.traerListasFavoritasPorIdCliente(nickname);
//    }
//    
//    //Operaciones SEGUIR CONSUMO
//    
//    public static List<DataUsuario> getSeguidores(String nicknameArtista){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.getSeguidores(nicknameArtista);
//    }
//    
//    public static void Dejar_De_Seguir_Usuario(String cliente, String usuario){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.dejarDeSeguirUsuario(cliente, usuario);
//    }
//    
//    public static void Seguir_ALBUM(String cliente_seleccionado,String album_seleccionado){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.seguirALBUM(cliente_seleccionado, album_seleccionado);
//    }
//            
//    public static void Seguir_LISTA(String cliente_seleccionado, String lista_seleccionada){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.seguirLISTA(cliente_seleccionado, lista_seleccionada);
//    }
//            
//    public static void Seguir_TEMA(String cliente_seleccionado, String tema_seleccionado){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.seguirTEMA(cliente_seleccionado, tema_seleccionado);
//    }
//            
//    public static void Seguir_Usuario(String cliente_seleccionado, String nickname_usuario){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.seguirUsuario(cliente_seleccionado, nickname_usuario);
//    }
//            
//    //Operaciones REGISTRO CONSUMO
//    
//    public static void borrarRegistrosAcceso(){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.borrarRegistrosAcceso();
//    }
//            
//    public static int obtenerTotalRegistros(){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.obtenerTotalRegistros();
//    }
//            
//    public static List<DataRegistro> obtenerRegistros(){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.obtenerRegistros();
//    }
//            
//    public static void altaRegistro(String ip, String url, String userAgent, String os){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.altaRegistro(ip, url, userAgent, os);
//    }
//            
//    //Operaciones SUB CONSUMO
//    
//    public static void altaSubscripcion (String nick, String tipo){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        port.altaSubscripcion(nick, tipo);
//    }
//    
//    public static DataSub darSubUsuario(String nick){
//        com.servicios.ServicioWeb_Service service = new com.servicios.ServicioWeb_Service();
//        com.servicios.ServicioWeb port = service.getServicioWebPort();
//        return port.darSubUsuario(nick);
//    }
//            
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//}
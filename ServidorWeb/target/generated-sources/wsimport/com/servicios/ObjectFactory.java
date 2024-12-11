
package com.servicios;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servicios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AlbumNoExisteException_QNAME = new QName("http://servicios.com/", "AlbumNoExisteException");
    private final static QName _AltaAlbumEliminado_QNAME = new QName("http://servicios.com/", "AltaAlbumEliminado");
    private final static QName _AltaAlbumEliminadoResponse_QNAME = new QName("http://servicios.com/", "AltaAlbumEliminadoResponse");
    private final static QName _AltaArtistaEliminado_QNAME = new QName("http://servicios.com/", "AltaArtistaEliminado");
    private final static QName _AltaArtistaEliminadoResponse_QNAME = new QName("http://servicios.com/", "AltaArtistaEliminadoResponse");
    private final static QName _AltaTemaEliminado_QNAME = new QName("http://servicios.com/", "AltaTemaEliminado");
    private final static QName _AltaTemaEliminadoResponse_QNAME = new QName("http://servicios.com/", "AltaTemaEliminadoResponse");
    private final static QName _DataListaRIC_QNAME = new QName("http://servicios.com/", "DataListaRIC");
    private final static QName _DataListaRICResponse_QNAME = new QName("http://servicios.com/", "DataListaRICResponse");
    private final static QName _DataUsuarioArtistaCompleto_QNAME = new QName("http://servicios.com/", "DataUsuarioArtistaCompleto");
    private final static QName _DataUsuarioArtistaCompletoResponse_QNAME = new QName("http://servicios.com/", "DataUsuarioArtistaCompletoResponse");
    private final static QName _DataUsuarioClienteCompleto_QNAME = new QName("http://servicios.com/", "DataUsuarioClienteCompleto");
    private final static QName _DataUsuarioClienteCompletoResponse_QNAME = new QName("http://servicios.com/", "DataUsuarioClienteCompletoResponse");
    private final static QName _DejarDeSeguirUsuario_QNAME = new QName("http://servicios.com/", "Dejar_De_Seguir_Usuario");
    private final static QName _DejarDeSeguirUsuarioResponse_QNAME = new QName("http://servicios.com/", "Dejar_De_Seguir_UsuarioResponse");
    private final static QName _EliminarAlbumPorNombre_QNAME = new QName("http://servicios.com/", "EliminarAlbumPorNombre");
    private final static QName _EliminarAlbumPorNombreResponse_QNAME = new QName("http://servicios.com/", "EliminarAlbumPorNombreResponse");
    private final static QName _EliminarArtistaPorNickname_QNAME = new QName("http://servicios.com/", "EliminarArtistaPorNickname");
    private final static QName _EliminarArtistaPorNicknameResponse_QNAME = new QName("http://servicios.com/", "EliminarArtistaPorNicknameResponse");
    private final static QName _EliminarTemaPorNombre_QNAME = new QName("http://servicios.com/", "EliminarTemaPorNombre");
    private final static QName _EliminarTemaPorNombreResponse_QNAME = new QName("http://servicios.com/", "EliminarTemaPorNombreResponse");
    private final static QName _EliminarUsuarioTest_QNAME = new QName("http://servicios.com/", "EliminarUsuarioTest");
    private final static QName _EliminarUsuarioTestResponse_QNAME = new QName("http://servicios.com/", "EliminarUsuarioTestResponse");
    private final static QName _EncontrarListaParticular_QNAME = new QName("http://servicios.com/", "Encontrar_Lista_Particular");
    private final static QName _EncontrarListaParticularResponse_QNAME = new QName("http://servicios.com/", "Encontrar_Lista_ParticularResponse");
    private final static QName _GeneroNoExisteException_QNAME = new QName("http://servicios.com/", "GeneroNoExisteException");
    private final static QName _ListaRepetidaException_QNAME = new QName("http://servicios.com/", "ListaRepetidaException");
    private final static QName _ObtenerArtista_QNAME = new QName("http://servicios.com/", "ObtenerArtista");
    private final static QName _ObtenerArtistaResponse_QNAME = new QName("http://servicios.com/", "ObtenerArtistaResponse");
    private final static QName _ObtenerCliente_QNAME = new QName("http://servicios.com/", "ObtenerCliente");
    private final static QName _ObtenerClienteResponse_QNAME = new QName("http://servicios.com/", "ObtenerClienteResponse");
    private final static QName _SeguirALBUM_QNAME = new QName("http://servicios.com/", "Seguir_ALBUM");
    private final static QName _SeguirALBUMResponse_QNAME = new QName("http://servicios.com/", "Seguir_ALBUMResponse");
    private final static QName _SeguirLISTA_QNAME = new QName("http://servicios.com/", "Seguir_LISTA");
    private final static QName _SeguirLISTAResponse_QNAME = new QName("http://servicios.com/", "Seguir_LISTAResponse");
    private final static QName _SeguirTEMA_QNAME = new QName("http://servicios.com/", "Seguir_TEMA");
    private final static QName _SeguirTEMAResponse_QNAME = new QName("http://servicios.com/", "Seguir_TEMAResponse");
    private final static QName _SeguirUsuario_QNAME = new QName("http://servicios.com/", "Seguir_Usuario");
    private final static QName _SeguirUsuarioResponse_QNAME = new QName("http://servicios.com/", "Seguir_UsuarioResponse");
    private final static QName _UsuarioNoExisteException_QNAME = new QName("http://servicios.com/", "UsuarioNoExisteException");
    private final static QName _UsuarioRepetidoException_QNAME = new QName("http://servicios.com/", "UsuarioRepetidoException");
    private final static QName _UsuarioSeguidosWeb_QNAME = new QName("http://servicios.com/", "UsuarioSeguidosWeb");
    private final static QName _UsuarioSeguidosWebResponse_QNAME = new QName("http://servicios.com/", "UsuarioSeguidosWebResponse");
    private final static QName _ActualizarAlbumEliminadoSistema_QNAME = new QName("http://servicios.com/", "actualizarAlbumEliminadoSistema");
    private final static QName _ActualizarAlbumEliminadoSistemaResponse_QNAME = new QName("http://servicios.com/", "actualizarAlbumEliminadoSistemaResponse");
    private final static QName _ActualizarArtistaEliminado_QNAME = new QName("http://servicios.com/", "actualizarArtistaEliminado");
    private final static QName _ActualizarArtistaEliminadoResponse_QNAME = new QName("http://servicios.com/", "actualizarArtistaEliminadoResponse");
    private final static QName _ActualizarTemaEliminadoSistema_QNAME = new QName("http://servicios.com/", "actualizarTemaEliminadoSistema");
    private final static QName _ActualizarTemaEliminadoSistemaResponse_QNAME = new QName("http://servicios.com/", "actualizarTemaEliminadoSistemaResponse");
    private final static QName _AddGeneroAlbum_QNAME = new QName("http://servicios.com/", "addGeneroAlbum");
    private final static QName _AddGeneroAlbumResponse_QNAME = new QName("http://servicios.com/", "addGeneroAlbumResponse");
    private final static QName _AgregarTemaLista_QNAME = new QName("http://servicios.com/", "agregarTemaLista");
    private final static QName _AgregarTemaListaResponse_QNAME = new QName("http://servicios.com/", "agregarTemaListaResponse");
    private final static QName _AltaAlbum_QNAME = new QName("http://servicios.com/", "altaAlbum");
    private final static QName _AltaAlbumResponse_QNAME = new QName("http://servicios.com/", "altaAlbumResponse");
    private final static QName _AltaListaPart_QNAME = new QName("http://servicios.com/", "altaListaPart");
    private final static QName _AltaListaPartResponse_QNAME = new QName("http://servicios.com/", "altaListaPartResponse");
    private final static QName _AltaPerfil_QNAME = new QName("http://servicios.com/", "altaPerfil");
    private final static QName _AltaPerfilResponse_QNAME = new QName("http://servicios.com/", "altaPerfilResponse");
    private final static QName _AltaRegistro_QNAME = new QName("http://servicios.com/", "altaRegistro");
    private final static QName _AltaRegistroResponse_QNAME = new QName("http://servicios.com/", "altaRegistroResponse");
    private final static QName _AltaSubscripcion_QNAME = new QName("http://servicios.com/", "altaSubscripcion");
    private final static QName _AltaSubscripcionResponse_QNAME = new QName("http://servicios.com/", "altaSubscripcionResponse");
    private final static QName _AltaTema_QNAME = new QName("http://servicios.com/", "altaTema");
    private final static QName _AltaTemaResponse_QNAME = new QName("http://servicios.com/", "altaTemaResponse");
    private final static QName _BorrarRegistrosAcceso_QNAME = new QName("http://servicios.com/", "borrarRegistrosAcceso");
    private final static QName _BorrarRegistrosAccesoResponse_QNAME = new QName("http://servicios.com/", "borrarRegistrosAccesoResponse");
    private final static QName _CargarDatosAlbum_QNAME = new QName("http://servicios.com/", "cargarDatosAlbum");
    private final static QName _CargarDatosAlbumResponse_QNAME = new QName("http://servicios.com/", "cargarDatosAlbumResponse");
    private final static QName _DarSubUsuario_QNAME = new QName("http://servicios.com/", "darSubUsuario");
    private final static QName _DarSubUsuarioResponse_QNAME = new QName("http://servicios.com/", "darSubUsuarioResponse");
    private final static QName _DataAlbum_QNAME = new QName("http://servicios.com/", "dataAlbum");
    private final static QName _DataLista_QNAME = new QName("http://servicios.com/", "dataLista");
    private final static QName _DataTema_QNAME = new QName("http://servicios.com/", "dataTema");
    private final static QName _DataUsuario_QNAME = new QName("http://servicios.com/", "dataUsuario");
    private final static QName _EliminarAlbumesFavoritosCliente_QNAME = new QName("http://servicios.com/", "eliminarAlbumesFavoritosCliente");
    private final static QName _EliminarAlbumesFavoritosClienteResponse_QNAME = new QName("http://servicios.com/", "eliminarAlbumesFavoritosClienteResponse");
    private final static QName _EliminarGenerosDeAlbum_QNAME = new QName("http://servicios.com/", "eliminarGenerosDeAlbum");
    private final static QName _EliminarGenerosDeAlbumResponse_QNAME = new QName("http://servicios.com/", "eliminarGenerosDeAlbumResponse");
    private final static QName _EliminarListaFavoritaCliente_QNAME = new QName("http://servicios.com/", "eliminarListaFavoritaCliente");
    private final static QName _EliminarListaFavoritaClienteResponse_QNAME = new QName("http://servicios.com/", "eliminarListaFavoritaClienteResponse");
    private final static QName _EliminarTemaListaDef_QNAME = new QName("http://servicios.com/", "eliminarTemaListaDef");
    private final static QName _EliminarTemaListaDefResponse_QNAME = new QName("http://servicios.com/", "eliminarTemaListaDefResponse");
    private final static QName _EliminarTemasFavoritosCliente_QNAME = new QName("http://servicios.com/", "eliminarTemasFavoritosCliente");
    private final static QName _EliminarTemasFavoritosClienteResponse_QNAME = new QName("http://servicios.com/", "eliminarTemasFavoritosClienteResponse");
    private final static QName _EliminarTemasListaPart_QNAME = new QName("http://servicios.com/", "eliminarTemasListaPart");
    private final static QName _EliminarTemasListaPartResponse_QNAME = new QName("http://servicios.com/", "eliminarTemasListaPartResponse");
    private final static QName _EsPublicaLista_QNAME = new QName("http://servicios.com/", "esPublicaLista");
    private final static QName _EsPublicaListaResponse_QNAME = new QName("http://servicios.com/", "esPublicaListaResponse");
    private final static QName _ExisteMail_QNAME = new QName("http://servicios.com/", "existeMail");
    private final static QName _ExisteMailResponse_QNAME = new QName("http://servicios.com/", "existeMailResponse");
    private final static QName _ExisteTemaLista_QNAME = new QName("http://servicios.com/", "existeTemaLista");
    private final static QName _ExisteTemaListaResponse_QNAME = new QName("http://servicios.com/", "existeTemaListaResponse");
    private final static QName _ExisteUsuario_QNAME = new QName("http://servicios.com/", "existeUsuario");
    private final static QName _ExisteUsuarioResponse_QNAME = new QName("http://servicios.com/", "existeUsuarioResponse");
    private final static QName _GetAlbum_QNAME = new QName("http://servicios.com/", "getAlbum");
    private final static QName _GetAlbumEliminado_QNAME = new QName("http://servicios.com/", "getAlbumEliminado");
    private final static QName _GetAlbumEliminadoResponse_QNAME = new QName("http://servicios.com/", "getAlbumEliminadoResponse");
    private final static QName _GetAlbumResponse_QNAME = new QName("http://servicios.com/", "getAlbumResponse");
    private final static QName _GetAlbumsByArtista_QNAME = new QName("http://servicios.com/", "getAlbumsByArtista");
    private final static QName _GetAlbumsByArtista2_QNAME = new QName("http://servicios.com/", "getAlbumsByArtista2");
    private final static QName _GetAlbumsByArtista2Response_QNAME = new QName("http://servicios.com/", "getAlbumsByArtista2Response");
    private final static QName _GetAlbumsByArtistaResponse_QNAME = new QName("http://servicios.com/", "getAlbumsByArtistaResponse");
    private final static QName _GetAlbumsByGenero_QNAME = new QName("http://servicios.com/", "getAlbumsByGenero");
    private final static QName _GetAlbumsByGeneroResponse_QNAME = new QName("http://servicios.com/", "getAlbumsByGeneroResponse");
    private final static QName _GetAllAlbums_QNAME = new QName("http://servicios.com/", "getAllAlbums");
    private final static QName _GetAllAlbumsResponse_QNAME = new QName("http://servicios.com/", "getAllAlbumsResponse");
    private final static QName _GetAllTemas_QNAME = new QName("http://servicios.com/", "getAllTemas");
    private final static QName _GetAllTemasResponse_QNAME = new QName("http://servicios.com/", "getAllTemasResponse");
    private final static QName _GetArtistaEliminado_QNAME = new QName("http://servicios.com/", "getArtistaEliminado");
    private final static QName _GetArtistaEliminadoResponse_QNAME = new QName("http://servicios.com/", "getArtistaEliminadoResponse");
    private final static QName _GetArtistas_QNAME = new QName("http://servicios.com/", "getArtistas");
    private final static QName _GetArtistasResponse_QNAME = new QName("http://servicios.com/", "getArtistasResponse");
    private final static QName _GetClientes_QNAME = new QName("http://servicios.com/", "getClientes");
    private final static QName _GetClientes2_QNAME = new QName("http://servicios.com/", "getClientes2");
    private final static QName _GetClientes2Response_QNAME = new QName("http://servicios.com/", "getClientes2Response");
    private final static QName _GetClientesResponse_QNAME = new QName("http://servicios.com/", "getClientesResponse");
    private final static QName _GetDataAlbumsAjax_QNAME = new QName("http://servicios.com/", "getDataAlbumsAjax");
    private final static QName _GetDataAlbumsAjaxResponse_QNAME = new QName("http://servicios.com/", "getDataAlbumsAjaxResponse");
    private final static QName _GetDataListasReproduccionAjax_QNAME = new QName("http://servicios.com/", "getDataListasReproduccionAjax");
    private final static QName _GetDataListasReproduccionAjaxResponse_QNAME = new QName("http://servicios.com/", "getDataListasReproduccionAjaxResponse");
    private final static QName _GetDataTemasAjax_QNAME = new QName("http://servicios.com/", "getDataTemasAjax");
    private final static QName _GetDataTemasAjaxResponse_QNAME = new QName("http://servicios.com/", "getDataTemasAjaxResponse");
    private final static QName _GetDataUsuariosAjax_QNAME = new QName("http://servicios.com/", "getDataUsuariosAjax");
    private final static QName _GetDataUsuariosAjaxResponse_QNAME = new QName("http://servicios.com/", "getDataUsuariosAjaxResponse");
    private final static QName _GetGeneros_QNAME = new QName("http://servicios.com/", "getGeneros");
    private final static QName _GetGeneros2_QNAME = new QName("http://servicios.com/", "getGeneros2");
    private final static QName _GetGeneros2Response_QNAME = new QName("http://servicios.com/", "getGeneros2Response");
    private final static QName _GetGenerosResponse_QNAME = new QName("http://servicios.com/", "getGenerosResponse");
    private final static QName _GetListasParticulares_QNAME = new QName("http://servicios.com/", "getListasParticulares");
    private final static QName _GetListasParticularesResponse_QNAME = new QName("http://servicios.com/", "getListasParticularesResponse");
    private final static QName _GetPadre_QNAME = new QName("http://servicios.com/", "getPadre");
    private final static QName _GetPadreResponse_QNAME = new QName("http://servicios.com/", "getPadreResponse");
    private final static QName _GetSeguidores_QNAME = new QName("http://servicios.com/", "getSeguidores");
    private final static QName _GetSeguidoresResponse_QNAME = new QName("http://servicios.com/", "getSeguidoresResponse");
    private final static QName _GetTemaEliminado_QNAME = new QName("http://servicios.com/", "getTemaEliminado");
    private final static QName _GetTemaEliminadoResponse_QNAME = new QName("http://servicios.com/", "getTemaEliminadoResponse");
    private final static QName _Hello_QNAME = new QName("http://servicios.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://servicios.com/", "helloResponse");
    private final static QName _ModificarListaParticularPorId_QNAME = new QName("http://servicios.com/", "modificarListaParticularPorId");
    private final static QName _ModificarListaParticularPorIdResponse_QNAME = new QName("http://servicios.com/", "modificarListaParticularPorIdResponse");
    private final static QName _ObtenerRegistros_QNAME = new QName("http://servicios.com/", "obtenerRegistros");
    private final static QName _ObtenerRegistrosResponse_QNAME = new QName("http://servicios.com/", "obtenerRegistrosResponse");
    private final static QName _ObtenerTotalRegistros_QNAME = new QName("http://servicios.com/", "obtenerTotalRegistros");
    private final static QName _ObtenerTotalRegistrosResponse_QNAME = new QName("http://servicios.com/", "obtenerTotalRegistrosResponse");
    private final static QName _ObtenerUsuario_QNAME = new QName("http://servicios.com/", "obtenerUsuario");
    private final static QName _ObtenerUsuarioMail_QNAME = new QName("http://servicios.com/", "obtenerUsuarioMail");
    private final static QName _ObtenerUsuarioMailResponse_QNAME = new QName("http://servicios.com/", "obtenerUsuarioMailResponse");
    private final static QName _ObtenerUsuarioResponse_QNAME = new QName("http://servicios.com/", "obtenerUsuarioResponse");
    private final static QName _TraerAlbumes_QNAME = new QName("http://servicios.com/", "traerAlbumes");
    private final static QName _TraerAlbumesArtista_QNAME = new QName("http://servicios.com/", "traerAlbumesArtista");
    private final static QName _TraerAlbumesArtistaResponse_QNAME = new QName("http://servicios.com/", "traerAlbumesArtistaResponse");
    private final static QName _TraerAlbumesFavoritosPorIdCliente_QNAME = new QName("http://servicios.com/", "traerAlbumesFavoritosPorIdCliente");
    private final static QName _TraerAlbumesFavoritosPorIdClienteResponse_QNAME = new QName("http://servicios.com/", "traerAlbumesFavoritosPorIdClienteResponse");
    private final static QName _TraerAlbumesResponse_QNAME = new QName("http://servicios.com/", "traerAlbumesResponse");
    private final static QName _TraerListasFavoritasPorIdCliente_QNAME = new QName("http://servicios.com/", "traerListasFavoritasPorIdCliente");
    private final static QName _TraerListasFavoritasPorIdClienteResponse_QNAME = new QName("http://servicios.com/", "traerListasFavoritasPorIdClienteResponse");
    private final static QName _TraerListasParticularesPorClientes_QNAME = new QName("http://servicios.com/", "traerListasParticularesPorClientes");
    private final static QName _TraerListasParticularesPorClientesResponse_QNAME = new QName("http://servicios.com/", "traerListasParticularesPorClientesResponse");
    private final static QName _TraerListasParticularesPublicas_QNAME = new QName("http://servicios.com/", "traerListasParticularesPublicas");
    private final static QName _TraerListasParticularesPublicasResponse_QNAME = new QName("http://servicios.com/", "traerListasParticularesPublicasResponse");
    private final static QName _TraerListasPorDefecto_QNAME = new QName("http://servicios.com/", "traerListasPorDefecto");
    private final static QName _TraerListasPorDefectoResponse_QNAME = new QName("http://servicios.com/", "traerListasPorDefectoResponse");
    private final static QName _TraerNickNamesClientes_QNAME = new QName("http://servicios.com/", "traerNickNamesClientes");
    private final static QName _TraerNickNamesClientesResponse_QNAME = new QName("http://servicios.com/", "traerNickNamesClientesResponse");
    private final static QName _TraerTemasFavoritosPorIdCliente_QNAME = new QName("http://servicios.com/", "traerTemasFavoritosPorIdCliente");
    private final static QName _TraerTemasFavoritosPorIdClienteResponse_QNAME = new QName("http://servicios.com/", "traerTemasFavoritosPorIdClienteResponse");
    private final static QName _TraerTemasPorIdAlbum_QNAME = new QName("http://servicios.com/", "traerTemasPorIdAlbum");
    private final static QName _TraerTemasPorIdAlbumResponse_QNAME = new QName("http://servicios.com/", "traerTemasPorIdAlbumResponse");
    private final static QName _TraerTemasPorIdListaReproduccion_QNAME = new QName("http://servicios.com/", "traerTemasPorIdListaReproduccion");
    private final static QName _TraerTemasPorIdListaReproduccionResponse_QNAME = new QName("http://servicios.com/", "traerTemasPorIdListaReproduccionResponse");
    private final static QName _TraerTemasPorListasPorDefectoId_QNAME = new QName("http://servicios.com/", "traerTemasPorListasPorDefectoId");
    private final static QName _TraerTemasPorListasPorDefectoIdResponse_QNAME = new QName("http://servicios.com/", "traerTemasPorListasPorDefectoIdResponse");
    private final static QName _UsuariosSeguidosResponse_QNAME = new QName("http://servicios.com/", "usuariosSeguidosResponse");
    private final static QName _VerificaAlbum_QNAME = new QName("http://servicios.com/", "verificaAlbum");
    private final static QName _VerificaAlbumResponse_QNAME = new QName("http://servicios.com/", "verificaAlbumResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlbumNoExisteException }
     * 
     */
    public AlbumNoExisteException createAlbumNoExisteException() {
        return new AlbumNoExisteException();
    }

    /**
     * Create an instance of {@link AltaAlbumEliminado }
     * 
     */
    public AltaAlbumEliminado createAltaAlbumEliminado() {
        return new AltaAlbumEliminado();
    }

    /**
     * Create an instance of {@link AltaAlbumEliminadoResponse }
     * 
     */
    public AltaAlbumEliminadoResponse createAltaAlbumEliminadoResponse() {
        return new AltaAlbumEliminadoResponse();
    }

    /**
     * Create an instance of {@link AltaArtistaEliminado }
     * 
     */
    public AltaArtistaEliminado createAltaArtistaEliminado() {
        return new AltaArtistaEliminado();
    }

    /**
     * Create an instance of {@link AltaArtistaEliminadoResponse }
     * 
     */
    public AltaArtistaEliminadoResponse createAltaArtistaEliminadoResponse() {
        return new AltaArtistaEliminadoResponse();
    }

    /**
     * Create an instance of {@link AltaTemaEliminado }
     * 
     */
    public AltaTemaEliminado createAltaTemaEliminado() {
        return new AltaTemaEliminado();
    }

    /**
     * Create an instance of {@link AltaTemaEliminadoResponse }
     * 
     */
    public AltaTemaEliminadoResponse createAltaTemaEliminadoResponse() {
        return new AltaTemaEliminadoResponse();
    }

    /**
     * Create an instance of {@link DataListaRIC }
     * 
     */
    public DataListaRIC createDataListaRIC() {
        return new DataListaRIC();
    }

    /**
     * Create an instance of {@link DataListaRICResponse }
     * 
     */
    public DataListaRICResponse createDataListaRICResponse() {
        return new DataListaRICResponse();
    }

    /**
     * Create an instance of {@link DataUsuarioArtistaCompleto }
     * 
     */
    public DataUsuarioArtistaCompleto createDataUsuarioArtistaCompleto() {
        return new DataUsuarioArtistaCompleto();
    }

    /**
     * Create an instance of {@link DataUsuarioArtistaCompletoResponse }
     * 
     */
    public DataUsuarioArtistaCompletoResponse createDataUsuarioArtistaCompletoResponse() {
        return new DataUsuarioArtistaCompletoResponse();
    }

    /**
     * Create an instance of {@link DataUsuarioClienteCompleto }
     * 
     */
    public DataUsuarioClienteCompleto createDataUsuarioClienteCompleto() {
        return new DataUsuarioClienteCompleto();
    }

    /**
     * Create an instance of {@link DataUsuarioClienteCompletoResponse }
     * 
     */
    public DataUsuarioClienteCompletoResponse createDataUsuarioClienteCompletoResponse() {
        return new DataUsuarioClienteCompletoResponse();
    }

    /**
     * Create an instance of {@link DejarDeSeguirUsuario }
     * 
     */
    public DejarDeSeguirUsuario createDejarDeSeguirUsuario() {
        return new DejarDeSeguirUsuario();
    }

    /**
     * Create an instance of {@link DejarDeSeguirUsuarioResponse }
     * 
     */
    public DejarDeSeguirUsuarioResponse createDejarDeSeguirUsuarioResponse() {
        return new DejarDeSeguirUsuarioResponse();
    }

    /**
     * Create an instance of {@link EliminarAlbumPorNombre }
     * 
     */
    public EliminarAlbumPorNombre createEliminarAlbumPorNombre() {
        return new EliminarAlbumPorNombre();
    }

    /**
     * Create an instance of {@link EliminarAlbumPorNombreResponse }
     * 
     */
    public EliminarAlbumPorNombreResponse createEliminarAlbumPorNombreResponse() {
        return new EliminarAlbumPorNombreResponse();
    }

    /**
     * Create an instance of {@link EliminarArtistaPorNickname }
     * 
     */
    public EliminarArtistaPorNickname createEliminarArtistaPorNickname() {
        return new EliminarArtistaPorNickname();
    }

    /**
     * Create an instance of {@link EliminarArtistaPorNicknameResponse }
     * 
     */
    public EliminarArtistaPorNicknameResponse createEliminarArtistaPorNicknameResponse() {
        return new EliminarArtistaPorNicknameResponse();
    }

    /**
     * Create an instance of {@link EliminarTemaPorNombre }
     * 
     */
    public EliminarTemaPorNombre createEliminarTemaPorNombre() {
        return new EliminarTemaPorNombre();
    }

    /**
     * Create an instance of {@link EliminarTemaPorNombreResponse }
     * 
     */
    public EliminarTemaPorNombreResponse createEliminarTemaPorNombreResponse() {
        return new EliminarTemaPorNombreResponse();
    }

    /**
     * Create an instance of {@link EliminarUsuarioTest }
     * 
     */
    public EliminarUsuarioTest createEliminarUsuarioTest() {
        return new EliminarUsuarioTest();
    }

    /**
     * Create an instance of {@link EliminarUsuarioTestResponse }
     * 
     */
    public EliminarUsuarioTestResponse createEliminarUsuarioTestResponse() {
        return new EliminarUsuarioTestResponse();
    }

    /**
     * Create an instance of {@link EncontrarListaParticular }
     * 
     */
    public EncontrarListaParticular createEncontrarListaParticular() {
        return new EncontrarListaParticular();
    }

    /**
     * Create an instance of {@link EncontrarListaParticularResponse }
     * 
     */
    public EncontrarListaParticularResponse createEncontrarListaParticularResponse() {
        return new EncontrarListaParticularResponse();
    }

    /**
     * Create an instance of {@link GeneroNoExisteException }
     * 
     */
    public GeneroNoExisteException createGeneroNoExisteException() {
        return new GeneroNoExisteException();
    }

    /**
     * Create an instance of {@link ListaRepetidaException }
     * 
     */
    public ListaRepetidaException createListaRepetidaException() {
        return new ListaRepetidaException();
    }

    /**
     * Create an instance of {@link ObtenerArtista }
     * 
     */
    public ObtenerArtista createObtenerArtista() {
        return new ObtenerArtista();
    }

    /**
     * Create an instance of {@link ObtenerArtistaResponse }
     * 
     */
    public ObtenerArtistaResponse createObtenerArtistaResponse() {
        return new ObtenerArtistaResponse();
    }

    /**
     * Create an instance of {@link ObtenerCliente }
     * 
     */
    public ObtenerCliente createObtenerCliente() {
        return new ObtenerCliente();
    }

    /**
     * Create an instance of {@link ObtenerClienteResponse }
     * 
     */
    public ObtenerClienteResponse createObtenerClienteResponse() {
        return new ObtenerClienteResponse();
    }

    /**
     * Create an instance of {@link SeguirALBUM }
     * 
     */
    public SeguirALBUM createSeguirALBUM() {
        return new SeguirALBUM();
    }

    /**
     * Create an instance of {@link SeguirALBUMResponse }
     * 
     */
    public SeguirALBUMResponse createSeguirALBUMResponse() {
        return new SeguirALBUMResponse();
    }

    /**
     * Create an instance of {@link SeguirLISTA }
     * 
     */
    public SeguirLISTA createSeguirLISTA() {
        return new SeguirLISTA();
    }

    /**
     * Create an instance of {@link SeguirLISTAResponse }
     * 
     */
    public SeguirLISTAResponse createSeguirLISTAResponse() {
        return new SeguirLISTAResponse();
    }

    /**
     * Create an instance of {@link SeguirTEMA }
     * 
     */
    public SeguirTEMA createSeguirTEMA() {
        return new SeguirTEMA();
    }

    /**
     * Create an instance of {@link SeguirTEMAResponse }
     * 
     */
    public SeguirTEMAResponse createSeguirTEMAResponse() {
        return new SeguirTEMAResponse();
    }

    /**
     * Create an instance of {@link SeguirUsuario }
     * 
     */
    public SeguirUsuario createSeguirUsuario() {
        return new SeguirUsuario();
    }

    /**
     * Create an instance of {@link SeguirUsuarioResponse }
     * 
     */
    public SeguirUsuarioResponse createSeguirUsuarioResponse() {
        return new SeguirUsuarioResponse();
    }

    /**
     * Create an instance of {@link UsuarioNoExisteException }
     * 
     */
    public UsuarioNoExisteException createUsuarioNoExisteException() {
        return new UsuarioNoExisteException();
    }

    /**
     * Create an instance of {@link UsuarioRepetidoException }
     * 
     */
    public UsuarioRepetidoException createUsuarioRepetidoException() {
        return new UsuarioRepetidoException();
    }

    /**
     * Create an instance of {@link UsuarioSeguidosWeb }
     * 
     */
    public UsuarioSeguidosWeb createUsuarioSeguidosWeb() {
        return new UsuarioSeguidosWeb();
    }

    /**
     * Create an instance of {@link UsuarioSeguidosWebResponse }
     * 
     */
    public UsuarioSeguidosWebResponse createUsuarioSeguidosWebResponse() {
        return new UsuarioSeguidosWebResponse();
    }

    /**
     * Create an instance of {@link ActualizarAlbumEliminadoSistema }
     * 
     */
    public ActualizarAlbumEliminadoSistema createActualizarAlbumEliminadoSistema() {
        return new ActualizarAlbumEliminadoSistema();
    }

    /**
     * Create an instance of {@link ActualizarAlbumEliminadoSistemaResponse }
     * 
     */
    public ActualizarAlbumEliminadoSistemaResponse createActualizarAlbumEliminadoSistemaResponse() {
        return new ActualizarAlbumEliminadoSistemaResponse();
    }

    /**
     * Create an instance of {@link ActualizarArtistaEliminado }
     * 
     */
    public ActualizarArtistaEliminado createActualizarArtistaEliminado() {
        return new ActualizarArtistaEliminado();
    }

    /**
     * Create an instance of {@link ActualizarArtistaEliminadoResponse }
     * 
     */
    public ActualizarArtistaEliminadoResponse createActualizarArtistaEliminadoResponse() {
        return new ActualizarArtistaEliminadoResponse();
    }

    /**
     * Create an instance of {@link ActualizarTemaEliminadoSistema }
     * 
     */
    public ActualizarTemaEliminadoSistema createActualizarTemaEliminadoSistema() {
        return new ActualizarTemaEliminadoSistema();
    }

    /**
     * Create an instance of {@link ActualizarTemaEliminadoSistemaResponse }
     * 
     */
    public ActualizarTemaEliminadoSistemaResponse createActualizarTemaEliminadoSistemaResponse() {
        return new ActualizarTemaEliminadoSistemaResponse();
    }

    /**
     * Create an instance of {@link AddGeneroAlbum }
     * 
     */
    public AddGeneroAlbum createAddGeneroAlbum() {
        return new AddGeneroAlbum();
    }

    /**
     * Create an instance of {@link AddGeneroAlbumResponse }
     * 
     */
    public AddGeneroAlbumResponse createAddGeneroAlbumResponse() {
        return new AddGeneroAlbumResponse();
    }

    /**
     * Create an instance of {@link AgregarTemaLista }
     * 
     */
    public AgregarTemaLista createAgregarTemaLista() {
        return new AgregarTemaLista();
    }

    /**
     * Create an instance of {@link AgregarTemaListaResponse }
     * 
     */
    public AgregarTemaListaResponse createAgregarTemaListaResponse() {
        return new AgregarTemaListaResponse();
    }

    /**
     * Create an instance of {@link AltaAlbum }
     * 
     */
    public AltaAlbum createAltaAlbum() {
        return new AltaAlbum();
    }

    /**
     * Create an instance of {@link AltaAlbumResponse }
     * 
     */
    public AltaAlbumResponse createAltaAlbumResponse() {
        return new AltaAlbumResponse();
    }

    /**
     * Create an instance of {@link AltaListaPart }
     * 
     */
    public AltaListaPart createAltaListaPart() {
        return new AltaListaPart();
    }

    /**
     * Create an instance of {@link AltaListaPartResponse }
     * 
     */
    public AltaListaPartResponse createAltaListaPartResponse() {
        return new AltaListaPartResponse();
    }

    /**
     * Create an instance of {@link AltaPerfil }
     * 
     */
    public AltaPerfil createAltaPerfil() {
        return new AltaPerfil();
    }

    /**
     * Create an instance of {@link AltaPerfilResponse }
     * 
     */
    public AltaPerfilResponse createAltaPerfilResponse() {
        return new AltaPerfilResponse();
    }

    /**
     * Create an instance of {@link AltaRegistro }
     * 
     */
    public AltaRegistro createAltaRegistro() {
        return new AltaRegistro();
    }

    /**
     * Create an instance of {@link AltaRegistroResponse }
     * 
     */
    public AltaRegistroResponse createAltaRegistroResponse() {
        return new AltaRegistroResponse();
    }

    /**
     * Create an instance of {@link AltaSubscripcion }
     * 
     */
    public AltaSubscripcion createAltaSubscripcion() {
        return new AltaSubscripcion();
    }

    /**
     * Create an instance of {@link AltaSubscripcionResponse }
     * 
     */
    public AltaSubscripcionResponse createAltaSubscripcionResponse() {
        return new AltaSubscripcionResponse();
    }

    /**
     * Create an instance of {@link AltaTema }
     * 
     */
    public AltaTema createAltaTema() {
        return new AltaTema();
    }

    /**
     * Create an instance of {@link AltaTemaResponse }
     * 
     */
    public AltaTemaResponse createAltaTemaResponse() {
        return new AltaTemaResponse();
    }

    /**
     * Create an instance of {@link BorrarRegistrosAcceso }
     * 
     */
    public BorrarRegistrosAcceso createBorrarRegistrosAcceso() {
        return new BorrarRegistrosAcceso();
    }

    /**
     * Create an instance of {@link BorrarRegistrosAccesoResponse }
     * 
     */
    public BorrarRegistrosAccesoResponse createBorrarRegistrosAccesoResponse() {
        return new BorrarRegistrosAccesoResponse();
    }

    /**
     * Create an instance of {@link CargarDatosAlbum }
     * 
     */
    public CargarDatosAlbum createCargarDatosAlbum() {
        return new CargarDatosAlbum();
    }

    /**
     * Create an instance of {@link CargarDatosAlbumResponse }
     * 
     */
    public CargarDatosAlbumResponse createCargarDatosAlbumResponse() {
        return new CargarDatosAlbumResponse();
    }

    /**
     * Create an instance of {@link DarSubUsuario }
     * 
     */
    public DarSubUsuario createDarSubUsuario() {
        return new DarSubUsuario();
    }

    /**
     * Create an instance of {@link DarSubUsuarioResponse }
     * 
     */
    public DarSubUsuarioResponse createDarSubUsuarioResponse() {
        return new DarSubUsuarioResponse();
    }

    /**
     * Create an instance of {@link DataAlbum }
     * 
     */
    public DataAlbum createDataAlbum() {
        return new DataAlbum();
    }

    /**
     * Create an instance of {@link DataLista }
     * 
     */
    public DataLista createDataLista() {
        return new DataLista();
    }

    /**
     * Create an instance of {@link DataTema }
     * 
     */
    public DataTema createDataTema() {
        return new DataTema();
    }

    /**
     * Create an instance of {@link DataUsuario }
     * 
     */
    public DataUsuario createDataUsuario() {
        return new DataUsuario();
    }

    /**
     * Create an instance of {@link EliminarAlbumesFavoritosCliente }
     * 
     */
    public EliminarAlbumesFavoritosCliente createEliminarAlbumesFavoritosCliente() {
        return new EliminarAlbumesFavoritosCliente();
    }

    /**
     * Create an instance of {@link EliminarAlbumesFavoritosClienteResponse }
     * 
     */
    public EliminarAlbumesFavoritosClienteResponse createEliminarAlbumesFavoritosClienteResponse() {
        return new EliminarAlbumesFavoritosClienteResponse();
    }

    /**
     * Create an instance of {@link EliminarGenerosDeAlbum }
     * 
     */
    public EliminarGenerosDeAlbum createEliminarGenerosDeAlbum() {
        return new EliminarGenerosDeAlbum();
    }

    /**
     * Create an instance of {@link EliminarGenerosDeAlbumResponse }
     * 
     */
    public EliminarGenerosDeAlbumResponse createEliminarGenerosDeAlbumResponse() {
        return new EliminarGenerosDeAlbumResponse();
    }

    /**
     * Create an instance of {@link EliminarListaFavoritaCliente }
     * 
     */
    public EliminarListaFavoritaCliente createEliminarListaFavoritaCliente() {
        return new EliminarListaFavoritaCliente();
    }

    /**
     * Create an instance of {@link EliminarListaFavoritaClienteResponse }
     * 
     */
    public EliminarListaFavoritaClienteResponse createEliminarListaFavoritaClienteResponse() {
        return new EliminarListaFavoritaClienteResponse();
    }

    /**
     * Create an instance of {@link EliminarTemaListaDef }
     * 
     */
    public EliminarTemaListaDef createEliminarTemaListaDef() {
        return new EliminarTemaListaDef();
    }

    /**
     * Create an instance of {@link EliminarTemaListaDefResponse }
     * 
     */
    public EliminarTemaListaDefResponse createEliminarTemaListaDefResponse() {
        return new EliminarTemaListaDefResponse();
    }

    /**
     * Create an instance of {@link EliminarTemasFavoritosCliente }
     * 
     */
    public EliminarTemasFavoritosCliente createEliminarTemasFavoritosCliente() {
        return new EliminarTemasFavoritosCliente();
    }

    /**
     * Create an instance of {@link EliminarTemasFavoritosClienteResponse }
     * 
     */
    public EliminarTemasFavoritosClienteResponse createEliminarTemasFavoritosClienteResponse() {
        return new EliminarTemasFavoritosClienteResponse();
    }

    /**
     * Create an instance of {@link EliminarTemasListaPart }
     * 
     */
    public EliminarTemasListaPart createEliminarTemasListaPart() {
        return new EliminarTemasListaPart();
    }

    /**
     * Create an instance of {@link EliminarTemasListaPartResponse }
     * 
     */
    public EliminarTemasListaPartResponse createEliminarTemasListaPartResponse() {
        return new EliminarTemasListaPartResponse();
    }

    /**
     * Create an instance of {@link EsPublicaLista }
     * 
     */
    public EsPublicaLista createEsPublicaLista() {
        return new EsPublicaLista();
    }

    /**
     * Create an instance of {@link EsPublicaListaResponse }
     * 
     */
    public EsPublicaListaResponse createEsPublicaListaResponse() {
        return new EsPublicaListaResponse();
    }

    /**
     * Create an instance of {@link ExisteMail }
     * 
     */
    public ExisteMail createExisteMail() {
        return new ExisteMail();
    }

    /**
     * Create an instance of {@link ExisteMailResponse }
     * 
     */
    public ExisteMailResponse createExisteMailResponse() {
        return new ExisteMailResponse();
    }

    /**
     * Create an instance of {@link ExisteTemaLista }
     * 
     */
    public ExisteTemaLista createExisteTemaLista() {
        return new ExisteTemaLista();
    }

    /**
     * Create an instance of {@link ExisteTemaListaResponse }
     * 
     */
    public ExisteTemaListaResponse createExisteTemaListaResponse() {
        return new ExisteTemaListaResponse();
    }

    /**
     * Create an instance of {@link ExisteUsuario }
     * 
     */
    public ExisteUsuario createExisteUsuario() {
        return new ExisteUsuario();
    }

    /**
     * Create an instance of {@link ExisteUsuarioResponse }
     * 
     */
    public ExisteUsuarioResponse createExisteUsuarioResponse() {
        return new ExisteUsuarioResponse();
    }

    /**
     * Create an instance of {@link GetAlbum }
     * 
     */
    public GetAlbum createGetAlbum() {
        return new GetAlbum();
    }

    /**
     * Create an instance of {@link GetAlbumEliminado }
     * 
     */
    public GetAlbumEliminado createGetAlbumEliminado() {
        return new GetAlbumEliminado();
    }

    /**
     * Create an instance of {@link GetAlbumEliminadoResponse }
     * 
     */
    public GetAlbumEliminadoResponse createGetAlbumEliminadoResponse() {
        return new GetAlbumEliminadoResponse();
    }

    /**
     * Create an instance of {@link GetAlbumResponse }
     * 
     */
    public GetAlbumResponse createGetAlbumResponse() {
        return new GetAlbumResponse();
    }

    /**
     * Create an instance of {@link GetAlbumsByArtista }
     * 
     */
    public GetAlbumsByArtista createGetAlbumsByArtista() {
        return new GetAlbumsByArtista();
    }

    /**
     * Create an instance of {@link GetAlbumsByArtista2 }
     * 
     */
    public GetAlbumsByArtista2 createGetAlbumsByArtista2() {
        return new GetAlbumsByArtista2();
    }

    /**
     * Create an instance of {@link GetAlbumsByArtista2Response }
     * 
     */
    public GetAlbumsByArtista2Response createGetAlbumsByArtista2Response() {
        return new GetAlbumsByArtista2Response();
    }

    /**
     * Create an instance of {@link GetAlbumsByArtistaResponse }
     * 
     */
    public GetAlbumsByArtistaResponse createGetAlbumsByArtistaResponse() {
        return new GetAlbumsByArtistaResponse();
    }

    /**
     * Create an instance of {@link GetAlbumsByGenero }
     * 
     */
    public GetAlbumsByGenero createGetAlbumsByGenero() {
        return new GetAlbumsByGenero();
    }

    /**
     * Create an instance of {@link GetAlbumsByGeneroResponse }
     * 
     */
    public GetAlbumsByGeneroResponse createGetAlbumsByGeneroResponse() {
        return new GetAlbumsByGeneroResponse();
    }

    /**
     * Create an instance of {@link GetAllAlbums }
     * 
     */
    public GetAllAlbums createGetAllAlbums() {
        return new GetAllAlbums();
    }

    /**
     * Create an instance of {@link GetAllAlbumsResponse }
     * 
     */
    public GetAllAlbumsResponse createGetAllAlbumsResponse() {
        return new GetAllAlbumsResponse();
    }

    /**
     * Create an instance of {@link GetAllTemas }
     * 
     */
    public GetAllTemas createGetAllTemas() {
        return new GetAllTemas();
    }

    /**
     * Create an instance of {@link GetAllTemasResponse }
     * 
     */
    public GetAllTemasResponse createGetAllTemasResponse() {
        return new GetAllTemasResponse();
    }

    /**
     * Create an instance of {@link GetArtistaEliminado }
     * 
     */
    public GetArtistaEliminado createGetArtistaEliminado() {
        return new GetArtistaEliminado();
    }

    /**
     * Create an instance of {@link GetArtistaEliminadoResponse }
     * 
     */
    public GetArtistaEliminadoResponse createGetArtistaEliminadoResponse() {
        return new GetArtistaEliminadoResponse();
    }

    /**
     * Create an instance of {@link GetArtistas }
     * 
     */
    public GetArtistas createGetArtistas() {
        return new GetArtistas();
    }

    /**
     * Create an instance of {@link GetArtistasResponse }
     * 
     */
    public GetArtistasResponse createGetArtistasResponse() {
        return new GetArtistasResponse();
    }

    /**
     * Create an instance of {@link GetClientes }
     * 
     */
    public GetClientes createGetClientes() {
        return new GetClientes();
    }

    /**
     * Create an instance of {@link GetClientes2 }
     * 
     */
    public GetClientes2 createGetClientes2() {
        return new GetClientes2();
    }

    /**
     * Create an instance of {@link GetClientes2Response }
     * 
     */
    public GetClientes2Response createGetClientes2Response() {
        return new GetClientes2Response();
    }

    /**
     * Create an instance of {@link GetClientesResponse }
     * 
     */
    public GetClientesResponse createGetClientesResponse() {
        return new GetClientesResponse();
    }

    /**
     * Create an instance of {@link GetDataAlbumsAjax }
     * 
     */
    public GetDataAlbumsAjax createGetDataAlbumsAjax() {
        return new GetDataAlbumsAjax();
    }

    /**
     * Create an instance of {@link GetDataAlbumsAjaxResponse }
     * 
     */
    public GetDataAlbumsAjaxResponse createGetDataAlbumsAjaxResponse() {
        return new GetDataAlbumsAjaxResponse();
    }

    /**
     * Create an instance of {@link GetDataListasReproduccionAjax }
     * 
     */
    public GetDataListasReproduccionAjax createGetDataListasReproduccionAjax() {
        return new GetDataListasReproduccionAjax();
    }

    /**
     * Create an instance of {@link GetDataListasReproduccionAjaxResponse }
     * 
     */
    public GetDataListasReproduccionAjaxResponse createGetDataListasReproduccionAjaxResponse() {
        return new GetDataListasReproduccionAjaxResponse();
    }

    /**
     * Create an instance of {@link GetDataTemasAjax }
     * 
     */
    public GetDataTemasAjax createGetDataTemasAjax() {
        return new GetDataTemasAjax();
    }

    /**
     * Create an instance of {@link GetDataTemasAjaxResponse }
     * 
     */
    public GetDataTemasAjaxResponse createGetDataTemasAjaxResponse() {
        return new GetDataTemasAjaxResponse();
    }

    /**
     * Create an instance of {@link GetDataUsuariosAjax }
     * 
     */
    public GetDataUsuariosAjax createGetDataUsuariosAjax() {
        return new GetDataUsuariosAjax();
    }

    /**
     * Create an instance of {@link GetDataUsuariosAjaxResponse }
     * 
     */
    public GetDataUsuariosAjaxResponse createGetDataUsuariosAjaxResponse() {
        return new GetDataUsuariosAjaxResponse();
    }

    /**
     * Create an instance of {@link GetGeneros }
     * 
     */
    public GetGeneros createGetGeneros() {
        return new GetGeneros();
    }

    /**
     * Create an instance of {@link GetGeneros2 }
     * 
     */
    public GetGeneros2 createGetGeneros2() {
        return new GetGeneros2();
    }

    /**
     * Create an instance of {@link GetGeneros2Response }
     * 
     */
    public GetGeneros2Response createGetGeneros2Response() {
        return new GetGeneros2Response();
    }

    /**
     * Create an instance of {@link GetGenerosResponse }
     * 
     */
    public GetGenerosResponse createGetGenerosResponse() {
        return new GetGenerosResponse();
    }

    /**
     * Create an instance of {@link GetListasParticulares }
     * 
     */
    public GetListasParticulares createGetListasParticulares() {
        return new GetListasParticulares();
    }

    /**
     * Create an instance of {@link GetListasParticularesResponse }
     * 
     */
    public GetListasParticularesResponse createGetListasParticularesResponse() {
        return new GetListasParticularesResponse();
    }

    /**
     * Create an instance of {@link GetPadre }
     * 
     */
    public GetPadre createGetPadre() {
        return new GetPadre();
    }

    /**
     * Create an instance of {@link GetPadreResponse }
     * 
     */
    public GetPadreResponse createGetPadreResponse() {
        return new GetPadreResponse();
    }

    /**
     * Create an instance of {@link GetSeguidores }
     * 
     */
    public GetSeguidores createGetSeguidores() {
        return new GetSeguidores();
    }

    /**
     * Create an instance of {@link GetSeguidoresResponse }
     * 
     */
    public GetSeguidoresResponse createGetSeguidoresResponse() {
        return new GetSeguidoresResponse();
    }

    /**
     * Create an instance of {@link GetTemaEliminado }
     * 
     */
    public GetTemaEliminado createGetTemaEliminado() {
        return new GetTemaEliminado();
    }

    /**
     * Create an instance of {@link GetTemaEliminadoResponse }
     * 
     */
    public GetTemaEliminadoResponse createGetTemaEliminadoResponse() {
        return new GetTemaEliminadoResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ModificarListaParticularPorId }
     * 
     */
    public ModificarListaParticularPorId createModificarListaParticularPorId() {
        return new ModificarListaParticularPorId();
    }

    /**
     * Create an instance of {@link ModificarListaParticularPorIdResponse }
     * 
     */
    public ModificarListaParticularPorIdResponse createModificarListaParticularPorIdResponse() {
        return new ModificarListaParticularPorIdResponse();
    }

    /**
     * Create an instance of {@link ObtenerRegistros }
     * 
     */
    public ObtenerRegistros createObtenerRegistros() {
        return new ObtenerRegistros();
    }

    /**
     * Create an instance of {@link ObtenerRegistrosResponse }
     * 
     */
    public ObtenerRegistrosResponse createObtenerRegistrosResponse() {
        return new ObtenerRegistrosResponse();
    }

    /**
     * Create an instance of {@link ObtenerTotalRegistros }
     * 
     */
    public ObtenerTotalRegistros createObtenerTotalRegistros() {
        return new ObtenerTotalRegistros();
    }

    /**
     * Create an instance of {@link ObtenerTotalRegistrosResponse }
     * 
     */
    public ObtenerTotalRegistrosResponse createObtenerTotalRegistrosResponse() {
        return new ObtenerTotalRegistrosResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuario }
     * 
     */
    public ObtenerUsuario createObtenerUsuario() {
        return new ObtenerUsuario();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioMail }
     * 
     */
    public ObtenerUsuarioMail createObtenerUsuarioMail() {
        return new ObtenerUsuarioMail();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioMailResponse }
     * 
     */
    public ObtenerUsuarioMailResponse createObtenerUsuarioMailResponse() {
        return new ObtenerUsuarioMailResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioResponse }
     * 
     */
    public ObtenerUsuarioResponse createObtenerUsuarioResponse() {
        return new ObtenerUsuarioResponse();
    }

    /**
     * Create an instance of {@link TraerAlbumes }
     * 
     */
    public TraerAlbumes createTraerAlbumes() {
        return new TraerAlbumes();
    }

    /**
     * Create an instance of {@link TraerAlbumesArtista }
     * 
     */
    public TraerAlbumesArtista createTraerAlbumesArtista() {
        return new TraerAlbumesArtista();
    }

    /**
     * Create an instance of {@link TraerAlbumesArtistaResponse }
     * 
     */
    public TraerAlbumesArtistaResponse createTraerAlbumesArtistaResponse() {
        return new TraerAlbumesArtistaResponse();
    }

    /**
     * Create an instance of {@link TraerAlbumesFavoritosPorIdCliente }
     * 
     */
    public TraerAlbumesFavoritosPorIdCliente createTraerAlbumesFavoritosPorIdCliente() {
        return new TraerAlbumesFavoritosPorIdCliente();
    }

    /**
     * Create an instance of {@link TraerAlbumesFavoritosPorIdClienteResponse }
     * 
     */
    public TraerAlbumesFavoritosPorIdClienteResponse createTraerAlbumesFavoritosPorIdClienteResponse() {
        return new TraerAlbumesFavoritosPorIdClienteResponse();
    }

    /**
     * Create an instance of {@link TraerAlbumesResponse }
     * 
     */
    public TraerAlbumesResponse createTraerAlbumesResponse() {
        return new TraerAlbumesResponse();
    }

    /**
     * Create an instance of {@link TraerListasFavoritasPorIdCliente }
     * 
     */
    public TraerListasFavoritasPorIdCliente createTraerListasFavoritasPorIdCliente() {
        return new TraerListasFavoritasPorIdCliente();
    }

    /**
     * Create an instance of {@link TraerListasFavoritasPorIdClienteResponse }
     * 
     */
    public TraerListasFavoritasPorIdClienteResponse createTraerListasFavoritasPorIdClienteResponse() {
        return new TraerListasFavoritasPorIdClienteResponse();
    }

    /**
     * Create an instance of {@link TraerListasParticularesPorClientes }
     * 
     */
    public TraerListasParticularesPorClientes createTraerListasParticularesPorClientes() {
        return new TraerListasParticularesPorClientes();
    }

    /**
     * Create an instance of {@link TraerListasParticularesPorClientesResponse }
     * 
     */
    public TraerListasParticularesPorClientesResponse createTraerListasParticularesPorClientesResponse() {
        return new TraerListasParticularesPorClientesResponse();
    }

    /**
     * Create an instance of {@link TraerListasParticularesPublicas }
     * 
     */
    public TraerListasParticularesPublicas createTraerListasParticularesPublicas() {
        return new TraerListasParticularesPublicas();
    }

    /**
     * Create an instance of {@link TraerListasParticularesPublicasResponse }
     * 
     */
    public TraerListasParticularesPublicasResponse createTraerListasParticularesPublicasResponse() {
        return new TraerListasParticularesPublicasResponse();
    }

    /**
     * Create an instance of {@link TraerListasPorDefecto }
     * 
     */
    public TraerListasPorDefecto createTraerListasPorDefecto() {
        return new TraerListasPorDefecto();
    }

    /**
     * Create an instance of {@link TraerListasPorDefectoResponse }
     * 
     */
    public TraerListasPorDefectoResponse createTraerListasPorDefectoResponse() {
        return new TraerListasPorDefectoResponse();
    }

    /**
     * Create an instance of {@link TraerNickNamesClientes }
     * 
     */
    public TraerNickNamesClientes createTraerNickNamesClientes() {
        return new TraerNickNamesClientes();
    }

    /**
     * Create an instance of {@link TraerNickNamesClientesResponse }
     * 
     */
    public TraerNickNamesClientesResponse createTraerNickNamesClientesResponse() {
        return new TraerNickNamesClientesResponse();
    }

    /**
     * Create an instance of {@link TraerTemasFavoritosPorIdCliente }
     * 
     */
    public TraerTemasFavoritosPorIdCliente createTraerTemasFavoritosPorIdCliente() {
        return new TraerTemasFavoritosPorIdCliente();
    }

    /**
     * Create an instance of {@link TraerTemasFavoritosPorIdClienteResponse }
     * 
     */
    public TraerTemasFavoritosPorIdClienteResponse createTraerTemasFavoritosPorIdClienteResponse() {
        return new TraerTemasFavoritosPorIdClienteResponse();
    }

    /**
     * Create an instance of {@link TraerTemasPorIdAlbum }
     * 
     */
    public TraerTemasPorIdAlbum createTraerTemasPorIdAlbum() {
        return new TraerTemasPorIdAlbum();
    }

    /**
     * Create an instance of {@link TraerTemasPorIdAlbumResponse }
     * 
     */
    public TraerTemasPorIdAlbumResponse createTraerTemasPorIdAlbumResponse() {
        return new TraerTemasPorIdAlbumResponse();
    }

    /**
     * Create an instance of {@link TraerTemasPorIdListaReproduccion }
     * 
     */
    public TraerTemasPorIdListaReproduccion createTraerTemasPorIdListaReproduccion() {
        return new TraerTemasPorIdListaReproduccion();
    }

    /**
     * Create an instance of {@link TraerTemasPorIdListaReproduccionResponse }
     * 
     */
    public TraerTemasPorIdListaReproduccionResponse createTraerTemasPorIdListaReproduccionResponse() {
        return new TraerTemasPorIdListaReproduccionResponse();
    }

    /**
     * Create an instance of {@link TraerTemasPorListasPorDefectoId }
     * 
     */
    public TraerTemasPorListasPorDefectoId createTraerTemasPorListasPorDefectoId() {
        return new TraerTemasPorListasPorDefectoId();
    }

    /**
     * Create an instance of {@link TraerTemasPorListasPorDefectoIdResponse }
     * 
     */
    public TraerTemasPorListasPorDefectoIdResponse createTraerTemasPorListasPorDefectoIdResponse() {
        return new TraerTemasPorListasPorDefectoIdResponse();
    }

    /**
     * Create an instance of {@link UsuariosSeguidosResponse }
     * 
     */
    public UsuariosSeguidosResponse createUsuariosSeguidosResponse() {
        return new UsuariosSeguidosResponse();
    }

    /**
     * Create an instance of {@link VerificaAlbum }
     * 
     */
    public VerificaAlbum createVerificaAlbum() {
        return new VerificaAlbum();
    }

    /**
     * Create an instance of {@link VerificaAlbumResponse }
     * 
     */
    public VerificaAlbumResponse createVerificaAlbumResponse() {
        return new VerificaAlbumResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link LocalDate }
     * 
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link Artista }
     * 
     */
    public Artista createArtista() {
        return new Artista();
    }

    /**
     * Create an instance of {@link TemaEliminado }
     * 
     */
    public TemaEliminado createTemaEliminado() {
        return new TemaEliminado();
    }

    /**
     * Create an instance of {@link AlbumEliminado }
     * 
     */
    public AlbumEliminado createAlbumEliminado() {
        return new AlbumEliminado();
    }

    /**
     * Create an instance of {@link ArtistaEliminado }
     * 
     */
    public ArtistaEliminado createArtistaEliminado() {
        return new ArtistaEliminado();
    }

    /**
     * Create an instance of {@link DataSub }
     * 
     */
    public DataSub createDataSub() {
        return new DataSub();
    }

    /**
     * Create an instance of {@link Album }
     * 
     */
    public Album createAlbum() {
        return new Album();
    }

    /**
     * Create an instance of {@link Tema }
     * 
     */
    public Tema createTema() {
        return new Tema();
    }

    /**
     * Create an instance of {@link DataRegistro }
     * 
     */
    public DataRegistro createDataRegistro() {
        return new DataRegistro();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link ListaParticular }
     * 
     */
    public ListaParticular createListaParticular() {
        return new ListaParticular();
    }

    /**
     * Create an instance of {@link ListaReproduccion }
     * 
     */
    public ListaReproduccion createListaReproduccion() {
        return new ListaReproduccion();
    }

    /**
     * Create an instance of {@link Subscripcion }
     * 
     */
    public Subscripcion createSubscripcion() {
        return new Subscripcion();
    }

    /**
     * Create an instance of {@link DataGenero }
     * 
     */
    public DataGenero createDataGenero() {
        return new DataGenero();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlbumNoExisteException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlbumNoExisteException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "AlbumNoExisteException")
    public JAXBElement<AlbumNoExisteException> createAlbumNoExisteException(AlbumNoExisteException value) {
        return new JAXBElement<AlbumNoExisteException>(_AlbumNoExisteException_QNAME, AlbumNoExisteException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaAlbumEliminado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaAlbumEliminado }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "AltaAlbumEliminado")
    public JAXBElement<AltaAlbumEliminado> createAltaAlbumEliminado(AltaAlbumEliminado value) {
        return new JAXBElement<AltaAlbumEliminado>(_AltaAlbumEliminado_QNAME, AltaAlbumEliminado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaAlbumEliminadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaAlbumEliminadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "AltaAlbumEliminadoResponse")
    public JAXBElement<AltaAlbumEliminadoResponse> createAltaAlbumEliminadoResponse(AltaAlbumEliminadoResponse value) {
        return new JAXBElement<AltaAlbumEliminadoResponse>(_AltaAlbumEliminadoResponse_QNAME, AltaAlbumEliminadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaArtistaEliminado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaArtistaEliminado }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "AltaArtistaEliminado")
    public JAXBElement<AltaArtistaEliminado> createAltaArtistaEliminado(AltaArtistaEliminado value) {
        return new JAXBElement<AltaArtistaEliminado>(_AltaArtistaEliminado_QNAME, AltaArtistaEliminado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaArtistaEliminadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaArtistaEliminadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "AltaArtistaEliminadoResponse")
    public JAXBElement<AltaArtistaEliminadoResponse> createAltaArtistaEliminadoResponse(AltaArtistaEliminadoResponse value) {
        return new JAXBElement<AltaArtistaEliminadoResponse>(_AltaArtistaEliminadoResponse_QNAME, AltaArtistaEliminadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaTemaEliminado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaTemaEliminado }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "AltaTemaEliminado")
    public JAXBElement<AltaTemaEliminado> createAltaTemaEliminado(AltaTemaEliminado value) {
        return new JAXBElement<AltaTemaEliminado>(_AltaTemaEliminado_QNAME, AltaTemaEliminado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaTemaEliminadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaTemaEliminadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "AltaTemaEliminadoResponse")
    public JAXBElement<AltaTemaEliminadoResponse> createAltaTemaEliminadoResponse(AltaTemaEliminadoResponse value) {
        return new JAXBElement<AltaTemaEliminadoResponse>(_AltaTemaEliminadoResponse_QNAME, AltaTemaEliminadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataListaRIC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataListaRIC }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "DataListaRIC")
    public JAXBElement<DataListaRIC> createDataListaRIC(DataListaRIC value) {
        return new JAXBElement<DataListaRIC>(_DataListaRIC_QNAME, DataListaRIC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataListaRICResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataListaRICResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "DataListaRICResponse")
    public JAXBElement<DataListaRICResponse> createDataListaRICResponse(DataListaRICResponse value) {
        return new JAXBElement<DataListaRICResponse>(_DataListaRICResponse_QNAME, DataListaRICResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataUsuarioArtistaCompleto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataUsuarioArtistaCompleto }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "DataUsuarioArtistaCompleto")
    public JAXBElement<DataUsuarioArtistaCompleto> createDataUsuarioArtistaCompleto(DataUsuarioArtistaCompleto value) {
        return new JAXBElement<DataUsuarioArtistaCompleto>(_DataUsuarioArtistaCompleto_QNAME, DataUsuarioArtistaCompleto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataUsuarioArtistaCompletoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataUsuarioArtistaCompletoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "DataUsuarioArtistaCompletoResponse")
    public JAXBElement<DataUsuarioArtistaCompletoResponse> createDataUsuarioArtistaCompletoResponse(DataUsuarioArtistaCompletoResponse value) {
        return new JAXBElement<DataUsuarioArtistaCompletoResponse>(_DataUsuarioArtistaCompletoResponse_QNAME, DataUsuarioArtistaCompletoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataUsuarioClienteCompleto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataUsuarioClienteCompleto }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "DataUsuarioClienteCompleto")
    public JAXBElement<DataUsuarioClienteCompleto> createDataUsuarioClienteCompleto(DataUsuarioClienteCompleto value) {
        return new JAXBElement<DataUsuarioClienteCompleto>(_DataUsuarioClienteCompleto_QNAME, DataUsuarioClienteCompleto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataUsuarioClienteCompletoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataUsuarioClienteCompletoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "DataUsuarioClienteCompletoResponse")
    public JAXBElement<DataUsuarioClienteCompletoResponse> createDataUsuarioClienteCompletoResponse(DataUsuarioClienteCompletoResponse value) {
        return new JAXBElement<DataUsuarioClienteCompletoResponse>(_DataUsuarioClienteCompletoResponse_QNAME, DataUsuarioClienteCompletoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DejarDeSeguirUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DejarDeSeguirUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "Dejar_De_Seguir_Usuario")
    public JAXBElement<DejarDeSeguirUsuario> createDejarDeSeguirUsuario(DejarDeSeguirUsuario value) {
        return new JAXBElement<DejarDeSeguirUsuario>(_DejarDeSeguirUsuario_QNAME, DejarDeSeguirUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DejarDeSeguirUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DejarDeSeguirUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "Dejar_De_Seguir_UsuarioResponse")
    public JAXBElement<DejarDeSeguirUsuarioResponse> createDejarDeSeguirUsuarioResponse(DejarDeSeguirUsuarioResponse value) {
        return new JAXBElement<DejarDeSeguirUsuarioResponse>(_DejarDeSeguirUsuarioResponse_QNAME, DejarDeSeguirUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAlbumPorNombre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarAlbumPorNombre }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "EliminarAlbumPorNombre")
    public JAXBElement<EliminarAlbumPorNombre> createEliminarAlbumPorNombre(EliminarAlbumPorNombre value) {
        return new JAXBElement<EliminarAlbumPorNombre>(_EliminarAlbumPorNombre_QNAME, EliminarAlbumPorNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAlbumPorNombreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarAlbumPorNombreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "EliminarAlbumPorNombreResponse")
    public JAXBElement<EliminarAlbumPorNombreResponse> createEliminarAlbumPorNombreResponse(EliminarAlbumPorNombreResponse value) {
        return new JAXBElement<EliminarAlbumPorNombreResponse>(_EliminarAlbumPorNombreResponse_QNAME, EliminarAlbumPorNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarArtistaPorNickname }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarArtistaPorNickname }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "EliminarArtistaPorNickname")
    public JAXBElement<EliminarArtistaPorNickname> createEliminarArtistaPorNickname(EliminarArtistaPorNickname value) {
        return new JAXBElement<EliminarArtistaPorNickname>(_EliminarArtistaPorNickname_QNAME, EliminarArtistaPorNickname.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarArtistaPorNicknameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarArtistaPorNicknameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "EliminarArtistaPorNicknameResponse")
    public JAXBElement<EliminarArtistaPorNicknameResponse> createEliminarArtistaPorNicknameResponse(EliminarArtistaPorNicknameResponse value) {
        return new JAXBElement<EliminarArtistaPorNicknameResponse>(_EliminarArtistaPorNicknameResponse_QNAME, EliminarArtistaPorNicknameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTemaPorNombre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarTemaPorNombre }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "EliminarTemaPorNombre")
    public JAXBElement<EliminarTemaPorNombre> createEliminarTemaPorNombre(EliminarTemaPorNombre value) {
        return new JAXBElement<EliminarTemaPorNombre>(_EliminarTemaPorNombre_QNAME, EliminarTemaPorNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTemaPorNombreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarTemaPorNombreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "EliminarTemaPorNombreResponse")
    public JAXBElement<EliminarTemaPorNombreResponse> createEliminarTemaPorNombreResponse(EliminarTemaPorNombreResponse value) {
        return new JAXBElement<EliminarTemaPorNombreResponse>(_EliminarTemaPorNombreResponse_QNAME, EliminarTemaPorNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioTest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioTest }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "EliminarUsuarioTest")
    public JAXBElement<EliminarUsuarioTest> createEliminarUsuarioTest(EliminarUsuarioTest value) {
        return new JAXBElement<EliminarUsuarioTest>(_EliminarUsuarioTest_QNAME, EliminarUsuarioTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioTestResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioTestResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "EliminarUsuarioTestResponse")
    public JAXBElement<EliminarUsuarioTestResponse> createEliminarUsuarioTestResponse(EliminarUsuarioTestResponse value) {
        return new JAXBElement<EliminarUsuarioTestResponse>(_EliminarUsuarioTestResponse_QNAME, EliminarUsuarioTestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarListaParticular }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EncontrarListaParticular }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "Encontrar_Lista_Particular")
    public JAXBElement<EncontrarListaParticular> createEncontrarListaParticular(EncontrarListaParticular value) {
        return new JAXBElement<EncontrarListaParticular>(_EncontrarListaParticular_QNAME, EncontrarListaParticular.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarListaParticularResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EncontrarListaParticularResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "Encontrar_Lista_ParticularResponse")
    public JAXBElement<EncontrarListaParticularResponse> createEncontrarListaParticularResponse(EncontrarListaParticularResponse value) {
        return new JAXBElement<EncontrarListaParticularResponse>(_EncontrarListaParticularResponse_QNAME, EncontrarListaParticularResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneroNoExisteException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeneroNoExisteException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "GeneroNoExisteException")
    public JAXBElement<GeneroNoExisteException> createGeneroNoExisteException(GeneroNoExisteException value) {
        return new JAXBElement<GeneroNoExisteException>(_GeneroNoExisteException_QNAME, GeneroNoExisteException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaRepetidaException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListaRepetidaException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "ListaRepetidaException")
    public JAXBElement<ListaRepetidaException> createListaRepetidaException(ListaRepetidaException value) {
        return new JAXBElement<ListaRepetidaException>(_ListaRepetidaException_QNAME, ListaRepetidaException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerArtista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerArtista }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "ObtenerArtista")
    public JAXBElement<ObtenerArtista> createObtenerArtista(ObtenerArtista value) {
        return new JAXBElement<ObtenerArtista>(_ObtenerArtista_QNAME, ObtenerArtista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerArtistaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerArtistaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "ObtenerArtistaResponse")
    public JAXBElement<ObtenerArtistaResponse> createObtenerArtistaResponse(ObtenerArtistaResponse value) {
        return new JAXBElement<ObtenerArtistaResponse>(_ObtenerArtistaResponse_QNAME, ObtenerArtistaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "ObtenerCliente")
    public JAXBElement<ObtenerCliente> createObtenerCliente(ObtenerCliente value) {
        return new JAXBElement<ObtenerCliente>(_ObtenerCliente_QNAME, ObtenerCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "ObtenerClienteResponse")
    public JAXBElement<ObtenerClienteResponse> createObtenerClienteResponse(ObtenerClienteResponse value) {
        return new JAXBElement<ObtenerClienteResponse>(_ObtenerClienteResponse_QNAME, ObtenerClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguirALBUM }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeguirALBUM }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "Seguir_ALBUM")
    public JAXBElement<SeguirALBUM> createSeguirALBUM(SeguirALBUM value) {
        return new JAXBElement<SeguirALBUM>(_SeguirALBUM_QNAME, SeguirALBUM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguirALBUMResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeguirALBUMResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "Seguir_ALBUMResponse")
    public JAXBElement<SeguirALBUMResponse> createSeguirALBUMResponse(SeguirALBUMResponse value) {
        return new JAXBElement<SeguirALBUMResponse>(_SeguirALBUMResponse_QNAME, SeguirALBUMResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguirLISTA }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeguirLISTA }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "Seguir_LISTA")
    public JAXBElement<SeguirLISTA> createSeguirLISTA(SeguirLISTA value) {
        return new JAXBElement<SeguirLISTA>(_SeguirLISTA_QNAME, SeguirLISTA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguirLISTAResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeguirLISTAResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "Seguir_LISTAResponse")
    public JAXBElement<SeguirLISTAResponse> createSeguirLISTAResponse(SeguirLISTAResponse value) {
        return new JAXBElement<SeguirLISTAResponse>(_SeguirLISTAResponse_QNAME, SeguirLISTAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguirTEMA }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeguirTEMA }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "Seguir_TEMA")
    public JAXBElement<SeguirTEMA> createSeguirTEMA(SeguirTEMA value) {
        return new JAXBElement<SeguirTEMA>(_SeguirTEMA_QNAME, SeguirTEMA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguirTEMAResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeguirTEMAResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "Seguir_TEMAResponse")
    public JAXBElement<SeguirTEMAResponse> createSeguirTEMAResponse(SeguirTEMAResponse value) {
        return new JAXBElement<SeguirTEMAResponse>(_SeguirTEMAResponse_QNAME, SeguirTEMAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguirUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeguirUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "Seguir_Usuario")
    public JAXBElement<SeguirUsuario> createSeguirUsuario(SeguirUsuario value) {
        return new JAXBElement<SeguirUsuario>(_SeguirUsuario_QNAME, SeguirUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguirUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeguirUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "Seguir_UsuarioResponse")
    public JAXBElement<SeguirUsuarioResponse> createSeguirUsuarioResponse(SeguirUsuarioResponse value) {
        return new JAXBElement<SeguirUsuarioResponse>(_SeguirUsuarioResponse_QNAME, SeguirUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioNoExisteException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioNoExisteException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "UsuarioNoExisteException")
    public JAXBElement<UsuarioNoExisteException> createUsuarioNoExisteException(UsuarioNoExisteException value) {
        return new JAXBElement<UsuarioNoExisteException>(_UsuarioNoExisteException_QNAME, UsuarioNoExisteException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioRepetidoException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioRepetidoException }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "UsuarioRepetidoException")
    public JAXBElement<UsuarioRepetidoException> createUsuarioRepetidoException(UsuarioRepetidoException value) {
        return new JAXBElement<UsuarioRepetidoException>(_UsuarioRepetidoException_QNAME, UsuarioRepetidoException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioSeguidosWeb }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioSeguidosWeb }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "UsuarioSeguidosWeb")
    public JAXBElement<UsuarioSeguidosWeb> createUsuarioSeguidosWeb(UsuarioSeguidosWeb value) {
        return new JAXBElement<UsuarioSeguidosWeb>(_UsuarioSeguidosWeb_QNAME, UsuarioSeguidosWeb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioSeguidosWebResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioSeguidosWebResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "UsuarioSeguidosWebResponse")
    public JAXBElement<UsuarioSeguidosWebResponse> createUsuarioSeguidosWebResponse(UsuarioSeguidosWebResponse value) {
        return new JAXBElement<UsuarioSeguidosWebResponse>(_UsuarioSeguidosWebResponse_QNAME, UsuarioSeguidosWebResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAlbumEliminadoSistema }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarAlbumEliminadoSistema }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "actualizarAlbumEliminadoSistema")
    public JAXBElement<ActualizarAlbumEliminadoSistema> createActualizarAlbumEliminadoSistema(ActualizarAlbumEliminadoSistema value) {
        return new JAXBElement<ActualizarAlbumEliminadoSistema>(_ActualizarAlbumEliminadoSistema_QNAME, ActualizarAlbumEliminadoSistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAlbumEliminadoSistemaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarAlbumEliminadoSistemaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "actualizarAlbumEliminadoSistemaResponse")
    public JAXBElement<ActualizarAlbumEliminadoSistemaResponse> createActualizarAlbumEliminadoSistemaResponse(ActualizarAlbumEliminadoSistemaResponse value) {
        return new JAXBElement<ActualizarAlbumEliminadoSistemaResponse>(_ActualizarAlbumEliminadoSistemaResponse_QNAME, ActualizarAlbumEliminadoSistemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarArtistaEliminado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarArtistaEliminado }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "actualizarArtistaEliminado")
    public JAXBElement<ActualizarArtistaEliminado> createActualizarArtistaEliminado(ActualizarArtistaEliminado value) {
        return new JAXBElement<ActualizarArtistaEliminado>(_ActualizarArtistaEliminado_QNAME, ActualizarArtistaEliminado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarArtistaEliminadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarArtistaEliminadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "actualizarArtistaEliminadoResponse")
    public JAXBElement<ActualizarArtistaEliminadoResponse> createActualizarArtistaEliminadoResponse(ActualizarArtistaEliminadoResponse value) {
        return new JAXBElement<ActualizarArtistaEliminadoResponse>(_ActualizarArtistaEliminadoResponse_QNAME, ActualizarArtistaEliminadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarTemaEliminadoSistema }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarTemaEliminadoSistema }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "actualizarTemaEliminadoSistema")
    public JAXBElement<ActualizarTemaEliminadoSistema> createActualizarTemaEliminadoSistema(ActualizarTemaEliminadoSistema value) {
        return new JAXBElement<ActualizarTemaEliminadoSistema>(_ActualizarTemaEliminadoSistema_QNAME, ActualizarTemaEliminadoSistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarTemaEliminadoSistemaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarTemaEliminadoSistemaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "actualizarTemaEliminadoSistemaResponse")
    public JAXBElement<ActualizarTemaEliminadoSistemaResponse> createActualizarTemaEliminadoSistemaResponse(ActualizarTemaEliminadoSistemaResponse value) {
        return new JAXBElement<ActualizarTemaEliminadoSistemaResponse>(_ActualizarTemaEliminadoSistemaResponse_QNAME, ActualizarTemaEliminadoSistemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGeneroAlbum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddGeneroAlbum }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "addGeneroAlbum")
    public JAXBElement<AddGeneroAlbum> createAddGeneroAlbum(AddGeneroAlbum value) {
        return new JAXBElement<AddGeneroAlbum>(_AddGeneroAlbum_QNAME, AddGeneroAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGeneroAlbumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddGeneroAlbumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "addGeneroAlbumResponse")
    public JAXBElement<AddGeneroAlbumResponse> createAddGeneroAlbumResponse(AddGeneroAlbumResponse value) {
        return new JAXBElement<AddGeneroAlbumResponse>(_AddGeneroAlbumResponse_QNAME, AddGeneroAlbumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarTemaLista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarTemaLista }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "agregarTemaLista")
    public JAXBElement<AgregarTemaLista> createAgregarTemaLista(AgregarTemaLista value) {
        return new JAXBElement<AgregarTemaLista>(_AgregarTemaLista_QNAME, AgregarTemaLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarTemaListaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarTemaListaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "agregarTemaListaResponse")
    public JAXBElement<AgregarTemaListaResponse> createAgregarTemaListaResponse(AgregarTemaListaResponse value) {
        return new JAXBElement<AgregarTemaListaResponse>(_AgregarTemaListaResponse_QNAME, AgregarTemaListaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaAlbum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaAlbum }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "altaAlbum")
    public JAXBElement<AltaAlbum> createAltaAlbum(AltaAlbum value) {
        return new JAXBElement<AltaAlbum>(_AltaAlbum_QNAME, AltaAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaAlbumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaAlbumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "altaAlbumResponse")
    public JAXBElement<AltaAlbumResponse> createAltaAlbumResponse(AltaAlbumResponse value) {
        return new JAXBElement<AltaAlbumResponse>(_AltaAlbumResponse_QNAME, AltaAlbumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaListaPart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaListaPart }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "altaListaPart")
    public JAXBElement<AltaListaPart> createAltaListaPart(AltaListaPart value) {
        return new JAXBElement<AltaListaPart>(_AltaListaPart_QNAME, AltaListaPart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaListaPartResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaListaPartResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "altaListaPartResponse")
    public JAXBElement<AltaListaPartResponse> createAltaListaPartResponse(AltaListaPartResponse value) {
        return new JAXBElement<AltaListaPartResponse>(_AltaListaPartResponse_QNAME, AltaListaPartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaPerfil }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaPerfil }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "altaPerfil")
    public JAXBElement<AltaPerfil> createAltaPerfil(AltaPerfil value) {
        return new JAXBElement<AltaPerfil>(_AltaPerfil_QNAME, AltaPerfil.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaPerfilResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaPerfilResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "altaPerfilResponse")
    public JAXBElement<AltaPerfilResponse> createAltaPerfilResponse(AltaPerfilResponse value) {
        return new JAXBElement<AltaPerfilResponse>(_AltaPerfilResponse_QNAME, AltaPerfilResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaRegistro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaRegistro }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "altaRegistro")
    public JAXBElement<AltaRegistro> createAltaRegistro(AltaRegistro value) {
        return new JAXBElement<AltaRegistro>(_AltaRegistro_QNAME, AltaRegistro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaRegistroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaRegistroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "altaRegistroResponse")
    public JAXBElement<AltaRegistroResponse> createAltaRegistroResponse(AltaRegistroResponse value) {
        return new JAXBElement<AltaRegistroResponse>(_AltaRegistroResponse_QNAME, AltaRegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaSubscripcion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaSubscripcion }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "altaSubscripcion")
    public JAXBElement<AltaSubscripcion> createAltaSubscripcion(AltaSubscripcion value) {
        return new JAXBElement<AltaSubscripcion>(_AltaSubscripcion_QNAME, AltaSubscripcion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaSubscripcionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaSubscripcionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "altaSubscripcionResponse")
    public JAXBElement<AltaSubscripcionResponse> createAltaSubscripcionResponse(AltaSubscripcionResponse value) {
        return new JAXBElement<AltaSubscripcionResponse>(_AltaSubscripcionResponse_QNAME, AltaSubscripcionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaTema }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaTema }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "altaTema")
    public JAXBElement<AltaTema> createAltaTema(AltaTema value) {
        return new JAXBElement<AltaTema>(_AltaTema_QNAME, AltaTema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaTemaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltaTemaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "altaTemaResponse")
    public JAXBElement<AltaTemaResponse> createAltaTemaResponse(AltaTemaResponse value) {
        return new JAXBElement<AltaTemaResponse>(_AltaTemaResponse_QNAME, AltaTemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarRegistrosAcceso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BorrarRegistrosAcceso }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "borrarRegistrosAcceso")
    public JAXBElement<BorrarRegistrosAcceso> createBorrarRegistrosAcceso(BorrarRegistrosAcceso value) {
        return new JAXBElement<BorrarRegistrosAcceso>(_BorrarRegistrosAcceso_QNAME, BorrarRegistrosAcceso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarRegistrosAccesoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BorrarRegistrosAccesoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "borrarRegistrosAccesoResponse")
    public JAXBElement<BorrarRegistrosAccesoResponse> createBorrarRegistrosAccesoResponse(BorrarRegistrosAccesoResponse value) {
        return new JAXBElement<BorrarRegistrosAccesoResponse>(_BorrarRegistrosAccesoResponse_QNAME, BorrarRegistrosAccesoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarDatosAlbum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CargarDatosAlbum }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "cargarDatosAlbum")
    public JAXBElement<CargarDatosAlbum> createCargarDatosAlbum(CargarDatosAlbum value) {
        return new JAXBElement<CargarDatosAlbum>(_CargarDatosAlbum_QNAME, CargarDatosAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarDatosAlbumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CargarDatosAlbumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "cargarDatosAlbumResponse")
    public JAXBElement<CargarDatosAlbumResponse> createCargarDatosAlbumResponse(CargarDatosAlbumResponse value) {
        return new JAXBElement<CargarDatosAlbumResponse>(_CargarDatosAlbumResponse_QNAME, CargarDatosAlbumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarSubUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DarSubUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "darSubUsuario")
    public JAXBElement<DarSubUsuario> createDarSubUsuario(DarSubUsuario value) {
        return new JAXBElement<DarSubUsuario>(_DarSubUsuario_QNAME, DarSubUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DarSubUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DarSubUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "darSubUsuarioResponse")
    public JAXBElement<DarSubUsuarioResponse> createDarSubUsuarioResponse(DarSubUsuarioResponse value) {
        return new JAXBElement<DarSubUsuarioResponse>(_DarSubUsuarioResponse_QNAME, DarSubUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataAlbum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataAlbum }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "dataAlbum")
    public JAXBElement<DataAlbum> createDataAlbum(DataAlbum value) {
        return new JAXBElement<DataAlbum>(_DataAlbum_QNAME, DataAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataLista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataLista }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "dataLista")
    public JAXBElement<DataLista> createDataLista(DataLista value) {
        return new JAXBElement<DataLista>(_DataLista_QNAME, DataLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTema }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataTema }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "dataTema")
    public JAXBElement<DataTema> createDataTema(DataTema value) {
        return new JAXBElement<DataTema>(_DataTema_QNAME, DataTema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "dataUsuario")
    public JAXBElement<DataUsuario> createDataUsuario(DataUsuario value) {
        return new JAXBElement<DataUsuario>(_DataUsuario_QNAME, DataUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAlbumesFavoritosCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarAlbumesFavoritosCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "eliminarAlbumesFavoritosCliente")
    public JAXBElement<EliminarAlbumesFavoritosCliente> createEliminarAlbumesFavoritosCliente(EliminarAlbumesFavoritosCliente value) {
        return new JAXBElement<EliminarAlbumesFavoritosCliente>(_EliminarAlbumesFavoritosCliente_QNAME, EliminarAlbumesFavoritosCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAlbumesFavoritosClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarAlbumesFavoritosClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "eliminarAlbumesFavoritosClienteResponse")
    public JAXBElement<EliminarAlbumesFavoritosClienteResponse> createEliminarAlbumesFavoritosClienteResponse(EliminarAlbumesFavoritosClienteResponse value) {
        return new JAXBElement<EliminarAlbumesFavoritosClienteResponse>(_EliminarAlbumesFavoritosClienteResponse_QNAME, EliminarAlbumesFavoritosClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarGenerosDeAlbum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarGenerosDeAlbum }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "eliminarGenerosDeAlbum")
    public JAXBElement<EliminarGenerosDeAlbum> createEliminarGenerosDeAlbum(EliminarGenerosDeAlbum value) {
        return new JAXBElement<EliminarGenerosDeAlbum>(_EliminarGenerosDeAlbum_QNAME, EliminarGenerosDeAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarGenerosDeAlbumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarGenerosDeAlbumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "eliminarGenerosDeAlbumResponse")
    public JAXBElement<EliminarGenerosDeAlbumResponse> createEliminarGenerosDeAlbumResponse(EliminarGenerosDeAlbumResponse value) {
        return new JAXBElement<EliminarGenerosDeAlbumResponse>(_EliminarGenerosDeAlbumResponse_QNAME, EliminarGenerosDeAlbumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarListaFavoritaCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarListaFavoritaCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "eliminarListaFavoritaCliente")
    public JAXBElement<EliminarListaFavoritaCliente> createEliminarListaFavoritaCliente(EliminarListaFavoritaCliente value) {
        return new JAXBElement<EliminarListaFavoritaCliente>(_EliminarListaFavoritaCliente_QNAME, EliminarListaFavoritaCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarListaFavoritaClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarListaFavoritaClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "eliminarListaFavoritaClienteResponse")
    public JAXBElement<EliminarListaFavoritaClienteResponse> createEliminarListaFavoritaClienteResponse(EliminarListaFavoritaClienteResponse value) {
        return new JAXBElement<EliminarListaFavoritaClienteResponse>(_EliminarListaFavoritaClienteResponse_QNAME, EliminarListaFavoritaClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTemaListaDef }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarTemaListaDef }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "eliminarTemaListaDef")
    public JAXBElement<EliminarTemaListaDef> createEliminarTemaListaDef(EliminarTemaListaDef value) {
        return new JAXBElement<EliminarTemaListaDef>(_EliminarTemaListaDef_QNAME, EliminarTemaListaDef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTemaListaDefResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarTemaListaDefResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "eliminarTemaListaDefResponse")
    public JAXBElement<EliminarTemaListaDefResponse> createEliminarTemaListaDefResponse(EliminarTemaListaDefResponse value) {
        return new JAXBElement<EliminarTemaListaDefResponse>(_EliminarTemaListaDefResponse_QNAME, EliminarTemaListaDefResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTemasFavoritosCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarTemasFavoritosCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "eliminarTemasFavoritosCliente")
    public JAXBElement<EliminarTemasFavoritosCliente> createEliminarTemasFavoritosCliente(EliminarTemasFavoritosCliente value) {
        return new JAXBElement<EliminarTemasFavoritosCliente>(_EliminarTemasFavoritosCliente_QNAME, EliminarTemasFavoritosCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTemasFavoritosClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarTemasFavoritosClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "eliminarTemasFavoritosClienteResponse")
    public JAXBElement<EliminarTemasFavoritosClienteResponse> createEliminarTemasFavoritosClienteResponse(EliminarTemasFavoritosClienteResponse value) {
        return new JAXBElement<EliminarTemasFavoritosClienteResponse>(_EliminarTemasFavoritosClienteResponse_QNAME, EliminarTemasFavoritosClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTemasListaPart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarTemasListaPart }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "eliminarTemasListaPart")
    public JAXBElement<EliminarTemasListaPart> createEliminarTemasListaPart(EliminarTemasListaPart value) {
        return new JAXBElement<EliminarTemasListaPart>(_EliminarTemasListaPart_QNAME, EliminarTemasListaPart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTemasListaPartResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarTemasListaPartResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "eliminarTemasListaPartResponse")
    public JAXBElement<EliminarTemasListaPartResponse> createEliminarTemasListaPartResponse(EliminarTemasListaPartResponse value) {
        return new JAXBElement<EliminarTemasListaPartResponse>(_EliminarTemasListaPartResponse_QNAME, EliminarTemasListaPartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsPublicaLista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EsPublicaLista }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "esPublicaLista")
    public JAXBElement<EsPublicaLista> createEsPublicaLista(EsPublicaLista value) {
        return new JAXBElement<EsPublicaLista>(_EsPublicaLista_QNAME, EsPublicaLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsPublicaListaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EsPublicaListaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "esPublicaListaResponse")
    public JAXBElement<EsPublicaListaResponse> createEsPublicaListaResponse(EsPublicaListaResponse value) {
        return new JAXBElement<EsPublicaListaResponse>(_EsPublicaListaResponse_QNAME, EsPublicaListaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteMail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExisteMail }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "existeMail")
    public JAXBElement<ExisteMail> createExisteMail(ExisteMail value) {
        return new JAXBElement<ExisteMail>(_ExisteMail_QNAME, ExisteMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteMailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExisteMailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "existeMailResponse")
    public JAXBElement<ExisteMailResponse> createExisteMailResponse(ExisteMailResponse value) {
        return new JAXBElement<ExisteMailResponse>(_ExisteMailResponse_QNAME, ExisteMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteTemaLista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExisteTemaLista }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "existeTemaLista")
    public JAXBElement<ExisteTemaLista> createExisteTemaLista(ExisteTemaLista value) {
        return new JAXBElement<ExisteTemaLista>(_ExisteTemaLista_QNAME, ExisteTemaLista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteTemaListaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExisteTemaListaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "existeTemaListaResponse")
    public JAXBElement<ExisteTemaListaResponse> createExisteTemaListaResponse(ExisteTemaListaResponse value) {
        return new JAXBElement<ExisteTemaListaResponse>(_ExisteTemaListaResponse_QNAME, ExisteTemaListaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExisteUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "existeUsuario")
    public JAXBElement<ExisteUsuario> createExisteUsuario(ExisteUsuario value) {
        return new JAXBElement<ExisteUsuario>(_ExisteUsuario_QNAME, ExisteUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExisteUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "existeUsuarioResponse")
    public JAXBElement<ExisteUsuarioResponse> createExisteUsuarioResponse(ExisteUsuarioResponse value) {
        return new JAXBElement<ExisteUsuarioResponse>(_ExisteUsuarioResponse_QNAME, ExisteUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAlbum }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAlbum")
    public JAXBElement<GetAlbum> createGetAlbum(GetAlbum value) {
        return new JAXBElement<GetAlbum>(_GetAlbum_QNAME, GetAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumEliminado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAlbumEliminado }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAlbumEliminado")
    public JAXBElement<GetAlbumEliminado> createGetAlbumEliminado(GetAlbumEliminado value) {
        return new JAXBElement<GetAlbumEliminado>(_GetAlbumEliminado_QNAME, GetAlbumEliminado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumEliminadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAlbumEliminadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAlbumEliminadoResponse")
    public JAXBElement<GetAlbumEliminadoResponse> createGetAlbumEliminadoResponse(GetAlbumEliminadoResponse value) {
        return new JAXBElement<GetAlbumEliminadoResponse>(_GetAlbumEliminadoResponse_QNAME, GetAlbumEliminadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAlbumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAlbumResponse")
    public JAXBElement<GetAlbumResponse> createGetAlbumResponse(GetAlbumResponse value) {
        return new JAXBElement<GetAlbumResponse>(_GetAlbumResponse_QNAME, GetAlbumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumsByArtista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAlbumsByArtista }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAlbumsByArtista")
    public JAXBElement<GetAlbumsByArtista> createGetAlbumsByArtista(GetAlbumsByArtista value) {
        return new JAXBElement<GetAlbumsByArtista>(_GetAlbumsByArtista_QNAME, GetAlbumsByArtista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumsByArtista2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAlbumsByArtista2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAlbumsByArtista2")
    public JAXBElement<GetAlbumsByArtista2> createGetAlbumsByArtista2(GetAlbumsByArtista2 value) {
        return new JAXBElement<GetAlbumsByArtista2>(_GetAlbumsByArtista2_QNAME, GetAlbumsByArtista2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumsByArtista2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAlbumsByArtista2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAlbumsByArtista2Response")
    public JAXBElement<GetAlbumsByArtista2Response> createGetAlbumsByArtista2Response(GetAlbumsByArtista2Response value) {
        return new JAXBElement<GetAlbumsByArtista2Response>(_GetAlbumsByArtista2Response_QNAME, GetAlbumsByArtista2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumsByArtistaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAlbumsByArtistaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAlbumsByArtistaResponse")
    public JAXBElement<GetAlbumsByArtistaResponse> createGetAlbumsByArtistaResponse(GetAlbumsByArtistaResponse value) {
        return new JAXBElement<GetAlbumsByArtistaResponse>(_GetAlbumsByArtistaResponse_QNAME, GetAlbumsByArtistaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumsByGenero }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAlbumsByGenero }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAlbumsByGenero")
    public JAXBElement<GetAlbumsByGenero> createGetAlbumsByGenero(GetAlbumsByGenero value) {
        return new JAXBElement<GetAlbumsByGenero>(_GetAlbumsByGenero_QNAME, GetAlbumsByGenero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlbumsByGeneroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAlbumsByGeneroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAlbumsByGeneroResponse")
    public JAXBElement<GetAlbumsByGeneroResponse> createGetAlbumsByGeneroResponse(GetAlbumsByGeneroResponse value) {
        return new JAXBElement<GetAlbumsByGeneroResponse>(_GetAlbumsByGeneroResponse_QNAME, GetAlbumsByGeneroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAlbums }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAlbums }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAllAlbums")
    public JAXBElement<GetAllAlbums> createGetAllAlbums(GetAllAlbums value) {
        return new JAXBElement<GetAllAlbums>(_GetAllAlbums_QNAME, GetAllAlbums.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAlbumsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAlbumsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAllAlbumsResponse")
    public JAXBElement<GetAllAlbumsResponse> createGetAllAlbumsResponse(GetAllAlbumsResponse value) {
        return new JAXBElement<GetAllAlbumsResponse>(_GetAllAlbumsResponse_QNAME, GetAllAlbumsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTemas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllTemas }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAllTemas")
    public JAXBElement<GetAllTemas> createGetAllTemas(GetAllTemas value) {
        return new JAXBElement<GetAllTemas>(_GetAllTemas_QNAME, GetAllTemas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTemasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllTemasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getAllTemasResponse")
    public JAXBElement<GetAllTemasResponse> createGetAllTemasResponse(GetAllTemasResponse value) {
        return new JAXBElement<GetAllTemasResponse>(_GetAllTemasResponse_QNAME, GetAllTemasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArtistaEliminado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArtistaEliminado }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getArtistaEliminado")
    public JAXBElement<GetArtistaEliminado> createGetArtistaEliminado(GetArtistaEliminado value) {
        return new JAXBElement<GetArtistaEliminado>(_GetArtistaEliminado_QNAME, GetArtistaEliminado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArtistaEliminadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArtistaEliminadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getArtistaEliminadoResponse")
    public JAXBElement<GetArtistaEliminadoResponse> createGetArtistaEliminadoResponse(GetArtistaEliminadoResponse value) {
        return new JAXBElement<GetArtistaEliminadoResponse>(_GetArtistaEliminadoResponse_QNAME, GetArtistaEliminadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArtistas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArtistas }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getArtistas")
    public JAXBElement<GetArtistas> createGetArtistas(GetArtistas value) {
        return new JAXBElement<GetArtistas>(_GetArtistas_QNAME, GetArtistas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArtistasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetArtistasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getArtistasResponse")
    public JAXBElement<GetArtistasResponse> createGetArtistasResponse(GetArtistasResponse value) {
        return new JAXBElement<GetArtistasResponse>(_GetArtistasResponse_QNAME, GetArtistasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClientes }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getClientes")
    public JAXBElement<GetClientes> createGetClientes(GetClientes value) {
        return new JAXBElement<GetClientes>(_GetClientes_QNAME, GetClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientes2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClientes2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getClientes2")
    public JAXBElement<GetClientes2> createGetClientes2(GetClientes2 value) {
        return new JAXBElement<GetClientes2>(_GetClientes2_QNAME, GetClientes2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientes2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClientes2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getClientes2Response")
    public JAXBElement<GetClientes2Response> createGetClientes2Response(GetClientes2Response value) {
        return new JAXBElement<GetClientes2Response>(_GetClientes2Response_QNAME, GetClientes2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClientesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getClientesResponse")
    public JAXBElement<GetClientesResponse> createGetClientesResponse(GetClientesResponse value) {
        return new JAXBElement<GetClientesResponse>(_GetClientesResponse_QNAME, GetClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataAlbumsAjax }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDataAlbumsAjax }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getDataAlbumsAjax")
    public JAXBElement<GetDataAlbumsAjax> createGetDataAlbumsAjax(GetDataAlbumsAjax value) {
        return new JAXBElement<GetDataAlbumsAjax>(_GetDataAlbumsAjax_QNAME, GetDataAlbumsAjax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataAlbumsAjaxResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDataAlbumsAjaxResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getDataAlbumsAjaxResponse")
    public JAXBElement<GetDataAlbumsAjaxResponse> createGetDataAlbumsAjaxResponse(GetDataAlbumsAjaxResponse value) {
        return new JAXBElement<GetDataAlbumsAjaxResponse>(_GetDataAlbumsAjaxResponse_QNAME, GetDataAlbumsAjaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataListasReproduccionAjax }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDataListasReproduccionAjax }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getDataListasReproduccionAjax")
    public JAXBElement<GetDataListasReproduccionAjax> createGetDataListasReproduccionAjax(GetDataListasReproduccionAjax value) {
        return new JAXBElement<GetDataListasReproduccionAjax>(_GetDataListasReproduccionAjax_QNAME, GetDataListasReproduccionAjax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataListasReproduccionAjaxResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDataListasReproduccionAjaxResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getDataListasReproduccionAjaxResponse")
    public JAXBElement<GetDataListasReproduccionAjaxResponse> createGetDataListasReproduccionAjaxResponse(GetDataListasReproduccionAjaxResponse value) {
        return new JAXBElement<GetDataListasReproduccionAjaxResponse>(_GetDataListasReproduccionAjaxResponse_QNAME, GetDataListasReproduccionAjaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataTemasAjax }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDataTemasAjax }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getDataTemasAjax")
    public JAXBElement<GetDataTemasAjax> createGetDataTemasAjax(GetDataTemasAjax value) {
        return new JAXBElement<GetDataTemasAjax>(_GetDataTemasAjax_QNAME, GetDataTemasAjax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataTemasAjaxResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDataTemasAjaxResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getDataTemasAjaxResponse")
    public JAXBElement<GetDataTemasAjaxResponse> createGetDataTemasAjaxResponse(GetDataTemasAjaxResponse value) {
        return new JAXBElement<GetDataTemasAjaxResponse>(_GetDataTemasAjaxResponse_QNAME, GetDataTemasAjaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataUsuariosAjax }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDataUsuariosAjax }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getDataUsuariosAjax")
    public JAXBElement<GetDataUsuariosAjax> createGetDataUsuariosAjax(GetDataUsuariosAjax value) {
        return new JAXBElement<GetDataUsuariosAjax>(_GetDataUsuariosAjax_QNAME, GetDataUsuariosAjax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataUsuariosAjaxResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDataUsuariosAjaxResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getDataUsuariosAjaxResponse")
    public JAXBElement<GetDataUsuariosAjaxResponse> createGetDataUsuariosAjaxResponse(GetDataUsuariosAjaxResponse value) {
        return new JAXBElement<GetDataUsuariosAjaxResponse>(_GetDataUsuariosAjaxResponse_QNAME, GetDataUsuariosAjaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeneros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGeneros }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getGeneros")
    public JAXBElement<GetGeneros> createGetGeneros(GetGeneros value) {
        return new JAXBElement<GetGeneros>(_GetGeneros_QNAME, GetGeneros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeneros2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGeneros2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getGeneros2")
    public JAXBElement<GetGeneros2> createGetGeneros2(GetGeneros2 value) {
        return new JAXBElement<GetGeneros2>(_GetGeneros2_QNAME, GetGeneros2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeneros2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGeneros2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getGeneros2Response")
    public JAXBElement<GetGeneros2Response> createGetGeneros2Response(GetGeneros2Response value) {
        return new JAXBElement<GetGeneros2Response>(_GetGeneros2Response_QNAME, GetGeneros2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGenerosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGenerosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getGenerosResponse")
    public JAXBElement<GetGenerosResponse> createGetGenerosResponse(GetGenerosResponse value) {
        return new JAXBElement<GetGenerosResponse>(_GetGenerosResponse_QNAME, GetGenerosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListasParticulares }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListasParticulares }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getListasParticulares")
    public JAXBElement<GetListasParticulares> createGetListasParticulares(GetListasParticulares value) {
        return new JAXBElement<GetListasParticulares>(_GetListasParticulares_QNAME, GetListasParticulares.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListasParticularesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListasParticularesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getListasParticularesResponse")
    public JAXBElement<GetListasParticularesResponse> createGetListasParticularesResponse(GetListasParticularesResponse value) {
        return new JAXBElement<GetListasParticularesResponse>(_GetListasParticularesResponse_QNAME, GetListasParticularesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPadre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPadre }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getPadre")
    public JAXBElement<GetPadre> createGetPadre(GetPadre value) {
        return new JAXBElement<GetPadre>(_GetPadre_QNAME, GetPadre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPadreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPadreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getPadreResponse")
    public JAXBElement<GetPadreResponse> createGetPadreResponse(GetPadreResponse value) {
        return new JAXBElement<GetPadreResponse>(_GetPadreResponse_QNAME, GetPadreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeguidores }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSeguidores }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getSeguidores")
    public JAXBElement<GetSeguidores> createGetSeguidores(GetSeguidores value) {
        return new JAXBElement<GetSeguidores>(_GetSeguidores_QNAME, GetSeguidores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeguidoresResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSeguidoresResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getSeguidoresResponse")
    public JAXBElement<GetSeguidoresResponse> createGetSeguidoresResponse(GetSeguidoresResponse value) {
        return new JAXBElement<GetSeguidoresResponse>(_GetSeguidoresResponse_QNAME, GetSeguidoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemaEliminado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTemaEliminado }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getTemaEliminado")
    public JAXBElement<GetTemaEliminado> createGetTemaEliminado(GetTemaEliminado value) {
        return new JAXBElement<GetTemaEliminado>(_GetTemaEliminado_QNAME, GetTemaEliminado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemaEliminadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTemaEliminadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "getTemaEliminadoResponse")
    public JAXBElement<GetTemaEliminadoResponse> createGetTemaEliminadoResponse(GetTemaEliminadoResponse value) {
        return new JAXBElement<GetTemaEliminadoResponse>(_GetTemaEliminadoResponse_QNAME, GetTemaEliminadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarListaParticularPorId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarListaParticularPorId }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "modificarListaParticularPorId")
    public JAXBElement<ModificarListaParticularPorId> createModificarListaParticularPorId(ModificarListaParticularPorId value) {
        return new JAXBElement<ModificarListaParticularPorId>(_ModificarListaParticularPorId_QNAME, ModificarListaParticularPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarListaParticularPorIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarListaParticularPorIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "modificarListaParticularPorIdResponse")
    public JAXBElement<ModificarListaParticularPorIdResponse> createModificarListaParticularPorIdResponse(ModificarListaParticularPorIdResponse value) {
        return new JAXBElement<ModificarListaParticularPorIdResponse>(_ModificarListaParticularPorIdResponse_QNAME, ModificarListaParticularPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerRegistros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerRegistros }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "obtenerRegistros")
    public JAXBElement<ObtenerRegistros> createObtenerRegistros(ObtenerRegistros value) {
        return new JAXBElement<ObtenerRegistros>(_ObtenerRegistros_QNAME, ObtenerRegistros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerRegistrosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerRegistrosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "obtenerRegistrosResponse")
    public JAXBElement<ObtenerRegistrosResponse> createObtenerRegistrosResponse(ObtenerRegistrosResponse value) {
        return new JAXBElement<ObtenerRegistrosResponse>(_ObtenerRegistrosResponse_QNAME, ObtenerRegistrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTotalRegistros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerTotalRegistros }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "obtenerTotalRegistros")
    public JAXBElement<ObtenerTotalRegistros> createObtenerTotalRegistros(ObtenerTotalRegistros value) {
        return new JAXBElement<ObtenerTotalRegistros>(_ObtenerTotalRegistros_QNAME, ObtenerTotalRegistros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTotalRegistrosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerTotalRegistrosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "obtenerTotalRegistrosResponse")
    public JAXBElement<ObtenerTotalRegistrosResponse> createObtenerTotalRegistrosResponse(ObtenerTotalRegistrosResponse value) {
        return new JAXBElement<ObtenerTotalRegistrosResponse>(_ObtenerTotalRegistrosResponse_QNAME, ObtenerTotalRegistrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "obtenerUsuario")
    public JAXBElement<ObtenerUsuario> createObtenerUsuario(ObtenerUsuario value) {
        return new JAXBElement<ObtenerUsuario>(_ObtenerUsuario_QNAME, ObtenerUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioMail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioMail }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "obtenerUsuarioMail")
    public JAXBElement<ObtenerUsuarioMail> createObtenerUsuarioMail(ObtenerUsuarioMail value) {
        return new JAXBElement<ObtenerUsuarioMail>(_ObtenerUsuarioMail_QNAME, ObtenerUsuarioMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioMailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioMailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "obtenerUsuarioMailResponse")
    public JAXBElement<ObtenerUsuarioMailResponse> createObtenerUsuarioMailResponse(ObtenerUsuarioMailResponse value) {
        return new JAXBElement<ObtenerUsuarioMailResponse>(_ObtenerUsuarioMailResponse_QNAME, ObtenerUsuarioMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "obtenerUsuarioResponse")
    public JAXBElement<ObtenerUsuarioResponse> createObtenerUsuarioResponse(ObtenerUsuarioResponse value) {
        return new JAXBElement<ObtenerUsuarioResponse>(_ObtenerUsuarioResponse_QNAME, ObtenerUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerAlbumes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerAlbumes }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerAlbumes")
    public JAXBElement<TraerAlbumes> createTraerAlbumes(TraerAlbumes value) {
        return new JAXBElement<TraerAlbumes>(_TraerAlbumes_QNAME, TraerAlbumes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerAlbumesArtista }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerAlbumesArtista }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerAlbumesArtista")
    public JAXBElement<TraerAlbumesArtista> createTraerAlbumesArtista(TraerAlbumesArtista value) {
        return new JAXBElement<TraerAlbumesArtista>(_TraerAlbumesArtista_QNAME, TraerAlbumesArtista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerAlbumesArtistaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerAlbumesArtistaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerAlbumesArtistaResponse")
    public JAXBElement<TraerAlbumesArtistaResponse> createTraerAlbumesArtistaResponse(TraerAlbumesArtistaResponse value) {
        return new JAXBElement<TraerAlbumesArtistaResponse>(_TraerAlbumesArtistaResponse_QNAME, TraerAlbumesArtistaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerAlbumesFavoritosPorIdCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerAlbumesFavoritosPorIdCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerAlbumesFavoritosPorIdCliente")
    public JAXBElement<TraerAlbumesFavoritosPorIdCliente> createTraerAlbumesFavoritosPorIdCliente(TraerAlbumesFavoritosPorIdCliente value) {
        return new JAXBElement<TraerAlbumesFavoritosPorIdCliente>(_TraerAlbumesFavoritosPorIdCliente_QNAME, TraerAlbumesFavoritosPorIdCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerAlbumesFavoritosPorIdClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerAlbumesFavoritosPorIdClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerAlbumesFavoritosPorIdClienteResponse")
    public JAXBElement<TraerAlbumesFavoritosPorIdClienteResponse> createTraerAlbumesFavoritosPorIdClienteResponse(TraerAlbumesFavoritosPorIdClienteResponse value) {
        return new JAXBElement<TraerAlbumesFavoritosPorIdClienteResponse>(_TraerAlbumesFavoritosPorIdClienteResponse_QNAME, TraerAlbumesFavoritosPorIdClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerAlbumesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerAlbumesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerAlbumesResponse")
    public JAXBElement<TraerAlbumesResponse> createTraerAlbumesResponse(TraerAlbumesResponse value) {
        return new JAXBElement<TraerAlbumesResponse>(_TraerAlbumesResponse_QNAME, TraerAlbumesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerListasFavoritasPorIdCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerListasFavoritasPorIdCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerListasFavoritasPorIdCliente")
    public JAXBElement<TraerListasFavoritasPorIdCliente> createTraerListasFavoritasPorIdCliente(TraerListasFavoritasPorIdCliente value) {
        return new JAXBElement<TraerListasFavoritasPorIdCliente>(_TraerListasFavoritasPorIdCliente_QNAME, TraerListasFavoritasPorIdCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerListasFavoritasPorIdClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerListasFavoritasPorIdClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerListasFavoritasPorIdClienteResponse")
    public JAXBElement<TraerListasFavoritasPorIdClienteResponse> createTraerListasFavoritasPorIdClienteResponse(TraerListasFavoritasPorIdClienteResponse value) {
        return new JAXBElement<TraerListasFavoritasPorIdClienteResponse>(_TraerListasFavoritasPorIdClienteResponse_QNAME, TraerListasFavoritasPorIdClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerListasParticularesPorClientes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerListasParticularesPorClientes }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerListasParticularesPorClientes")
    public JAXBElement<TraerListasParticularesPorClientes> createTraerListasParticularesPorClientes(TraerListasParticularesPorClientes value) {
        return new JAXBElement<TraerListasParticularesPorClientes>(_TraerListasParticularesPorClientes_QNAME, TraerListasParticularesPorClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerListasParticularesPorClientesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerListasParticularesPorClientesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerListasParticularesPorClientesResponse")
    public JAXBElement<TraerListasParticularesPorClientesResponse> createTraerListasParticularesPorClientesResponse(TraerListasParticularesPorClientesResponse value) {
        return new JAXBElement<TraerListasParticularesPorClientesResponse>(_TraerListasParticularesPorClientesResponse_QNAME, TraerListasParticularesPorClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerListasParticularesPublicas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerListasParticularesPublicas }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerListasParticularesPublicas")
    public JAXBElement<TraerListasParticularesPublicas> createTraerListasParticularesPublicas(TraerListasParticularesPublicas value) {
        return new JAXBElement<TraerListasParticularesPublicas>(_TraerListasParticularesPublicas_QNAME, TraerListasParticularesPublicas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerListasParticularesPublicasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerListasParticularesPublicasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerListasParticularesPublicasResponse")
    public JAXBElement<TraerListasParticularesPublicasResponse> createTraerListasParticularesPublicasResponse(TraerListasParticularesPublicasResponse value) {
        return new JAXBElement<TraerListasParticularesPublicasResponse>(_TraerListasParticularesPublicasResponse_QNAME, TraerListasParticularesPublicasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerListasPorDefecto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerListasPorDefecto }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerListasPorDefecto")
    public JAXBElement<TraerListasPorDefecto> createTraerListasPorDefecto(TraerListasPorDefecto value) {
        return new JAXBElement<TraerListasPorDefecto>(_TraerListasPorDefecto_QNAME, TraerListasPorDefecto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerListasPorDefectoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerListasPorDefectoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerListasPorDefectoResponse")
    public JAXBElement<TraerListasPorDefectoResponse> createTraerListasPorDefectoResponse(TraerListasPorDefectoResponse value) {
        return new JAXBElement<TraerListasPorDefectoResponse>(_TraerListasPorDefectoResponse_QNAME, TraerListasPorDefectoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerNickNamesClientes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerNickNamesClientes }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerNickNamesClientes")
    public JAXBElement<TraerNickNamesClientes> createTraerNickNamesClientes(TraerNickNamesClientes value) {
        return new JAXBElement<TraerNickNamesClientes>(_TraerNickNamesClientes_QNAME, TraerNickNamesClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerNickNamesClientesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerNickNamesClientesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerNickNamesClientesResponse")
    public JAXBElement<TraerNickNamesClientesResponse> createTraerNickNamesClientesResponse(TraerNickNamesClientesResponse value) {
        return new JAXBElement<TraerNickNamesClientesResponse>(_TraerNickNamesClientesResponse_QNAME, TraerNickNamesClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerTemasFavoritosPorIdCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerTemasFavoritosPorIdCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerTemasFavoritosPorIdCliente")
    public JAXBElement<TraerTemasFavoritosPorIdCliente> createTraerTemasFavoritosPorIdCliente(TraerTemasFavoritosPorIdCliente value) {
        return new JAXBElement<TraerTemasFavoritosPorIdCliente>(_TraerTemasFavoritosPorIdCliente_QNAME, TraerTemasFavoritosPorIdCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerTemasFavoritosPorIdClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerTemasFavoritosPorIdClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerTemasFavoritosPorIdClienteResponse")
    public JAXBElement<TraerTemasFavoritosPorIdClienteResponse> createTraerTemasFavoritosPorIdClienteResponse(TraerTemasFavoritosPorIdClienteResponse value) {
        return new JAXBElement<TraerTemasFavoritosPorIdClienteResponse>(_TraerTemasFavoritosPorIdClienteResponse_QNAME, TraerTemasFavoritosPorIdClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerTemasPorIdAlbum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerTemasPorIdAlbum }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerTemasPorIdAlbum")
    public JAXBElement<TraerTemasPorIdAlbum> createTraerTemasPorIdAlbum(TraerTemasPorIdAlbum value) {
        return new JAXBElement<TraerTemasPorIdAlbum>(_TraerTemasPorIdAlbum_QNAME, TraerTemasPorIdAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerTemasPorIdAlbumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerTemasPorIdAlbumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerTemasPorIdAlbumResponse")
    public JAXBElement<TraerTemasPorIdAlbumResponse> createTraerTemasPorIdAlbumResponse(TraerTemasPorIdAlbumResponse value) {
        return new JAXBElement<TraerTemasPorIdAlbumResponse>(_TraerTemasPorIdAlbumResponse_QNAME, TraerTemasPorIdAlbumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerTemasPorIdListaReproduccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerTemasPorIdListaReproduccion }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerTemasPorIdListaReproduccion")
    public JAXBElement<TraerTemasPorIdListaReproduccion> createTraerTemasPorIdListaReproduccion(TraerTemasPorIdListaReproduccion value) {
        return new JAXBElement<TraerTemasPorIdListaReproduccion>(_TraerTemasPorIdListaReproduccion_QNAME, TraerTemasPorIdListaReproduccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerTemasPorIdListaReproduccionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerTemasPorIdListaReproduccionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerTemasPorIdListaReproduccionResponse")
    public JAXBElement<TraerTemasPorIdListaReproduccionResponse> createTraerTemasPorIdListaReproduccionResponse(TraerTemasPorIdListaReproduccionResponse value) {
        return new JAXBElement<TraerTemasPorIdListaReproduccionResponse>(_TraerTemasPorIdListaReproduccionResponse_QNAME, TraerTemasPorIdListaReproduccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerTemasPorListasPorDefectoId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerTemasPorListasPorDefectoId }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerTemasPorListasPorDefectoId")
    public JAXBElement<TraerTemasPorListasPorDefectoId> createTraerTemasPorListasPorDefectoId(TraerTemasPorListasPorDefectoId value) {
        return new JAXBElement<TraerTemasPorListasPorDefectoId>(_TraerTemasPorListasPorDefectoId_QNAME, TraerTemasPorListasPorDefectoId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerTemasPorListasPorDefectoIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraerTemasPorListasPorDefectoIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "traerTemasPorListasPorDefectoIdResponse")
    public JAXBElement<TraerTemasPorListasPorDefectoIdResponse> createTraerTemasPorListasPorDefectoIdResponse(TraerTemasPorListasPorDefectoIdResponse value) {
        return new JAXBElement<TraerTemasPorListasPorDefectoIdResponse>(_TraerTemasPorListasPorDefectoIdResponse_QNAME, TraerTemasPorListasPorDefectoIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuariosSeguidosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuariosSeguidosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "usuariosSeguidosResponse")
    public JAXBElement<UsuariosSeguidosResponse> createUsuariosSeguidosResponse(UsuariosSeguidosResponse value) {
        return new JAXBElement<UsuariosSeguidosResponse>(_UsuariosSeguidosResponse_QNAME, UsuariosSeguidosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaAlbum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificaAlbum }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "verificaAlbum")
    public JAXBElement<VerificaAlbum> createVerificaAlbum(VerificaAlbum value) {
        return new JAXBElement<VerificaAlbum>(_VerificaAlbum_QNAME, VerificaAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaAlbumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificaAlbumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicios.com/", name = "verificaAlbumResponse")
    public JAXBElement<VerificaAlbumResponse> createVerificaAlbumResponse(VerificaAlbumResponse value) {
        return new JAXBElement<VerificaAlbumResponse>(_VerificaAlbumResponse_QNAME, VerificaAlbumResponse.class, null, value);
    }

}

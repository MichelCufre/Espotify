<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="datatypes.DataUsuario"%>
<%@page import="datatypes.DataTema"%>
<%@page import="datatypes.DataAlbum"%>
<%@page import="datatypes.DataLista"%>
<%@page import="controladores.iSistema"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Perfil de Usuario</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/boostrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/boostrap/js/jquery-3.7.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/boostrap/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <jsp:include page="/template/header.jsp" />
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8 text-center">
                <% 
                    DataUsuario dataUsuario = (DataUsuario) session.getAttribute("dataUsuario");
                    iSistema sistema = (iSistema) session.getAttribute("sistema");
                    
                    if (dataUsuario == null) {
                        out.print("<p>No hay ningún usuario logueado.</p>");
                    } else {
                        String imagenPerfil = dataUsuario.getImagen() != null ? dataUsuario.getImagen() : "default-image.jpg";
                        boolean esArtista = "artista".equalsIgnoreCase(dataUsuario.getTipo());
                %>
                <img src="<%= imagenPerfil %>" alt="<%= dataUsuario.getNombre() %> <%= dataUsuario.getApellido() %>" class="rounded-circle profile-image mb-3">
                
                <h1 class="mb-2"><%= dataUsuario.getNombre() %> <%= dataUsuario.getApellido() %></h1>
                
                <% if (esArtista && dataUsuario.getSitioWeb() != null && !dataUsuario.getSitioWeb().isEmpty()) { %>
                <a href="<%= dataUsuario.getSitioWeb() %>" class="text-decoration-none mb-3 d-block"><%= dataUsuario.getSitioWeb() %></a>
                <% } %>

                <button class="btn btn-outline-success">Seguir</button>

                <ul class="nav nav-tabs mb-3" id="profileTabs" role="tablist">
                    <li class="nav-item" role="presentation">
                        <button class="nav-link active" id="info-tab" data-bs-toggle="tab" data-bs-target="#info" type="button" role="tab">Información</button>
                    </li>
                    <% if (esArtista) { %>
                    <li class="nav-item" role="presentation">
                        <button class="nav-link" id="albums-tab" data-bs-toggle="tab" data-bs-target="#albums" type="button" role="tab">Álbumes</button>
                    </li>
                    <% } else { %>
                    <li class="nav-item" role="presentation">
                        <button class="nav-link" id="preferencias-tab" data-bs-toggle="tab" data-bs-target="#preferencias" type="button" role="tab">Preferencias</button>
                    </li>
                    <% } %>
                </ul>

                <div class="tab-content" id="profileTabsContent">
                    <div class="tab-pane fade show active" id="info" role="tabpanel">
                        <div class="bg-light p-3 rounded">
                            <% 
                                List<DataUsuario> seguidores = sistema.getSeguidores(dataUsuario.getNick());
                            %>
                            <p class="fw-bold mb-2">
                                <a data-bs-toggle="collapse" href="#seguidoresCollapse" role="button" aria-expanded="false" aria-controls="seguidoresCollapse">
                                    <%= seguidores != null ? seguidores.size() : 0 %> seguidores
                                </a>
                            </p>
                            <div class="collapse mb-3" id="seguidoresCollapse">
                                <ul class="list-group">
                                    <% for (DataUsuario seguidor : seguidores) { %>
                                        <li class="list-group-item"><%= seguidor.getNombre() %> <%= seguidor.getApellido() %></li>
                                    <% } %>
                                </ul>
                            </div>

                            <% if (!esArtista) { // Es un cliente
                                Map<String, ArrayList<DataUsuario>> usuariosSeguidos = sistema.UsuarioSeguidos(dataUsuario.getNick());
                                int totalSeguidos = 0;
                                for (ArrayList<DataUsuario> lista : usuariosSeguidos.values()) {
                                    totalSeguidos += lista.size();
                                }
                            %>
                            <p class="fw-bold mb-2">
                                <a data-bs-toggle="collapse" href="#seguidosCollapse" role="button" aria-expanded="false" aria-controls="seguidosCollapse">
                                    <%= totalSeguidos %> seguidos
                                </a>
                            </p>
                            <div class="collapse mb-3" id="seguidosCollapse">
                                <% for (Map.Entry<String, ArrayList<DataUsuario>> entry : usuariosSeguidos.entrySet()) { %>
                                    <h3 class="h5"><%= entry.getKey() %></h3>
                                    <ul class="list-group mb-3">
                                    <% for (DataUsuario seguido : entry.getValue()) { %>
                                        <li class="list-group-item"><%= seguido.getNombre() %> <%= seguido.getApellido() %></li>
                                    <% } %>
                                    </ul>
                                <% } %>
                            </div>

                            <% 
                                List<DataLista> listasCliente = sistema.traerListasParticularesPorClientes(dataUsuario.getNick());
                            %>
                            <p class="fw-bold mb-2">
                                <a data-bs-toggle="collapse" href="#listasCollapse" role="button" aria-expanded="false" aria-controls="listasCollapse">
                                    <%= listasCliente.size() %> listas de reproducción
                                </a>
                            </p>
                            <div class="collapse mb-3" id="listasCollapse">
                                <ul class="list-group">
                                    <% for (DataLista lista : listasCliente) { %>
                                        <li class="list-group-item"><%= lista.getNombre() %></li>
                                    <% } %>
                                </ul>
                            </div>
                            <% } %>

                            <% if (esArtista) { %>
                                <h2 class="h5 mb-2">Biografía</h2>
                                <p class="text-muted"><%= dataUsuario.getBiografia() %></p>
                            <% } %>
                        </div>
                    </div>

                    <% if (esArtista) { %>
                    <div class="tab-pane fade" id="albums" role="tabpanel">
                        <h2 class="h4 mb-3">Álbumes del Artista</h2>
                        <ul class="list-group">
                        <% 
                            List<String> albumesArtista = sistema.traerAlbumesArtista(dataUsuario.getNick());
                            for (String album : albumesArtista) {
                        %>
                            <li class="list-group-item"><%= album %></li>
                        <% } %>
                        </ul>
                    </div>
                    <% } else { // Es un cliente %>
                    <div class="tab-pane fade" id="preferencias" role="tabpanel">
                        <h2 class="h4 mb-3">Preferencias</h2>
                        
                        <% 
                            List<DataTema> temasFavoritos = sistema.traerTemasFavoritosPorIdCliente(dataUsuario.getNick());
                        %>
                        <p class="fw-bold mb-2">
                            <a data-bs-toggle="collapse" href="#temasFavoritosCollapse" role="button" aria-expanded="false" aria-controls="temasFavoritosCollapse">
                                <%= temasFavoritos.size() %> Temas Favoritos
                            </a>
                        </p>
                        <div class="collapse mb-3" id="temasFavoritosCollapse">
                            <ul class="list-group">
                            <% for (DataTema tema : temasFavoritos) { %>
                                <li class="list-group-item"><%= tema.getNombre() %></li>
                            <% } %>
                            </ul>
                        </div>

                        <% 
                            List<DataAlbum> albumesFavoritos = sistema.traerAlbumesFavoritosPorIdCliente(dataUsuario.getNick());
                        %>
                        <p class="fw-bold mb-2">
                            <a data-bs-toggle="collapse" href="#albumesFavoritosCollapse" role="button" aria-expanded="false" aria-controls="albumesFavoritosCollapse">
                                <%= albumesFavoritos.size() %> Álbumes Favoritos
                            </a>
                        </p>
                        <div class="collapse mb-3" id="albumesFavoritosCollapse">
                            <ul class="list-group">
                            <% for (DataAlbum album : albumesFavoritos) { %>
                                <li class="list-group-item"><%= album.getNombre() %></li>
                            <% } %>
                            </ul>
                        </div>

                        <% 
                            List<DataLista> listasFavoritas = sistema.traerListasFavoritasPorIdCliente(dataUsuario.getNick());
                        %>
                        <p class="fw-bold mb-2">
                            <a data-bs-toggle="collapse" href="#listasFavoritasCollapse" role="button" aria-expanded="false" aria-controls="listasFavoritasCollapse">
                                <%= listasFavoritas.size() %> Listas Favoritas
                            </a>
                        </p>
                        <div class="collapse mb-3" id="listasFavoritasCollapse">
                            <ul class="list-group">
                            <% for (DataLista lista : listasFavoritas) { %>
                                <li class="list-group-item"><%= lista.getNombre() %></li>
                            <% } %>
                            </ul>
                        </div>
                    </div>
                    <% } %>
                </div>
                <% } %>
            </div>
        </div>
    </div>
</body>
</html>

<style>
    .profile-image {
        width: 150px;
        height: 150px;
        object-fit: cover;
    }
</style>
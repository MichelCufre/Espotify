<%@page import="com.servicios.ServicioWeb_Service"%>
<%@page import="com.servicios.ServicioWeb"%>
<%@page import= "java.util.List"%>
<%@page import= "com.servicios.DataTema"%>
<%@page import= "com.servicios.DataUsuario"%>
<%@page import= "com.servicios.DataAlbum"%>
<%@page import= "com.servicios.DataLista"%>
<%--<%@page import="controladores.Fabrica"%>
<%@page import="controladores.iSistema"%>--%>
<%--<%@page import="persistencia.ControladorPersistencia"%>--%>
<%@page import="com.servicios.DataSub"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/boostrap/css/bootstrap.min.css">
    <nav class="navbar navbar-expand-lg custom-navbar">
        <div class="container-fluid">
            <a class="navbar-brand d-flex align-items-center" href="#">
                <img src="${pageContext.request.contextPath}/assets/logoEspotify.svg" alt="Logo" style="width: 40px; height: 40px; margin-right: 8px;">
                Espotify
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/index.jsp">Home</a>
                    </li>
                    <%
                        DataUsuario dataUsuario = (DataUsuario) session.getAttribute("dataUsuario");
                        boolean isLoggedIn = (dataUsuario != null);
                        boolean isArtista = (isLoggedIn && "artista".equalsIgnoreCase(dataUsuario.getTipo()));
                        boolean isCliente = (isLoggedIn && "cliente".equalsIgnoreCase(dataUsuario.getTipo()));
                        
                        ServicioWeb sys;
                        ServicioWeb_Service service = new ServicioWeb_Service();
                        sys = service.getServicioWebPort();
                        
                         DataUsuario dataUsuario7 = (DataUsuario) session.getAttribute("dataUsuario");     
                         
                    %>
                    <% if (isLoggedIn) { %>
                    <% if (isArtista) { %>
                    <li class="nav-item">
                        <a class="nav-link" id="btnCrearAlbum" href="${pageContext.request.contextPath}/altaAlbum.jsp">Crear Álbum</a>
                    </li>
                    <% } else { %>
                    <li class="nav-item">

                        <% if (dataUsuario7 == null) {%>


                        <% } else {%>
                        <%String nicknameUsuarioooo = dataUsuario7.getNick();%>
                        <% if (sys.obtenerCliente(nicknameUsuarioooo).getSub() == null) {%>

                        <% } else {%>
                        <%String estado = sys.darSubUsuario(nicknameUsuarioooo).getEstado();%>

                        <%if(estado.equals("Pendiente")||estado.equals("Cancelada")){%>

                        <% } else {%>
                        <a class="nav-link" href="${pageContext.request.contextPath}/crearLista.jsp">Crear Lista</a>
                        <%}%>
                        <%}%>
                        <%}%>
                    </li>
                    <li class="nav-item">


                        <% if (dataUsuario7 == null) {%>


                        <% } else {%>
                        <%String nicknameUsuarioooo = dataUsuario7.getNick();%>
                        <% if (sys.obtenerCliente(nicknameUsuarioooo).getSub() == null) {%>

                        <% } else {%>
                        <%String estado = sys.darSubUsuario(nicknameUsuarioooo).getEstado();%>

                        <%if(estado.equals("Pendiente")||estado.equals("Cancelada")){%>

                        <% } else {%>
                        <a class="nav-link" href="${pageContext.request.contextPath}/agregarTemaLista.jsp">Agregar Tema a Lista</a>
                        <%}%>
                        <%}%>
                        <%}%>
                    </li>
                    <li class="nav-item">

                      
                        <% if (dataUsuario7 == null) {%>


                        <% } else {%>
                        <%String nicknameUsuarioooo = dataUsuario7.getNick();%>
                        <% if (sys.obtenerCliente(nicknameUsuarioooo).getSub() == null) {%>

                        <% } else {%>
                        <%String estado = sys.darSubUsuario(nicknameUsuarioooo).getEstado();%>

                        <%if(estado.equals("Pendiente")||estado.equals("Cancelada")){%>

                        <% } else {%>
                        <a class="nav-link" href="${pageContext.request.contextPath}/publicarLista.jsp">Publicar Lista</a>
                        <%}%>
                        <%}%>
                        <%}%>

                    </li>
                    <% } %>
                    <% } %>
                </ul>
                <form class="d-flex custom-search" role="search">
                    <input id="searchBar" class="form-control me-2" type="search" placeholder="Tema, Album, Lista o Usuario" aria-label="Buscar">
                    <!--                    <button class="btn btn-outline-success" type="submit">Buscar</button>-->
                </form>
                <ul class="navbar-nav ms-auto mb-2 mb-lg-0 align-items-center">
                    <% if (!isLoggedIn) { %>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/login.jsp">Iniciar Sesion</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/registro.jsp">Registrarse</a>
                    </li>
                    <% } %>
                    <% if (isCliente) { %>
                    <li class="nav-item">
                        <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/contratoSub.jsp">Suscripción</a>
                    </li>
                    <% } %>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle d-flex align-items-center" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            <img src="${pageContext.request.contextPath}/assets/user.svg" alt="User Logo" style="width: 40px; height: 40px; margin-right: 8px;">
                            <%= isLoggedIn ? dataUsuario.getNick() : "Visitante" %>
                        </a>
                        <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                            <% if (isLoggedIn) { %>
                            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/perfil.jsp">Consultar perfil</a></li>
                            <% if (isArtista) { %>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/eliminarCuenta.jsp" style="color: red;">Eliminar cuenta</a></li>
                            <% } %>
                            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/SvLogout">Cerrar sesion</a></li>
                                <% } else { %>
                            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/login.jsp">Iniciar sesion</a></li>
                            <li><a class="dropdown-item" href="${pageContext.request.contextPath}/registro.jsp">Registrarse</a></li>
                                <% } %>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <script>
        let temasAjax = [];
        let listasPAjax = [];
        let listasDAjax = [];
        let artistasAjax = [];
        let clientesAjax = [];
        let albumsAjax = [];

    // Verificación de campos y duplicados con AJAX
        $(document).ready(function () {
            let searchTimer;
            const doneTypingInterval = 10;
            const checkType = "checkSearch"; // Asegúrate de que checkType esté definido

            function checkField(field) {
                let value = $(field).val();
                if (value.length > 0) {
                    $.ajax({
                        url: "SvSearchBar",
                        method: 'POST',
                        data: {action: checkType, value: value},
                        success: function (response) {

                            temasAjax = response.temas;
                            listasPAjax = response.listasParticulares;
                            listasDAjax = response.listasPorDefecto;
                            artistasAjax = response.artistas;
                            clientesAjax = response.clientes;
                            albumsAjax = response.albums;
                            displaySearchBar();
                        },
                        error: function () {
                            alert("Error al mostrar");
                        }
                    });
                } else {
                    albumGrid.innerHTML = '';
                }
            }

            // Verificar el nombre del álbum
            $('#searchBar').on('input', function () {
                clearTimeout(searchTimer);
                searchTimer = setTimeout(() => checkField('#searchBar'), doneTypingInterval);
            });
        });

    </script>
</header>
<style>

    .navbar navbar-expand-lg custom-navbar{
        position: sticky;

    }
    .custom-navbar {
        background: linear-gradient(to right, #d3d3d3, #f0f0f0);
    }
    .custom-search {
        width: 400px;
        margin-right: 20px;
    }
    @media (max-width: 991px) {
        .custom-search {
            width: 100%;
            margin-right: 0;
            margin-bottom: 10px;
        }
    }
    .dropdown-menu-end {
        right: 0;
        left: auto;
    }
</style>
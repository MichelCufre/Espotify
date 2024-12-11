<%-- 
    Document   : eliminarCuenta
    Created on : 7 nov. 2024, 11:15:21
    Author     : dokgo
--%>

<%@page import="com.servicios.ServicioWeb_Service"%>
<%@page import="com.servicios.ServicioWeb"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.servicios.DataUsuario"%>
<%@page import="com.servicios.DataTema"%>
<%@page import="com.servicios.DataAlbum"%>
<%@page import="com.servicios.DataLista"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Eliminar Cuenta</title>
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
                    ServicioWeb sys;
                    ServicioWeb_Service service = new ServicioWeb_Service();
                    sys = service.getServicioWebPort();
                    
                    if (dataUsuario == null) {
                        out.print("<p>No hay ningún usuario logueado.</p>");
                    } else {
                        String rutaOK = "imagenes_perfil/";
                        String imagenPerfil = (dataUsuario.getImagen() != null && !dataUsuario.getImagen().trim().isEmpty()) ? 
                            dataUsuario.getImagen() : 
                            "assets/user.svg";
                        
                        if (!imagenPerfil.equals("assets/user.svg") && !imagenPerfil.startsWith(rutaOK)) {
                                imagenPerfil = rutaOK + imagenPerfil;
                        }
                        
                        //boolean esArtista = "artista".equalsIgnoreCase(dataUsuario.getTipo());

                %>

                <img src="${pageContext.request.contextPath}/<%= imagenPerfil %>" 
                     alt="<%=imagenPerfil%>" 
                     class="rounded-circle profile-image mb-3">
                
                <h1 class="mb-2">
                    <%= dataUsuario.getNombre() %>
                    <% if (dataUsuario.getApellido() != null && !dataUsuario.getApellido().trim().isEmpty()) { %>
                        <%= dataUsuario.getApellido() %>
                    <% } %>
                </h1>
                
                <% if (dataUsuario.getSitioWeb() != null && !dataUsuario.getSitioWeb().isEmpty()) { %>
                <a href="<%= dataUsuario.getSitioWeb() %>" class="text-decoration-none mb-3 d-block"><%= dataUsuario.getSitioWeb() %></a>
                <% } %>

                <!-- Sección de advertencia para la eliminación de cuenta -->
                <div class="alert alert-danger mt-4" role="alert">
                    <h4 class="alert-heading">¡Advertencia!</h4>
                    <p>Al eliminar tu cuenta, se borrará permanentemente toda tu información asociada, incluidos tus álbumes, listas de reproducción, seguidores, y cualquier otro dato relacionado.</p>
                    <hr>
                    <p class="mb-0">Si realmente deseas eliminar tu cuenta, haz clic en el siguiente botón.</p>
                </div>

                <!-- Formulario para confirmar la eliminación de cuenta -->
                <form action="SvEliminarCuenta" method="post">
                    <input type="hidden" name="idUsuario" value="<%= dataUsuario.getNick() %>">
                    <button type="submit" class="btn btn-danger mt-3">Eliminar Cuenta</button>
                </form>
                
                <!-- Enlace para cancelar la acción y volver al perfil -->
                <a href="<%= request.getContextPath() %>/index.jsp" class="btn btn-secondary mt-3">Cancelar</a>

                <% } %>
            </div>
        </div>
    </div>

    <style>
        .profile-image {
            width: 150px;
            height: 150px;
            object-fit: cover;
        }
    </style>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.servicios.DataUsuario" %>
<%@ page import="com.servicios.DataLista" %>

<html>
<head>
     <jsp:include page="/template/header.jsp" />
    <title>Ranking de Usuarios</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

    <style>
    body {
        font-family: 'Arial', sans-serif;
        background-color: white; 
        color: black; 
        margin: 0;
        padding: 0;
    }

    h1 {
        color: #1DB954; 
        text-align: center;
        margin-top: 20px;
    }

    
    .contenedor {
        display: flex;
        justify-content: space-between;
        margin: 20px;
    }

    
    .artista, .cliente {
        cursor: pointer;
        color: #1DB954; 
        font-size: 18px;
        font-weight: bold;
        margin: 10px 0;
        transition: color 0.3s ease, transform 0.3s ease;
        padding: 10px;
        border-radius: 8px;
        background-color: rgba(0, 0, 0, 0.05); 
        box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1); 
    }

    .artista:hover, .cliente:hover {
        color: #fff;
        background-color: #1DB954; 
        transform: scale(1.05);
    }

    .info {
        margin-top: 20px;
        padding: 15px;
        background-color: #f9f9f9; 
        border-radius: 10px;
        border: 1px solid #ddd; 
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1); 
        display: none;
    }
    
    .info h2 {
        color: #1DB954; 
    }

    .info p {
        font-size: 16px;
        line-height: 1.5;
        margin: 10px 0;
    }
    
    

</style>

    <script>
        function mostrarInfo(id) {
            var elementos = document.getElementsByClassName('info');
            for (var i = 0; i < elementos.length; i++) {
                elementos[i].style.display = 'none'; // Ocultar todas las secciones
            }
            document.getElementById(id).style.display = 'block'; // Mostrar solo la sección seleccionada
        }
    </script>
</head>
<body>

<h1>Ranking de Usuarios</h1>

<div class="container">
    <div class="row">
        
        <div class="col-md-6">
            <h2>Artistas</h2>
            <div id="artistas">
                <%
                    List<DataUsuario> artistas = (List<DataUsuario>) request.getAttribute("artistas");
                    Map<String, Integer> seguidoresMap = (Map<String, Integer>) request.getAttribute("seguidoresMap");
                    
                    for (DataUsuario artista : artistas) {
                        String nombre = (artista.getNombre() != null) ? artista.getNombre().replace("'", "\\'") : "";
                        String apellido = (artista.getApellido() != null) ? artista.getApellido().replace("'", "\\'") : "";
                        String correo = (artista.getCorreo() != null) ? artista.getCorreo().replace("'", "\\'") : "";
                        int numeroSeguidores = seguidoresMap.getOrDefault(artista.getNick(), 0);
                %>
                        <p class="artista" onclick="mostrarInfo('<%= artista.getNick() %>_artista')">
                            <%= nombre %> <%= apellido %> - Seguidores: <%= numeroSeguidores %>
                        </p>
                        
                        <div id="<%= artista.getNick() %>_artista" class="info">
                            <h2>Información del Artista</h2>
                            <p>Nombre: <%= nombre %></p>
                            <p>Apellido: <%= apellido %></p>
                            <p>Email: <%= correo %></p>
                        </div>
                <%
                    }
                %>
            </div>
        </div>

       
        <div class="col-md-6">
            <h2>Clientes</h2>
            <div id="clientes">
                <%
                    List<DataUsuario> clientes = (List<DataUsuario>) request.getAttribute("clientes");
                    Map<String, Integer> seguidoresClientesMap = (Map<String, Integer>) request.getAttribute("seguidoresClientesMap");
                    Map<String, List<DataLista>> listasPublicasClienteMap = (Map<String, List<DataLista>>) request.getAttribute("listasPublicasClienteMap");
                    
                    for (DataUsuario cliente : clientes) {
                        String nicknameC = (cliente.getNick() != null) ? cliente.getNick().replace("'", "\\'") : "";
                        String nombreC = (cliente.getNombre() != null) ? cliente.getNombre().replace("'", "\\'") : "";
                        String apellidoC = (cliente.getApellido() != null) ? cliente.getApellido().replace("'", "\\'") : "";
                        
                        int numeroSeguidoresC = seguidoresClientesMap.getOrDefault(cliente.getNick(), 0);
                        List<DataLista> listasPublicas = listasPublicasClienteMap.get(cliente.getNick());
                %>
                        <p class="cliente" onclick="mostrarInfo('<%= cliente.getNick() %>_cliente')">
                            <%= nombreC %> <%= apellidoC %> - Seguidores: <%= numeroSeguidoresC %>
                        </p>
                        
                        <div id="<%= cliente.getNick() %>_cliente" class="info">
                            <h2>Información del Cliente</h2>
                            <p>Nickname: <%= nicknameC %></p>
                            
                            <h4>Listas Públicas:</h4>
                            <ul>
                                <%
                                    if (listasPublicas != null && !listasPublicas.isEmpty()) {
                                        for (DataLista lista : listasPublicas) {
                                            String nombreLista = (lista.getNombre() != null) ? lista.getNombre() : "Lista sin nombre";
                                %>
                                            <li><%= nombreLista %></li>
                                <%
                                        }
                                    } else {
                                %>
                                        <li>No tiene listas públicas</li>
                                <%
                                    }
                                %>
                            </ul>
                            
                             <% 
                   

                        String rutaOK = "imagenes_perfil/";
                        String imagenPerfil = (cliente.getImagen() != null && !cliente.getImagen().trim().isEmpty()) ? 
                            cliente.getImagen() : 
                            "assets/user.svg";
                        
                        if (!imagenPerfil.equals("assets/user.svg") && !imagenPerfil.startsWith(rutaOK)) {
                                imagenPerfil = rutaOK + imagenPerfil;
                        }
                        
                    %>

                            <img src="${pageContext.request.contextPath}/<%= imagenPerfil %>" 
                                 alt="<%=imagenPerfil%>" 
                                 width="200" height="150" >

                                    </div>
                            <%
                                }

                            %>
            </div>
        </div>
    </div>
</div>

</body>
</html>
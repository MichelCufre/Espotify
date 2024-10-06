<%-- 
    Document   : registro
    Created on : 1 oct. 2024, 18:03:31
    Author     : dokgo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/boostrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/boostrap/js/jquery-3.7.1.min.js"></script>
    <title>Registrarse</title>
   
</head>
<body class="bg-light"> 
    <jsp:include page="/template/header.jsp" />
    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="login-container bg-white p-4 rounded shadow">
            <h1 class="text-center">Registro</h1>
            <form class="login-form" action="SvRegistroUsuario" method="POST" enctype="multipart/form-data">
                <div class="form-group">
                    <label for="nickname">Nickname:</label>
                    <input type="text" id="nickname" name="nickname" class="form-control" required>
                    <small id="nicknameError" class="text-danger" style="display:none;"></small>
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="text" id="email" name="email" class="form-control" required>
                    <small id="emailError" class="text-danger" style="display:none;"></small>
                </div>
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" id="nombre" name="nombre" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="apellido">Apellido:</label>
                    <input type="text" id="apellido" name="apellido" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="password">Contraseña:</label>
                    <input type="password" id="password" name="password" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="conf_password">Confirmar Contraseña:</label>
                    <input type="password" id="conf_password" name="conf_password" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="fecha">Fecha de Nacimiento:</label>
                    <input type="date" id="fecha" name="fecha" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="imagen">Cargar Imagen:</label>
                    <input type="file" id="imagen" name="imagen" class="form-control" accept="image/*">
                </div>
                
                <div class="form-group">
                    <label>Tipo de Usuario:</label><br>
                    <input type="radio" id="cliente" name="tipo_usuario" value="cliente">
                    <label for="cliente">Cliente</label><br>
                    <input type="radio" id="artista" name="tipo_usuario" value="artista">
                    <label for="artista">Artista</label>
                </div>

                <div id="extra-artista" style="display: none;">
                    <div class="form-group">
                        <label for="biografia">Biografía:</label>
                        <textarea id="biografia" name="biografia" class="form-control"></textarea>
                    </div>
                    <div class="form-group">
                        <label for="sitioweb">Sitio Web:</label>
                        <input type="url" id="sitioweb" name="sitioweb" class="form-control">
                    </div>
                </div>

                <button type="submit" class="btn btn-outline-success">Registrarse</button>
            </form>
        </div>
    </div>
    
    <script src="${pageContext.request.contextPath}/boostrap/js/bootstrap.bundle.min.js"></script>
    <script>
        
    // Función para mostrar/ocultar los campos de Artista
        document.querySelectorAll('input[name="tipo_usuario"]').forEach((elem) => {
            elem.addEventListener("change", function() {
                const extraArtista = document.getElementById("extra-artista");
                if (document.getElementById("artista").checked) {
                    extraArtista.style.display = "block";
                } else {
                    extraArtista.style.display = "none";
                }
            });
        });
        
        $(document).ready(function() {
            let nicknameTimer, emailTimer;
            const doneTypingInterval = 10; // Tiempo en ms después de que el usuario deja de escribir

            function checkField(field, errorElement, checkType) {
                const value = $(field).val();
                if (value.length > 0) {
                    $.ajax({
                        url: 'SvRegistroUsuario',
                        method: 'POST',
                        data: { action: checkType, value: value },
                        success: function(response) {
                            if (response === 'exists') {
                                $(errorElement).text(checkType === 'checkNickname' ? 'Nickname ya existe' : 'Email ya está en uso').show();
                            } else {
                                $(errorElement).hide();
                            }
                        },
                        error: function() {
                            $(errorElement).text('Error al verificar').show();
                        }
                    });
                } else {
                    $(errorElement).hide();
                }
            }

            $('#nickname').on('input', function() {
                clearTimeout(nicknameTimer);
                nicknameTimer = setTimeout(() => checkField('#nickname', '#nicknameError', 'checkNickname'), doneTypingInterval);
            });

            $('#email').on('input', function() {
                clearTimeout(emailTimer);
                emailTimer = setTimeout(() => checkField('#email', '#emailError', 'checkEmail'), doneTypingInterval);
            });

            
        });
        
    </script>
    
</body>
</html>
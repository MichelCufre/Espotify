<%-- 
    Document   : login
    Created on : 29 set. 2024, 15:34:05
    Author     : dokgo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/boostrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/boostrap/js/jquery-3.7.1.min.js"></script>
    <title>Login</title>
</head>
<body class="bg-light">
    <jsp:include page="/template/header.jsp" />
    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="login-container bg-white p-4 rounded shadow">
            <h1 class="text-center">Iniciar Sesión</h1>
            <form id="loginForm" class="login-form" action="SvLogin" method="POST">
                <div class="form-group">
                    <label for="username">Nickname o Email:</label>
                    <input type="text" id="username" name="username" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="password">Contraseña:</label>
                    <input type="password" id="password" name="password" class="form-control" required>
                </div>
                <button type="submit" class="btn btn-outline-success mt-2">Iniciar Sesion</button>
            </form>
            <div id="loginMessage" class="mt-3"></div>
        </div>
    </div>
    <script src="${pageContext.request.contextPath}/boostrap/js/bootstrap.bundle.min.js"></script>
    <script>
        $(document).ready(function() {
            $('#loginForm').submit(function(e) {
                e.preventDefault();
                $.ajax({
                    url: 'SvLogin',
                    type: 'POST',
                    data: $(this).serialize(),
                    success: function(response) {
                        if (response === 'success') {
                            window.location.href = 'index.jsp';
                        } else {
                            $('#loginMessage').html('<div class="alert alert-danger">Usuario o contraseña incorrectos</div>');
                        }
                    },
                    error: function() {
                        $('#loginMessage').html('<div class="alert alert-danger">Error al intentar iniciar sesion</div>');
                    }
                });
            });
        });
    </script>
</body>
</html>



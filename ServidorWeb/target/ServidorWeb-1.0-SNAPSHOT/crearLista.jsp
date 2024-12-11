<%-- 
    Document   : crearLista
    Created on : 23 oct. 2024, 9:33:59 p. m.
    Author     : miche
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/boostrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/boostrap/js/jquery-3.7.1.min.js"></script>
    <title>CrearLista</title>
   
</head>
<body class="bg-light"> 
    <jsp:include page="/template/header.jsp" />
    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="login-container bg-white p-4 rounded shadow">
            <h1 class="text-center">Crear Lista de Reproduccion</h1>
            <form class="login-form" action="SvCrearLista" method="POST" enctype="multipart/form-data">
             
                <div class="form-group">
                    <label for="nombreLista">Nombre:</label>
                    <input type="text" id="nombreLista" name="nombreLista" class="form-control" required>
                    <small id="nombreError" class="text-danger" style="display:none;"></small>
                </div>
                <div class="form-group">
                    <label for="imagen">Cargar Imagen:</label>
                    <input type="file" id="imagen" name="imagen" class="form-control" accept="image/*">
                </div>

                <button type="submit" class="btn btn-outline-success">Crear Lista</button>
                <h2 id="pick"></h2>
            </form>
        </div>
    </div>
    
    <script src="${pageContext.request.contextPath}/boostrap/js/bootstrap.bundle.min.js"></script>
    <script>
        
        $(document).ready(function() {
            let nombreTimer;
            const doneTypingInterval = 10; 

            function checkField(field, errorElement, checkType) {
                const value = $(field).val();
                if (value.length > 0) {
                    $.ajax({
                        url: 'SvCrearLista',
                        method: 'POST',
                        data: { action: checkType, value: value },
                        success: function(response) {
                            $("#pick").html(document.getElementById("nombreLista").value);
                            if (response === 'exists') {
                                $(errorElement).text(checkType === 'checkNombre' ? 'Ese Nombre Ya existe').show();
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

            $('#nombreLista').on('input', function() {
                clearTimeout(nombreTimer);
                nombreTimer = setTimeout(() => checkField('#nombreLista', '#nombreError', 'checkNombre'), doneTypingInterval);
            });

            
        });
        
    </script>
    
</body>
</html>
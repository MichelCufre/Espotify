
<%@page import= "datatypes.DataTema"%>
<%@page import= "java.util.Set"%>
<%@page import= "java.util.HashSet"%>
<%@page import= "controladores.Fabrica"%>
<%@page import= "controladores.iSistema"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/boostrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/boostrap/js/jquery-3.7.1.min.js"></script>
    <title>Alta Album</title>
</head>
<body class="bg-light">
    
    <jsp:include page="/template/header.jsp"/>
    <div class="container justify-content-center align-items-center vw-30 vh-75" id="p">
        <div class="login-container bg-white p-4 rounded shadow">
            <h1 class="text-center">Alta Album</h1>
            <form class="login-form" action="SvAltaAlbum" method="POST">
                <div class="form-group">
                    <label for="nombreA">Nombre del Álbum:</label>
                    <input type="text" id="nombreA" name="nombreA" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="anio">Año:</label>
                    <input type="text" id="anio" name="anio" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="nombreG">Género:</label>
                    <input type="text" id="nombreG" name="nombreG" class="form-control">
                </div>
                <button type="button" id="add-genre" class="btn btn-outline-success">Añadir Género</button>
                
                <div class="form-group">
                    <label for="nombreT">Nombre del Tema:</label>
                    <input type="text" id="nombreT" name="nombreT" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="duracion">Duración:</label>
                    <input type="text" id="duracion" name="duracion" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="pos">Posición:</label>
                    <input type="text" id="pos" name="pos" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="direccionWeb">Dirección Web:</label>
                    <input type="text" id="direccionWeb" name="direccionWeb" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="archivo">Archivo:</label>
                    <input type="text" id="archivo" name="archivo" class="form-control" required>
                </div>
                <div><button type="button" id="add-tema" class="btn btn-outline-success">Añadir Tema</button></div>
                
                <button type="submit" id="enviar" class="btn btn-outline-success">Enviar</button>
            </form>
        </div>
        <div class="container d-flex justify-content-center align-items-center vh-100 vw-75">
            <div class="container d-flex vh-80 vw-75">
                <div class="login-container bg-white p-4 rounded shadow" id="generos-seleccionados" >
                    <h3>Géneros seleccionados:</h3>
                    <ul id="lista-generos"></ul>
                </div>
                <div class="login-container bg-white p-4 rounded shadow" id="temas-seleccionados" >
                    <h3>Temas seleccionados:</h3>
                    <ul id="lista-temas"></ul>
                </div>
            </div>
        </div>
        
    </div>
    
    <script src="${pageContext.request.contextPath}/boostrap/js/bootstrap.bundle.min.js"></script>
    <script>
        let generos = [];
        let temas = [];

        // Añadir género
        document.getElementById('add-genre').addEventListener('click', function() {
            var nombreG = document.getElementById('nombreG').value;
            if (nombreG && !generos.includes(nombreG)) {  // Verifica si no está ya añadido
                generos.push(nombreG);
                document.getElementById('nombreG').value = ""; 
                mostrarGeneros(); // Mostrar los géneros actualizados
            } else {
                alert("El género ya está en la lista o el campo está vacío.");
            }
        });

        // Añadir tema
        document.getElementById('add-tema').addEventListener('click', function() {
            let nombreT = document.getElementById('nombreT').value;
            let duracion = document.getElementById('duracion').value;
            let pos = document.getElementById('pos').value;
            let direccionWeb = document.getElementById('direccionWeb').value;
            let archivo = document.getElementById('archivo').value;
            
            if (nombreT && duracion && pos && (!direccionWeb || !archivo)) {  // Verifica las condiciones
                let tema = {
                    nombreT: nombreT,
                    duracion: duracion,
                    pos: pos,
                    direccionWeb: direccionWeb,
                    archivo: archivo
                };
                
                temas.push(tema); 
                document.getElementById('nombreT').value = "";
                document.getElementById('duracion').value = "";
                document.getElementById('pos').value = "";
                document.getElementById('direccionWeb').value = "";
                document.getElementById('archivo').value = "";
                mostrarTemas(); // Mostrar los temas actualizados
            } else {
                alert("Debe llenar los campos de tema correctamente.");
            }
        });

        // Función para mostrar géneros seleccionados en pantalla
        function mostrarGeneros() {
            let generosDiv = document.getElementById('lista-generos');
            generosDiv.innerHTML = ""; // Limpiar contenido previo
            generos.forEach(function(genero) {
                let li = document.createElement('li');
                li.textContent = genero;
                generosDiv.appendChild(li); 
            });
        }

        // Función para mostrar temas seleccionados en pantalla
        function mostrarTemas() {
            let temasDiv = document.getElementById('lista-temas');
            temasDiv.innerHTML = "";
            temas.forEach(function(tema) {
                let li = document.createElement('li');
                li.textContent = "Tema: " + tema.nombreT + ", Posición: " + tema.pos;
                temasDiv.appendChild(li);
            });
        }

        document.getElementById('enviar').addEventListener('click', function(event) {
            event.preventDefault(); // Esto solo previene el envío mientras verificamos
            
            // Asegúrate de que todos los campos requeridos estén completos
            let nombreA = document.getElementById('nombreA').value;
            let anio = document.getElementById('anio').value;
            let generosValidos = generos.length > 0; // Asegúrate de que haya géneros
            let temasValidos = temas.length > 0; // Asegúrate de que haya temas

            fetch('SvAltaAlbum', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({ generos: generos, temas: temas }) // Enviamos los arrays al servidor
            }).then(response => {
                if (response.ok) {
                    console.log('Datos enviados al servidor');

                    document.getElementById('albumForm').submit();  // Envía el formulario después de que los datos sean verificados y enviados
                } else {
                    console.log('Error al enviar datos');
                }
            }).catch(error => {
                console.log('Error:', error);
            });
        });

        // Verificación de campos y duplicados con AJAX
        $(document).ready(function() {
            function checkField(field, errorElement, checkType) {
                const value = $(field).val();
                if (value.length > 0) {
                    $.ajax({
                        url: 'SvAltaAlbum',
                        method: 'POST',
                        data: { action: checkType, value: value },
                        success: function(response) {
                            if (response === 'exists') {
                                $(errorElement).text('Ya existe').show();
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

            // Verificar el nombre del álbum
            $('#nombreA').on('input', function() {
                checkField('#nombreA', '#albumError', 'checkAlbumName');
            });

            // Verificar género duplicado
            $('#nombreG').on('input', function() {
                checkField('#nombreG', '#genreError', 'checkGenre');
            });

            // Verificar tema y posición duplicada
            $('#nombreT, #pos').on('input', function() {
                checkField('#nombreT', '#temaError', 'checkTema');
            });

            // Verificación de archivo y dirección web
            $('#archivo, #direccionWeb').on('input', function() {
                const archivo = $('#archivo').val();
                const direccionWeb = $('#direccionWeb').val();

                if (archivo && direccionWeb) {
                    $('#archivoError').text('Solo puedes ingresar un archivo o una dirección web, no ambos.').show();
                } else {
                    $('#archivoError').hide();
                }
            });
        });
    </script>
    
</body>
</html>

#p 

container justify-content-center align-items-center vw-30 vh-75 {
    width : 400px;
}
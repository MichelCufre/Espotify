  
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.servicios.DataUsuario" %>
<%@ page import ="com.servicios.DataLista" %>


<!DOCTYPE html>
<html>
<head>
    <title>Publicar Lista</title>
    <meta charset="UTF-8">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/bootstrap/js/jquery-3.7.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.bundle.min.js"></script>
    
</head>
<body class="bg-light">
    
    <jsp:include page="/template/header.jsp" />
    <div class="container">
    <h1>Publicar Lista de Reproducción</h1>
    
    <% 
        DataUsuario dataUsuario = (DataUsuario) session.getAttribute("dataUsuario"); 
        
        if (dataUsuario == null) {
            out.print("<p>No hay ningún usuario logueado.</p>");
        }else{
        
           
    %>
    
    
    <h3>Listas de Reproduccion de <%= dataUsuario.getNombre() %> <%= dataUsuario.getApellido() %> </h3>
    <!-- Tabla para mostrar las listas de reproducción -->
    <table id="tableLista">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Cliente</th>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>

    <!-- Botón para publicar la lista seleccionada -->
    <form id="publishForm">
        <input type="hidden" id="selectedListaId" name="listaId">
        <button id="btnPublicarLista" type="submit">Publicar Lista</button>
    </form>
</div>
      
 <script>
    function onUsuarioChange() {
        const usuario = "<%= dataUsuario.getNick() %>";
        document.getElementById("selectedListaId").value = ""; // Deseleccionar la lista
        $('.selected').removeClass('selected'); // Quitar la clase 'selected' de cualquier fila

        if (usuario) {
            $.ajax({
                url: 'svPublicarLista',
                type: 'GET',
                data: { usuario: usuario },
                success: function(response) {
                    $('#tableLista tbody').empty();

                    if (response.length === 0) {
                        $('#tableLista tbody').append(
                            '<tr><td colspan="3" style="text-align:center;">No hay listas disponibles</td></tr>'
                        );
                    } else {
                        response.forEach(function(lista) {
                            $('#tableLista tbody').append(
                                '<tr onclick="selectRow(this)">' +
                                '<td>' + lista.id + '</td>' +
                                '<td>' + lista.nombre + '</td>' +
                                '<td>' + lista.extra + '</td>' +  
                                '</tr>'
                            );
                        });
                    }
                },
                error: function() {
                    alert('Ocurrió un error al obtener las listas.');
                }
            });
        }
    }

    function selectRow(row) {
        var selected = document.querySelector('.selected');
        if (selected) {
            selected.classList.remove('selected');
        }
        row.classList.add('selected');
        document.getElementById("selectedListaId").value = row.cells[0].innerText;
    }

    $(document).ready(function() {
    $('form#publishForm').on('submit', function(event) {
        event.preventDefault();

        const listaId = $('#selectedListaId').val();
        if (!listaId) {
            alert("Debe seleccionar una lista");
            return;
        }

        $.ajax({
            url: 'svModificarLista',
            type: 'POST',
            data: { listaId: listaId },
            success: function(response) {
                alert("Lista publicada exitosamente!");

                // Eliminar la fila seleccionada de la tabla
                $('#tableLista .selected').remove();

                // Reiniciar el valor de selectedListaId
                $('#selectedListaId').val("");

                // Quitar la clase 'selected' de cualquier fila restante
                $('.selected').removeClass('selected');
            },
            error: function() {
                alert('Ocurrió un error al publicar la lista.');
            }
        });
    });
});
    
    window.onload = function() {
        onUsuarioChange();
    }
</script>

</body>
</html>
  <%  } %>
  
<style>
body {
        font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
        background-color: #FFFFFF; 
        color: #000000; 
        margin: 0;
        padding: 0;
        /* Añadido un margen horizontal */
        
    }

    h1 {
        text-align: center;
        margin-top: 20px;
        color: #1DB954; 
        margin-bottom: 40px;
    }
    
    .form-group {
        margin-bottom: 20px;
        flex: 1;
    }
    
    label {
        display: block;
        font-size: 14px;
        color: #333333; 
        margin-bottom: 8px;
    }
    
   
    
    #btnPublicarLista {
        width: 100%;
        padding: 10px;
        border-radius: 4px;
        border: none;
        background-color: #E0E0E0; 
        color: #000000; 
        font-size: 14px;
        outline: none;
        height: 40px;
        background-color: #1DB954; 
        color: #FFFFFF; 
        margin-bottom: 10px; 
    }
    
    #btnPublicarLista:hover {
        background-color: #1AA34A; 
    }
    
    table {
        width: 100%;
        border-collapse: collapse;
        margin-bottom: 20px;
    }
    
    table, th, td {
        border: 1px solid #CCCCCC; 
    }
    
    th, td {
        padding: 10px;
        text-align: left;
        color: #000000; 
    }
    
    th {
        background-color: #1DB954; 
        color: #FFFFFF; 
    }
    
    tr:nth-child(even) {
        background-color: #F7F7F7; 
    }
    
    tr:nth-child(odd) {
        background-color: #E0E0E0; 
    }
    
    tr.selected {
        background-color: #A9A9A9; 
    }
    
    .hidden {
        display: none;
    }
    </style>
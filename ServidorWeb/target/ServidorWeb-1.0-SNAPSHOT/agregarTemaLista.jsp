<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.servicios.DataAlbum"%>
<%@page import="com.servicios.DataLista"%>
<%@page import="com.servicios.DataTema"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="com.servicios.DataUsuario"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Tema a Lista</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/bootstrap/js/jquery-3.7.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.bundle.min.js"></script>
</head>

<body class="bg-light">
    <jsp:include page="/template/header.jsp" />
    <div class="container">
    <h1>Agregar Tema a Lista</h1>
    <% 
        DataUsuario dataUsuario = (DataUsuario) session.getAttribute("dataUsuario"); 
        
        if (dataUsuario == null) {
            out.print("<p>No hay ningún usuario logueado.</p>");
        }
    %>
    
    <h2 class="mb-2"><%= dataUsuario.getNombre() %> <%= dataUsuario.getApellido() %></h2>
    
    
    

    <div class="form-group">
        <h2>Listas Disponibles</h2>
        <table id="tablaListasDisponibles">
            <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
            </tr>
            </thead>
            <tbody>
            <!-- Las filas se llenarán dinámicamente -->
            </tbody>
        </table>
    </div>
    
    
    <div class="form-group">
        <label for="cmbOrigenTema">Origen del Tema:</label>
        <select id="cmbOrigenTema" onchange="alternarOrigenTema()">
            <option value="" disabled selected>Seleccione Origen del Tema</option>
            <option value="Por Defecto">Por Defecto</option>
            <option value="Lista Publica">Lista Pública</option>
            <option value="Album">Álbum</option>
        </select>
    </div>
    
    <div class="form-group hidden" id="listaPublicaElements">
        <label for="cmbListaPublica">Selecciona Lista Pública:</label>
        <select id="cmbListaPublica"></select>
    </div>

    <div class="form-group hidden" id="listaDefectoElements">
        <label for="cmbListaDefecto">Selecciona Lista por Defecto:</label>
        <select id="cmbListaDefecto"></select>
    </div>

    <div class="form-group hidden" id="albumElements">
        <label for="cmbAlbum">Selecciona Álbum:</label>
        <select id="cmbAlbum" onchange="cargarTemas(this.value, 'album')"></select>
    </div>

    
    
    <div class="form-group">
        <h2>Temas Disponibles</h2>
        <table id="tablaTemasDisponibles">
            <thead>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Duración</th>
            </tr>
            </thead>
            <tbody>
            <!-- Las filas se llenarán dinámicamente -->
            </tbody>
        </table>
    </div>

    <button id="btnAgregarTema" type="submit" onclick="agregarTema()">Agregar Tema a Lista</button>
    <button id="btnCancelar" type="reset" onclick="location.reload()">Cancelar</button>
</div>

    <script>
    let selectedListaRow = null;
    let selectedTemaRow = null;
    
    
    
   

    function cargarUsuarios() {
        
        var xhr = new XMLHttpRequest(); 
       xhr.open("GET", "svCargarUsuarios", true);
        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4 && xhr.status === 200) {
                var respuestaTexto = xhr.responseText;
                var usuarios = JSON.parse(respuestaTexto);

                var cmbUsuario = document.getElementById("cmbUsuario");
                cmbUsuario.innerHTML = '<option value="">Seleccionar Usuario</option>'; 

                for (var i = 0; i < usuarios.length; i++) {
                    var opcion = document.createElement("option");
                    opcion.value = usuarios[i];
                    opcion.text = usuarios[i];
                    cmbUsuario.appendChild(opcion);
                }
            }
        };
        xhr.send();
    }

    function cargarListasUsuario() {
        var usuarioSeleccionado  = "<%= dataUsuario.getNick() %>";
        var xhr = new XMLHttpRequest();
        xhr.open("GET", "svCargarListas?usuario=" + usuarioSeleccionado, true);
        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4 && xhr.status === 200) {
                var respuestaTexto = xhr.responseText;
                var listas = JSON.parse(respuestaTexto);

                var tablaListas = document.getElementById("tablaListasDisponibles");
                var cuerpoTabla = tablaListas.getElementsByTagName("tbody")[0];
                cuerpoTabla.innerHTML = "";

                for (var i = 0; i < listas.length; i++) {
                    var fila = cuerpoTabla.insertRow();
                    fila.setAttribute("data-id", listas[i].id);
                    fila.onclick = seleccionarListaFila;  
                    
                    var celdaId = fila.insertCell(0);
                    var celdaNombre = fila.insertCell(1);

                    celdaId.innerHTML = listas[i].id;
                    celdaNombre.innerHTML = listas[i].nombre;
                }
            }
        };
        xhr.send();
        
        selectedListaRow = null;
    }

    function seleccionarListaFila() {
        if (selectedListaRow) {
            selectedListaRow.classList.remove("selected");
        }
        selectedListaRow = this;
        this.classList.add("selected");
    }

    function cargarOpcionesLista(origen) {
        var xhr = new XMLHttpRequest();
        xhr.open("GET", "svCargarOrigenTema?tipo=" + origen, true);
        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4 && xhr.status === 200) {
                var respuestaTexto = xhr.responseText;
                var opciones = JSON.parse(respuestaTexto);

                var cmbListaDefecto = document.getElementById("cmbListaDefecto");
                var cmbListaPublica = document.getElementById("cmbListaPublica");
                var cmbAlbum = document.getElementById("cmbAlbum");

                // Opción "Seleccionar" para cada ComboBox
                cmbListaDefecto.innerHTML = '<option value="" disabled selected>Seleccionar Lista por Defecto</option>';
                cmbListaPublica.innerHTML = '<option value="" disabled selected>Seleccionar Lista Pública</option>';
                cmbAlbum.innerHTML = '<option value="" disabled selected>Seleccionar Álbum</option>';

                for (var i = 0; i < opciones.length; i++) {
                    var opcion = document.createElement("option");
                    opcion.value = opciones[i].id;
                    opcion.text = opciones[i].nombre;

                    if (origen === "defecto") {
                        cmbListaDefecto.appendChild(opcion);
                    } else if (origen === "publica") {
                        cmbListaPublica.appendChild(opcion);
                    } else if (origen === "album") {
                        cmbAlbum.appendChild(opcion);
                    }
                }
            }
        };
        xhr.send();
    }

    function cargarTemas(id, origen) {
        var xhr = new XMLHttpRequest();
        xhr.open("GET", "svCargarTemas?id=" + id + "&tipo=" + origen, true);
        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4 && xhr.status === 200) {
                var respuestaTexto = xhr.responseText;
                var temas = JSON.parse(respuestaTexto);

                var tablaTemas = document.getElementById("tablaTemasDisponibles");
                var cuerpoTabla = tablaTemas.getElementsByTagName("tbody")[0];
                cuerpoTabla.innerHTML = "";

                for (var i = 0; i < temas.length; i++) {
                    var fila = cuerpoTabla.insertRow();
                    fila.setAttribute("data-id", temas[i].id);
                    fila.onclick = seleccionarTemaFila;  
                    
                    var celdaId= fila.insertCell(0);
                    var celdaNombre = fila.insertCell(1);
                    var celdaDuracion = fila.insertCell(2);
                   
                    celdaId.innerHTML = temas[i].id;
                    celdaNombre.innerHTML = temas[i].nombre;
                    celdaDuracion.innerHTML = temas[i].duracion;
                }
            }
        };
        xhr.send();
        
        selectedTemaRow = null;
    }

    function seleccionarTemaFila() {
        if (selectedTemaRow) {
            selectedTemaRow.classList.remove("selected");
        }
        selectedTemaRow = this;
        this.classList.add("selected");
    }

    

    function alternarOrigenTema() {
        var origenSeleccionado = document.getElementById("cmbOrigenTema").value;
        
        var elementosAlbum = document.getElementById("albumElements");
        var elementosListaPublica = document.getElementById("listaPublicaElements");
        var elementosListaDefecto = document.getElementById("listaDefectoElements");

        elementosAlbum.classList.add("hidden");
        elementosListaPublica.classList.add("hidden");
        elementosListaDefecto.classList.add("hidden");

        if (origenSeleccionado === "Album") {
            cargarOpcionesLista("album");
            elementosAlbum.classList.remove("hidden");
            var cmbAlbum = document.getElementById("cmbAlbum");
            
            cmbAlbum.onchange = function() {
                cargarTemas(this.value, "album");
            };
        } else if (origenSeleccionado === "Lista Publica") {
            cargarOpcionesLista("publica");
            elementosListaPublica.classList.remove("hidden");
            var cmbListaPublica = document.getElementById("cmbListaPublica");
            cmbListaPublica.onchange = function() {
                cargarTemas(this.value, "publica");
            };
        } else if (origenSeleccionado === "Por Defecto") {
            cargarOpcionesLista("defecto");
            elementosListaDefecto.classList.remove("hidden");
            var cmbListaDefecto = document.getElementById("cmbListaDefecto");
            cmbListaDefecto.onchange = function() {
                cargarTemas(this.value, "defecto");
            };
        }
    }

    function agregarTema() {
        if (!selectedListaRow) {
            alert("Por favor, seleccione una lista y un tema.");
            return;  // Detenemos la ejecución si no hay una lista seleccionada
        }

        if (!selectedTemaRow) {
            alert("Por favor, selecciona una lista y un tema.");
            return;  // Detenemos la ejecución si no hay un tema seleccionado
        }

        // Si ambas validaciones pasan, continuamos
        var listaId = selectedListaRow.getAttribute("data-id");
        var temaId = selectedTemaRow.getAttribute("data-id");

        var xhr = new XMLHttpRequest();
        xhr.open("POST", "svAgregarTemaLista", true);
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

        xhr.onload = function() {
            if (xhr.status === 200) {
                alert(xhr.responseText);  // Mensaje de éxito del servidor

                // Eliminar la fila del tema agregado de la tabla
                selectedTemaRow.remove();
                selectedTemaRow = null;  
                
            } else if (xhr.status === 409) {
                alert("El tema ya existe en la lista.");  
            }
        };

        xhr.onerror = function() {
            alert("Ocurrió un error en la solicitud.");
        };

        xhr.send("listaId=" + listaId + "&temaId=" + temaId);
        
        if (!selectedListaRow) {
            alert("Por favor, selecciona una lista.");
            return;  
        }

        if (!selectedTemaRow) {
            alert("Por favor, selecciona un tema.");
            return;  
        }
    }

    window.onload = function() {
         
        cargarListasUsuario();
    }
</script>
    
</body>
</html>

<style>
    body {
        font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
        background-color: #FFFFFF; 
        color: #000000; 
        margin: 0;
        padding: 0;
    }
    h1 {
        text-align: center;
        margin-top: 20px;
        color: #1DB954; 
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
    select {
        width: 100%;
        padding: 10px;
        border-radius: 4px;
        border: none;
        background-color: #E0E0E0; 
        color: #000000; 
        font-size: 14px;
        outline: none;
    }
    
    #btnAgregarTema, #btnCancelar{
        width: 100%;
        padding: 10px;
        border-radius: 4px;
        border: none;
        background-color: #E0E0E0; 
        color: #000000; 
        font-size: 14px;
        outline: none;
        
        background-color: #1DB954; 
        color: #FFFFFF; 
        margin-bottom: 10px; 
        
        
    }
    
    #btnAgregarTema:hover, #btnCancelar:hover {
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

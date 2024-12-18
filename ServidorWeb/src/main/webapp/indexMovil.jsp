<%@page import="persistencia.ControladorPersistencia"%>
<%@page import= "java.util.List"%>
<%@page import= "java.util.Vector"%>
<%@page import= "datatypes.DataTema"%>
<%@page import= "datatypes.DataGenero"%>
<%@page import= "datatypes.DataUsuario"%>
<%@page import= "datatypes.DataAlbum"%>
<%@page import= "datatypes.DataLista"%>
<%@page import= "controladores.Fabrica"%>
<%@page import= "controladores.iSistema"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Espotify</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!--Boostrap-->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/boostrap/css/bootstrap.min.css">
        <script src="${pageContext.request.contextPath}/boostrap/js/jquery-3.7.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/boostrap/js/bootstrap.bundle.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    </head>
    
    <body class="bg-light">
        <jsp:include page="/template/headerMovil.jsp" />
        <div class="container">  
            <h1></h1>
        </div>
        
        <!--<div class="content-wrapper">-->
            <div class="topnav" >

            </div>
               <div class="main-content">
            <h2 id="content-title"></h2>
            <div id="album-grid" class="album-grid mt-4"></div>
            <div id="album-details" class="mt-4" style="display: none;">
                <div class="row">
                    <div class="col-md-4">
                        <img id="album-cover" src="${pageContext.request.contextPath}/imagenes_album/fotoAlbum.jpg" alt="Foto Album" class="img-fluid">
                    </div>
                    <div class="col-md-8">
                        <h3 id="album-title"></h3>
                        <h5 id="album-anio"></h5>
                        <a href="" id="album-artist"></a>
                        <p id="album-genre"></p>
                        <button class="btn btn-outline-success">Play</button>
                        <button class="btn btn-secondary" style="display:none;">Download</button>
                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th></th>
                                        <th id="track-number-header">#</th>
                                        <th>Tema</th>
                                        <th>Duración</th>
                                    </tr>
                                </thead>
                                <tbody id="track-list-body"></tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
            <footer class="player">
                <img src="" class="albumImg" id="albumCoverPlayer" alt="Album cover">
                <div class="controls">
                    <button id="playBtn">▶</button>
                </div>
                <input type="range" class="volume" id="volume"  min="0" max="100" value="50">
            </footer>
        <!--</div>-->


        <script>
            document.querySelectorAll('.sidebar-option').forEach(option => {
                option.addEventListener('click', () => {
                    const optionType = option.getAttribute('data-option');
                    const trackListBody = document.getElementById('track-list-body');

                    if (optionType === 'albumes') {
                        // En la vista de álbumes, asegúrate de mostrar la columna #
                        document.getElementById('track-number-header').style.display = '';
                        trackListBody.querySelectorAll('.track-number').forEach(cell => cell.style.display = '');
                    } else if (optionType === 'listas') {
                        // En la vista de listas, oculta la columna # o elimina las celdas de la columna #
                        document.getElementById('track-number-header').style.display = 'none';
                        trackListBody.querySelectorAll('.track-number').forEach(cell => cell.style.display = 'none');
                    }
                });
            });
            
            
            document.addEventListener("DOMContentLoaded", function() {
                cargarAlbumesFavoritos();
                cargarListasFavoritas();
                cargarTemasFavoritos();
            });
            const playBtn = document.getElementById('playBtn');
            const contentTitle = document.getElementById('content-title');
            const sidebarOptions = document.querySelectorAll('.sidebar-option');
            let isPlaying;
            const audioPlayer = new Audio();
            const volumeControl = document.getElementById("volumeControl");
            const playlist = document.querySelectorAll("#track-list-body li");
            //CONSULTA ALBUM Y LISTA
            let albumSelected;
            let listaSelected;
            let generoSelected = "";
            let artistaSelected = "";
             <% 
            ControladorPersistencia cpu = new ControladorPersistencia();
            iSistema sys = new Fabrica().getSistema(cpu);
            
            DataUsuario dataUsuario = (DataUsuario) session.getAttribute("dataUsuario");
            boolean isLoggedIn = (dataUsuario != null);
            boolean isCliente = (isLoggedIn && "cliente".equalsIgnoreCase(dataUsuario.getTipo()));
            String estado = "messi";
            
            if(dataUsuario != null){
                if(isCliente){
                    if(sys.ObtenerCliente(dataUsuario.getNick()).getSub() != null){
                        estado = sys.darSubUsuario(dataUsuario.getNick()).getEstado();
                     }
                }
            }
            
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule());
            List<DataAlbum> albums = sys.getAllAlbums();
            DataGenero[] generos = sys.getGeneros2(); 
            DataUsuario[] artistas = sys.getArtistas(); 
            Vector<DataLista> listaPartPublicas = sys.traerListasParticularesPublicas();
            List<DataLista> listaDefecto = sys.traerListasPorDefecto();
            String albumsJson = mapper.writeValueAsString(albums);
            String generosJson = mapper.writeValueAsString(generos);
            String artistasJson = mapper.writeValueAsString(artistas);
            String listaPartPublicasJson = mapper.writeValueAsString(listaPartPublicas);
            String listaDefectoJson = mapper.writeValueAsString(listaDefecto);
            %>
            const artistas = <%= artistasJson %>;
            const generos = <%= generosJson %>;
            const albums = <%= albumsJson %>;
            let albumsGen = [];
            let albumsArt = [];
            let tracks = [];
            let listaPartPublicas = <%= listaPartPublicasJson %>;
            let listaDefecto = <%= listaDefectoJson %>;
            

        sidebarOptions.forEach(option => {
        option.addEventListener('click', () => {
            const selectedOption = option.dataset.option;
            
            if (selectedOption === 'generos' || selectedOption === 'artistas' || selectedOption === 'listas') {
                displayExtra(selectedOption); 
            } else if (selectedOption === 'albumes') {
                displayAlbums(albums); 
            }
            document.getElementById("searchBar").value = "";
            document.getElementById('album-details').style.display = 'none';
            document.getElementById('album-grid').style.display = 'grid';
            document.getElementById('content-title').textContent = option.textContent;
            
            });
        });
        
        function getAlbumsGen(){

        let value = generoSelected;
        checkType = 'Genero';
        $.ajax({
                url: 'SvGetAlbumBy',
                method: 'POST',
                data: { action: checkType, value: value },
                success: function(response) {

                        albumsGen = JSON.parse(response);
                        displayAlbums(albumsGen);
                },
                error: function() {
                   alert("Error");
                }
            });
        }
        
        function getAlbumsArt(){

        let value = artistaSelected;
        checkType = 'Artista';
        $.ajax({
                url: 'SvGetAlbumBy',
                method: 'POST',
                data: { action: checkType, value: value },
                success: function(response) {

                    albumsArt = JSON.parse(response);
                    displayAlbums(albumsArt);
                    
                },
                error: function() {
                   alert("Error");
                }
            });
        }
        
        function displaySearchBar(){
            const albumGrid = document.getElementById('album-grid');
            albumGrid.innerHTML = '';
            document.getElementById('content-title').textContent = "";
            //ARTISTAS
            if(artistasAjax.length !== 0){
                const titleNameArt = document.createElement('h3');
                titleNameArt.className = 'tituloSearch';
                titleNameArt.textContent = "Artistas";
                albumGrid.appendChild(titleNameArt);
            }
            artistasAjax.forEach(artista => {
                const artistaCard = document.createElement('div');
                artistaCard.className = 'artista-card';

                if(artista.imagen !== null ){
                const imgElement = document.createElement('img');

                imgElement.src = "${pageContext.request.contextPath}/imagenes_perfil/" + artista.imagen; 
                imgElement.className = "albumImg";
                imgElement.alt = artista.nombre;
                artistaCard.appendChild(imgElement);  
                }else{
                    const imgElement = document.createElement('img');
                    imgElement.src = "${pageContext.request.contextPath}/assets/user.svg";
                    imgElement.className = "albumImg";
                    artistaCard.appendChild(imgElement);  
                }

                const titleElementArt = document.createElement('h5');
                titleElementArt.textContent = artista.nick;
                artistaCard.appendChild(titleElementArt);

                artistaCard.addEventListener('click', function() {
                
            fetch('SvPerfilVisitado', {
            method: 'POST',
           headers: {
        'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: new URLSearchParams({
                    nombre01: artista.nick
                    
            })
            })
            .then(response => {
                if (response.ok) {
                    console.log('Nombre guardado en la sesión');
                    
                    console.log("hola");
                    window.location.href = 'perfilVisitado.jsp';
                }
            })
            .catch(error => console.error('Error:', error));
               
                });
                
                albumGrid.appendChild(artistaCard);
            });
            
            //CLIENTES
            if(clientesAjax.length !== 0){
                const titleNameCli = document.createElement('h3');
                titleNameCli.className = 'tituloSearch';
                titleNameCli.textContent = "Clientes";
                albumGrid.appendChild(titleNameCli);
            }
            clientesAjax.forEach(cliente => {
                const clienteCard = document.createElement('div');
                clienteCard.className = 'cliente-card';

                if(cliente.imagen !== null) {
                    const imgElement = document.createElement('img');
                    imgElement.src = "${pageContext.request.contextPath}/imagenes_perfil/" + cliente.imagen; 
                    imgElement.className = "albumImg";
                    imgElement.alt = cliente.nombre;
                    clienteCard.appendChild(imgElement);  
                } else {
                    const imgElement = document.createElement('img');
                    imgElement.src = "${pageContext.request.contextPath}/assets/user.svg";
                    imgElement.className = "albumImg";
                    clienteCard.appendChild(imgElement);  
                }

                const titleElementCliente = document.createElement('h5');
                titleElementCliente.textContent = cliente.nick;
                clienteCard.appendChild(titleElementCliente);

                clienteCard.addEventListener('click', function() {
                    fetch('SvPerfilVisitado', {
            method: 'POST',
           headers: {
        'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: new URLSearchParams({
                    nombre01: cliente.nick
                    
            })
            })
            .then(response => {
                if (response.ok) {
                    console.log('Nombre guardado en la sesión');
                    
                    console.log("hola");
                    window.location.href = 'perfilVisitado.jsp';
                }
            })
            .catch(error => console.error('Error:', error));
                });
                albumGrid.appendChild(clienteCard);
            });

            //LISTAS PARTICULARES
            if(listasPAjax.length !== 0){
                const titleNameLP = document.createElement('h3');
                titleNameLP.className = 'tituloSearch';
                titleNameLP.textContent = "Listas Particulares";
                albumGrid.appendChild(titleNameLP);
            }
            listasPAjax.forEach(listaP => {
                const listaPCard = document.createElement('div');
                listaPCard.className = 'listaP-card';

                if(listaP.imagen !== null && listaP.imagen !== "-") {
                    const imgElement = document.createElement('img');
                    imgElement.src = "${pageContext.request.contextPath}/imagenes_lista/" + listaP.imagen; 
                    imgElement.className = "albumImg";
                    imgElement.alt = listaP.nombre;
                    listaPCard.appendChild(imgElement);  
                } else {
                    const imgElement = document.createElement('img');
                    imgElement.src = "${pageContext.request.contextPath}/imagenes_lista/lista.png";
                    imgElement.className = "albumImg";
                    listaPCard.appendChild(imgElement);  
                }

                const titleElementListaP = document.createElement('h5');
                titleElementListaP.textContent = listaP.nombre;
                listaPCard.appendChild(titleElementListaP);

                listaPCard.addEventListener('click', function() {
                    listaSelected = listaP;
                    displayListaDetails(listaSelected);
                });
                albumGrid.appendChild(listaPCard);
            });

            // LISTAS DEFECTO
            if(listasDAjax.length !== 0){
                const titleNameLD = document.createElement('h3');
                titleNameLD.className = 'tituloSearch';
                titleNameLD.textContent = "Listas Por Defecto";
                albumGrid.appendChild(titleNameLD);
            }
            listasDAjax.forEach(listaD => {
                const listaDCard = document.createElement('div');
                listaDCard.className = 'listaD-card';

                if(listaD.imagen !== null && listaD.imagen !== "-") {
                    const imgElement = document.createElement('img');
                    imgElement.src = "${pageContext.request.contextPath}/imagenes_lista/" + listaD.imagen; 
                    imgElement.className = "albumImg";
                    imgElement.alt = listaD.nombre;
                    listaDCard.appendChild(imgElement);  
                } else {
                    const imgElement = document.createElement('img');
                    imgElement.src = "${pageContext.request.contextPath}/imagenes_lista/lista.png";
                    imgElement.className = "albumImg";
                    listaDCard.appendChild(imgElement);  
                }

                const titleElementListaD = document.createElement('h5');
                titleElementListaD.textContent = listaD.nombre;
                listaDCard.appendChild(titleElementListaD);

                listaDCard.addEventListener('click', function() {
                    listaSelected = listaD;
                    displayListaDetails(listaSelected);
                });
                albumGrid.appendChild(listaDCard);
            });

            // TEMAS
            if(temasAjax.length !== 0){
            const titleNameTemas = document.createElement('h3');
            titleNameTemas.className = 'tituloSearch';
            titleNameTemas.textContent = "Temas";
            albumGrid.appendChild(titleNameTemas);
            }
            temasAjax.forEach(tema => {
                const temaCard = document.createElement('div');
                temaCard.className = 'tema-card';
                const imgElement = document.createElement('img');
                imgElement.src = "${pageContext.request.contextPath}/imagenes_album/tema.jpg"; 
                imgElement.className = "albumImg";
                imgElement.alt = tema.nombre;
                temaCard.appendChild(imgElement);  
                const titleElementTema = document.createElement('h5');
                titleElementTema.textContent = tema.nombre;
                temaCard.appendChild(titleElementTema);

                temaCard.addEventListener('click', function() {
                    
                });
                albumGrid.appendChild(temaCard);
            });

            // ALBUMS
            if(albumsAjax.length !== 0){
                const titleNameAlbum = document.createElement('h3');
                titleNameAlbum.className = 'tituloSearch';
                titleNameAlbum.textContent = "Albums";
                albumGrid.appendChild(titleNameAlbum);
            }
            albumsAjax.forEach(album => {
                const albumCard = document.createElement('div');
                albumCard.className = 'album-card';

                if(album.imagenAlbum !== null) {
                    const imgElement = document.createElement('img');
                    imgElement.className = "albumImg";
                    imgElement.src = "${pageContext.request.contextPath}/imagenes_album/" + album.imagenAlbum; 
                    imgElement.alt = album.nombre;
                    albumCard.appendChild(imgElement);  
                } else {
                    const imgElement = document.createElement('img');
                    imgElement.src = "${pageContext.request.contextPath}/imagenes_album/fotoAlbum.jpg";
                    imgElement.className = "albumImg";
                    albumCard.appendChild(imgElement);  
                }

                const titleElementAlbum = document.createElement('h5');
                titleElementAlbum.textContent = album.nombre;
                albumCard.appendChild(titleElementAlbum);

                // Crear y agregar el artista
                const artistElement = document.createElement('a');
                artistElement.textContent = album.nombreArt;
                albumCard.appendChild(artistElement);

                albumCard.addEventListener('click', function() {
                    albumSelected = album;
                    displayAlbumDetails(albumSelected);
                });

                albumGrid.appendChild(albumCard);
            });
        }
        
        function displayExtra(selectedOption) {
            const albumGrid = document.getElementById('album-grid');
            albumGrid.innerHTML = '';
            let titulo = document.getElementById('content-title');
            if (selectedOption === 'generos'){
                generos.forEach(genero => {
                    const generoCard = document.createElement('div');
                    generoCard.className = 'genero-card';
                    const titleElement = document.createElement('h5');
                    titleElement.textContent = genero.nombre;
                    generoCard.appendChild(titleElement);


                    generoCard.addEventListener('click', function() {
                        generoSelected = genero.nombre;
                        getAlbumsGen(); 
                    });
                    albumGrid.appendChild(generoCard);
                });
            }else if (selectedOption === 'artistas'){
                    artistas.forEach(artista => {
                    const artistaCard = document.createElement('div');
                    artistaCard.className = 'artista-card';

                    if(artista.imagen !== null ){
                    const imgElement = document.createElement('img');
                    
                    imgElement.src = "${pageContext.request.contextPath}/imagenes_perfil/" + artista.imagen; 
                    imgElement.className = "albumImg";
                    imgElement.alt = artista.nombre;
                    artistaCard.appendChild(imgElement);  
                    }else{
                        const imgElement = document.createElement('img');
                        imgElement.src = "${pageContext.request.contextPath}/assets/user.svg";
                        imgElement.className = "albumImg";
                        artistaCard.appendChild(imgElement);  
                    }

                    const titleElementArt = document.createElement('h5');
                    titleElementArt.textContent = artista.nick;
                    artistaCard.appendChild(titleElementArt);


                    artistaCard.addEventListener('click', function() {
                        artistaSelected = artista.nick;
                        getAlbumsArt(); 
                    });
                    albumGrid.appendChild(artistaCard);
                });
            }else if(selectedOption === 'listas'){
                if(listaDefecto.length !== 0){
                    const titleNameAlbum = document.createElement('h3');
                    titleNameAlbum.className = 'tituloSearch';
                    titleNameAlbum.textContent = "Listas Por Defecto";
                    albumGrid.appendChild(titleNameAlbum);
                }
                listaDefecto.forEach(listaD => {
                    const listaDCard = document.createElement('div');
                    listaDCard.className = 'listaD-card';

                    if(listaD.imagen !== null && listaD.imagen !== "-") {
                        const imgElement = document.createElement('img');
                        imgElement.src = "${pageContext.request.contextPath}/imagenes_lista/" + listaD.imagen; 
                        imgElement.className = "albumImg";
                        imgElement.alt = listaD.nombre;
                        listaDCard.appendChild(imgElement);  
                    } else {
                        const imgElement = document.createElement('img');
                        imgElement.src = "${pageContext.request.contextPath}/imagenes_lista/lista.png";
                        imgElement.className = "albumImg";
                        listaDCard.appendChild(imgElement);  
                    }

                    const titleElementListaD = document.createElement('h5');
                    titleElementListaD.textContent = listaD.nombre;
                    listaDCard.appendChild(titleElementListaD);

                    listaDCard.addEventListener('click', function() {
                        listaSelected = listaD;
                        displayListaDetails(listaSelected);
                        albumSelected = null;
                    });
                    albumGrid.appendChild(listaDCard);
                });

                if(listaPartPublicas.length !== 0){
                    const titleNameAlbum = document.createElement('h3');
                    titleNameAlbum.className = 'tituloSearch';
                    titleNameAlbum.textContent = "Listas Particulares";
                    albumGrid.appendChild(titleNameAlbum);
                }

                listaPartPublicas.forEach(listaP => {
                    const listaPCard = document.createElement('div');
                    listaPCard.className = 'listaD-card';

                    if(listaP.imagen !== null && listaP.imagen !== "-") {
                        const imgElement = document.createElement('img');
                        imgElement.src = "${pageContext.request.contextPath}/imagenes_lista/" + listaP.imagen; 
                        imgElement.className = "albumImg";
                        imgElement.alt = listaP.nombre;
                        listaPCard.appendChild(imgElement);  
                    } else {
                        const imgElement = document.createElement('img');
                        imgElement.src = "${pageContext.request.contextPath}/imagenes_lista/lista.png";
                        imgElement.className = "albumImg";
                        listaPCard.appendChild(imgElement);  
                    }

                    const titleElementListaP = document.createElement('h5');  
                    titleElementListaP.textContent = listaP.nombre;
                    listaPCard.appendChild(titleElementListaP);

                    listaPCard.addEventListener('click', function() {
                        listaSelected = listaP;
                        displayListaDetails(listaSelected);
                        albumSelected = null;
                    });
                    albumGrid.appendChild(listaPCard);
                });
            }
            }

        function displayAlbums(dtList) {
            const albumGrid = document.getElementById('album-grid');
            albumGrid.innerHTML = '';
            if(dtList !== null){
            dtList.forEach(album => {
                const albumCard = document.createElement('div');
                albumCard.className = 'album-card';
                if(album.imagenAlbum !== null ){
                    const imgElement = document.createElement('img');
                    imgElement.className = "albumImg";
                    imgElement.src = "${pageContext.request.contextPath}/imagenes_album/" + album.imagenAlbum; 
                    imgElement.alt = album.nombre;
                    albumCard.appendChild(imgElement);  
                }else{
                    const imgElement = document.createElement('img');
                    imgElement.src = "${pageContext.request.contextPath}/imagenes_album/fotoAlbum.jpg";
                    imgElement.className = "albumImg";
                    albumCard.appendChild(imgElement);  
                }
                const titleElement = document.createElement('h5');
                titleElement.textContent = album.nombre;
                albumCard.appendChild(titleElement);

                // Crear y agregar el artista
                const artistElement = document.createElement('a');
                artistElement.textContent = album.nombreArt;
                albumCard.appendChild(artistElement);


                albumCard.addEventListener('click', function() {
                    albumSelected = album;
                    displayAlbumDetails(albumSelected);
                    listaSelected = null;
                    
                });
                albumGrid.appendChild(albumCard);
            });
            }
        }
        


   //Albumfavorito
        let albumesFavoritos = new Set();
        
        function cargarAlbumesFavoritos() {
            fetch('SvObtenerAlbumesFavoritos', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded'
                }
            })
            .then(response => response.json())
            .then(data => {
                // Limpiar el conjunto actual
                albumesFavoritos.clear();
                // Agregar los IDs de los álbumes favoritos al conjunto
                data.forEach(album => {
                    albumesFavoritos.add(album.id);
                });
                // Actualizar las estrellas visibles actualmente
                actualizarEstrellasVisibles();
            })
            .catch(error => console.error("Error al cargar álbumes favoritos:", error));
        }

        // Función para actualizar las estrellas visibles
        function actualizarEstrellasVisibles() {
            document.querySelectorAll('.album-favorite').forEach(estrella => {
                const albumId = estrella.getAttribute('data-id');
                if (albumesFavoritos.has(parseInt(albumId))) {
                    estrella.classList.add('active');
                } else {
                    estrella.classList.remove('active');
                }
            });
        }
        //
        
        
        //Tema favorito
        
        let temasFavoritos = new Set();
        
        function cargarTemasFavoritos() {
            fetch('SvObtenerTemasFavoritos', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded'
                }
            })
            .then(response => response.json())
            .then(data => {
                temasFavoritos.clear();
                data.forEach(tema => {
                    temasFavoritos.add(tema.id);
                });
                actualizarEstrellasTemas();
            })
            .catch(error => console.error("Error al cargar temas favoritos:", error));
        }
        //
        function actualizarEstrellasTemas() {
            document.querySelectorAll('.track-favorite').forEach(estrella => {
                const temaId = estrella.getAttribute('data-id');
                if (temasFavoritos.has(parseInt(temaId))) {
                    estrella.classList.add('active');
                } else {
                    estrella.classList.remove('active');
                }
            });
        }
        
        
        
        
        function displayAlbumDetails(album) {
            document.getElementById('album-grid').style.display = 'none';
            document.getElementById('album-details').style.display = 'block';

            // Album cover setup
            if(album.imagenAlbum !== null){
                document.getElementById('album-cover').src = "${pageContext.request.contextPath}/imagenes_album/" + album.imagenAlbum; 
            }else{
                document.getElementById('album-cover').src = "${pageContext.request.contextPath}/imagenes_album/fotoAlbum.jpg"; 
            }

            // Album info setup
            document.getElementById('album-title').textContent = album.nombre;
            document.getElementById('album-artist').textContent = album.nombreArt;
            
            document.getElementById('album-artist').addEventListener('click', function() {
                
            fetch('SvPerfilVisitado', {
            method: 'POST',
           headers: {
        'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: new URLSearchParams({
                    nombre01: album.nombreArt
                    
            })
            })
            .then(response => {
                if (response.ok) {
                    console.log('Nombre guardado en la sesión');
                    
                    console.log("hola");
                    window.location.href = 'perfilVisitado.jsp';
                }
            })
            .catch(error => console.error('Error:', error));
               
                });
            document.getElementById('album-anio').textContent = album.fechaCreacion;
            document.getElementById('album-genre').textContent = album.generos;

            // Eliminar estrella existente si hay alguna
//            const existingFavoriteContainer = document.querySelector('.album-favorite-container');
//            if (existingFavoriteContainer) {
//                existingFavoriteContainer.remove();
//            }
            document.querySelectorAll('.album-favorite-container, .album-favorite, .lista-favorite-container, .lista-favorite').forEach(el => {
                el.remove();
            });
            <%if (estado.equals("Vigente")){%>
            // Agregar estrella de favorito para el álbum
            const albumFavoriteContainer = document.createElement('div');
            albumFavoriteContainer.className = 'album-favorite-container';
            const albumFavoriteIcon = document.createElement('i');
            albumFavoriteIcon.className = 'fa-solid fa-star album-favorite';
            albumFavoriteIcon.setAttribute('data-id', album.id);
            albumFavoriteIcon.setAttribute('data-nombre', album.nombre);
            
            // Verificar si el álbum está en favoritos y aplicar la clase active si corresponde
            if (albumesFavoritos.has(parseInt(album.id))) {
                albumFavoriteIcon.classList.add('active');
            }

            // Evento click para la estrella del álbum
            albumFavoriteIcon.addEventListener("click", function() {
                const id = this.getAttribute('data-id');
                const nombreAlbum = this.getAttribute('data-nombre');
                const tipo = this.classList.contains('active') ? "Dejar" : "Seguir";

                fetch('SvSeguirAlbum', {
                    method: "POST",
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded'
                    },
                    body: new URLSearchParams({
                        nombreAlbum: nombreAlbum,
                        tipo: tipo,
                        id: id
                    })
                })
                .then(response => {
                    if (response.ok) {
                        if (tipo === "Seguir") {
                            this.classList.add('active');
                            albumesFavoritos.add(parseInt(id));
                        } else {
                            this.classList.remove('active');
                            albumesFavoritos.delete(parseInt(id));
                        }
                        actualizarEstrellasVisibles();
                    }
                    return response.text();
                })
                .catch(error => console.error("Error al marcar álbum como favorito:", error));
            });

            // Insertar la estrella después del título del álbum
            const albumTitleElement = document.getElementById('album-title');
            albumFavoriteContainer.appendChild(albumFavoriteIcon);
            albumTitleElement.parentNode.insertBefore(albumFavoriteContainer, albumTitleElement.nextSibling);
            <%}%>
           

            // Procesamiento de tracks
            tracks = album.temas;
            tracks.sort((a, b) => a.posicion - b.posicion);
            const trackListBody = document.getElementById('track-list-body');
            trackListBody.innerHTML = '';

            tracks.forEach((track) => {
                const row = trackListBody.insertRow();
                row.className = "trackRow";
                if(track.direccionWeb !== null && track.direccionWeb !== "-" && track.direccionWeb !== ""){
                    row.dataset.src = track.direccionWeb;
                }else if(track.archivo !== null && track.archivo !== "-" && track.archivo !== ""){
                    row.dataset.src = "${pageContext.request.contextPath}/archivos_musica/" + track.archivo;
                }

                // Icono Play
                const playCell = row.insertCell(0);
                const playIcon = document.createElement("i");
                playIcon.className = "fa-solid fa-play";

                playIcon.addEventListener("click", function() {
                    this.classList.toggle('active');
                    loadTrack(row.dataset.src);
                });

                playCell.appendChild(playIcon);

                // Resto de las celdas
                row.insertCell(1).textContent = track.posicion;
                row.insertCell(2).textContent = track.nombre;
                row.insertCell(3).textContent = track.duracion;

                // Estrella para la canción
                <%if (estado.equals("Vigente")){%>
                const iCell = row.insertCell(4);
                const i = document.createElement("i");
                i.className = "fa-solid fa-star track-favorite";
                i.setAttribute('data-id', track.id);
                i.setAttribute('data-nombre', track.nombre);


                // Eliminar estrella existente si hay alguna
                const existingFavoriteContainer = document.querySelector('.track-favorite-container');
                if (existingFavoriteContainer) {
                    existingFavoriteContainer.remove();
                }
            
                // Verificar si el tema está en favoritos y aplicar la clase active si corresponde
                if (temasFavoritos.has(parseInt(track.id))) {
                    i.classList.add('active');
                }

                // Evento click para la estrella del tema
                i.addEventListener("click", function() {
                    const id = this.getAttribute('data-id');
                    const nombreTema = this.getAttribute('data-nombre');
                    const tipo = this.classList.contains('active') ? "Dejar" : "Seguir";

                    fetch('SvSeguirTema', {
                        method: "POST",
                        headers: {
                            'Content-Type': 'application/x-www-form-urlencoded'
                        },
                        body: new URLSearchParams({
                            nombreTema: nombreTema,
                            tipo: tipo,
                            id: id
                        })
                    })
                    .then(response => {
                        if (response.ok) {
                            if (tipo === "Seguir") {
                                this.classList.add('active');
                                temasFavoritos.add(parseInt(id));
                            } else {
                                this.classList.remove('active');
                                temasFavoritos.delete(parseInt(id));
                            }
                            actualizarEstrellasTemas();
                        }
                        return response.text();
                    })
                    .catch(error => console.error("Error al marcar tema como favorito:", error));
                });

                row.addEventListener("mouseover", () => {
                    playCell.appendChild(playIcon);  
                });
                iCell.appendChild(i);
                
                
                if(track.direccionWeb !== null && track.direccionWeb !== "-" && track.direccionWeb !== ""){
                const infCell = row.insertCell(5);
                const inf = document.createElement("i");
                inf.className = "fa-solid fa-info";
                infCell.appendChild(inf);

                // Evento de clic para el botón de descarga
                inf.addEventListener("click", function() {
                    
                    const fileUrl = row.dataset.src;
                    if (fileUrl) {
                        const a = document.createElement('a');
                        a.href = fileUrl;
                        a.target = "_blank";

                        document.body.appendChild(a);
                        a.click();
                        document.body.removeChild(a);
                    } else {
                        console.error("No se encontró la URL del archivo para descargar.");
                    }
                });
                
                }else{
                    const dCell = row.insertCell(5);
                    const d = document.createElement("i");
                    d.className = "fa-regular fa-circle-down";
                    dCell.appendChild(d);

                    // Evento de clic para el botón de descarga
                    d.addEventListener("click", function() {

                        const fileUrl = row.dataset.src;
                        if (fileUrl) {
                            const a = document.createElement('a');
                            a.href = fileUrl;
                            a.download = ''; 

                            // Agregar el enlace temporal al DOM, hacer clic y luego eliminarlo
                            document.body.appendChild(a);
                            a.click();
                            document.body.removeChild(a);
                        } else {
                            console.error("No se encontró la URL del archivo para descargar.");
                        }
                    });
                }
                <%}%>
            });
            
        }
        
        
        //Lista

        let listasFavoritas = new Set();

        function cargarListasFavoritas() {
            fetch('SvObtenerListasFavoritas', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded'
                }
            })
            .then(response => response.json())
            .then(data => {
                // Limpiar el conjunto actual
                listasFavoritas.clear();
                // Agregar los IDs de las listas favoritas al conjunto
                data.forEach(lista => {
                    listasFavoritas.add(lista.id);
                });
                // Actualizar las estrellas visibles actualmente
                actualizarEstrellasVisiblesListas();
            })
            .catch(error => console.error("Error al cargar listas favoritas:", error));
        }

        // Función para actualizar las estrellas visibles
        function actualizarEstrellasVisiblesListas() {
            document.querySelectorAll('.lista-favorite').forEach(estrella => {
                const listaId = estrella.getAttribute('data-id');
                if (listasFavoritas.has(parseInt(listaId))) {
                    estrella.classList.add('active');
                } else {
                    estrella.classList.remove('active');
                }
            });
        }

        function displayListaDetails(lista) {
            document.getElementById('album-grid').style.display = 'none';
            document.getElementById('album-details').style.display = 'block';
            if(lista.imagenAlbum !== null && lista.imagen !== "-"){
                document.getElementById('album-cover').src = "${pageContext.request.contextPath}/imagenes_lista/" + lista.imagen; 
            }else{
                document.getElementById('album-cover').src = "${pageContext.request.contextPath}/imagenes_lista/lista.png"; 
            }
            document.getElementById('album-title').textContent = lista.nombre;
            document.getElementById('album-artist').textContent = lista.cliente;
            
            document.getElementById('album-genre').textContent = lista.generos;
            
            //
            
            // Eliminar cualquier estrella existente
//            const existingFavoriteContainer = document.querySelector('.lista-favorite-container');
//            if (existingFavoriteContainer) {
//                existingFavoriteContainer.remove();
//            }
            <%if (estado.equals("Vigente")){%>
            document.querySelectorAll('.lista-favorite-container, .lista-favorite, .album-favorite-container, .album-favorite').forEach(el => {
                el.remove();
            });
            
            // Crear y configurar el ícono de favorito para la lista
            const listaFavoriteContainer = document.createElement('div');
            listaFavoriteContainer.className = 'lista-favorite-container';
            const listaFavoriteIcon = document.createElement('i');
            listaFavoriteIcon.className = 'fa-solid fa-star lista-favorite';
            listaFavoriteIcon.setAttribute('data-id', lista.id);
            listaFavoriteIcon.setAttribute('data-nombre', lista.nombre);

            // Verificar si la lista está en favoritos
            if (listasFavoritas.has(parseInt(lista.id))) {
                listaFavoriteIcon.classList.add('active');
            }

            // Evento click para la estrella de favorito
            listaFavoriteIcon.addEventListener("click", function() {
                const id = this.getAttribute('data-id');
                const nombreLista = this.getAttribute('data-nombre');
                const tipo = this.classList.contains('active') ? "Dejar" : "Seguir";

                fetch('SvSeguirLista', {
                    method: "POST",
                    headers: {
                        'Content-Type': 'application/x-www-form-urlencoded'
                    },
                    body: new URLSearchParams({
                        nombreLista: nombreLista,
                        tipo: tipo,
                        id: id
                    })
                })
                .then(response => {
                    if (response.ok) {
                        if (tipo === "Seguir") {
                            this.classList.add('active');
                            listasFavoritas.add(parseInt(id));
                        } else {
                            this.classList.remove('active');
                            listasFavoritas.delete(parseInt(id));
                        }
                        actualizarEstrellasVisiblesListas();
                    }
                    return response.text();
                })
                .catch(error => console.error("Error al marcar lista como favorita:", error));
            });

            // Insertar el ícono de favorito después del título de la lista
            const listaTitleElement = document.getElementById('album-title');
            listaFavoriteContainer.appendChild(listaFavoriteIcon);
            listaTitleElement.parentNode.insertBefore(listaFavoriteContainer, listaTitleElement.nextSibling);
            
            //
            <%}%>
            tracks = lista.temas;
            const trackListBody = document.getElementById('track-list-body');
            trackListBody.innerHTML = '';
            tracks.forEach((track) => {
                const row = trackListBody.insertRow();
                row.className = "trackRow";
                if(track.direccionWeb !== null && track.direccionWeb !== "-" && track.direccionWeb !== ""){
                    row.dataset.src = track.direccionWeb;
                }else if(track.archivo !== null && track.archivo !== "-" && track.archivo !== ""){
                    row.dataset.src = "${pageContext.request.contextPath}/archivos_musica/" + track.archivo;
                }
                console.log(row.dataset.src);
                //Icono Play
                const playCell = row.insertCell(0);
                const playIcon = document.createElement("i");
                playIcon.className = "fa-solid fa-play";
                
                playIcon.addEventListener("click", function() {
                    this.classList.toggle('active');
                    console.log('Play clickeado:', this);
                    loadTrack(row.dataset.src);
                });
                
                playCell.appendChild(playIcon);
                row.insertCell(1).textContent = track.nombre;
                row.insertCell(2).textContent = track.duracion;
                
                <%if (estado.equals("Vigente")){%>
                const iCell = row.insertCell(3);
                const i = document.createElement("i");
                i.className = "fa-solid fa-star track-favorite";
                i.setAttribute('data-id', track.id);
                i.setAttribute('data-nombre', track.nombre);


                // Eliminar estrella existente si hay alguna
                const existingFavoriteContainer = document.querySelector('.track-favorite-container');
                if (existingFavoriteContainer) {
                    existingFavoriteContainer.remove();
                }
            
                // Verificar si el tema está en favoritos y aplicar la clase active si corresponde
                if (temasFavoritos.has(parseInt(track.id))) {
                    i.classList.add('active');
                }

                // Evento click para la estrella del tema
                i.addEventListener("click", function() {
                    const id = this.getAttribute('data-id');
                    const nombreTema = this.getAttribute('data-nombre');
                    const tipo = this.classList.contains('active') ? "Dejar" : "Seguir";

                    fetch('SvSeguirTema', {
                        method: "POST",
                        headers: {
                            'Content-Type': 'application/x-www-form-urlencoded'
                        },
                        body: new URLSearchParams({
                            nombreTema: nombreTema,
                            tipo: tipo,
                            id: id
                        })
                    })
                    .then(response => {
                        if (response.ok) {
                            if (tipo === "Seguir") {
                                this.classList.add('active');
                                temasFavoritos.add(parseInt(id));
                            } else {
                                this.classList.remove('active');
                                temasFavoritos.delete(parseInt(id));
                            }
                            actualizarEstrellasTemas();
                        }
                        return response.text();
                    })
                    .catch(error => console.error("Error al marcar tema como favorito:", error));
                });

                row.addEventListener("mouseover", () => {
                    playCell.appendChild(playIcon);  
                });
                iCell.appendChild(i);
                
                if(track.direccionWeb !== null && track.direccionWeb !== "-" && track.direccionWeb !== ""){
                const infCell = row.insertCell(4);
                const inf = document.createElement("i");
                inf.className = "fa-solid fa-info";
                infCell.appendChild(inf);

                // Evento de clic para el botón de descarga
                inf.addEventListener("click", function() {
                    
                    const fileUrl = row.dataset.src;
                    if (fileUrl) {
                        const a = document.createElement('a');
                        a.href = fileUrl;
                        a.target = "_blank";

                        document.body.appendChild(a);
                        a.click();
                        document.body.removeChild(a);
                    } else {
                        console.error("No se encontró la URL del archivo para descargar.");
                    }
                });
                
                }else{
                    const dCell = row.insertCell(4);
                    const d = document.createElement("i");
                    d.className = "fa-regular fa-circle-down";
                    dCell.appendChild(d);

                    // Evento de clic para el botón de descarga
                    d.addEventListener("click", function() {

                        const fileUrl = row.dataset.src;
                        if (fileUrl) {
                            const a = document.createElement('a');
                            a.href = fileUrl;
                            a.download = '';

                            // Agregar el enlace temporal al DOM, hacer clic y luego eliminarlo
                            document.body.appendChild(a);
                            a.click();
                            document.body.removeChild(a);
                        } else {
                            console.error("No se encontró la URL del archivo para descargar.");
                        }
                    });
                }
              <%}%>  
            });
            
        }
        
        function loadTrack(src) {
            const soundcloudEmbedUrl = "https://w.soundcloud.com/player/?url=";
            const youtubeEmbedUrl = "https://www.youtube.com/embed/";

            const playerContainer = document.querySelector('.player');
            playerContainer.innerHTML = ``;

            if (src.includes("soundcloud.com")) {
                playerContainer.innerHTML = `
                    <img src="" class="albumImg" id="albumCoverPlayer" alt="Album cover">
                    
                `;
                if(albumSelected !== null){
                    if (albumSelected.imagenAlbum !== null) {
                        document.getElementById("albumCoverPlayer").src = "${pageContext.request.contextPath}/imagenes_album/" + albumSelected.imagenAlbum;
                    }else{
                        document.getElementById("albumCoverPlayer").src = "${pageContext.request.contextPath}/imagenes_album/fotoAlbum.jpg"; 
                    }
                }
                
                if(listaSelected !== null){
                    if (listaSelected.imagen !== null) {
                        document.getElementById("albumCoverPlayer").src = "${pageContext.request.contextPath}/imagenes_lista/" + listaSelected.imagen;
                    }else{
                        document.getElementById("albumCoverPlayer").src = "${pageContext.request.contextPath}/imagenes_lista/lista.png"; 
                    }
                }
                audioPlayer.pause();
                const soundcloudIframe = document.createElement("iframe");
                soundcloudIframe.className = "iframec";
                soundcloudIframe.src = soundcloudEmbedUrl + encodeURIComponent(src) + "&color=%23ff5500&auto_play=true";

                playerContainer.appendChild(soundcloudIframe);
            } else if (src.includes("youtube.com") || src.includes("youtu.be")) {

                audioPlayer.pause();
                const videoId = src.includes("youtu.be") ? src.split("/").pop() : new URL(src).searchParams.get("v");
                const youtubeIframe = document.createElement("iframe");
                youtubeIframe.width = "100%";
                youtubeIframe.height = "180";
                youtubeIframe.src = youtubeEmbedUrl + videoId + "?autoplay=1";
                youtubeIframe.frameBorder = "0";
                youtubeIframe.allow = "accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture";

                playerContainer.appendChild(youtubeIframe);
            } else {
                playerContainer.innerHTML = `
                    <img src="" class="albumImg" id="albumCoverPlayer" alt="Album cover">
                    <div class="controls">
                        <button id="playBtn">▶</button>
                    </div>
                    <input type="range" class="volume" min="0" max="100" value="50">
                `;
                assignPlayButtonEvent();
                
                audioPlayer.src = encodeURI(src);
                audioPlayer.play();
                if(albumSelected !== null){
                    if (albumSelected.imagenAlbum !== null) {
                        document.getElementById("albumCoverPlayer").src = "${pageContext.request.contextPath}/imagenes_album/" + albumSelected.imagenAlbum;
                    }else{
                        document.getElementById("albumCoverPlayer").src = "${pageContext.request.contextPath}/imagenes_album/fotoAlbum.jpg"; 
                    }
                }
                
                if(listaSelected !== null){
                    if (listaSelected.imagen !== null) {
                        document.getElementById("albumCoverPlayer").src = "${pageContext.request.contextPath}/imagenes_lista/" + listaSelected.imagen;
                    }else{
                        document.getElementById("albumCoverPlayer").src = "${pageContext.request.contextPath}/imagenes_lista/lista.png"; 
                    }
                }

                isPlaying = true;
                updatePlayButton(isPlaying);
            }
            
        }
        
        // Control de volumen
            document.getElementById("volume").addEventListener("input", () => {
                audioPlayer.volume = document.getElementById("volume").value / 100;
            });

                function updatePlayButton(isPlaying) {
            const playBtn = document.getElementById('playBtn');

            if (isPlaying) {
                playBtn.textContent = "⏸";
                playBtn.setAttribute("aria-label", "Pause");
            } else {
                playBtn.textContent = "▶";
                playBtn.setAttribute("aria-label", "Play");
            }
        }

        function assignPlayButtonEvent() {
            const playBtn = document.getElementById('playBtn');
            playBtn.addEventListener("click", function() {
                console.log("click playbtn");
                if (isPlaying) {
                    audioPlayer.pause();
                    isPlaying = false;
                } else {
                    audioPlayer.play();
                    isPlaying = true;
                }
                updatePlayButton(isPlaying);
            });
        }
        </script>
    </body>
</html>

<style>
    
/* Estilos generales */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
body {
    font-family: Arial, sans-serif;
    display: flex;
    flex-direction: column;
    min-height: 100vh;
    padding-bottom: 110px;
}
    .player .iframec {
    width: 70px; 
    height: 80px;
    overflow: hidden;
}
/* Reglas específicas */
.player {
    position: fixed;
    bottom: 0;
    width: 80%;
    left: 50%; 
    transform: translateX(-50%); 
    background-color: white;
    color: black; 
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 10px 20px;
    box-shadow: 0 -2px 10px rgba(0, 0, 0, 0.2);
    border-radius: 10px 10px 0 0;
}

.player .album-cover {
    height: 30px;
    width: 30px;
    object-fit: cover;
    border-radius: 5px;
    margin-right: 15px;
}

.player .song-info {
    display: flex;
    flex-direction: column;
    flex: 1;
    overflow: hidden;
}

.player .song-info .title {
    font-size: 16px;
    font-weight: bold;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
}

.player .song-info .artist {
    font-size: 14px;
    color: #ccc;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
}

.player .controls {
    display: flex;
    align-items: center;
    gap: 15px;
}

.player .controls button {
    background: none;
    border: none;
    color: black;
    font-size: 18px;
    cursor: pointer;
    display: flex;
    align-items: center;
    justify-content: center;
}

.player .controls button:hover {
    color: #ccc;
}

.player .additional-options {
    display: flex;
    align-items: center;
    gap: 15px;
}

.player .additional-options button {
    background: none;
    border: none;
    color: black;
    font-size: 18px;
    cursor: pointer;
}

.player .additional-options button:hover {
    color: #ccc;
}

.albumImg {
    height: 150px;
    width: 150px;
    object-fit: cover;
}

.album-cover {
    height: 250px;
    width: 250px;
    object-fit: cover;
}

i {
    display: inline-block;
    cursor: pointer;
}

.fa-star {
    cursor: pointer;
    color: #000;
    transition: color 0.3s ease;
    background: none;
    border: none;
    font-size: 1.2em;
}

.fa-solid.fa-play {
    cursor: pointer;
    border: none;
    font-size: 1.2em;
}

.fa-solid.fa-star.active {
    color: gold;
}

.content-wrapper {
    display: flex;
    flex-grow: 1;
}

.sidebar {
    width: 200px;
    background-color: #f0f0f0;
    padding: 20px;
}

.sidebar-option {
    cursor: pointer;
    padding: 10px;
    margin-bottom: 10px;
}

.sidebar-option:hover {
    background-color: #e0e0e0;
}

.main-content {
    flex-grow: 1;
    padding: 20px;
    display: flex;
    flex-direction: column;
}

.content-title {
    font-size: 24px;
    margin-bottom: 20px;
}

.genres-container {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 20px;
}

.genre {
    background-color: #e0e0e0;
    padding: 20px;
    text-align: center;
    cursor: pointer;
}

.controls {
    display: flex;
    justify-content: center;
    margin-top: 20px;
}

.controls button {
    margin: 0 10px;
    font-size: 24px;
    background: none;
    border: none;
    cursor: pointer;
}

.volume {
    width: 100%;
    margin-top: 20px;
}

.album-grid {
    display: grid;
    grid-template-columns: repeat(auto-fill, minmax(150px, 1fr));
    gap: 20px;
}

.table {
    border-radius: 15px;
    overflow: hidden;
}

.table thead {
    background-color: #1DB954;
    color: white;
}

.album-card,
.genero-card,
.artista-card,
.tema-card,
.listaP-card,
.listaD-card,
.cliente-card {
    cursor: pointer;
    transition: transform 0.3s;
    border: 1px solid #ccc;
    padding: 10px;
    background-color: #fff;
    text-align: center;
}

.album-card:hover {
    transform: scale(1.05);
}

.track-list {
    max-height: 300px;
    overflow-y: auto;
}

.hidden-column {
    display: none;
}

/* Adaptaciones para dispositivos móviles */
@media (max-width: 768px) {
    .sidebar {
        width: 100%;
        padding: 10px;
    }

    .sidebar-option {
        padding: 8px;
        font-size: 14px;
    }

    .main-content {
        padding: 10px;
    }

    .content-title {
        font-size: 20px;
    }

    .genres-container {
        grid-template-columns: repeat(auto-fill, minmax(100px, 1fr));
        gap: 10px;
    }

    .player {
        padding: 10px;
    }

    .controls button {
        font-size: 18px;
    }

    .album-cover {
        height: 200px;
        width: 200px;
    }

    .albumImg {
        height: 100px;
        width: 100px;
    }

    .table {
        font-size: 12px;
    }

    .table thead {
        font-size: 14px;
    }

    .album-card,
    .genero-card,
    .artista-card,
    .tema-card,
    .listaP-card,
    .listaD-card,
    .cliente-card {
        padding: 8px;
        font-size: 14px;
    }

    .track-list {
        max-height: 200px;
    }
}


</style>
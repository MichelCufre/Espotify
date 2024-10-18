<%-- 
    Document   : login
    Created on : 29 set. 2024, 15:40:05
    Author     : dokgo
--%>

<%@page import= "datatypes.DataTema"%>
<%@page import= "datatypes.DataGenero"%>
<%@page import= "datatypes.DataUsuario"%>
<%@page import= "datatypes.DataAlbum"%>
<%@page import= "controladores.Fabrica"%>
<%@page import= "controladores.iSistema"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Espotify</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!--Boostrap-->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/boostrap/css/bootstrap.min.css">
        <script src="${pageContext.request.contextPath}/boostrap/js/jquery-3.7.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/boostrap/js/bootstrap.bundle.min.js"></script>
    </head>
    
    <body class="bg-light">
        <jsp:include page="/template/header.jsp" />
        <div class="container">  
            <h1></h1>
        </div>
        
        <div class="content-wrapper">
            <div class="sidebar">
                <div class="sidebar-option" data-option="generos">Generos</div>
                <div class="sidebar-option" data-option="artistas">Artistas</div>
                <div class="sidebar-option" data-option="albumes">Albumes</div>
            </div>
               <div class="main-content">
            <h2 id="content-title">Géneros</h2>
            <div id="extra-grid" class="album-grid mt-4"></div>
            <div id="album-grid" class="album-grid mt-4"></div>
            <div id="album-details" class="mt-4" style="display: none;">
                <div class="row">
                    <div class="col-md-4">
                        <img id="album-cover" src="" alt="Album cover" class="img-fluid">
                    </div>
                    <div class="col-md-8">
                        <h3 id="album-title"></h3>
                        <p id="album-artist"></p>
                        <p id="album-genre"></p>
                        <button class="btn btn-primary me-2">Play</button>
                        <button class="btn btn-secondary">Download</button>
                        <div class="track-list mt-4">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>#</th>
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
            <div class="player">
                <img src="" alt="Album cover">
                <div class="controls">
                    <button id="prevBtn">⏮</button>
                    <button id="playBtn">▶</button>
                    <button id="nextBtn">⏭</button>
                </div>
                <input type="range" class="volume" min="0" max="100" value="50">
            </div>
        </div>

        <script>
            const playBtn = document.getElementById('playBtn');
            const contentTitle = document.getElementById('content-title');
            const sidebarOptions = document.querySelectorAll('.sidebar-option');
            let isPlaying = false;
            let albumSelected = "";
            let generoSelected = "";
            let artistaSelected = "";

            playBtn.addEventListener('click', () => {
                if (isPlaying) {
                    playBtn.textContent = '▶';
                    isPlaying = false;
                } else {
                    playBtn.textContent = '⏸';
                    isPlaying = true;
                }
            });

            sidebarOptions.forEach(option => {
        option.addEventListener('click', () => {
        const selectedOption = option.dataset.option;
//        if (selectedOption === 'generos') {
//            displayExtra('generos'); // Mostrar géneros
//        } else if (selectedOption === 'artistas') {
//            displayExtra('artistas'); // Mostrar artistas
//        }
        if (selectedOption === 'albumes') {
            displayAlbums();  // Muestra los álbumes
        }
        document.getElementById('content-title').textContent = option.textContent;
    });
});
        <% 
        iSistema sys = new Fabrica().getSistema();
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule()); // Registrar el módulo para fechas de Java 8
        DataGenero[] generos = sys.getGeneros2(); 
        DataUsuario[] artistas = sys.getArtistas(); 
        
        String generosJson = mapper.writeValueAsString(generos);
        String artistasJson = mapper.writeValueAsString(artistas);
        %>
        const artistas = JSON.parse('<%=generosJson.replace("\"", "\\\"")%>');
    const generos = JSON.parse('<%=artistasJson.replace("\"", "\\\"")%>');
        
        const tracks = [
            { id: 1, title: "Déjame Bailar", duration: "3:25" },
            { id: 2, title: "Nada Para Ver", duration: "3:57" },
            { id: 3, title: "Venganza", duration: "3:41" },
            { id: 4, title: "Llévame Contigo", duration: "3:14" },
            { id: 5, title: "No Era Cierto", duration: "3:33" },
            { id: 6, title: "Quemado", duration: "3:10" }
        ];


//        function displayExtra() {
//            const extraGrid = document.getElementById('extra-grid');
//            extraGrid.innerHTML = '';
//            let titulo = document.getElementById('content-title');
//            const selectedOption = option.dataset.option;
//        if (selectedOption === 'generos'){
//            generos.forEach(genero => {
//                const generoCard = document.createElement('div');
//
//                generoCard.className = 'genero-card';
//                  
//                const titleElement = document.createElement('h5');
//                titleElement.textContent = genero.nombre;
//                generoCard.appendChild(titleElement);
//
//                generoCard.addEventListener('click', () => displayAlbums(genero));
//                extraGrid.appendChild(generoCard);
//            });
//        }else if (selectedOption === 'artistas'){
//                artistas.forEach(artista => {
//                const artistaCard = document.createElement('div');
//
//                artistaCard.className = 'genero-card';
//                  
//                const titleElement = document.createElement('h5');
//                titleElement.textContent = artista.nickname;
//                artistaCard.appendChild(titleElement);
//
//                artistaCard.addEventListener('click', () => displayAlbums(artista));
//                extraGrid.appendChild(generoCard);
//            });
//            }
//        }

        function displayAlbums() {
            const albumGrid = document.getElementById('album-grid');
            albumGrid.innerHTML = '';
            albums.forEach(album => {
                const albumCard = document.createElement('div');

                albumCard.className = 'album-card';
                
                  // Crear y agregar el título
                const imgElement = document.createElement('img');
                imgElement.src = album.img;
                imgElement.src = album.nombre;
                albumCard.appendChild(imgElement);  
                  
                const titleElement = document.createElement('h5');
                titleElement.textContent = album.nombre;
                albumCard.appendChild(titleElement);

                // Crear y agregar el artista
                const artistElement = document.createElement('a');
                artistElement.textContent = album.artista;
                albumCard.appendChild(artistElement);

                albumCard.addEventListener('click', () => displayAlbumDetails(album));
                albumGrid.appendChild(albumCard);
            });
        }
        
//        function displayAlbums(genero) {
//            generoSelected = genero.nombre;
//            const albumGrid = document.getElementById('album-grid');
//            albumGrid.innerHTML = '';
//            albumsGen.forEach(album => {
//                const albumCard = document.createElement('div');
//                albumCard.className = 'album-card';
//                
//                  // Crear y agregar el título
//                const imgElement = document.createElement('img');
//                imgElement.src = album.img;
//                imgElement.src = album.nombre;
//                albumCard.appendChild(imgElement);  
//                  
//                const titleElement = document.createElement('h5');
//                titleElement.textContent = album.nombre;
//                albumCard.appendChild(titleElement);
//
//                // Crear y agregar el artista
//                const artistElement = document.createElement('a');
//                artistElement.textContent = album.artista;
//                albumCard.appendChild(artistElement);
//
//                albumCard.addEventListener('click', () => displayAlbumDetails(album));
//                albumGrid.appendChild(albumCard);
//            });
//        }
//        
//        function displayAlbums(artista) {
//            artistaSelected = artista.nombre;
//            const albumGrid = document.getElementById('album-grid');
//            albumGrid.innerHTML = '';
//            albumsArt.forEach(album => {
//                const albumCard = document.createElement('div');
//
//                albumCard.className = 'album-card';
//                
//                  // Crear y agregar el título
//                const imgElement = document.createElement('img');
//                imgElement.src = album.img;
//                imgElement.src = album.nombre;
//                albumCard.appendChild(imgElement);  
//                  
//                const titleElement = document.createElement('h5');
//                titleElement.textContent = album.nombre;
//                albumCard.appendChild(titleElement);
//
//                // Crear y agregar el artista
//                const artistElement = document.createElement('a');
//                artistElement.textContent = album.artista;
//                albumCard.appendChild(artistElement);
//
//                albumCard.addEventListener('click', () => displayAlbumDetails(album));
//                albumGrid.appendChild(albumCard);
//            });
//        }

        function displayAlbumDetails(album) {
            albumSelected = album.nombre;
            document.getElementById('album-grid').style.display = 'none';
            document.getElementById('album-details').style.display = 'block';
            document.getElementById('album-cover').src = album.img;
            document.getElementById('album-title').textContent = album.nombre;
            //document.getElementById('album-artist').textContent = album.artist;
            //document.getElementById('album-genre').textContent = album.genero;

            const trackListBody = document.getElementById('track-list-body');
            trackListBody.innerHTML = '';
            tracks.forEach((track, index) => {
                const row = trackListBody.insertRow();
                row.insertCell(0).textContent = index + 1;
                row.insertCell(1).textContent = track.title;
                row.insertCell(2).textContent = track.duration;
            });
        }

        document.addEventListener('DOMContentLoaded', () => {
            displayAlbums();

            const sidebarLinks = document.querySelectorAll('.sidebar .list-group-item');
            sidebarLinks.forEach(link => {
                link.addEventListener('click', (e) => {
                    document.getElementById('content-title').textContent = e.target.textContent;
//                    document.getElementById('extra-grid').style.display = 'grid';
                    document.getElementById('album-grid').style.display = 'grid';
                    document.getElementById('album-details').style.display = 'none';
                });
            });
        });
        </script>
    </body>
</html>


<style>
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
body {
    font-family: Arial, sans-serif;
    display: flex;
    flex-direction: column;
    min-height: 100vh;
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
.player {
    width: 200px;
    background-color: #f0f0f0;
    padding: 20px;
    display: flex;
    flex-direction: column;
    align-items: center;
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
.album-card {
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


</style>
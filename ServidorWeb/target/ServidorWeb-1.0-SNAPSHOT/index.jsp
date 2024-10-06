<%-- 
    Document   : login
    Created on : 29 set. 2024, 15:40:05
    Author     : dokgo
--%>

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
                <h2 class="content-title">Generos</h2>
                <div class="genres-container">
<!--                    carga2-->
                </div>
            </div>
            <div class="player">
                <img src="imagen del album" alt="Album cover">
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
            const contentTitle = document.querySelector('.content-title');
            const sidebarOptions = document.querySelectorAll('.sidebar-option');
            let isPlaying = false;

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
                    contentTitle.textContent = option.textContent;
                    // argegar la logica para meter al otro contenedor
                    // basado en la opcion seleccionada
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
  
</style>
<%-- 
    Document   : altaAlbum
    Created on : 6 oct. 2024, 7:46:05 p. m.
    Author     : miche
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Album</title>
    </head>
    <body>
        <form action="SvAltaAlbum" method="POST">
            <p><label>Nombre:</label><input type="text" name="nombreA"></p>
            <p><label>Año:</label><input type="text" name="anio"></p>
            <p><label>Genero:</label><input type="text" name="nombreG"></p>
            <p><label>Nombre Tema:</label><input type="text" name="nombreT"></p>
            <p><label>Duracion:</label><input type="text" name="duracion"></p>
            <p><label>Posicion</label><input type="text" name="pos"></p>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>

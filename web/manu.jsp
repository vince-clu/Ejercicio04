<%-- 
    Document   : manu
    Created on : 12-dic-2012, 16:36:49
    Author     : vesprada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calcula el cuadrado de tu número</h1>
        <form action="/Ejercicio04/Acceso" method="POST">
            <input type="text" name="numero">
            <input type="submit" value="Calcula">
            <input type="hidden" value="form1" name="form">
        </form>
        
       <form action="Acceso" method="get">
            
            <p>Escribe algo:</p>
            <input type="text" name="dato">
            <input type="submit" value="Enviar">
            <input type="hidden" value="form2" name="form">
 

        </form>
    </body>
</html>

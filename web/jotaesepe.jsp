<%-- 
    Document   : jotaesepe
    Created on : 17-dic-2012, 16:17:50
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
        <h1>Hello Jota</h1>
        Has escrito <%= request.getAttribute("nombre") %>
    </body>
</html>

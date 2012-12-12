<%-- 
    Document   : vin2
    Created on : 12-dic-2012, 18:03:59
    Author     : vesprada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <%
        String formVin= (String) request.getParameter("formVin");
        
    %>
    <body>
        <h1>Hello <%=formVin%> </h1>
    </body>
</html>

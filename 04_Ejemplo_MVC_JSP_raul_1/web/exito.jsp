<%-- 
    Document   : exito
    Created on : 26-sep-2019, 13:40:44
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exito - registro guardado</title>
    </head>
    <body>
        <h1>Exito - registro guardado</h1>
        <label for="nombre">Nombre: </label>
        <input readonly value="<%= request.getParameter("nombre") %>"/>
        <label for="edad">Nombre: </label>
        <input readonly value="<%= request.getParameter("edad") %>"/>
    </body>
</html>

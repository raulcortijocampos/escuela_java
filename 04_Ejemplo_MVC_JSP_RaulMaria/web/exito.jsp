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
       
        <% 
            String lala = (String) request.getAttribute("vieneDe");
            if ("add".equals(lala)) {%>
                <h1>Exito - registro guardado</h1>
                <label for="nombre">Nombre: </label>
                <input readonly value="<%= request.getParameter("nombre") %>"/>
                <label for="edad">Edad: </label>
                <input readonly value="<%= request.getParameter("edad") %>"/>
                <label for="email">Email: </label>
                <input readonly value="<%= request.getParameter("email") %>"/>
                <label for="password">Password: </label>
                <input readonly value="<%= request.getParameter("password") %>"/>
                <a href="./"> volver al inicio </a>
        <% }else if("borrar".equals(lala)) { %>
                 <h1>Exito - Borrado <% request.getParameter("nombreABorrar");  %></h1>
                 <a href="./"> volver al inicio </a>
        <% } %>
    </body>
</html>

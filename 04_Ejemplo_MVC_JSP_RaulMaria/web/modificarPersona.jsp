<%-- 
    Document   : modificarPersona
    Created on : 26-sep-2019, 17:24:58
    Author     : student
--%>

<%@page import="com.sinensia.modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar persona</title>
    </head>
    <body>
        <h1>Modificar persona</h1>
        <h1><%=request.getParameter("nombre")%></h1>
        <% Persona pers = (Persona) session.getAttribute("modificarPers"); %>
        <% if(pers != null){ %>
            <label for="nombre">Nombre Antiguo: </label>
            <input id="nombre" readonly value="<%= pers.getNombre() %>"/>
            <label for="edad">Edad antigua: </label>
            <input id="edad" readonly value="<%= pers.getEdad() %>"/>
            <label for="edad">Email antigua: </label>
            <input id="edad" readonly value="<%= pers.getEmail() %>"/>
            <label for="edad">Password antigua: </label>
            <input id="edad" readonly value="<%= pers.getPassword()%>"/>
        <% }else{ %>
            <span style="color: red">
                No se han encontrado personas
            </span>
         <% }%>
         
        <form name='form1' method='post' action='./exito.jsp'>
            <table border='1'>
                <tr>
                    <td>Nuevo nombre</td>
                    <td><input type='text' name='nuevoNombre' id='nuevoNombre' value="<%= pers.getNombre() %>"/></td>
                </tr>
                <tr>
                    <td>Nuevo Edad</td>
                    <td> <input type='number' name='nuevoEdad' id='nuevoEdad' value="<%= pers.getEdad() %>"/>
                </tr>
                <tr>
                    <td>Nuevo Email</td>
                    <td><input type='text' name='nuevoEmail' id='nuevoEmail' value="<%= pers.getEmail() %>"/>
                </tr>
                <tr>
                    <td>Nuevo Password</td>
                    <td><input type='password' name='nuevoPassword' id='nuevoPassword' value="<%= pers.getPassword()%>"/>
                </tr>
            </table>
            <input type='submit' value='Cambiar'/>
            <input type='hidden' name="queHacer" id="queHacer" value="cambiar"/>
        </form>
    </body>
</html>

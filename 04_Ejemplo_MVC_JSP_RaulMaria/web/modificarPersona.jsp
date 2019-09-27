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
            <label for="nombre">Nombre: </label>
            <input id="nombre" readonly value="<%= pers.getNombre() %>"/>
            <label for="edad">Nombre: </label>
            <input id="edad" readonly value="<%= pers.getEdad() %>"/>
        <% }else{ %>
            <span style="color: red">
                No se han encontrado personas
            </span>
         <% }%>
         
        <form name='form1' method='post' action='./personas.do'>
            <table border='1'>
                <tr>
                    <td>Nuevo nombre</td>
                    <td><input type='text' name='nombre' id='nombre'/></td>
                </tr>
                <tr>
                    <td>Nuevo Edad</td>
                    <td> <input type='number' name='edad' id='edad'/></td>
                </tr>
                <tr>
                    <td>Nuevo Email</td>
                    <td><input type='text' name='email' id='email'/></td>
                </tr>
                <tr>
                    <td>Nuevo Password</td>
                    <td><input type='password' name='password' id='password'/></td>
                </tr>
            </table>
            <input type='submit' value='Cambiar'/>
            <input type='hidden' name="queHacer" id="queHacer" value="cambiar"/>
        </form>
    </body>
</html>

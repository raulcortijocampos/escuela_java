<%-- 
    Document   : result
    Created on : 02-oct-2019, 9:35:33
    Author     : student
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>
        <h1>Result</h1>
        <a href="index.html">Inicio</a>
        <c:catch var="excepcion">
            <jsp:useBean id="user" type="sinensia.modelo.User" scope="session">
                <jsp:getProperty property="*" name="user"/>
            </jsp:useBean>
            
        </c:catch>
    </body>
</html>

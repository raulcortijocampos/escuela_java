<%-- 
    Document   : lisUsers
    Created on : 01-oct-2019, 16:47:52
    Author     : student
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="sinensia.modelo.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="userList" 
             type="java.util.ArrayList<User>" scope="request">
    <jsp:getProperty property="*" name="userList"></jsp:getProperty>
</jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Users List</h1>
        <%-- ${} corresponde a EL (Expression Languaje) de JSTL --%>
            <c:forEach items="${userList}" var="user">
                <form action="users.do" method="post">
                    <table>
                        <tr>
                            <td><input id="id" name="id" size="4" readonly type="number" value="${user.id}"</td>
                            <td>${user.email}</td>
                            <td>${user.password}</td>
                            <td>${user.name}</td>
                            <td>${user.age}</td>
                            <td><input name="method" type="submit" value="Delete"/></td>
                        </tr>
                    </table>
                </form>
            </c:forEach>
        
    </body>
</html>

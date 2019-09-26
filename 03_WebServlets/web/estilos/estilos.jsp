<%-- 
    Document   : estilos
    Created on : 26-sep-2019, 9:30:24
    Author     : student
--%>

<%@page contentType="text/css" pageEncoding="UTF-8"%>

.menu-principal{
    display: inline-block;
    border: 2px solid green;
    margin: 3px;
}

<% for(int i =0; i<10; i++){%>
   
.tipo-letra-<%="tam-" + i%>{
    font-size: <%=10 + i*2%>px;
    background-color: #1144<%=i*10%>;
    margin: <%=i*2%>px;
    padding: <%=i%>px;
}

<%
}
%>
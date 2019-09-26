<%-- 
    Document   : param
    Created on : 25-sep-2019, 17:36:55
    Author     : student
--%>

<%@include file="head.jsp" %>
<!DOCTYPE html>
<html>
    <%=head("Parametros") %>
    <body>
        <%@include file="header.jsp" %>
        <h1>Datos</h1>
        <p>  Te llamas <% out.println(request.getParameter("nombre")); %></p>
        <p>  , tienes <% out.println(request.getParameter("edad")); %></p>
        <p>  y tu apellido es <% out.println(request.getParameter("apellido")); %></p>
        <p>  y email es <% out.println(request.getParameter("email")); %></p>
        <ul>
            <% for(int i=0; i<10; i++){ %>
            
            <li class="tipo-letra-tam-<%=i%>">Numero <% out.println("" + i); %></li>  
            
           <% } %>
        </ul>
    </body>
</html>

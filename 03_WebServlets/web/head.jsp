<%-- 
    Document   : head
    Created on : 26-sep-2019, 11:37:47
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! 
    String head(String titulo){
    String nombreJSP = this.getClass().getSimpleName().replaceAll("_", ".");  //coge el nombre de la clase
        return "<head>"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"
                +"<title>03_WebServlets " + titulo + " (" + nombreJSP + ")" + "</title>"
                +"<link rel='stylesheet' href='./estilos/estilos.jsp'/>"
                +"</head>";
    }
%>

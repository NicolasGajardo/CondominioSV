<%-- 
    Document   : eliminar-residente
    Created on : 29-06-2017, 9:37:49
    Author     : ottoekog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    int id_residente = Integer.parseInt(request.getParameter("p_id")); 
    String nombre = request.getParameter("p_nombre");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Residente</title>
        <link href="semantic/semantic.min.css" rel="stylesheet" type="text/css"/>
        <script src="semantic/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="semantic/semantic.min.js" type="text/javascript"></script>
    </head>
    <body>
        <h1>ELIMINAR RESIDENTE</h1><hr>
        ¿Desea eliminar el residente <% out.print(nombre); %>?
        <br><br>
        <a href="EliminarResidenteServlet?id_residente=<% out.print(id_residente); %>">ELIMINAR AHORA</a><br><br>
        <a href="BuscarResidenteServlet">VOLVER A LISTADO</a>
    </body>
</html>

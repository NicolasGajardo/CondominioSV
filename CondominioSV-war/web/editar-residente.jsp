<%-- 
    Document   : editar-residente
    Created on : 23-06-2017, 0:37:00
    Author     : ottoekog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String id = request.getParameter("p_id");
    String rut = request.getParameter("p_rut");
    String nombre = request.getParameter("p_nombre");
    String depto = request.getParameter("p_depto");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Residente</title>
        <link href="semantic/semantic.min.css" rel="stylesheet" type="text/css"/>
        <script src="semantic/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="semantic/semantic.min.js" type="text/javascript"></script>
    </head>
    <body>
        <h1>EDITAR RESIDENTE</h1>
        <div class="ui segment">
            <form name="frm_editar_residente" action="EditarResidenteServlet" method="POST">
                <input type="hidden" name="txt_id" value="<% out.print(id); %>">
                RUT: <input type="text" name="txt_rut" value="<% out.print(rut); %>">
                Nombre : <input type="text" name="txt_nombre" value="<% out.print(nombre); %>">
                Depto : <input type="text" name="txt_depto" value="<% out.print(depto); %>">
                <button class="ui primary button">ACTUALIZAR</button> 
            </form>
        </div>
    </body>
</html>

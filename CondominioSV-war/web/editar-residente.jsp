<%-- 
    Document   : editar-residente
    Created on : 23-06-2017, 0:37:00
    Author     : ottoekog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //String rut = request.getParameter("p_rut");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INACAP</title>
    </head>
    <body>
        <h1>Ingreso de asignatura</h1>
        <form name="frm_editar_residente" action="" method="POST">
            ID: <input type="hidden" name="txt_id">
            RUT: <input type="text" name="txt_rut" value="<%= //out.print(rut) %>">
            Nombre : <input type="text" name="txt_nombre">
            Depto : <input type="text" name="txt_depto" >
            <input type="submit" />
        </form>
    </body>
</html>

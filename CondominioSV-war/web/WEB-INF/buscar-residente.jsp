    <%-- 
    Document   : captura-datos
    Created on : 25-05-2017, 21:29:41
    Author     : ottoekog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INACAP</title>
    </head>
    <body>
        <h1>Ingreso de asignatura</h1>
        <form name="frm_residente" action="/CondominioSV-war/BuscarResidenteServlet" method="POST">
            RUT: <input type="text" name="txt_rut">
            Nombre : <input type="text" name="txt_nombre">
            Depto : <input type="text" name="txt_depto" >
            <input type="submit" />
        </form>
    </body>
</html>

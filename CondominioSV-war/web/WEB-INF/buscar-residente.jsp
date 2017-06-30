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
        <title>Residentes</title>
        <link href="semantic/semantic.min.css" rel="stylesheet" type="text/css"/>
        <script src="semantic/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="semantic/semantic.min.js" type="text/javascript"></script>
    </head>
    <body>
        <h1>BUSQUEDA DE RESIDENTES</h1>
        <div class="ui segment">
            <form name="frm_residente" action="/CondominioSV-war/BuscarResidenteServlet" method="POST">
                ID: <input type="text" name="txt_id">
                RUT: <input type="text" name="txt_rut">
                Nombre : <input type="text" name="txt_nombre">
                Depto : <input type="text" name="txt_depto" >
                <button class="ui primary button">BUSCAR</button> 
            </form>
        </div>
    </body>
</html>

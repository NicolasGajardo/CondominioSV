<%-- 
    Document   : agregar-departamento
    Created on : 29-06-2017, 17:04:56
    Author     : ottoekog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Departamentos</title>
        <link href="semantic/semantic.min.css" rel="stylesheet" type="text/css"/>
        <script src="semantic/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="semantic/semantic.min.js" type="text/javascript"></script>
    </head>
    <body>
        <h1>AGREGAR DEPARTAMENTOS</h1>
        <div class="ui segment">
            <form name="frm_residente" action="/CondominioSV-war/AgregarDepartamentoServlet" method="POST">
<!--                ID: <input type="text" name="txt_id">-->
                EDIFICIO: <input type="text" name="txt_edificio" required>
                NUMERO: <input type="number" name="txt_numero" required>
                HABITACIONES: <input type="number" name="txt_habitaciones" required>
                BANOS: <input type="number" name="txt_banos" required>
                <button class="ui primary button">AGREGAR</button> 
            </form>
        </div>
    </body>
</html>

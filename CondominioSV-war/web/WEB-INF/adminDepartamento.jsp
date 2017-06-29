<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
    <head>
        <title>Condominio Alta Vista</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <style>
            .aptDesc {
                float:left;
            }
        </style>
    </head>

    <jsp:include page="../top.jsp"></jsp:include>
    <div class="main">
        <h2>Buscar Departamento:</h2>
        <form action="/CondominioSendaVista-war/Admin/Departamento/OperacionesBD" method="GET" >
            <div>
                <p>Nombre: </p>
                <input id="input_nombre" name="input_nombre" alt="Nombre a buscar" >
            </div>
            <div>
                <p>Rut: </p>
                <input id="input_rut" name="input_rut" alt="Rut a buscar">
            </div>
            <div>
                <p>¿Es Propetario?: </p>
                <select id="input_is_propetario" name="input_is_propetario" alt="¿Es propetario?">
                    <option>Si</option>
                    <option>No</option>
                    <option>No sé</option>
                </select>
            </div>

            <div>
                <input type="submit" value="Enviar"/>
            </div>
        </form>            
    </div>
</body>
</html>
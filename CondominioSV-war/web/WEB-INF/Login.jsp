<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Condominio Senda Vista</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script src="js/funciones.js" type="text/javascript"></script>
</head>
<body>
	<jsp:include page="../top.jsp"></jsp:include>
	<div class="main">
		<h2>Login</h2>
		<p class="obligatorio">* Obligatorio</p>
		<form action="/CondominioSV-war/Login" method="POST" >
			<div>
				<p>Usuario:</p>
				<input id="inputusuario" name="input_usuario" onclick="estiloNormal('inputusuario')" onchange="validaCampos('inputusuario')" alt="Su Usuario Aquí" required>*
			</div>
			<div>
				<p>Clave:</p>
                                <input id="inputpassword" name="input_password" onchange="validaCampos('inputpassword')" onclick="estiloNormal('inputpassword')" alt="Su Pass Aquí" type="password" required>*
			</div>
                        <div>
                            <input type="submit" value="Enviar"/>
                        </div>
		</form>
	</div>
	<jsp:include page="../bot.jsp"></jsp:include>
</body>
</html>
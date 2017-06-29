<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Condominio Senda Vista</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<jsp:include page="../top.jsp"></jsp:include>
	<div class="main">
		<h2>Contactar</h2>
		<p class="obligatorio">* Obligatorio</p>
		<form action="/CondominioSV-war/Contactar" method="POST">
			<div>
				<p>Elija Departamento</p>
				<select name="selected_dep">
					  <option id="select_A" value="depA" <%= request.getParameter("aptType")!=null && request.getParameter("aptType").equalsIgnoreCase("A") ? "selected" : "" %>>Tipo A</option>
					  <option id="select_B" value="depB" <%= request.getParameter("aptType")!=null && request.getParameter("aptType").equalsIgnoreCase("B") ? "selected" : "" %>>Tipo B</option>
					  <option id="select_C" value="depC" <%= request.getParameter("aptType")!=null && request.getParameter("aptType").equalsIgnoreCase("C") ? "selected" : "" %>>Tipo C</option>
					  <option id="select_D" value="depD" <%= request.getParameter("aptType")!=null && request.getParameter("aptType").equalsIgnoreCase("D") ? "selected" : "" %>>Tipo D</option>
				</select>			
			</div>
			<div>
				<p>Nombre:</p>
				<input name="input_nombre" alt="Su Nombre Aquí" required>*
			</div>
			<div>
				<p>Apellido:</p>
				<input name="input_apellido" alt="Su Apellido Aquí">
			</div>
			<div>
				<p>Celular:</p>
				<input name="input_celular" alt="Su Celular Aquí">
			</div>
			<div>
				<p>Teléfono:</p>
				<input name="input_telefono" alt="Su Teléfono Aquí">
			</div>
			<div>
				<p>email:</p>
				<input type="email" name="input_email" alt="Su EmailAquí" required>*
			</div>
			<div>
				<button name="form_contactar" type="submit">Solicitar Cita!</button>
			</div>
		</form>
	</div>
	<jsp:include page="../bot.jsp"></jsp:include>
</body>
</html>
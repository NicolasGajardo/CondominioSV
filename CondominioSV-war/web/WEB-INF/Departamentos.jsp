<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<body>
	<jsp:include page="../top.jsp"></jsp:include>
	<div class="main">
			<h2>Departamentos</h2>
			<div class="depto_container depto_container_left">
					<h2><a href="/CondominioSV-war/Contactar">Tipo A</a></h2>
					<a href="/CondominioSV-war/Contactar"><img alt="Departamento tipo A" src="img/depA.jpg"></a>
				<p class="aptDesc">2 dormitorios<br>2 baños</p>
			</div>
			<div class="depto_container depto_container_right">
					<h2><a href="/CondominioSV-war/Contactar?aptType=B">Tipo B</a></h2> 
					<a href="/CondominioSV-war/Contactar?aptType=B"><img alt="Departamento tipo B" src="img/depB.jpg"></a>
				<p class="aptDesc">2 dormitorios<br>2 baños</p>
			</div>
			<div class="depto_container depto_container_left">
					<h2><a href="/CondominioSV-war/Contactar?aptType=C">Tipo C</a></h2>
					<a href="/CondominioSV-war/Contactar?aptType=C"><img alt="Departamento tipo C" src="img/depC.jpg"></a>
				<p class="aptDesc">2 dormitorios<br>2 baños</p>
			</div>
			<div class="depto_container depto_container_right">
				
					<h2><a href="/CondominioSV-war/Contactar?aptType=D">Tipo D</a></h2>
					<a href="/CondominioSV-war/Contactar?aptType=D"><img alt="Departamento tipo D" src="img/depD.jpg"></a>
				<p class="aptDesc">3 dormitorios<br>2 baños</p>
			</div>
	</div>
	<jsp:include page="../bot.jsp"></jsp:include>
</body>
</html>
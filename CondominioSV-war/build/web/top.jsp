<div class="top">
	<h1 id="title" class="title"><a href="/" class="title" >Condominio Senda Vista</a></h1>
	<h2 id="subtitle" class="title">Un hogar para 
		<%
			int random = new java.util.Random().nextInt(12);
			switch (random) {
				case 0: out.write("Ti"); break;
				case 1: out.write("Manuel"); break;
				case 2: out.write("Estudiantes"); break;
				case 3: out.write("Señoritas"); break;
				case 4: out.write("Caballeros"); break;
				case 5: out.write("Usted"); break;
				case 6: out.write("Hermanos"); break;
				case 7: out.write("Adolecentes"); break;
				case 8: out.write("Infantes"); break;
				case 10: out.write("Ette Keg"); break;
				default: out.write("Cualquiera");
			}
	
		%>
	</h2>
	<div class="links">
		<a href="/CondominioSV-war/" class="link">Inicio</a>
		<a href="/CondominioSV-war/Departamentos" class="link">Departamentos</a>
		<a href="/CondominioSV-war/Contactar" class="link">Contáctenos!</a>
                <a href="/CondominioSV-war/Login" class="link">Acceso</a>
	</div>        
</div>
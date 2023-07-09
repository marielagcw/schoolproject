<%@page import="com.educacionit.marielagcw.entities.Curso"%>
<%@page import="com.educacionit.marielagcw.connectors.Connector"%>
<%@page import="com.educacionit.marielagcw.repositories.jdbc.CursoRepository"%>
<%@page import="com.educacionit.marielagcw.repositories.interfaces.ICursoRepository"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Colegio</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container-lg bg-secondary-subtle">

		<%@include file="jsp/navbar.jsp"%>

		<h1 class="titulo text-bg-secondary p-3">Mantenimiento de
			Alumnos</h1>

		<!-- Formulario Alta Alumnos -->
		<form>
			<div class="mb-3 row">
				<label for="nombre" class="col-sm-2 col-form-label">Nombre</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="nombre" name="nombre"
						minlength="3" maxlength="25">
				</div>
				<label for="apellido" class="col-sm-2 col-form-label">Apellido</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="apellido"
						name="apellido" minlength="3" maxlength="25">
				</div>
				<label for="edad" class="col-sm-2 col-form-label">Edad</label>
				<div class="col-sm-10">
					<input type="number" class="form-control" id="edad"
						name="edad" value="18" min="18" max="120">
				</div>
				<label for="id_curso" class="col-sm-2 col-form-label">Curso</label>
				<div class="col-sm-10">
					<select class="form-select" aria-label="Default select example"
						id="id_curso" name="id_curso">
						<%
							ICursoRepository cursoRepository=new CursoRepository(Connector.getConnection());
							for(Curso curso:cursoRepository.getAll()){
								out.println("<option value='"+curso.getId()+"'>"+
											curso.getId()+", "+curso.getTitulo()+", "+curso.getProfesor()+", "+
											curso.getDia()+", "+curso.getTurno()
											+"</option>");
							}
						%>
					</select>
				</div>
				<div class="col-sm-10">
					<button type="submit" class="btn btn-primary btn-lg">Guardar</button>
					<button type="reset" class="btn btn-secondary btn-lg">Limpiar</button>
				</div>

			</div>
		</form>
		
		<!-- Alumnos Save -->
		<%@include file="jsp/alumnosSave.jsp"%>
		
		<!-- Alumnos Table -->
		<%@include file="jsp/alumnosTable.jsp"%>
		
	</div>

</body>
</html>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
	crossorigin="anonymous">
	
</script>
<script src="/js/main.js" type="text/javascript"></script>

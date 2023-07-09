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
			Cursos</h1>

		<!-- Formulario Alta Cursos -->
		<form>
			<div class="mb-3 row">
				<label for="titulo" class="col-sm-2 col-form-label">Título</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="titulo" name="titulo" minlength="3" maxlength="25" >
				</div>
				<label for="profesor" class="col-sm-2 col-form-label">Profesor</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="profesor" name="profesor" minlength="3" maxlength="25">
				</div>
				<label for="dia" class="col-sm-2 col-form-label">Día</label>
				<div class="col-sm-10">
					<select class="form-select" aria-label="Default select example"
						id="dia" name="dia">
						<option selected value="LUNES">lunes</option>
						<option value="MARTES">martes</option>
						<option value="MIERCOLES">miércoles</option>
						<option value="JUEVES">jueves</option>
						<option value="VIERNES">viernes</option>
					</select>
				</div>
				<label for="turno" class="col-sm-2 col-form-label">Turno</label>
				<div class="col-sm-10">
					<select class="form-select" aria-label="Default select example"
						id="turno" name="turno">
						<option selected value="MAÑANA">mañana</option>
						<option value="TARDE">tarde</option>
						<option value="NOCHE">noche</option>
					</select>
				</div>
				<div class="col-sm-10">
					<button type="submit" 	class="btn btn-primary btn-lg"	>Guardar</button>
					<button type="reset" 	class="btn btn-secondary btn-lg">Limpiar</button>
				</div>

			</div>
		</form>
		
		<!-- Cursos Save -->
		<%@include file="jsp/cursosSave.jsp"%>
		
		<!-- Cursos Table -->
		<%@include file="jsp/cursosTable.jsp"%>
		
	</div>

</body>
</html>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
	crossorigin="anonymous">
	
</script>
<script src="/js/main.js" type="text/javascript"></script>

<%@ page contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Barra de Navegación -->
<nav class="navbar navbar-expand-lg bg-dark" data-bs-theme="dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="http://localhost:8080/index.jsp">Colegio</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="http://localhost:8080/index.jsp">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="http://localhost:8080/cursos.jsp">Cursos</a>
				</li>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="http://localhost:8080/alumnos.jsp">Alumnos</a>
				</li>
			</ul>
			<!-- reloj -->
			<section id="contReloj">
				<p id="pHoras"></p>
				<p>:</p>
				<p id="pMinutos"></p>
				<p>:</p>
				<p id="pSegundos"></p>
			</section>
			<!-- buscador -->
			<form class="d-flex" role="search">
				<input class="form-control me-2" type="search" name="buscar" value="" placeholder="buscar"
					aria-label="Search">
				<button class="btn btn-outline-success bg-sucsess" data-bs-theme="dark" type="submit">Buscar</button>
			</form>
		</div>
	</div>
</nav>
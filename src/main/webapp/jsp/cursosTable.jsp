<%@page import="com.educacionit.marielagcw.entities.Curso"%>
<%@page import="com.educacionit.marielagcw.connectors.Connector"%>
<%@page import="com.educacionit.marielagcw.repositories.jdbc.CursoRepository"%>
<%@page import="com.educacionit.marielagcw.repositories.interfaces.ICursoRepository"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<table class="table table-striped-columns">
	<thead>
		<tr class="table-primary">
			<th scope="col">Id</th>
			<th scope="col">Título</th>
			<th scope="col">Profesor</th>
			<th scope="col">Día</th>
			<th scope="col">Turno</th>
		</tr>
	</thead>
	<tbody>
	<%
		ICursoRepository cursoRepository=new CursoRepository(Connector.getConnection());
		String buscar=request.getParameter("buscar");
		if(buscar==null) buscar=""; 
		for(Curso curso:cursoRepository.getLikeTitulo(buscar)){
			out.println("<tr>");
			out.println("<th scope='row'>"+curso.getId()+"</th>");
			out.println("<td>"+curso.getTitulo()+"</td>");
			out.println("<td>"+curso.getProfesor()+"</td>");
			out.println("<td>"+curso.getDia()+"</td>");
			out.println("<td>"+curso.getTurno()+"</td>");
			out.println("</tr>");
		}
	%>
	</tbody>
</table>
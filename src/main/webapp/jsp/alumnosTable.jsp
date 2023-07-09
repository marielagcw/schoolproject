<%@page import="com.educacionit.marielagcw.entities.Alumno"%>
<%@page import="com.educacionit.marielagcw.connectors.Connector"%>
<%@page import="com.educacionit.marielagcw.repositories.jdbc.AlumnoRepository"%>
<%@page import="com.educacionit.marielagcw.repositories.interfaces.IAlumnoRepository"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<table class="table table-striped-columns">
	<thead>
		<tr class="table-primary">
			<th scope="col">Id</th>
			<th scope="col">Nombre</th>
			<th scope="col">Apellido</th>
			<th scope="col">Edad</th>
		</tr>
	</thead>
	<tbody>
	<%
		IAlumnoRepository alumnoRepository=new AlumnoRepository(Connector.getConnection());
		String buscar=request.getParameter("buscar");
		if(buscar==null) buscar="";
		for(Alumno alumno:alumnoRepository.getLikeApellido(buscar)){
			out.println("<tr>");
			out.println("<th scope='row'>"+alumno.getId()+"</th>");
			out.println("<td>"+alumno.getNombre()+"</td>");
			out.println("<td>"+alumno.getApellido()+"</td>");
			out.println("<td>"+alumno.getEdad()+"</td>");
			out.println("</tr>");
		}
	%>
	</tbody>
</table>
<%@page import="com.educacionit.marielagcw.connectors.Connector" %>
<%@page import="com.educacionit.marielagcw.repositories.jdbc.CursoRepository"%>
<%@page import="com.educacionit.marielagcw.repositories.interfaces.ICursoRepository"%>
<%@page import="com.educacionit.marielagcw.enums.Turno"%>
<%@page import="com.educacionit.marielagcw.enums.Dia"%>
<%@page import="com.educacionit.marielagcw.entities.Curso"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	out.println("<input type='text' value='Ingrese un nuevo curso!' class='form-control' readonly>");
	try{
		String titulo=request.getParameter("titulo");
		String profesor=request.getParameter("profesor");
		String dia=request.getParameter("dia");
		String turno=request.getParameter("turno");
		if(
			titulo!=null && profesor!=null &&
			titulo.length()>=3 && titulo.length()<=25 &&
			profesor.length()>=3 && profesor.length()<=25
		){
			Curso curso=new Curso(titulo,profesor,Dia.valueOf(dia),Turno.valueOf(turno));
			ICursoRepository cursoRepository=new CursoRepository(Connector.getConnection());
			cursoRepository.save(curso);
			if(curso.getId()>=0){
				out.println("<input type='text' value='Se guardo el curso ID: "+curso.getId()+"!' class='form-control' readonly>");
			}else{
				out.println("<input type='text' value='No se pudo guardar el curso!' class='form-control' readonly>");
			}
		}else{
			out.println("<input type='text' value='Debe ingresar correctamente los parámetros!' class='form-control' readonly>");
		}
	}catch(Exception e){
		out.println("<input type='text' value='Ocurrio un error!' class='form-control' readonly>");
	}
%>
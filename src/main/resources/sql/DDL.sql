-- Script para deplegar la base en ambiente de desarrollo o testing

drop database if exists colegio;
create database colegio;
use colegio;
drop table if exists alumnos;
drop table if exists cursos;

create table cursos(
	id int auto_increment primary key,
    titulo varchar(25) not null check(length(titulo) >= 3),
    profesor varchar(25) not null check(length(profesor) >= 3),
    dia enum("LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES"),
    turno enum("MAÑANA", "TARDE", "NOCHE")
    );

-- Usando enum podemos evitar escribir validaciones, porque cuando se intente agregar otro dato salta una excepción
    
CREATE TABLE alumnos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(25) NOT NULL check(length(nombre) >= 3),
    apellido VARCHAR(25) NOT NULL check(length(apellido) >= 3),
    edad INT NOT NULL CHECK (edad >= 18 AND edad <= 120),
    id_curso INT NOT NULL
);

-- Tenemos una cardinalidad de 1 a muchos, porque un alumno solo asiste a un curso, pero un curso puede tener muchos alumnos.

alter table alumnos 
	add constraint FK_alumnos_id_curso
	foreign key(id_curso)
	references cursos(id);

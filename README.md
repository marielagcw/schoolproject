# schoolproject

# Descripción

Sistema de gestión de alumnos para una escuela realizado como parte del curso Java Standard 11 Web Programming de Educación IT.

# Desarrollo

El sistema tiene las siguientes funcionalidades:
- ABM de alumnos
- ABM de cursos

Además:
- Hay utilidades para leer/escribir archivos de texto
- Hay una interfaz gráfica desarrollada con Swing

## Especificaciones técnicas
- Maria DB
- Java 17
- Maven
- Spring Boot
- Java Swing

## Interfaz
- Se utiliza JSP  para la interfaz web
- Se utiliza Bootstrap para el diseño

## Instalación
- Clonar el repositorio o descargar el archivo
- Correr un servidor de Base de Datos (ej. MySQL Workbench)
- Usar los scripts de la carpeta "sql" para crear la base de datos y las tablas
- Correr el siguiente comando en consola para levantar la aplicación:

```bash
sh mvnw spring-boot:run
```
Ingresar a [localhost:8080/index.jsp](http://localhost:8080/index.jsp) para interactuar con el sistema


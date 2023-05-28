-- Consultas de prueba de la BD
use colegio;

-- 1. Obtener todos los cursos:
SELECT * FROM cursos;

-- 2. Obtener los alumnos que asisten al curso con ID 3:
SELECT * FROM alumnos WHERE id_curso = 3;

-- 3. Obtener los cursos que se imparten los viernes en el turno de la mañana:
SELECT * FROM cursos WHERE dia = 'VIERNES' AND turno = 'MAÑANA';

-- 4. Obtener los alumnos cuyo nombre comienza con la letra 'M':
SELECT * FROM alumnos WHERE nombre LIKE 'M%';

-- 5. Obtener la cantidad de alumnos por curso:
SELECT c.titulo, COUNT(a.id) as cantidad_alumnos
FROM cursos c
LEFT JOIN alumnos a ON c.id = a.id_curso
GROUP BY c.id;
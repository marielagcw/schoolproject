package com.educacionit.marielagcw;

import com.educacionit.marielagcw.repositories.interfaces.IAlumnoRepository;
import com.educacionit.marielagcw.repositories.jdbc.AlumnoRepository;
import com.educacionit.marielagcw.connectors.Connector;
import com.educacionit.marielagcw.entities.Alumno;

public class TestAlumnoRepository {

    public static void main(String[] args) {
        IAlumnoRepository alumnoRepository = new AlumnoRepository(Connector.getConnection());

        // Método save()
        System.out.println("===================================== >> SAVE");
        Alumno alumno = new Alumno("Alumno1", "Apellido1", 18, 1);
        alumnoRepository.save(alumno);
        System.out.println(alumno);

        // Método getById()
        System.out.println("===================================== >> GET BY ID");
        System.out.println(alumnoRepository.getById(1));

        // Método remove()
        System.out.println("===================================== >> REMOVE");
        alumnoRepository.remove(alumnoRepository.getById(1));
        System.out.println(alumnoRepository.getAll());

        // Método update()
        System.out.println("===================================== >> UPDATE");
        System.out.println(alumnoRepository.getById(3));
        alumno = alumnoRepository.getById(3);
        if (alumno != null && alumno.getId() != 0) {
            alumno.setNombre("Alumno2");
            alumno.setApellido("Apellido2");
            alumnoRepository.update(alumno);
        }
        System.out.println(alumnoRepository.getById(3));

        // Método getAll()
        System.out.println("===================================== >> GET ALL");
        alumnoRepository.getAll().forEach(System.out::println);
    }
}

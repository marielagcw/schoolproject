package com.educacionit.marielagcw;

import com.educacionit.marielagcw.connectors.Connector;
import com.educacionit.marielagcw.entities.Curso;
import com.educacionit.marielagcw.enums.Dia;
import com.educacionit.marielagcw.enums.Turno;
import com.educacionit.marielagcw.repositories.interfaces.ICursoRepository;
import com.educacionit.marielagcw.repositories.jdbc.CursoRepository;

public class TestCursoRepository {
    public static void main(String[] args) {
        ICursoRepository cursoRepository = new CursoRepository(Connector.getConnection());

        // // Método save()
        System.out.println("===================================== >> SAVE");
        Curso curso = new Curso("Java", "Rios", Dia.VIERNES, Turno.TARDE);
        cursoRepository.save(curso);
        System.out.println(curso);

        // // Método getById()
        System.out.println("===================================== >> GET BY ID");
        System.out.println(cursoRepository.getById(12));

        // // Método remove()
        System.out.println("===================================== >> REMOVE");
        cursoRepository.remove(cursoRepository.getById(12));
        System.out.println(cursoRepository.getAll());

        // Método update()
        System.out.println("===================================== >> UPDATE");
        System.out.println(cursoRepository.getById(3));
        curso = cursoRepository.getById(3);
        if (curso != null && curso.getId() != 0) {
            curso.setProfesor("Lala");
            curso.setTitulo("JavaScript");
            cursoRepository.update(curso);
        }
        System.out.println(cursoRepository.getAll());
        System.out.println(cursoRepository.getById(3));

        // Método getAll()
        System.out.println("===================================== >> GET ALL");
        cursoRepository.getAll().forEach(System.out::println);
    }
}

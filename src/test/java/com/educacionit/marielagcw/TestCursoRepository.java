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

        // método save()
        Curso curso = new Curso("Java", "Rios", Dia.VIERNES, Turno.TARDE);
        cursoRepository.save(curso);
        System.out.println(curso);
    }
}

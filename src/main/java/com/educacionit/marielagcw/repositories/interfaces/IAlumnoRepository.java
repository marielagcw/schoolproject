package com.educacionit.marielagcw.repositories.interfaces;

import java.util.List;

import com.educacionit.marielagcw.entities.Alumno;

public interface IAlumnoRepository {

    void save(Alumno alumno);

    void remove(Alumno alumno);

    void update(Alumno alumno);

    Alumno getById(Integer id);

    List<Alumno> getAll();
}

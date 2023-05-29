package com.educacionit.marielagcw.repositories.interfaces;

import java.util.List;

import com.educacionit.marielagcw.entities.Curso;

public interface ICursoRepository {
    void save(Curso curso);

    void remove(Curso curso);

    void update(Curso curso);

    Curso getById(Integer id);

    List<Curso> getAll();
}

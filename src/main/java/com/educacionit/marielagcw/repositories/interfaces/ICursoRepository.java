package com.educacionit.marielagcw.repositories.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.educacionit.marielagcw.entities.Curso;

public interface ICursoRepository {
    void save(Curso curso);

    void remove(Curso curso);

    void update(Curso curso);

    Curso getById(Integer id);

    List<Curso> getAll();

    default List<Curso> getLikeTitulo(String titulo) {
        if (titulo == null) {
            return new ArrayList<>();
        }
        return getAll()
                .stream()
                .filter(curso -> curso.getTitulo() != null)
                .filter(curso -> curso.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .toList(); //JDK 16 o sup  - Inumutable List
    }
}

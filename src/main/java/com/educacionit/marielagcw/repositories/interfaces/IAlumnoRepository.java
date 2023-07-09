package com.educacionit.marielagcw.repositories.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.educacionit.marielagcw.entities.Alumno;

public interface IAlumnoRepository {

    void save(Alumno alumno);

    void remove(Alumno alumno);

    void update(Alumno alumno);

    Alumno getById(Integer id);

    List<Alumno> getAll();

    default List<Alumno> getLikeApellido(String apellido) {
        if (apellido == null) {
            return new ArrayList<>();
        }
        return getAll()
                .stream()
                .filter(alumno -> alumno.getApellido() != null)
                .filter(alumno -> alumno.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .toList();
    }

    default List<Alumno> getByCurso(Integer idCurso) {
        if (idCurso == null) {
            return new ArrayList<>();
        }
        return getAll()
                .stream()
                .filter(alumno -> alumno.getIdCurso() == idCurso)
                .toList();
    }
}

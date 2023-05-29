package com.educacionit.marielagcw.repositories.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.educacionit.marielagcw.entities.Curso;
import com.educacionit.marielagcw.repositories.interfaces.ICursoRepository;

public class CursoRepository implements ICursoRepository {

    private Connection conn;

    public CursoRepository(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void save(Curso curso) {
        if (curso == null)
            return;
        try (PreparedStatement ps = conn.prepareStatement(
                "insert into cursos (titulo,profesor,dia, turno) values (?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, curso.getTitulo());
            ps.setString(2, curso.getProfesor());
            ps.setString(3, curso.getDia().toString());
            ps.setString(4, curso.getTurno().toString());
            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next())
                curso.setId(rs.getInt(1));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void remove(Curso curso) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void update(Curso curso) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Curso getById(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public List<Curso> getAll() {
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

}

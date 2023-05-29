package com.educacionit.marielagcw.repositories.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.educacionit.marielagcw.entities.Alumno;
import com.educacionit.marielagcw.repositories.interfaces.IAlumnoRepository;

public class AlumnoRepository implements IAlumnoRepository {

    private Connection conn;

    public AlumnoRepository(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void save(Alumno alumno) {
        if (alumno == null)
            return;
        try (PreparedStatement ps = conn.prepareStatement(
                "insert into alumnos (nombre, apellido, edad, id_curso) values (?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getEdad());
            ps.setInt(4, alumno.getIdCurso());
            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next())
                alumno.setId(rs.getInt(1));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void remove(Alumno alumno) {
        if (alumno == null)
            return;
        try (PreparedStatement ps = conn.prepareStatement("delete from alumnos where id=?")) {
            ps.setInt(1, alumno.getId());
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update(Alumno alumno) {
        if (alumno == null)
            return;
        try (PreparedStatement ps = conn
                .prepareStatement("update alumnos set nombre=?, apellido=?, edad=?, id_curso=? where id=?")) {
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getEdad());
            ps.setInt(4, alumno.getIdCurso());
            ps.setInt(5, alumno.getId());
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public Alumno getById(Integer id) {
        Alumno alumno = new Alumno();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from alumnos where id=" + id)) {
            if (rs.next()) {
                alumno = new Alumno(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getInt("id_curso"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return alumno;
    }

    @Override
    public List<Alumno> getAll() {
        List<Alumno> list = new ArrayList<>();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from alumnos")) {
            while (rs.next()) {
                list.add(new Alumno(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getInt("id_curso")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

}

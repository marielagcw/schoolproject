package com.educacionit.marielagcw.entities;

public class Alumno {

    // Atributos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int idCurso;

    // Constructores
    public Alumno() {
    }

    /**
     * @param nombre
     * @param apellido
     * @param edad
     * @param idCurso
     */
    public Alumno(String nombre, String apellido, int edad, int idCurso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.idCurso = idCurso;
    }

    /**
     * @param id
     * @param nombre
     * @param apellido
     * @param edad
     * @param idCurso
     */
    public Alumno(int id, String nombre, String apellido, int edad, int idCurso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.idCurso = idCurso;
    }

    // Getters y Setters
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the idCurso
     */
    public int getIdCurso() {
        return idCurso;
    }

    /**
     * @param idCurso the idCurso to set
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    // TO String
    @Override
    public String toString() {
        return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", idCurso="
                + idCurso + "]";
    }

}

package com.educacionit.marielagcw.utils.sistema;

public class Usuario {
    public String getUsuario(){
        return System.getProperty("user.name");
    }
    public static void main(String[] args) {
        System.out.println(new Usuario().getUsuario());
    }
}

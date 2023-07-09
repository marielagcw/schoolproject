package com.educacionit.marielagcw.utils.sistema;

import java.time.LocalDate;

public class Fecha {
    public String getFecha(){
        return LocalDate.now().toString().replace("-", "/");
    }
    public static void main(String[] args) {
        System.out.println(new Fecha().getFecha());
    }
}

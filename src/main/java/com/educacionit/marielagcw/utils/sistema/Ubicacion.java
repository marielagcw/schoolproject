package com.educacionit.marielagcw.utils.sistema;

import java.util.Calendar;

public class Ubicacion {
    public String getUbicacion(){
        return Calendar
                    .getInstance()
                    .getTimeZone()
                    .getID()
                    .replace("/", " ")
                    .replace("_", " ");
    }
    public static void main(String[] args) {
        System.out.println(new Ubicacion().getUbicacion());
    }
}

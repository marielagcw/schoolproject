package com.educacionit.marielagcw.utils.sistema;

public class VersionJava {
    public String getVersionJava(){
        //return System.getProperties().toString();
        return System.getProperty("java.vm.name")+" "+System.getProperty("java.version");
    }
    public static void main(String[] args) {
        System.out.println(new VersionJava().getVersionJava());
    }
}

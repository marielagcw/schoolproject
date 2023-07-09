package com.educacionit.marielagcw.utils.sistema;

public class SistemaOperativo {
    public String getSistemaOperativo(){
        return  
                System.getProperty("os.name")+" "+
                System.getProperty("os.version")+" "+
                System.getProperty("os.arch");
    }
    public static void main(String[] args) {
        System.out.println(new SistemaOperativo().getSistemaOperativo());
    }
}

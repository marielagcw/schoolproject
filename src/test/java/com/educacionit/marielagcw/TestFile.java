package com.educacionit.marielagcw;


import com.educacionit.marielagcw.utils.files.FileText;
import com.educacionit.marielagcw.utils.files.IFile;

import java.util.List;

public class TestFile {
    public static void main(String[] args) {
        //Test de ultilidad FileText e interface I_File

        //String file="c:/texto.txt";
        String file="texto.txt";
        IFile fText=new FileText(file);

        fText.setText("Curso de Java!!\n");
        fText.append("Ejemplo para escribir archivos\n");
        
        fText.addLine("Primavera.");        
        fText.addLine("Verano.");   
        fText.addLine("Otoño.");   
        fText.addLine("Invierno.");   
        fText.addLine("Ñoquis."); 
        fText.addLine("ñoquis."); 
        
        fText.addLines(List.of("lunes","martes","miércoles","jueves","viernes","sábado","domingo","lunes","martes","Verano."));
        
        fText.remove("jueves");

        //fText.clear();

        //System.out.println(fText.getText());
        //fText.print();

        //fText.getLikeFilter("vi").forEach(System.out::println);

        //fText.getLinkedHashSet().forEach(System.out::println);
        
        //fText.getSortedLines().forEach(System.out::println);

        //fText.getReversedSortedLines().forEach(System.out::println);

        fText.getAll().forEach(System.out::println);

        /*
        String text="";
        StringBuffer sb=new StringBuffer();
        System.out.println(LocalTime.now());
        for(int a=0; a<=1000000; a++){
            //text+="x";
            sb.append("x");
        }
        System.out.println(LocalTime.now());
        */
    }
}

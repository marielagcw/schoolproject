package com.educacionit.marielagcw.utils.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileText implements IFile {

    /*
     *  Nota:       
     *              Paquete IO:     Input Ouput
     *              Paquete NIO:    New Input Output    JDK 6 o sup
     * 
     * 
     * Reglas del FS (File System) (NTFS - FAT32 - EXT3 - EXT4)
     * 
     * - Sobre un archivo pueden abrirse casi infinitos (muchos) streams de lectura de distintos
     *      programas, de cualquier lenguaje de programación.
     * 
     * - Sobre un archivo solo puede abrirse un stream de escritura, un stream de escritura
     *      bloquea a otros stream de escritura, pero no bloquea los stream de lectura. 
     * 
     */

    private File file;

    public FileText(File file) {
        this.file = file;
    }

    public FileText(String text) {
        this.file=new File(text);
    }

    @Override
    public String getText() {
        //String text="";
        StringBuffer sb=new StringBuffer();
        int car;
        try (FileReader in=new FileReader(file)){
        //try(FileInputStream in =new FileInputStream(file)){
            while((car=in.read())!=-1){
                //text+=(char)car;
                sb.append((char)car);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        //return text;
        return sb.toString();
    }

    @Override
    public void setText(String text) {
        try (FileWriter out=new FileWriter(file)) {
            out.write(text);
        } catch (Exception e) {
            System.out.println(e);    
        }
    }

    @Override
    public void append(String text) {
        try (FileWriter out=new FileWriter(file, true)) {
            out.write(text);
        } catch (Exception e) {
            System.out.println(e);    
        }
    }

    @Override
    public List<String> getAll() {
        List<String>list=new ArrayList();
        String line;
        try (BufferedReader in=new BufferedReader(new FileReader(file))){
            //while((line=in.readLine())!=null){
            //    list.add(line);
            //}

            //list=in.lines().toList();
            list=in.lines().collect(Collectors.toList());

        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
  
}

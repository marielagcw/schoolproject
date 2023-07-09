package com.educacionit.marielagcw;

import java.sql.ResultSet;
import java.time.LocalDateTime;

import com.educacionit.marielagcw.connectors.Connector;
import java.time.Duration;

public class TestConnector {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_LIGHT_YELLOW = "\u001B[93m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_UNBOLD = "\u001B[21m";
    public static final String ANSI_UNDERLINE = "\u001B[4m";
    public static final String ANSI_STOP_UNDERLINE = "\u001B[24m";
    public static final String ANSI_BLINK = "\u001B[5m";

    public static void main(String[] args) {
       
        LocalDateTime ldtInicio = LocalDateTime.now();
       
        try (ResultSet rs = Connector // ResultSet es un conjunto de registros que se obtienen de la consulta
                .getConnection() // Estoy pidiendo el get connection
                .createStatement() // Le estoy pidiendo que ejecute una sentencia SQL
                .executeQuery("select version()")) {
            if (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(ANSI_GREEN + "Se pudo conectar a la BD");
            } else
                System.out.println(ANSI_RED + "No se pudo conectar a la BD");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(ANSI_RED + "No se pudo conectar a la BD");
        }
        
        // Tomamos los tiempos de respuesta y decimos si es aceptable o no. 
        LocalDateTime ldtFinal = LocalDateTime.now();
        Duration duration = Duration.between(ldtInicio, ldtFinal);
        if (duration.toSeconds() <= 2) {
            System.out.println(ANSI_GREEN + "Tiempo de respuesta: + " + duration.toMillis() + " ms, ACEPTABLE");
        } else {
            System.out.println(ANSI_RED + "Tiempo de respuesta: + " + duration.toMillis() + " ms, MUY LENTO");
        }
        
        System.out.println(ANSI_RESET);
    }
}

// Colores ANSI para imprimir colores en consola
// Patrón red/green, es un patrón que nos permite visualizar rápidamente en
// consola los problemas.
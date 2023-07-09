package com.educacionit.marielagcw.connectors;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    private static String url = "jdbc:mariadb://localhost:3306/colegio";
    private static String user = "root";
    private static String pass = "root";
    private static Connection conn = null;

    private Connector() {
    }

    public static Connection getConnection() {
        try {
            // Queremos una sola conexión a la base de datos siempre
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, user, pass);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}

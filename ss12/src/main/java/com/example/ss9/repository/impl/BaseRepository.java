package com.example.ss9.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    private static String jdbcUrl = "jdbc:mysql://localhost:3306/demo_c0423g1";
    private static String username = "root";
    private static String password = "28101998";
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private BaseRepository() {

    }

    public static Connection getConnectionJavaToDB() {
        return connection;
    }
}

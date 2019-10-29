package iot.yurenia.passive;

import java.sql.*;

public class Application {
    private static final String URL = "jdbc:mysql://localhost:3306/yurenia_db";
    private static final String USER = "root";
    private static final String PASS = "woolverok77";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.
                    getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        Connection connection = Application.getConnection();
    }
}

package iot.yurenia.passive;

import iot.yurenia.passive.view.ViewMain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {

    private static final String URL =
            "jdbc:mysql://localhost:3306/yurenia_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASS = "woolverok77";
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
                System.out.println("SQLState: " + e.getSQLState());
                System.out.println("VendorError: " + e.getErrorCode());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    public static void main(String[] args) {

        ViewMain view = new ViewMain();
        view.outputMenu();
        view.chooseTable();
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

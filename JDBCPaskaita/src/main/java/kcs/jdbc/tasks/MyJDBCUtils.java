package kcs.jdbc.tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyJDBCUtils {

    private static final String URL = "jdbc:mysql://127.0.0.1:3308/kcs";
    private static final String NAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL, NAME, PASSWORD);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}

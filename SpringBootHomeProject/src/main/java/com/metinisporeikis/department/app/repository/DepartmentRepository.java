package com.metinisporeikis.department.app.repository;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class DepartmentRepository {
    private static final String URL = "jdbc:mysql://127.0.0.1:3308/metinisporeikis";
    private static final String USERNAME = "root";
    private static final String PASWORD = "";

    public PreparedStatement getPreparedStatment(String sql) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASWORD);
            return connection.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
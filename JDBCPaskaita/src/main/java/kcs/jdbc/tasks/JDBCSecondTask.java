package kcs.jdbc.tasks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCSecondTask {
    public static void main(String[] args) throws SQLException {
        Connection connection = MyJDBCUtils.getConnection();

        if(connection == null){
            return;
        }
        try{
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE students SET name=?, surname=?, email=?, phone=? where id=?");
        preparedStatement.setString(1, "newName");
        preparedStatement.setString(2, "newSurname");
        preparedStatement.setString(3, "newEmail@gmail.com");
        preparedStatement.setString(4, "895457745");
        preparedStatement.setInt(5, 1);

        preparedStatement.execute();
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}
}

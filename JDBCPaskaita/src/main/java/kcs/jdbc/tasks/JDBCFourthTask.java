package kcs.jdbc.tasks;

import java.net.ConnectException;
import java.sql.Connection;

public class JDBCFourthTask {
    public static void main(String[] args) {
        Connection connection = MyJDBCUtils.getConnection();
        if(connection == null){
            return;
        }
        if(QueryUtils.isTableExist(connection, "students")){
            System.out.println("Lentele egzistuoja");
        }else{
            System.out.println("tokios lenteles nera");
        }
    }
}

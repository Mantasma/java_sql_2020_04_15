package kcs.jdbc.tasks;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryUtils {
    public static boolean isTableExist(Connection connection, String tableName) {
        if (connection == null || tableName == null) {
            return false;
        }
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet tables = metaData.getTables(null, null, tableName, null);
            return tables.next();

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
return false;
    }
}

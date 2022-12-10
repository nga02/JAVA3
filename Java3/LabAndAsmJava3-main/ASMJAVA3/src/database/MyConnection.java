
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author NTV
 */
public class MyConnection {
    public static Connection getConnect() {
        try {
            String connectionUrl = 
                    "jdbc:sqlserver://TIENVO\\NTV:1433;"
                    + "databaseName=FPL_DT;"
                    + "user=sa;password=123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connect =
                    DriverManager.getConnection(connectionUrl);
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

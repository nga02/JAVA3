package lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcUtill {

    private static Connection con;

    public static Connection getConnection() {
        if (con == null) {

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String User = "sa", Pass = "nga123", Url = "jdbc:sqlserver://localhost:1433;" + ";databaseName=QLSinhVien";
                con = DriverManager.getConnection(Url, User, Pass);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return con;

    }
}

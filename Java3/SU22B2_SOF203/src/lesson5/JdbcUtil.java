package lesson5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtil {

    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                // B1: Load Driver
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                // B2: Kết nối
                String dbUser = "sa",
                        dbPass = "nga123", 
                        dbUrl = "jdbc:sqlserver://localhost:1433;" 
                        + ";databaseName=QL_San_Pham" 
                        + ";encrypt=true;trustServerCertificate=true";

                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Kết nối thành công");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return conn;
    }
}

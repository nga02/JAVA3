package De1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

    private static Connection con;

    public static Connection getConnection() {
        if (con == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser = "sa",
                        dbPass = "nga123",
                        dbUrl = "jdbc:sqlserver://localhost:1433;"
                        + ";databaseName=QL_San_Pham"
                        + ";encrypt=true;trustServerCertificate=true";
                con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Kết nối thành công");
            } catch (ClassNotFoundException ex) {

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return con;
    }
}

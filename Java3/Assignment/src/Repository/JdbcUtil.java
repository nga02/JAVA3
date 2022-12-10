package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
    private static Connection conn;
    
    public static Connection getConnection(){
        if (conn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                
                String userDB = "sa", passDB = "nga123",
                        urlDB = "jdbc:sqlserver://localhost:1433;databaseName = Assigment_Java3;encrypt=true;trustServerCertificate=true;";
                
                conn = DriverManager.getConnection(urlDB, userDB, passDB);
                System.out.println("Kết nối thành công");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } 
        }
        return conn;
    }
}

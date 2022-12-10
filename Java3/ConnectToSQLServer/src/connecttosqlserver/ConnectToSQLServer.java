package connecttosqlserver;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectToSQLServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var server = "ADMIN-PC\\SQLEXPRESS";
        var user = "sa";
        var password = "nga123";
        var db = "ql_sach_lt1";
        var port = 1433;
        var encrypt =true;
        var trustServerCertificate=true;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setPortNumber(port);
        ds.setEncrypt(encrypt);
        ds.setTrustServerCertificate(trustServerCertificate);
        try ( Connection conn = ds.getConnection()) {
            System.out.println("Kết nối thành công!");
            System.out.println(conn.getCatalog());
        } catch (SQLServerException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }

}



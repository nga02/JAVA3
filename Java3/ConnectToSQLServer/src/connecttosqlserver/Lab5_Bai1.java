package connecttosqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab5_Bai1 {

    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=QLSinhVien;user=sa;password=nga123;encrypt=true;trustServerCertificate=true;";

        try ( Connection con = DriverManager.getConnection(connectionUrl);  Statement stmt = con.createStatement();) {
            String SQL = "SELECT * FROM STUDENTS";
            ResultSet rs = stmt.executeQuery(SQL);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.print(rs.getString("MaSV") + ", ");
                System.out.print(rs.getString("Hoten") + ", ");
                System.out.print(rs.getString("Email") + ", ");
                System.out.print(rs.getString("SoDT") + ", ");
                System.out.println(rs.getString("Gioitinh"));
            }
            con.close();
            // Handle any errors that may have occurred.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

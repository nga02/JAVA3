package Buoi7_JDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class MainJDBC {

    public static void main(String[] args) {
        try {
            //3.Nạp driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//lấy ở đâu

            //4.Connection
            String url = "jdbc:sqlserver://localhost:1433;databaseName=MyApplication";
            String username = "sa";
            String password = "nga123";
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công!");

            //5.Statement + napj SQL vaof statement
            StringBuilder sql = new StringBuilder();
            sql.append("select");
            sql.append("id as 'Mã sinh viên',");
            sql.append("name as 'Tên sinh viên' ");
            sql.append("FROM Student");

            Statement stm = conn.createStatement();

            //6.Execute Statemenent
            ResultSet result = stm.executeQuery(sql.toString());

            //7.Get result
            while (result.next()) {
                Integer id = result.getInt(1);
                String name = result.getString("Tên sinh viên:");
                System.out.printf("name-%s and id-%d\n",name,id);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

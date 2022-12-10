/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson7_demo_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import lesson5.Product;

public class DemoSelect {
    public static void main(String[] args) {
        try {
            // B1: Load Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // B2: Kết nối
           
            String dbUser = "sa",
                    dbPass = "nga123",
                    dbUrl = "jdbc:sqlserver://localhost:1433;" 
                    + ";databaseName=QL_San_Pham;"+
                    "encrypt=true;trustServerCertificate=true"; 
            Connection conn = DriverManager
                .getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Kết nối thành công");
            
            ArrayList<Product> listSP = new ArrayList<>();
            
            String query = "SELECT * FROM san_pham";
            
            PreparedStatement ps = conn.prepareStatement(query);            
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            
            while (rs.next() == true) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                String mau = rs.getString("mau_sac");
                int soLg = rs.getInt("so_luong");
                double donGia = rs.getDouble("don_gia");
                int danhMucId = rs.getInt("danh_muc_id");
                
                Product p = new Product(id, ten, soLg, donGia, mau, danhMucId);
                listSP.add(p);
            }
            
            System.out.println("Success");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

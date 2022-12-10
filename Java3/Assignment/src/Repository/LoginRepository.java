/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import ENTITY.SinhVien;
import ENTITY.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class LoginRepository {
    public ArrayList<User> getAll(){
        ArrayList<User> lst = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "select * from Users";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {             
                String ten = rs.getString("username");
                String pass = rs.getString("password");
                String role = rs.getString("role");
                
                User user = new User(ten, pass, role);
                lst.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lst;
    }
}

package repository;

import java.util.ArrayList;
import model.Ban1;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BanRepository {

    public ArrayList<Ban1> getAll() {
        ArrayList<Ban1> lst = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT Id,Ma,Ten,TrangThai FROM Ban";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                int trangThai = rs.getInt("TrangThai");

                Ban1 b = new Ban1(id, ma, ten, trangThai);
                lst.add(b);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lst;
    }
    public void insert(Ban1 b){        
        try {
            Connection conn = DBContext.getConnection();
            String sql = "INSERT INTO Ban(Ma,Ten,TrangThai) VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql); 
            ps.setString(1, b.getMa());
            ps.setString(2, b.getTen());
            ps.setInt(3, b.getTrangThai());
            ps.execute();
        } catch (Exception ex) {
         ex.printStackTrace();
        }
        
    }
    public void delete(String id){
        try {  
            Connection conn =DBContext.getConnection();
            String sql="DELETE FROM Ban WHERE Id=?";
            PreparedStatement ps = conn.prepareStatement(sql); 
            ps.setString(1, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}

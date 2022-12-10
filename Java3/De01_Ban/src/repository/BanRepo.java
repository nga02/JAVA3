package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Ban;

public class BanRepo {

    public ArrayList<Ban> getAll() {
        ArrayList<Ban> lst = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT Id,Ma,Ten,GioiTinh FROM Ban";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                int gioiTinh = rs.getInt("GioiTinh");

                Ban b = new Ban(id, ma, ten, gioiTinh);
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

    public void insert(Ban b) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "INSERT INTO Ban(Ma,Ten,GioiTinh) VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

       //     ps.setString(1, b.getId());
            ps.setString(1, b.getMa());
            ps.setString(2, b.getTen());
            ps.setInt(3, b.getGioiTinh());
            ps.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    public void update(String id,Ban b) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "UPDATE Ban SET Ma=?,Ten=?,GioiTinh=? WHERE Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);

      
            ps.setString(1, b.getMa());
            ps.setString(2, b.getTen());
            ps.setInt(3, b.getGioiTinh());
            ps.setString(4, b.getId());
            ps.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void delete(String id) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "DELETE FROM Ban WHERE Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

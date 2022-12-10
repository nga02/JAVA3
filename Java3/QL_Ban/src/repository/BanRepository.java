package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Ban;

public class BanRepository {

    public List<Ban> getAll() {
        List<Ban> lstBan = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT Ban.Id AS 'MaBan',Ban.Ten,NgaySinh,GioiTinh,MoiQuanHe.Ten  AS 'TenMqh' "
                    + "FROM Ban JOIN MoiQuanHe ON Ban.IdMQH=MoiQuanHe.Id";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("MaBan");
                String name = rs.getString("Ten");
                Date ngaySinh = rs.getDate("NgaySinh");
                int gioiTinh = rs.getInt("GioiTinh");
                String mqh = rs.getString("TenMqh");

                Ban b = new Ban(id, name, mqh, ngaySinh, gioiTinh);
                lstBan.add(b);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lstBan;
    }

    public void insert(Ban b) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "INSERT INTO Ban(Ten,NgaySinh,GioiTinh,IdMQH) VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1, b.getTenBan());
            java.sql.Date date = new java.sql.Date(b.getNgaySinh().getTime());
            ps.setDate(2, date);
            ps.setInt(3, b.getGioiTinh());
            ps.setString(4, b.getMoiQuanHe());

            ps.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(String id, Ban b) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "UPDATE Ban SET Ten=?,NgaySinh=?,GioiTinh=?,IdMQH=? WHERE Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, b.getTenBan());
            java.sql.Date date = new java.sql.Date(b.getNgaySinh().getTime());
            ps.setDate(2, date);
            ps.setInt(3, b.getGioiTinh());
            ps.setString(4, b.getMoiQuanHe());
            ps.setString(5, id);

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
    public Ban getById(String id){
        Ban b = null;
        try { 
            Connection con = DBContext.getConnection();
            String sql = "SELECT * FROM Ban WHERE Id=?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            if(rs.next()){
              //  String id = rs.getString("MaBan");
                String name = rs.getString("Ten");
                Date ngaySinh = rs.getDate("NgaySinh");
                int gioiTinh = rs.getInt("GioiTinh");
                String mqh = rs.getString("TenMqh");
                
                b = new Ban(id, name, mqh, ngaySinh, gioiTinh);
            }
        } catch (Exception ex) {
         ex.printStackTrace();
        }
        return b;
    }
}

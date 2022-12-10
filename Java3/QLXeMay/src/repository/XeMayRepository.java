package repository;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.XeMay;

public class XeMayRepository {

    public List<XeMay> getAll() {
        List<XeMay> lst = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT Id,Ma,NgaySX,GiaBan,SoLuong,TrangThai FROM XeMay";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                Date ngaySX = rs.getDate("NgaySX");
                BigDecimal gia = rs.getBigDecimal("GiaBan");
                int soLuong = rs.getInt("SoLuong");
                int trangThai = rs.getInt("TrangThai");
                XeMay xm = new XeMay(id, ma, ngaySX, gia, soLuong, trangThai);
                lst.add(xm);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        return lst;
    }

    public void insert(XeMay x) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "INSERT INTO XeMay(Ma,NgaySX,GiaBan,SoLuong,TrangThai) VALUES(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, x.getMa());
            java.sql.Date date = new java.sql.Date(x.getNgaySX().getTime());
            ps.setDate(2, date);
            ps.setBigDecimal(3, x.getGia());
            ps.setInt(4, x.getSoLuong());
            ps.setInt(5, x.getTrangThai());

            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(String ma, XeMay x) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "UPDATE XeMay SET Ma=?,NgaySX=?,GiaBan=?,SoLuong=?,TrangThai=? WHERE Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, x.getMa());
            java.sql.Date date = new java.sql.Date(x.getNgaySX().getTime());
            ps.setDate(2, date);
            ps.setBigDecimal(3, x.getGia());
            ps.setInt(4, x.getSoLuong());
            ps.setInt(5, x.getTrangThai());
            ps.setString(6, ma);

            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String ma) {

        try {
            Connection conn = DBContext.getConnection();
            String sql = "DELETE FROM XeMay WHERE Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

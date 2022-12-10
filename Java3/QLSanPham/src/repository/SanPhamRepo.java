package repository;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.SanPham;

public class SanPhamRepo {

    public List<SanPham> getAll() {
        List<SanPham> lstSP = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT Id,Ma,NgaySX,GiaBan,SoLuong,TrangThai FROM SanPham ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                Date ngaySX = rs.getDate("NgaySX");
                BigDecimal gia = rs.getBigDecimal("GiaBan");
                int soLuong = rs.getInt("SoLuong");
                int trangThai = rs.getInt("TrangThai");
                SanPham sp = new SanPham(id, ma, ngaySX, trangThai, soLuong, gia);
                lstSP.add(sp);
            }
            ps.execute();
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return lstSP;
    }

    public void insert(SanPham sp) {
        try {
            Connection con = DBContext.getConnection();
            String sql = "INSERT INTO SanPham(Ma,NgaySX,GiaBan,SoLuong,TrangThai) VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, sp.getMaSP());
            java.sql.Date date = new java.sql.Date(sp.getNgaySX().getTime());
            ps.setDate(2, date);
            ps.setBigDecimal(3, sp.getGia());
            ps.setInt(4, sp.getSluong());
            ps.setInt(5, sp.getTrangThai());

            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(String id, SanPham sp) {
        try {
            Connection con = DBContext.getConnection();
            String sql = "UPDATE SanPham SET Ma=?,NgaySX=?,GiaBan=?,SoLuong=?,TrangThai=? WHERE Id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, sp.getMaSP());
            java.sql.Date date = new java.sql.Date(sp.getNgaySX().getTime());
            ps.setDate(2, date);
            ps.setBigDecimal(3, sp.getGia());
            ps.setInt(4, sp.getSluong());
            ps.setInt(5, sp.getTrangThai());
            
            ps.setString(6, sp.getIdSP());

            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String id) {
        try {
            Connection con = DBContext.getConnection();
            String sql = "DELETE FROM SanPham WHERE Id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

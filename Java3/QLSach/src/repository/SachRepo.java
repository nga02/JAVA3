package repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import model.Sach;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SachRepo {

    public ArrayList<Sach> getAll() {
        ArrayList<Sach> dsSach = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT Id,Ma,Ten,NgayXuatBan,SoTrang,DonGia,TrangThai FROM Sach";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idS = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Date ngaySX = rs.getDate("NgayXuatBan");
                int soTrang = rs.getInt("SoTrang");
                BigDecimal donGia = rs.getBigDecimal("DonGia");
                int trangThai = rs.getInt("TrangThai");

                Sach s = new Sach(idS, ma, ten, ngaySX, soTrang, trangThai, donGia);
                dsSach.add(s);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dsSach;
    }

    public void insert(Sach sach) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "INSERT INTO Sach(Ma,Ten,NgayXuatBan,SoTrang,DonGia,TrangThai) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, sach.getMaS());
            ps.setString(2, sach.getTenS());
            java.sql.Date date = new java.sql.Date(sach.getNgayXB().getTime());
            ps.setDate(3, date);
            ps.setInt(4, sach.getSoTrang());
            ps.setBigDecimal(5, sach.getGia());
            ps.setInt(6, sach.getTrangThai());

            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(String id, Sach sach) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "UPDATE Sach SET Ma=?,Ten=?,NgayXuatBan=?,SoTrang=?,DonGia=?,TrangThai=? WHERE Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, sach.getMaS());
            ps.setString(2, sach.getTenS());
            java.sql.Date date = new java.sql.Date(sach.getNgayXB().getTime());
            ps.setDate(3, date);
            ps.setInt(4, sach.getSoTrang());
            ps.setBigDecimal(5, sach.getGia());
            ps.setInt(6, sach.getTrangThai());
            ps.setString(7, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String id) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "DELETE FROM Sach WHERE Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);  
            ps.setString(1, id);
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

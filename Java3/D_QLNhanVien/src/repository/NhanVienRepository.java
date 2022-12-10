package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NhanVien;

public class NhanVienRepository {

    public ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> lst = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT n.Id AS 'Id',n.Ma AS 'Ma',GioiTinh,Sdt,NgaySinh,TrangThai,c.Ten AS 'ChucVu' FROM NhanVien n LEFT JOIN ChucVu c ON n.IdCV=c.Id";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String gioiTinh = rs.getString("GioiTinh");
                String sdt = rs.getString("Sdt");
                Date ngaySinh = rs.getDate("NgaySinh");
                int trangThai = rs.getInt("TrangThai");
                String tenCV = rs.getString("ChucVu");

                NhanVien nv = new NhanVien(id, ma, gioiTinh, sdt, ngaySinh, trangThai, tenCV);
                lst.add(nv);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lst;
    }

    public void insert(NhanVien nv) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "INSERT INTO NhanVien (Ma,GioiTinh,Sdt,NgaySinh,TrangThai) VALUES(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getGioiTinh());
            ps.setString(3, nv.getSdt());
            java.sql.Date date = new java.sql.Date(nv.getNgaySinh().getTime());
            ps.setDate(4, date);
            ps.setInt(5, nv.getTrangThai());

            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(String id, NhanVien nv) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "UPDATE NhanVien SET Ma=?,GioiTinh=?,Sdt=?,NgaySinh=?,TrangThai=? WHERE Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getGioiTinh());
            ps.setString(3, nv.getSdt());
            java.sql.Date date = new java.sql.Date(nv.getNgaySinh().getTime());
            ps.setDate(4, date);
            ps.setInt(5, nv.getTrangThai());
            ps.setString(6, nv.getId());
            ps.execute();
        } catch (Exception ex) {

        }
    }

    public void delete(String id) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "DELETE FROM NhanVien WHERE Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

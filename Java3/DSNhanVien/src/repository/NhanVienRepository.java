package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NhanVien;

public class NhanVienRepository {

    public void insert(NhanVien nv) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "INSERT INTO NhanVien(Ten,Ma,GioiTinh,Sdt,NgaySinh) VALUES(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
           // PreparedStatement pss = conn.prepareStatement(ql);
            ps.setString(1, nv.getHoten());
            ps.setString(2, nv.getManv());
            ps.setString(3, nv.getGioiTinh());
            ps.setString(4, nv.getSdt());
            java.sql.Date date = new java.sql.Date(nv.getNgaySinh().getTime());
            ps.setDate(5, date);
           // pss.setString(1, nv.getChucVu());
            
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void update(String id, NhanVien nv) {
        try {
            Connection con = DBContext.getConnection();
            String sql = "UPDATE NhanVien SET Ten=?,Ma=?,GioiTinh=?,Sdt=?,NgaySinh=? WHERE Id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nv.getHoten());
            ps.setString(2, nv.getManv());
            ps.setString(3, nv.getGioiTinh());
            ps.setString(4, nv.getSdt());
            java.sql.Date date = new java.sql.Date(nv.getNgaySinh().getTime());
            ps.setDate(5, date);
            ps.setString(6, id);
            
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String id) {
        try {
            Connection con = DBContext.getConnection();
            String sql = "DELETE FROM NhanVien WHERE Id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> lstNv = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT NhanVien.Id AS 'IdNV',NhanVien.Ten AS 'TenNV',NhanVien.Ma AS 'MaNV',\n"
                    + "GioiTinh,Sdt,NgaySinh,ChucVu.Ten AS 'Chucvu' FROM NhanVien LEFT JOIN ChucVu  ON NhanVien.IdCV = ChucVu.Id";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("IdNV");
                String name = rs.getString("TenNV");
                String ma = rs.getString("MaNV");
                String gioiTinh = rs.getString("GioiTinh");
                String sdt = rs.getString("Sdt");
                Date ngaySinh = rs.getDate("NgaySinh");
                String chucvu = rs.getString("Chucvu");
         
                NhanVien nv = new NhanVien(id, name, ma, gioiTinh, ngaySinh, sdt, chucvu);
                lstNv.add(nv);

            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lstNv;
    }

}

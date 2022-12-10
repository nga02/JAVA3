package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NhanVien;

public class NhanVienRepository {

    public ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> lst = new ArrayList();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "SELECT Ma,Ten,DiaChi,GioiTinh FROM NhanVien ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String diachi = rs.getString("DiaChi");
                String gioitinh = rs.getString("GioiTinh");

                NhanVien nv = new NhanVien(ma, ten, diachi, gioitinh);
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
            String sql = "INSERT INTO NhanVien(Ma,Ten,DiaChi,GioiTinh ) VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getTen());
            ps.setString(3, nv.getDiachi());
            ps.setString(4, nv.getGioitinh());

            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

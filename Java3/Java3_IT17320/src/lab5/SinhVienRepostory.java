package lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SinhVienRepostory {

    public void insert(SinhVien sv) {
        try {
            Connection con = JdbcUtill.getConnection();
            String query = "INSERT INTO STUDENTS"
                    + "(MaSV,Hoten,Email,SoDT,Gioitinh,Diachi)" + "VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getEmail());
            ps.setString(4, sv.getSdt());
            ps.setInt(5, sv.getGioitTinh());
            ps.setString(6, sv.getDiaChi());

            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void update(int id, SinhVien sv) {

        try {
            Connection con = JdbcUtill.getConnection();
            String query = "UPDATE SinhVien SET" + "Hoten=?,Email=?,SoDT=?,Gioitinh=?,Diachi=?"
                    + "WHERE MaSV=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getEmail());
            ps.setString(4, sv.getSdt());
            ps.setInt(5, sv.getGioitTinh());
            ps.setString(6, sv.getDiaChi());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection con = JdbcUtill.getConnection();
            String query = "DELETE FROM SinhVien WHERE MaSV=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<SinhVien> all() {
        ArrayList<SinhVien> lstSV = new ArrayList<>();

        try {
            Connection con = JdbcUtill.getConnection();
            String query = "SELECT * FROM SinhVien";
            PreparedStatement ps = con.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();

            while (rs.next() == true) {
                String id = rs.getString("MaSV");
                String ten = rs.getString("HoTen");
                String email = rs.getString("Email");
                String SDT = rs.getString("SoDT");
                int gtinh = rs.getInt("Gioitinh");
                String diachi = rs.getString("Diachi");

                SinhVien sv = new SinhVien(id, ten, email, SDT, diachi, gtinh);
                lstSV.add(sv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lstSV;

    }
}

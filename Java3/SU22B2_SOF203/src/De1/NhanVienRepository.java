package De1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

public class NhanVienRepository {

    public void insert(NhanVien nv) {

        try {
            Connection con = JdbcUtil.getConnection();
            String query = "INSERT INTO NHANVIEN(Ho_ten,Ma_nv,Sdt,Tuoi,Vai_tro) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nv.getHoTen());
            ps.setString(2, nv.getMaNV());
            ps.setString(3, nv.getSdt());
            ps.setInt(4, nv.getTuoi());
            ps.setString(5, nv.getVaitro());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void upate(int id, NhanVien nv) {
        try {
            Connection con = JdbcUtil.getConnection();
            String query = "UPDATE NHANVIEN SET Ho_ten=?,Ma_nv=?,Sdt=?,Tuoi=?,Vai_tro=?" + "WHERE Id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nv.getHoTen());
            ps.setString(2, nv.getMaNV());
            ps.setString(3, nv.getSdt());
            ps.setInt(4, nv.getTuoi());
            ps.setString(5, nv.getVaitro());
            ps.setInt(6, id);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection con = JdbcUtil.getConnection();
            String query = "DELETE FROM NHANVIEN WHERE Id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<NhanVien> getAll() {
        List<NhanVien> lstNV = new ArrayList<>();
        try {
            Connection con = JdbcUtil.getConnection();
            String query = "SELECT * FROM NHANVIEN";
            PreparedStatement ps = con.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();

            while (rs.next() == true) {
                int id = rs.getInt("Id");
                String name = rs.getString("Ho_ten");
                String maNV = rs.getString("Ma_nv");
                String sdt = rs.getString("Sdt");
                int tuoi = rs.getInt("Tuoi");
                String vaitro = rs.getString("Vai_tro");

                NhanVien nv = new NhanVien(id, sdt, maNV, sdt, vaitro, tuoi);
                lstNV.add(nv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lstNV;
    }
}

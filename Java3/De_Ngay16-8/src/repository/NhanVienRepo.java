package repository;

import java.util.ArrayList;
import model.NhanVien;
import java.sql.*;


public class NhanVienRepo {

    public ArrayList<NhanVien> getAll(){
        ArrayList<NhanVien> lst = new ArrayList<>();
        try {  
            Connection conn =DBContext.getConnection();
            String sql = "SELECT Ma,GioiTinh,DiaChi,MatKhau FROM NhanVien";
            PreparedStatement ps = conn.prepareStatement(sql); 
             ResultSet rs = ps.executeQuery(); 
             while(rs.next()){
                 String ma = rs.getString("Ma");
                 String gioiTinh = rs.getString("GioiTinh");
                 String diaChi = rs.getString("DiaChi");
                 String matKhau = rs.getString("MatKhau");
                 
                 NhanVien nv = new NhanVien(ma, gioiTinh, diaChi, matKhau);
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
            String sql = "INSERT INTO NhanVien(Ma,GioiTinh,DiaChi,MatKhau) VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMaNV());
            ps.setString(2, nv.getGioiTinh());
            ps.setString(3, nv.getDiaChi());
            ps.setString(4, nv.getMatKhau());
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String ma) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "DELETE FROM NhanVien WHERE Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

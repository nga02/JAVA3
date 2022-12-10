package Repository;

import ENTITY.SinhVien;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SinhVienRepository {
    
    public void insert(SinhVien sv){
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "insert into Students(student_id, fullName, email, phone, gender, address, avatar) values (?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getTenSV());
            ps.setString(3, sv.getEmail());
            ps.setString(4, sv.getSoDt());
            ps.setInt(5, sv.getGt());
            ps.setString(6, sv.getDiachi());
            ps.setString(7, sv.getHinhAnh());
            
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public void update(int id, SinhVien sv){
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "update Students set student_id = ?, fullName = ?, email= ?, phone = ?, gender = ?, address =?, avatar =? where id = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getTenSV());
            ps.setString(3, sv.getEmail());
            ps.setString(4, sv.getSoDt());
            ps.setInt(5, sv.getGt());
            ps.setString(6, sv.getDiachi());
            ps.setString(7, sv.getHinhAnh());
            ps.setInt(8, id);
            
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public void delete(int id){
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "delete from Students where id = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    
    
    public ArrayList<SinhVien> getAll(){
        ArrayList<SinhVien> lstSV = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "select * from Students";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {                
                int id = rs.getInt("id");
                String maSV = rs.getString("student_id");
                String ten = rs.getString("fullName");
                String sdt = rs.getString("phone");
                String email = rs.getString("email");
                int gt = rs.getInt("gender");
                String diaChi = rs.getString("address");
                String hinhAnh = rs.getString("avatar");
                
                SinhVien sv = new SinhVien(id, maSV, ten, email, sdt, gt, diaChi, hinhAnh);
                lstSV.add(sv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lstSV;
    }
    
    public SinhVien getStudentID(int id){
        SinhVien sv = new SinhVien();
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "select * from Students where id = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            ps.execute();

            ResultSet rs = ps.getResultSet();
            
            if (rs.next() == true) {  
                String maSV = rs.getString("student_id");
                String ten = rs.getString("fullName");
                String sdt = rs.getString("phone");
                String email = rs.getString("email");
                int gt = rs.getInt("gender");
                String diaChi = rs.getString("address");
                String hinhAnh = rs.getString("avatar");

                sv.setId(id);
                sv.setMaSV(maSV);
                sv.setTenSV(ten);
                sv.setEmail(email);
                sv.setGt(gt);
                sv.setDiachi(diaChi);
                sv.setHinhAnh(hinhAnh);
                sv.setSoDt(sdt);
                
                return sv;
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public SinhVien getByID(int id) {
        SinhVien sv = new SinhVien();
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "select * from Students where id = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            ps.execute();

            ResultSet rs = ps.getResultSet();
            
            if (rs.next() == true) {  
                String maSV = rs.getString("student_id");
                String ten = rs.getString("fullName");
                String sdt = rs.getString("phone");
                String email = rs.getString("email");
                int gt = rs.getInt("gender");
                String diaChi = rs.getString("address");
                String hinhAnh = rs.getString("avatar");

                sv.setId(id);
                sv.setMaSV(maSV);
                sv.setTenSV(ten);
                sv.setEmail(email);
                sv.setGt(gt);
                sv.setDiachi(diaChi);
                sv.setHinhAnh(hinhAnh);
                sv.setSoDt(sdt);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sv;
    }
    
    
    
    public int getIDSV(String maSV) {
        int id = -1;
        try {
            String selectQuerry = "select id from Students where student_id = ?";
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(selectQuerry);
            ps.setString(1, maSV);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }
    
    public String getMa(int idSV) {
        String maSV = "";
        try {
            String selectQuerry = "select student_id from Students where id = ?";
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(selectQuerry);
            ps.setInt(1, idSV);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                maSV = rs.getString("student_id");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return maSV;
    }
    public String getTen(int idSV) {
        String ten = "";
        try {
            String selectQuerry = "select fullName from Students where id = ?";
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(selectQuerry);
            ps.setInt(1, idSV);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ten = rs.getString("fullName");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ten;
    }
}

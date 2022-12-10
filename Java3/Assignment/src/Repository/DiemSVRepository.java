package Repository;

import ENTITY.DiemSinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DiemSVRepository {
    public void insert(DiemSinhVien dsv){
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "insert into Grade(student_Id, english, informatics, gymnastics) values (?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, dsv.getMaSV());
            ps.setFloat(2, dsv.getDiemAnh());
            ps.setFloat(3, dsv.getDiemTin());
            ps.setFloat(4, dsv.getDiemGDTC());
            
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public void update(int id, DiemSinhVien dsv){
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "update Grade set student_Id = ?, english = ?, informatics = ?, gymnastics = ? where id = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(5, id);
            ps.setInt(1, dsv.getMaSV());
            ps.setFloat(1, dsv.getDiemAnh());
            ps.setFloat(2, dsv.getDiemTin());
            ps.setFloat(3, dsv.getDiemGDTC());
            
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public void delete(int id){
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "DELETE FROM Grade WHERE id = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    
    public ArrayList<DiemSinhVien> getAll(){
        ArrayList<DiemSinhVien> lstSV = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "SELECT * " +
                            "FROM Grade";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) { 
                int id = rs.getInt("id");
                int studentid = rs.getInt("student_Id");
                Float english = rs.getFloat("english");
                Float informatics = rs.getFloat("informatics");
                Float gymnastics = rs.getFloat("gymnastics");
                
                DiemSinhVien sv = new DiemSinhVien(id, studentid, english, informatics, gymnastics);
                lstSV.add(sv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lstSV;
    }
    
    public DiemSinhVien getById(int id) {
        DiemSinhVien sv = null;
        try {
            Connection conn = JdbcUtil.getConnection();
            String query = "SELECT * " +
                            "FROM Grade where id = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            if (rs.next() == true) { 
                int studentid = rs.getInt("student_Id");
                Float english = rs.getFloat("english");
                Float informatics = rs.getFloat("informatics");
                Float gymnastics = rs.getFloat("gymnastics");
                
                sv = new DiemSinhVien(id, studentid, english, informatics, gymnastics);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sv;
    }
    
    
    public String getFullname(String studentId) {
        String fullname = "";
        
        try {
            Connection conn = JdbcUtil.getConnection();
            String selectQuerry = "SELECT fullName FROM Students WHERE student_id = ?";
            
            PreparedStatement ps = conn.prepareStatement(selectQuerry);
            ps.setString(1, studentId);
//            ps.execute();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                fullname = rs.getString("fullName");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return fullname;
    }
}

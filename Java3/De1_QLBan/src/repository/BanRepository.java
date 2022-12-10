package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Ban;
import model.MoiQuanHe;

public class BanRepository {

    //load danh sách
    public List<Ban> getAll() {
        List<Ban> dsBan = new ArrayList();

        try {
            Connection connection = DBContext.getConnection();
            String sql = "SELECT b.Ma AS 'MaBan',b.Ten AS 'TenBan',NgaySinh,GioiTinh,b.IdMQH AS 'MaMQH',m.Ten AS 'TenMQH'\n"
                    + "FROM Ban b LEFT JOIN MoiQuanHe m ON b.IdMQH=m.Id";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maBan = rs.getString("MaBan");
                String tenBan = rs.getString("TenBan");
                Date ngaySinh = rs.getDate("NgaySinh");
                Integer gioiTinh = rs.getInt("GioiTinh");

                String maQuanHe = rs.getString("MaMQH");
                String tenQuanHe = rs.getString("TenMQH");

                MoiQuanHe mqh = new MoiQuanHe();
                mqh.setId(maQuanHe);
                mqh.setTenMQH(tenQuanHe);

                Ban ban = new Ban();
                ban.setMa(maBan);
                ban.setTen(tenBan);
                ban.setNgaySinh(ngaySinh);
                ban.setGioiTinh(gioiTinh);
                ban.setMoiQuanHe(mqh);

                dsBan.add(ban);
            }

            rs.close();
            ps.close();
            connection.close();

        } catch (Exception ex) {
            System.out.println("Lỗi kết nối");
            return null;
        }
        return dsBan;
    }

    public void insert(Ban b) {
        try {
            Connection connection = DBContext.getConnection();
            String sql = "INSERT INTO Ban(Ma,Ten,NgaySinh,GioiTinh,IdMQH)VALUES(?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, b.getMa());
            ps.setString(2, b.getTen());
            java.sql.Date date = new java.sql.Date(b.getNgaySinh().getTime());
            ps.setDate(3, date);
            ps.setInt(4, b.getGioiTinh());
            String idMqh = null;
            if (b.getMoiQuanHe() != null) {
                idMqh = b.getMoiQuanHe().getId();
            }
            ps.setString(5, idMqh);

            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(String id, Ban b) {
        try {
            Connection connection = DBContext.getConnection();
            String sql = "UPDATE Ban SET Ten=?,NgaySinh=?,GioiTinh=?,IdMQH=? WHERE Ma=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, b.getTen());

            java.sql.Date date = new java.sql.Date(b.getNgaySinh().getTime());
            ps.setDate(2, date);
            ps.setInt(3, b.getGioiTinh());
            String idMqh = null;
            if (b.getMoiQuanHe() != null) {
                idMqh = b.getMoiQuanHe().getId();
            }
            ps.setString(4, idMqh);
            ps.setString(5, b.getMa());

            ps.execute();
        } catch (Exception ex) {
         
        }
    }

    public void delete(String ma) {       
        try {
            Connection connection = DBContext.getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM Ban WHERE Ma =?");
            ps.setString(1, ma);
            ps.executeUpdate();
          
            ps.close();
            connection.close();         
        } catch (Exception ex) {
          
        }
    }
}

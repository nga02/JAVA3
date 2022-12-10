
package repository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MoiQuanHe;

public class MoiQuanHeRepository {
    public List<MoiQuanHe> getAll(){
        List<MoiQuanHe> dsMqh = new ArrayList<>();
        try { 
            Connection con = DBContext.getConnection();
             String sql = "SELECT Id,Ten FROM MoiQuanHe";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               
                String idQuanHe = rs.getString("Id");
                String tenQuanHe = rs.getString("Ten");

                MoiQuanHe mqh = new MoiQuanHe();
                mqh.setId(idQuanHe);
                mqh.setTenMQH(tenQuanHe);

                dsMqh.add(mqh);        
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        return dsMqh;
    }
            
}

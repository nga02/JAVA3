
package service;

import java.util.ArrayList;
import model.NhanVien;
import repository.NhanVienRepository;


public class NhanVienService {
    private NhanVienRepository nhanVienRepository =  new NhanVienRepository();

    public NhanVienService() {
    }
   public ArrayList<NhanVien> getList(){
       return nhanVienRepository.getAll();
   }
   public void insert(NhanVien nv) {
       nhanVienRepository.insert(nv);
   }
}

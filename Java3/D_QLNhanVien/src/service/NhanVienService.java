
package service;

import java.util.ArrayList;
import model.NhanVien;
import repository.NhanVienRepository;


public class NhanVienService {
    
    private final NhanVienRepository nhanVienRepository = new NhanVienRepository();

    public NhanVienService() {
    }
    public ArrayList<NhanVien> getList(){
        return nhanVienRepository.getAll();
    }
    public void insert(NhanVien nv){
        nhanVienRepository.insert(nv);
    }
    public void update(String id,NhanVien nv){
        nhanVienRepository.update(id, nv);
    }
    public void delete(String id){
        nhanVienRepository.delete(id);
    }
}

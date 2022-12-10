package service;

import java.util.ArrayList;
import model.NhanVien;
import repository.NhanVienRepository;

public class NhanVienService {

    private NhanVienRepository nvRepo = new NhanVienRepository();

    public NhanVienService() {
    }

    public ArrayList<NhanVien> getList() {
        return nvRepo.getAll();
    }
    public void add(NhanVien nv){
        nvRepo.insert(nv);
    }
    public void update(String id,NhanVien nv){
        nvRepo.update(id, nv);
    }
    public void delete(String id){
        nvRepo.delete(id);
    }
}

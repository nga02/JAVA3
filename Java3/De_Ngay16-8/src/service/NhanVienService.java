package service;


import java.util.ArrayList;
import model.NhanVien;
import repository.NhanVienRepo;

public class NhanVienService {

    private final NhanVienRepo nhanVienRepo = new NhanVienRepo();

    public NhanVienService() {
    }

    public void insert(NhanVien nv) {
        nhanVienRepo.insert(nv);
    }

    public void delete(String ma) {
        nhanVienRepo.delete(ma);
    }

    public ArrayList<NhanVien> getList() {
        return nhanVienRepo.getAll();
    }
}

package service;

import java.util.List;
import model.SanPham;
import repository.SanPhamRepo;

public class SanPhamService {

    private final SanPhamRepo spRepo = new SanPhamRepo();
    
    public SanPhamService() {
    }

    public List<SanPham> getList() {
        return spRepo.getAll();
    }

    public void themMoi(SanPham sp) {
        spRepo.insert(sp);
    }

    public void capNhat(String id, SanPham sp) {
      spRepo.update(id, sp);
    }

    public void xoa(String id) {
        spRepo.delete(id);
    }
}

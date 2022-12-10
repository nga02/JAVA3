package service;

import java.util.List;
import model.Sach;
import repository.SachRepo;

public class SachService {

    private SachRepo dsRepo = new SachRepo();
    
    public SachService() {
    }

    public List<Sach> getList() {
        return dsRepo.getAll();
    }

    public void them(Sach s) {
        dsRepo.insert(s);
    }

    public void sua(String id, Sach s) {
        dsRepo.update(id, s);
    }

    public void xoa(String id) {
        dsRepo.delete(id);
    }
}

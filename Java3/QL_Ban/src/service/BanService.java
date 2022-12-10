package service;

import java.util.List;
import model.Ban;
import repository.BanRepository;

public class BanService {

    private BanRepository banRepo = new BanRepository();

    public BanService() {
    }

    public List<Ban> getList() {
        return banRepo.getAll();
    }

    public void add(Ban b){
        banRepo.insert(b);
    }
    public void update(String id,Ban b){
        banRepo.update(id, b);
    }
    public void delete(String id){
        banRepo.delete(id);
    }
    public void getById(String id){
        banRepo.getById(id);
    }
}

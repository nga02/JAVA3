package service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Ban;
import repository.BanRepository;

public class BanService {

    private final BanRepository banRepo = new BanRepository();

    public BanService() {
    }
    public List<Ban> getList() {
        try {
            return banRepo.getAll();
        } catch (Exception ex) {
            return null;
        }
    }

    public void delete(String maBan) {
        banRepo.delete(maBan);
    }
    public void themBan(Ban b){
       banRepo.insert(b);
    }
    public void update(String i,Ban b){
        banRepo.update(i, b);
    }
}


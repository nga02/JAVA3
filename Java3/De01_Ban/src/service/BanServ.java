
package service;

import java.util.List;
import model.Ban;
import repository.BanRepo;

public class BanServ {

    private final BanRepo banRepo = new BanRepo();

    public BanServ() {
    }
    public List<Ban> getList(){
        return banRepo.getAll();
    }
    public void insert(Ban b){
        banRepo.insert(b);
    }
    public void update(String id,Ban b){
        banRepo.update(id,b);
    }
    public void delete(String id){
        banRepo.delete(id);
    }
}

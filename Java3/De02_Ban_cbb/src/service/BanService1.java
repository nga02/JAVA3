
package service;

import java.util.ArrayList;
import model.Ban1;
import repository.BanRepository;

public class BanService1 {
    private BanRepository banRepo = new BanRepository();

    public BanService1() {
    }
    public ArrayList<Ban1> geList(){
        return banRepo.getAll();
    }
    public void insert(Ban1 b){        
       banRepo.insert(b);
    }
    public void delete(String id){
       banRepo.delete(id);
    }
}


package service;

import java.util.List;
import model.MoiQuanHe;
import repository.MoiQuanHeRepository;

public class MqhService {
    private  MoiQuanHeRepository mqhRepo =new MoiQuanHeRepository();
    public List<MoiQuanHe> getList(){
        return mqhRepo.getAll();
    }
}

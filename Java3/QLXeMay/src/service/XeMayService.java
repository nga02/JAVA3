
package service;

import java.util.List;
import model.XeMay;
import repository.XeMayRepository;

public class XeMayService {

    private XeMayRepository xeMayRepo = new XeMayRepository();

    public XeMayService() {
    }

    public List<XeMay> getList() {
        return xeMayRepo.getAll();
    }

    public void insert(XeMay xm) {
        xeMayRepo.insert(xm);
    }

    public void update(String ma, XeMay xm) {
        xeMayRepo.update(ma, xm);
    }

    public void delete(String ma) {
        xeMayRepo.delete(ma);
    }
}

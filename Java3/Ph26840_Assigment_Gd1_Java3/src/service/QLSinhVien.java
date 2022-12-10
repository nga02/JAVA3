package service;

import java.util.ArrayList;
import java.util.List;
import model.SinhVien;

public class QLSinhVien {

    private List<SinhVien> lstSV;

    public QLSinhVien() {
        this.lstSV = new ArrayList<>();
    }

    public void insert(SinhVien sv) {
        this.lstSV.add(sv);
    }

    public void update(int i, SinhVien sv) {
        this.lstSV.set(i, sv);
    }

    public void delete(int i) {
        this.lstSV.remove(i);
    }

    public List<SinhVien> getList() {
        return lstSV;
    }

    public void setList(List<SinhVien> listSinhVien) {
        this.lstSV = listSinhVien;
    }
     public SinhVien getByid(int index) {
        return this.lstSV.get(index);
    }
}

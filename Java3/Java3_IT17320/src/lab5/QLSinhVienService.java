package lab5;

import java.util.ArrayList;

public class QLSinhVienService {

    private ArrayList<SinhVien> lstQLSV;

    public QLSinhVienService() {
        lstQLSV = new ArrayList<>();
    }

    public void insert(SinhVien sv) {
        lstQLSV.add(sv);
    }

    public void update(int id, SinhVien sv) {
        lstQLSV.set(id, sv);
//        for (int i = 0; i < lstQLSV.size(); i++) {
//            SinhVien s = lstQLSV.get(i);
//            if (s.getMaSV() == id) {
//                
//            }
//        }
    }

    public void delete(int id) {
        lstQLSV.remove(id);
//        for (int i = 0; i < lstQLSV.size(); i++) {
//            SinhVien s = lstQLSV.get(i);
//            if (s.getMaSV() == id) {
//                
//            }
//        }
    }

    public ArrayList<SinhVien> getList() {
        return lstQLSV;
    }

    public void setList(ArrayList<SinhVien> lstSV) {
        lstQLSV = lstSV;
    }

    public SinhVien getById(int index) {
        return lstQLSV.get(index);
    }
}

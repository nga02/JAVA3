package service;

import java.util.ArrayList;
import java.util.List;
import model.Diem;

public class QLDiem {

    private List<Diem> ds;

    public QLDiem() {
        this.ds = new ArrayList<>();
    }

    public void insert(Diem diem) {
        this.ds.add(diem);
    }

    public void update(int index, Diem diem) {
        this.ds.set(index, diem);
    }

    public void delete(int index) {
        this.ds.remove(index);
    }

    public List<Diem> getList() {
        return this.ds;
    }

    public void setList(List<Diem> ds) {
        this.ds = ds;
    }
    
     public Diem getByid(int index) {
        return this.ds.get(index);
    }

}

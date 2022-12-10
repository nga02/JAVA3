/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICE;

import DAO.SinhVienDAO;
import ENTITY.SinhVien;
import Repository.SinhVienRepository;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class SinhVienService implements SinhVienDAO{
    private SinhVienRepository svRepo;

    public SinhVienService() {
        this.svRepo = new SinhVienRepository();
    }

    @Override
    public void insert(SinhVien sv) {
        this.svRepo.insert(sv);
    }

    @Override
    public void update(int id, SinhVien sv) {
        this.svRepo.update(id, sv);
    }

    @Override
    public void delete(int id) {
        this.svRepo.delete(id);
    }

    @Override
    public SinhVien getById(int id) {
        return this.svRepo.getByID(id);
    }

    @Override
    public ArrayList<SinhVien> getList() {
        return this.svRepo.getAll();
    }

//    public SinhVien checkTonTai(int id){
//        return this.svRepo.checkTonTai(id);
//    }
    
    public int getIDSV(String maSV) {
        return this.svRepo.getIDSV(maSV);
    }
    
    public String getMa(int id) {
        return this.svRepo.getMa(id);
    }
    
    public String getTen(int id) {
        return this.svRepo.getTen(id);
    }
}

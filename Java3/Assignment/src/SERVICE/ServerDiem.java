/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICE;

import DAO.DiemSinhVienDAO;
import ENTITY.DiemSinhVien;
import Repository.DiemSVRepository;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ServerDiem implements DiemSinhVienDAO{
    public DiemSVRepository dRepo;

    public ServerDiem() {
        this.dRepo = new DiemSVRepository();
    }

    @Override
    public void insert(DiemSinhVien dsv) {
        this.dRepo.insert(dsv);
    }

    @Override
    public void update(int id, DiemSinhVien dsv) {
        this.dRepo.update(id, dsv);
    }

    @Override
    public void delete(int id) {
        this.dRepo.delete(id);
    }

    @Override
    public DiemSinhVien getByid(int id) {
       return this.dRepo.getById(id);
    }

    @Override
    public ArrayList<DiemSinhVien> getList() {
        return this.dRepo.getAll();
    }

    public String getFullname(String studentId){
        return dRepo.getFullname(studentId);
    }
    
}

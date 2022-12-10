/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import ENTITY.SinhVien;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface SinhVienDAO {
    public void insert(SinhVien sv);
    public void update(int index,SinhVien sv);
    public void delete(int index);
    public SinhVien getById(int index);
    public ArrayList<SinhVien> getList();
//    public void setList(ArrayList<SinhVien> ds);
}

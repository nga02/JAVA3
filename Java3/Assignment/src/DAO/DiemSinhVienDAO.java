/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import ENTITY.DiemSinhVien;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface DiemSinhVienDAO {
    public void insert(DiemSinhVien dsv);
    public void update(int index,DiemSinhVien dsv);
    public void delete(int index);
    public DiemSinhVien getByid(int index);
    public ArrayList<DiemSinhVien> getList();
//    public void setList(ArrayList<DiemSinhVien> ds);
}

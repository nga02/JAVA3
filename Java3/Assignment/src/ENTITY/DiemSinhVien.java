/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTITY;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class DiemSinhVien implements Serializable{
//    private String name;
    private int id;
    private int maSV;
    private float diemAnh;
    private float diemTin;
    private float diemGDTC;

    public DiemSinhVien() {
    }

    public DiemSinhVien(int id, int maSV, float diemAnh, float diemTin, float diemGDTC) {
//        this.name = name;
        this.id = id;
        this.maSV = maSV;
        this.diemAnh = diemAnh;
        this.diemTin = diemTin;
        this.diemGDTC = diemGDTC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public float getTB() {
        return Math.round(((diemAnh+ diemTin + diemGDTC)/3)*100)/100;
    }

    public float getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(float diemAnh) {
        this.diemAnh = diemAnh;
    }

    public float getDiemTin() {
        return diemTin;
    }

    public void setDiemTin(float diemTin) {
        this.diemTin = diemTin;
    }

    public float getDiemGDTC() {
        return diemGDTC;
    }

    public void setDiemGDTC(float diemGDTC) {
        this.diemGDTC = diemGDTC;
    }
    
    
} 

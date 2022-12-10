package model;

import java.io.Serializable;

public class Diem implements Serializable {

    private String name;
    private String maSV;
    private double diemAnh;
    private double diemTin;
    private double diemGDTC;

    public Diem() {
    }

    public Diem(String name, String maSV, double diemAnh, double diemTin, double diemGDTC) {
        this.name = name;
        this.maSV = maSV;
        this.diemAnh = diemAnh;
        this.diemTin = diemTin;
        this.diemGDTC = diemGDTC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public double getDiemTin() {
        return diemTin;
    }

    public void setDiemTin(double diemTin) {
        this.diemTin = diemTin;
    }

    public double getDiemGDTC() {
        return diemGDTC;
    }

    public void setDiemGDTC(double diemGDTC) {
        this.diemGDTC = diemGDTC;
    }
     public double getDiemTB() {
        return Math.round(((diemAnh+ diemTin + diemGDTC)/3)*100)/100;
    }
}

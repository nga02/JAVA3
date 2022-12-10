package model;

import java.util.Date;

public class Ban {

    private String maBan, tenBan, moiQuanHe;
    private Date ngaySinh;
    private int gioiTinh;

    public Ban() {
    }

    public Ban(String maBan, String tenBan, String moiQuanHe, Date ngaySinh, int gioiTinh) {
        this.maBan = maBan;
        this.tenBan = tenBan;
        this.moiQuanHe = moiQuanHe;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
       
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getMoiQuanHe() {
        return moiQuanHe;
    }

    public void setMoiQuanHe(String moiQuanHe) {
        this.moiQuanHe = moiQuanHe;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    
    @Override
    public String toString() {
        return "Ban{" + "maBan=" + maBan + ", tenBan=" + tenBan + ", moiQuanHe=" + moiQuanHe + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + '}';
    }

  

}

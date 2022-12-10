
package model;

import java.util.Date;

public class Ban {
    private String ma;
    private String ten;
    private Date ngaySinh;
    private Integer gioiTinh;
    private MoiQuanHe moiQuanHe;
    
    public Ban() {
    }

    public Ban(String ma, String ten, Date ngaySinh, Integer gioiTinh, MoiQuanHe moiQuanHe) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.moiQuanHe = moiQuanHe;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public MoiQuanHe getMoiQuanHe() {
        return moiQuanHe;
    }

    public void setMoiQuanHe(MoiQuanHe moiQuanHe) {
        this.moiQuanHe = moiQuanHe;
    }
    
}

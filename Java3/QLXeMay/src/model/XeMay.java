package model;

import java.math.BigDecimal;
import java.util.Date;

public class XeMay {

    private String Id, Ma;
    private Date ngaySX;
    private BigDecimal gia;
    private int soLuong, trangThai;

    public XeMay() {
    }

    public XeMay(String Id, String Ma, Date ngaySX, BigDecimal gia, int soLuong, int trangThai) {
        this.Id = Id;
        this.Ma = Ma;
        this.ngaySX = ngaySX;
        this.gia = gia;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "XeMay{" + "Id=" + Id + ", Ma=" + Ma + ", ngaySX=" + ngaySX + ", gia=" + gia + ", soLuong=" + soLuong + ", trangThai=" + trangThai + '}';
    }

    
}

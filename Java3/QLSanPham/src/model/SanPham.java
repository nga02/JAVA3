
package model;

import java.math.BigDecimal;
import java.util.Date;

public class SanPham {
    private String idSP,maSP;
    private Date ngaySX;
    private int trangThai,sluong;
    private BigDecimal gia;

    public SanPham() {
    }

    public SanPham(String idSP, String maSP, Date ngaySX, int trangThai, int sluong, BigDecimal gia) {
        this.idSP = idSP;
        this.maSP = maSP;
        this.ngaySX = ngaySX;
        this.trangThai = trangThai;
        this.sluong = sluong;
        this.gia = gia;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "idSP=" + idSP + ", maSP=" + maSP + ", ngaySX=" + ngaySX + ", trangThai=" + trangThai + ", sluong=" + sluong + ", gia=" + gia + '}';
    }
    
}

package model;

import java.math.BigDecimal;
import java.util.Date;

public class Sach {

    private String id, maS, tenS;
    private Date ngayXB;
    private int soTrang, trangThai;
    private BigDecimal gia;

    public Sach() {
    }

    public Sach(String id, String maS, String tenS, Date ngayXB, int soTrang, int trangThai, BigDecimal gia) {
        this.id = id;
        this.maS = maS;
        this.tenS = tenS;
        this.ngayXB = ngayXB;
        this.soTrang = soTrang;
        this.trangThai = trangThai;
        this.gia = gia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaS() {
        return maS;
    }

    public void setMaS(String maS) {
        this.maS = maS;
    }

    public String getTenS() {
        return tenS;
    }

    public void setTenS(String tenS) {
        this.tenS = tenS;
    }

    public Date getNgayXB() {
        return ngayXB;
    }

    public void setNgayXB(Date ngayXB) {
        this.ngayXB = ngayXB;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Sach{" + "id=" + id + ", maS=" + maS + ", tenS=" + tenS + ", ngayXB=" + ngayXB + ", soTrang=" + soTrang + ", trangThai=" + trangThai + ", gia=" + gia + '}';
    }

}

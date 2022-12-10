package model;

import java.math.BigDecimal;
import java.util.Date;

public class NhanVien {

    private String id, ma, gioiTinh, sdt;
    private Date ngaySinh;
    private int trangThai;
    private String chucVu;

    public NhanVien() {
    }

    public NhanVien(String id, String ma, String gioiTinh, String sdt, Date ngaySinh, int trangThai, String chucVu) {
        this.id = id;
        this.ma = ma;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
        this.trangThai = trangThai;
        this.chucVu = chucVu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", ma=" + ma + ", gioiTinh=" + gioiTinh + ", sdt=" + sdt + ", ngaySinh=" + ngaySinh + ", trangThai=" + trangThai + ", chucVu=" + chucVu + '}';
    }

}

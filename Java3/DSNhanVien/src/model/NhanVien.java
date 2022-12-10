package model;

import java.util.Date;

public class NhanVien {

    private String id, hoten, manv, gioiTinh;
    private Date ngaySinh;
    private String sdt, chucVu;

    public NhanVien() {
    }

    public NhanVien(String id, String hoten, String manv, String gioiTinh, Date ngaySinh, String sdt, String chucVu) {
        this.id = id;
        this.hoten = hoten;
        this.manv = manv;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.chucVu = chucVu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", hoten=" + hoten + ", manv=" + manv + ", gioiTinh=" + gioiTinh + ", , sdt=" + sdt + ",ngaySinh=" + ngaySinh + " chucVu=" + chucVu + '}';
    }

}

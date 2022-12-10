package model;

public class NhanVien {

    private String ma, ten, diachi, gioitinh;

    public NhanVien() {
    }

    public NhanVien(String ma, String ten, String diachi, String gioitinh) {
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ma=" + ma + ", ten=" + ten + ", diachi=" + diachi + ", gioitinh=" + gioitinh + '}';
    }

}

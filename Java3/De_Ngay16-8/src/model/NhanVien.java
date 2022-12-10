package model;

public class NhanVien {

    private String maNV, gioiTinh, diaChi, matKhau;

    public NhanVien() {
    }

    public NhanVien(String maNV, String gioiTinh, String diaChi, String matKhau) {
        this.maNV = maNV;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", matKhau=" + matKhau + '}';
    }

}

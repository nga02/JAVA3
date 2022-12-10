package lab5;

public class SinhVien {

    private String maSV, hoTen, email, sdt, diaChi;
    private int gioitTinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String email, String sdt, String diaChi, int gioitTinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.gioitTinh = gioitTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getGioitTinh() {
        return gioitTinh;
    }

    public void setGioitTinh(int gioitTinh) {
        this.gioitTinh = gioitTinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", email=" + email + ", sdt=" + sdt + ", diaChi=" + diaChi + ", gioitTinh=" + gioitTinh + '}';
    }

}

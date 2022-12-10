package De1;

public class NhanVien {

    private int id;
    private String hoTen, maNV, Sdt, vaitro;
    private int tuoi;

    public NhanVien() {
    }

    public NhanVien(int id, String hoTen, String maNV, String Sdt, String vaitro, int tuoi) {
        this.id = id;
        this.hoTen = hoTen;
        this.maNV = maNV;
        this.Sdt = Sdt;
        this.vaitro = vaitro;
        this.tuoi = tuoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", hoTen=" + hoTen + ", maNV=" + maNV + ", Sdt=" + Sdt + ", vaitro=" + vaitro + ", tuoi=" + tuoi + '}';
    }

}

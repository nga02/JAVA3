
package models;

/**
 *
 * @author NTV
 */
public class Student {
    private String masv, name, email, sdt, diachi;
    private boolean gt;
    private byte[] hinh;

    public Student() {
    }

    public Student(String masv, String name, String email, String sdt, String diachi, byte[] hinh, boolean gt) {
        this.masv = masv;
        this.name = name;
        this.email = email;
        this.sdt = sdt;
        this.diachi = diachi;
        this.hinh = hinh;
        this.gt = gt;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public byte[] getHinh() {
        return hinh;
    }

    public void setHinh(byte[] hinh) {
        this.hinh = hinh;
    }

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }
    
    
}

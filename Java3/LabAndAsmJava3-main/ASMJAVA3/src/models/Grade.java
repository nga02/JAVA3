
package models;

/**
 *
 * @author NTV
 */
public class Grade extends Student{
    private int id;
    private float tienganh, tinhoc, gdtc;

    public Grade() {
    }

    public Grade(int id, float tienganh, float tinhoc, float gdtc) {
        this.id = id;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
    }
    
    public Grade( float tienganh, float tinhoc, float gdtc) {
        
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
    }

    public Grade(int id, float tienganh, float tinhoc, float gdtc, String masv, String name, String email, String sdt, String diachi, byte[] hinh, boolean gt) {
        super(masv, name, email, sdt, diachi, hinh, gt);
        this.id = id;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
    }
    
    public Grade(float tienganh, float tinhoc, float gdtc, String masv, String name, String email, String sdt, String diachi, byte[] hinh, boolean gt) {
        super(masv, name, email, sdt, diachi, hinh, gt);
        
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    

    public float getTienganh() {
        return tienganh;
    }

    public void setTienganh(float tienganh) {
        this.tienganh = tienganh;
    }

    public float getTinhoc() {
        return tinhoc;
    }

    public void setTinhoc(float tinhoc) {
        this.tinhoc = tinhoc;
    }

    public float getGdtc() {
        return gdtc;
    }

    public void setGdtc(float gdtc) {
        this.gdtc = gdtc;
    }

    
    public float getDTB() {
        return (tienganh + tinhoc + gdtc) / 3; 
    }
    
}

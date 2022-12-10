package model;

public class MoiQuanHe {

    private String id;
    private String maMQH;
    private String tenMQH;

    public MoiQuanHe() {
    }

    public MoiQuanHe(String id, String maMQH, String tenMQH) {
        this.id = id;
        this.maMQH = maMQH;
        this.tenMQH = tenMQH;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaMQH() {
        return maMQH;
    }

    public void setMaMQH(String maMQH) {
        this.maMQH = maMQH;
    }

    public String getTenMQH() {
        return tenMQH;
    }

    public void setTenMQH(String tenMQH) {
        this.tenMQH = tenMQH;
    }

    @Override
    public String toString() {
        return tenMQH;
    }

}

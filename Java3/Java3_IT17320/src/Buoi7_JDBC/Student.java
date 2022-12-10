package Buoi7_JDBC;

public class Student {

    private String name;
    private String phone;
    private Integer id;

    public Student() {
    }

    public Student(String name, String phone, Integer id) {
        this.name = name;
        this.phone = phone;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", phone=" + phone + ", id=" + id + '}';
    }

}

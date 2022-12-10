/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_ontapcuoi;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Student implements Serializable {

    String id, name, gender;
    double markAvg;

    public Student(String id, String name, String gender, double markAvg) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.markAvg = markAvg;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMarkAvg() {
        return markAvg;
    }

    public void setMarkAvg(double markAvg) {
        this.markAvg = markAvg;
    }

    public String getStatus(double mark) {
        if (mark >= 5) {
            return "Đạt";
        }else{
            return "Trượt";
            
        }
    }
}

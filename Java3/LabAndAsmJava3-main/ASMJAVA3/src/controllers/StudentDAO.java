/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import database.MyConnection;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;
import models.Student;


/**
 *
 * @author NTV
 */
public class StudentDAO {
    public static ArrayList<Student> viewAll() throws SQLException {
        ArrayList<Student> lst = new ArrayList<>();
        Connection con = MyConnection.getConnect();
        Statement stm = con.createStatement();
        String sql = "SELECT * FROM STUDENTS";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Student st = new Student();
            st.setMasv(rs.getString(1));
            st.setName(rs.getString(2));
            st.setEmail(rs.getString(3));
            st.setDiachi(rs.getString(6));
            st.setSdt(rs.getString(4));
            st.setGt(rs.getBoolean(5));
            Blob bl = rs.getBlob(7);            
            if (bl != null) {
                st.setHinh(bl.getBytes(1, (int) bl.length()));
            }           
            lst.add(st);
        }
        
        return lst;
    }
    
    public static boolean insert(Student st) throws SQLException {
        String sql = "INSERT INTO STUDENTS VALUES(?, ?, ?, ?, ?, ?, ?) ";
        Connection con = MyConnection.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, st.getMasv());
        pstmt.setString(2, st.getName());
        pstmt.setString(3, st.getEmail());
        pstmt.setString(4, st.getSdt());
        pstmt.setBoolean(5, st.isGt());
        pstmt.setString(6, st.getDiachi());
        if (st.getHinh() != null) {
            Blob hinh = new SerialBlob(st.getHinh());
            pstmt.setBlob(7, hinh);
        }else {
            Blob hinh = null;
            pstmt.setBlob(7, hinh);
        }
        return pstmt.executeUpdate() > 0;
    }
    
    public static boolean update(Student st) throws SQLException {
        String sql = "UPDATE STUDENTS SET Hoten = ?, Email = ?, SoDT = ?, GT = ?, Diachi = ?, Hinh = ? WHERE MASV = ?";
        Connection con = MyConnection.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(7, st.getMasv());
        pstmt.setString(1, st.getName());
        pstmt.setString(2, st.getEmail());
        pstmt.setString(3, st.getSdt());
        pstmt.setBoolean(4, st.isGt());
        pstmt.setString(5, st.getDiachi());
        if (st.getHinh() != null) {
            Blob hinh = new SerialBlob(st.getHinh());
            pstmt.setBlob(6, hinh);
        }else {
            Blob hinh = null;
            pstmt.setBlob(6, hinh);
        }
        return pstmt.executeUpdate() > 0;
    }
    
    public static boolean delete(String masv) throws SQLException {
        String sql = "DELETE STUDENTS WHERE MASV = ?";
        Connection con = MyConnection.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, masv);
        
        return pstmt.executeUpdate() > 0;
    }
    
    public static Student findByID(String masv) throws SQLException {
        String sql = "SELECT * FROM STUDENTS WHERE MASV = ?";
        Connection con = MyConnection.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, masv);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            Student st = new Student();
            st.setMasv(rs.getString(1));
            st.setName(rs.getString(2));
            st.setEmail(rs.getString(3));
            st.setDiachi(rs.getString(6));
            st.setSdt(rs.getString(4));
            st.setGt(rs.getBoolean(5));
            Blob bl = rs.getBlob(7);            
            if (bl != null) {
                
                st.setHinh(bl.getBytes(1, (int) bl.length()));
            }           
            
            return st;
        }
        return null;
    }
}

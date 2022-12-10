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
import models.Grade;


/**
 *
 * @author NTV
 */
public class GradeDAO {
    
    private static int index = -1;
    
    public static Grade btnNext() throws SQLException {        
        ArrayList<Grade> lst = viewAll();
        index ++;
        if (index > lst.size() -1 ) {
            index = lst.size() -1;
        }
        Grade gpa = lst.get(index);
        return gpa;
    }
    
    public static Grade btnPre() throws SQLException {
        index --;
        ArrayList<Grade> lst = viewAll();
        if (index < 0) {
            index = 0;
        }
        Grade gpa = lst.get(index);
        return gpa;
    }
    
    public static Grade btnFirst() throws SQLException {
        index = 0;
        ArrayList<Grade> lst = viewAll();
        
        Grade gpa = lst.get(index);
        return gpa;
    }
    
    public static Grade btnLast() throws SQLException {        
        ArrayList<Grade> lst = viewAll();
        index = lst.size() -1 ;
        
        Grade gpa = lst.get(index);
        return gpa;
    }
    public static ArrayList<Grade> viewAll() throws SQLException {
        ArrayList<Grade> lst = new ArrayList<>();
        Connection con = MyConnection.getConnect();
        Statement stm = con.createStatement();
        String sql = "SELECT * FROM GRADE";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Grade st = new Grade();
            st.setId(rs.getInt(1));
            st.setMasv(rs.getString(2));
            st.setTienganh(rs.getFloat(3));
            st.setTinhoc(rs.getFloat(4));
            st.setGdtc(rs.getFloat(5));
            lst.add(st);            
        }
        
        return lst;
    }
    
    public static boolean insert(Grade st) throws SQLException {
        String sql = "INSERT INTO GRADE VALUES(?, ?, ?, ?) ";
        Connection con = MyConnection.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, st.getMasv());
        pstmt.setFloat(2, st.getTienganh());
        pstmt.setFloat(3, st.getTinhoc());
        pstmt.setFloat(4, st.getGdtc());
        return pstmt.executeUpdate() > 0;
    }
    
    public static boolean update(Grade st) throws SQLException {
        String sql = "UPDATE GRADE SET TiengAnh = ?, TinHoc = ?, GDTC = ? WHERE MASV = ?";
        Connection con = MyConnection.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(4, st.getMasv());
        pstmt.setFloat(1, st.getTienganh());
        pstmt.setFloat(2, st.getTinhoc());
        pstmt.setFloat(3, st.getGdtc());
        return pstmt.executeUpdate() > 0;
    }
    
    public static boolean delete(String masv) throws SQLException {
        String sql = "DELETE GRADE WHERE MASV = ?";
        Connection con = MyConnection.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, masv);
        
        return pstmt.executeUpdate() > 0;
    }
    
    public static Grade findByID(String masv) throws SQLException {
        String sql = "SELECT * FROM GRADE WHERE MASV = ?";
        Connection con = MyConnection.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, masv);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            Grade st = new Grade();
            st.setId(rs.getInt(1));
            st.setMasv(rs.getString(2));
            st.setTienganh(rs.getFloat(3));
            st.setTinhoc(rs.getFloat(4));
            st.setGdtc(rs.getFloat(5));
            
            return st;
        }
        return null;
    }
    
    public static ArrayList<Grade> findByID() throws SQLException {
        String sql = "SELECT * FROM GRADE";
        ArrayList<Grade> lst = new ArrayList<>();
        Connection con = MyConnection.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql);        
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Grade st = new Grade();
            st.setId(rs.getInt(1));
            st.setMasv(rs.getString(2));
            st.setTienganh(rs.getFloat(3));
            st.setTinhoc(rs.getFloat(4));
            st.setGdtc(rs.getFloat(5));
            lst.add(st);
            
        }
        return lst;
    }
    
    public static ArrayList<Grade> findTop(int top) throws SQLException {
        String sql = "SELECT Top " + top + " *, (TiengAnh + TinHoc + GDTC)/3 as DTB"
                + " FROM GRADE order by DTB desc";
        ArrayList<Grade> lst = new ArrayList<>();
        Connection con = MyConnection.getConnect();
        PreparedStatement pstmt = con.prepareStatement(sql);        
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Grade st = new Grade();
            st.setId(rs.getInt(1));
            st.setMasv(rs.getString(2));
            st.setTienganh(rs.getFloat(3));
            st.setTinhoc(rs.getFloat(4));
            st.setGdtc(rs.getFloat(5));
            lst.add(st);
            
        }
        return lst;
    }
}

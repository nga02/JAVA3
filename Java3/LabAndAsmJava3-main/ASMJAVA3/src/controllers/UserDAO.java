package controllers;

import database.MyConnection;
import helper.ShareData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.User;

/**
 *
 * @author NTV
 */
public class UserDAO {

    public static boolean checkLogin(String username, String pass) throws SQLException {
        Connection con = MyConnection.getConnect();
        Statement stm = con.createStatement();
        String sql = "SELECT username,"
                + " [password], [role] FROM USERS WHERE username = '" + username + "'"
                + " and [password] = '" + pass + "' ";
        ResultSet rs = stm.executeQuery(sql);
        int row = 0;
        while (rs.next()) {
            row = 1;
            String role = rs.getString(3);
            User us = new User();
            us.setUsername(username);
            us.setRole(role);
            ShareData.u = us;
        }
        return (row > 0);
    }
}

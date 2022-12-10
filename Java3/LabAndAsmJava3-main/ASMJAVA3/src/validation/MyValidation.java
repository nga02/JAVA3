/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import javax.swing.JTextField;

/**
 *
 * @author NTV
 */
public class MyValidation {
    public static boolean isEmpty (JTextField txtValue, JLabel lblmsg, String msg) {
        String txt = txtValue.getText().trim();
        if (txt.length() == 0) {
            lblmsg.setText(msg);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }
        lblmsg.setText("");
        txtValue.setBackground(Color.white);
        return false;
    }
    
    public static boolean isEmpty (JTextField txtValue, String msg) {
        String txt = txtValue.getText().trim();
        if (txt.length() == 0) {
            JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }        
        txtValue.setBackground(Color.white);
        return false;
    }
    
    public static boolean isEmpty (JTextArea txtValue, String msg) {
        String txt = txtValue.getText().trim();
        if (txt.length() == 0) {
            JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }        
        txtValue.setBackground(Color.white);
        return false;
    }
    
    public static boolean isNotEmail (JTextField txtValue, String msg) {
        String txt = txtValue.getText().trim();
        String pattern = "^[a-zA-Z]\\w{2,30}@\\w{2,10}(\\.\\w{2,10}){1,2}$";
        if (!txt.matches(pattern)) {
            JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }        
        txtValue.setBackground(Color.white);
        return false;
    }
    
    public static boolean isNotNumber (JTextField txtValue, String msg) {
        String txt = txtValue.getText();
        String pattern = "^[0-9.]{1,5}$";
        if (!txt.matches(pattern)) {
            JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }
        
        double diem = Double.parseDouble(txtValue.getText());
        if (diem < 0 || diem > 10) {
            JOptionPane.showMessageDialog(null, "Điểm trong khoảng 0 - 10", "Error", JOptionPane.ERROR_MESSAGE);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }
        txtValue.setBackground(Color.white);
        return false;
    }
    
    public static boolean isNotSDT (JTextField txtValue, String msg) {
        String txt = txtValue.getText();
        String pattern = "^[0-9]{9,12}$";
        if (!txt.matches(pattern)) {
            JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }      
        txtValue.setBackground(Color.white);
        return false;
    }
}

package Buoi1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MainUI extends JFrame {
    
    public static void main(String[] args) {
        MainUI mainUI = new MainUI();
        mainUI.setTitle("Java3");
        
        mainUI.setSize(500,350);
        mainUI.setLocationRelativeTo(null);
        mainUI.setBounds(200, 50, 500, 350);
       // mainUI.setBackground(Color.RED);
        mainUI.setVisible(true);
        mainUI.setLayout(new FlowLayout());
        
        
        JButton btnRed = new JButton("Red");
        btnRed.setSize(40,40);
        mainUI.add(btnRed);
        mainUI.getContentPane().setBackground(Color.red);
        
        JButton btnBlue = new JButton("Blue");
        btnBlue.setSize(40,40);
        mainUI.add(btnBlue);
   //     mainUI.getContentPane().setBackground(Color.blue);
       
        
        btnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainUI.setBackground(Color.red);
                
            }
        });
        
    }
    
}


package Buoi5_Bai3_Layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FolowLayoutExample {
    JFrame frame;
    
    public FolowLayoutExample(){
        frame = new JFrame("Folow Layout");
        
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
   
        for (int i = 0; i < 10; i++) {
            jPanel.add(new JButton("Button"+i));
        }
      frame.getContentPane().add(jPanel);
    }
    public static void main(String[] args) {
        FolowLayoutExample folowLayoutExample = new FolowLayoutExample();
        folowLayoutExample.frame.setBounds(300,300,400,500);
        folowLayoutExample.frame.setVisible(true);
    }
}

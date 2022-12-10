
package Buoi5_Bai3_Layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutExample {
      JFrame frame;
    
    public CardLayoutExample(){
        frame = new JFrame("Folow Layout");
        
        JPanel jPanelCard1 = new JPanel();
        JButton btnCard1 = new JButton("Card 1...");
        btnCard1.setBounds(0,0,30,20);
     
      frame.getContentPane().add(jPanelCard1);
    }
    public static void main(String[] args) {
        CardLayoutExample cardLayoutExample = new CardLayoutExample();
        cardLayoutExample.frame.setBounds(300,300,400,500);
        cardLayoutExample.frame.setVisible(true);
    }
}

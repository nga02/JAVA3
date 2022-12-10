
package Buoi6_Bai4;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class MainUI {
    JFrame frame;
    MainUI(){
        frame = new JFrame("jmenu demo");
        frame.setBounds(100, 100,450,500);
        
        //menubar
//        menuBar=new JMenuBar();
//        menuBar.add(null);
    }
    public static void main(String[] args) {
        MainUI ui = new MainUI();
    }
}

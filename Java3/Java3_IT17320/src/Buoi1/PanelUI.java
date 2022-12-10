
package Buoi1;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class PanelUI extends JFrame {

    public static void main(String[] args) {
        PanelUI p = new PanelUI();
        p.setTitle("Test Panel");
        p.setBounds(200, 200, 500, 300);
        p.setVisible(true);

        JPanel jPanel = new JPanel();
        
        jPanel.setLayout(new GridLayout(4,3));
        p.add(jPanel);

        for (int i = 0; i < 12; i++) {
            JButton button = new JButton("Button" + i);
            jPanel.add(button);
        }
    }
}

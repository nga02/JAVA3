
package Buoi3_Components;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CheckBoxTest extends JFrame {

    public static void main(String[] args) {
        CheckBoxTest boxTest = new CheckBoxTest();
        boxTest.setSize(500, 400);
        boxTest.setVisible(true);
        
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 2));
        
        JCheckBox chbJava = new JCheckBox("Java");
        jPanel.add(chbJava);
        
        JCheckBox chbC = new JCheckBox("C#");
        jPanel.add(chbC);
        
        JCheckBox chbPython = new JCheckBox("Python");
        jPanel.add(chbPython);
        
        JCheckBox chbRuby = new JCheckBox("Ruby");
        jPanel.add(chbRuby);
        
        JRadioButton btnMade = new JRadioButton("Nam");
        JRadioButton btnNu = new JRadioButton("Nu");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(btnMade);
        buttonGroup.add(btnNu);
        
        boxTest.add(jPanel);
        
        boxTest.setVisible(true);
    }
}

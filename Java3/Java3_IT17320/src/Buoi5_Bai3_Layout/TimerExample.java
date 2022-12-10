package Buoi5_Bai3_Layout;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class TimerExample {

    JFrame frame;
    JLabel lblTime;
    Timer timer;

    public TimerExample() {
        frame = new JFrame();
        frame.setBounds(20, 20, 400, 500);
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        lblTime = new JLabel();
        lblTime.setText("00:00:00");

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
                String dateCurrent = dateFormat.format(new Date());
                lblTime.setText("");
            }
        });
        timer.start();
        frame.add(lblTime);
    }
    public static void main(String[] args) {
        TimerExample timerExample = new TimerExample();
        timerExample.frame.setVisible(true);
    }
}

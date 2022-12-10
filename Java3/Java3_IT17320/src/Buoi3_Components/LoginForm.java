package Buoi3_Components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {

    JButton btnLogin;
    JTextField txtUsername;
    JPasswordField txtPwd;
    JCheckBox chkRememberMe;

    public static void main(String[] args) {

        LoginForm form = new LoginForm();

        form.setTitle("Bai 2 - Login Form");
        form.setLayout(new FlowLayout());
        form.setBounds(200, 200, 400, 500);
        form.setUpUI();
        form.setVisible(true);
    }

    public void setUpUI() {

        //add cho UserName
        StringBuilder builderHtml = new StringBuilder("<html>");
        builderHtml.append("<i style=\"color:red\">Username</i>" + "</html>");
        builderHtml.append("</html>");
        this.add(new JLabel(builderHtml.toString()));
        txtUsername = new JTextField();
        txtUsername.setSize(600, 300);
        txtUsername.setText("fgyu");
        this.add(txtUsername);

        //add for password
        StringBuilder builderHtmlPwd = new StringBuilder("<html>");
        builderHtmlPwd.append("<i style=\"color:red\">Password</i>" + "</html>");
        builderHtmlPwd.append("</html>");
        this.add(new JLabel(builderHtmlPwd.toString()));
        txtPwd = new JPasswordField();
        txtPwd.setSize(1000, 300);
        txtPwd.setText("fgyu");
        this.add(txtPwd);

        //add remember me for checkbox
        chkRememberMe = new JCheckBox();
        chkRememberMe.setSelected(true);
        chkRememberMe.setText("Remember me");
        this.add(chkRememberMe);

        //add for Button
        btnLogin = new JButton("Login");
        btnLogin.setSize(100, 50);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkLogin();
            }
        });
        this.add(btnLogin);
    }

    protected void checkLogin() {
        String username = txtUsername.getText();
        String password = txtPwd.getText();

        if (username == null || "".equals(username)) {
            System.out.println("Ban phai nhap username");
            JOptionPane.showMessageDialog(this, "Ban phai nhap username");
            return;
        }
        if (password == null || "".equals(password)) {
            JOptionPane.showMessageDialog(this, "Ban phai nhap password");
        }
        if(password.equals("admin") && username.equals("admin")){
            JOptionPane.showMessageDialog(this, "Dang nhap thanh cong");
        }else{
            JOptionPane.showMessageDialog(this, "User or Pass ko dung");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test_ontapcuoi;

import java.awt.SystemTray;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    ArrayList<Student> lst = new ArrayList<>();
    DefaultTableModel model;
    int index = 0;

    public View() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        lst.add(new Student("1", "Nguyễn Thu Trang", "Nữ", 10));
        lst.add(new Student("2", "Nguyễn Thu Trang A", "Nữ", 9));
        lst.add(new Student("3", "Nguyễn Thu Trang B", "Nam", 1));
        lst.add(new Student("4", "Nguyễn Thu Trang C", "Nữ", 4));
        model = (DefaultTableModel) tbl.getModel();
        fillTable();
        index = 1;
        showDetail();
        dongHo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtDiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btnThem1 = new javax.swing.JButton();
        btnGhi1 = new javax.swing.JButton();
        Gio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Phut = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Giay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("QUẢN LÍ SINH VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã sinh viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Họ Tên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Giới tính");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");
        rdoNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNuActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Điểm TB");

        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnGhi.setText("GHI");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ Tên", "Giơi Tính", "Điểm", "Kết Quả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.setRowHeight(28);
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        btnThem1.setText("SỬA");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });

        btnGhi1.setText("OPEN");
        btnGhi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhi1ActionPerformed(evt);
            }
        });

        Gio.setText("0");

        jLabel7.setText(":");

        Phut.setText("0");

        jLabel9.setText(":");

        Giay.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75)
                        .addComponent(Gio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Phut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Giay))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnGhi1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(58, 58, 58)
                                            .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Gio)
                    .addComponent(jLabel7)
                    .addComponent(Phut)
                    .addComponent(jLabel9)
                    .addComponent(Giay))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem)
                    .addComponent(btnThem1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGhi)
                    .addComponent(btnGhi1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnXoa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNuActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        index = tbl.getSelectedRow();
        showDetail();
        tbl.setRowSelectionAllowed(true);

    }//GEN-LAST:event_tblMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        txtMa.setText("");
        txtTen.setText("");
        txtDiem.setText("");
        tbl.setRowSelectionAllowed(false);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        // TODO add your handling code here:
        double diem = 0;
        try {
            if (txtMa.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mã không được để trống");
                return;

            }
            if (txtTen.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Tên không được để trống");
                return;

            }
            if (txtDiem.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Điểm không được để trống");
                return;

            }
            try {
                diem = Double.parseDouble(txtDiem.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Điểm phải là số");
                return;
            }
            if (diem < 0 || diem > 10) {
                JOptionPane.showMessageDialog(this, "Khoảng điểm hơp lệ tư 0 - 10 ");
                return;
            }
            if (txtMa.getText().equals(lst.get(index).getId())) {
                JOptionPane.showMessageDialog(this, "Mã không đựoc trùng");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi validate dữ liệu");
            return;
        }

        Student x = new Student();
        x.setId(txtMa.getText());
        x.setName(txtTen.getText());
        x.setMarkAvg(Double.parseDouble(txtDiem.getText()));
        x.setGender(rdoNam.isSelected() ? "Nam" : "Nữ");
        lst.add(x);
        model.addRow(new Object[]{x.getId(), x.getName(), x.getGender(), x.getMarkAvg(), x.getStatus(x.getMarkAvg())});
        index = lst.size() - 1;
        showDetail();
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("o.txt"));
            o.writeObject(lst);
            JOptionPane.showMessageDialog(this, "Ghi filr thành công! ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi Ghi file! ");

        }

    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        index = tbl.getSelectedRow();
        if (lst.size() == 0) {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu để xóa");
            return;

        }
        int chon = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa không ?");
        if (chon == JOptionPane.NO_OPTION) {
            return;
        }
        lst.remove(index);
        model.removeRow(index);
        if (lst.size() == 0) {
            btnThemActionPerformed(evt);
        } else {
            if (index > lst.size() - 1) {
                index--;
            }
            showDetail();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        // TODO add your handling code here:
        double diem = 0;
        try {
            if (txtMa.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mã không được để trống");
                return;

            }
            if (txtTen.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Tên không được để trống");
                return;

            }
            if (txtDiem.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Điểm không được để trống");
                return;

            }
            try {
                diem = Double.parseDouble(txtDiem.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Điểm phải là số");
                return;
            }
            if (diem < 0 || diem > 10) {
                JOptionPane.showMessageDialog(this, "Khoảng điểm hơp lệ tư 0 - 10 ");
                return;
            }
//            if (txtMa.getText().equals(lst.get(index).getId())) {
//                JOptionPane.showMessageDialog(this, "Mã không đựoc trùng");
//                return;
//            }
        } catch (Exception e) {
        }

        Student x = new Student();
        x.setId(txtMa.getText());
        x.setName(txtTen.getText());
        x.setMarkAvg(Double.parseDouble(txtDiem.getText()));
        x.setGender(rdoNam.isSelected() ? "Nam" : "Nữ");
        lst.set(index, x);
        model.addRow(new Object[]{x.getId(), x.getName(), x.getGender(), x.getMarkAvg(), x.getStatus(x.getMarkAvg())});
        model.setValueAt(x.getId(), index, 0);
        model.setValueAt(x.getName(), index, 1);
        model.setValueAt(x.getGender(), index, 2);
        model.setValueAt(x.getMarkAvg(), index, 3);
        model.setValueAt(x.getStatus(x.getMarkAvg()), index, 4);
        JOptionPane.showMessageDialog(this, "Sửa thành công");

    }//GEN-LAST:event_btnThem1ActionPerformed

    private void btnGhi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhi1ActionPerformed
        // TODO add your handling code here:
        try {
            ObjectInputStream i = new ObjectInputStream(new FileInputStream("o.txt"));
            lst = (ArrayList<Student>) i.readObject();
            if (lst.size() == 0) {
                btnThemActionPerformed(evt);
            } else {
                fillTable();
                index = 0;
                showDetail();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi Đọc file! ");

        }
    }//GEN-LAST:event_btnGhi1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Giay;
    private javax.swing.JLabel Gio;
    private javax.swing.JLabel Phut;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnGhi1;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        model.setRowCount(0);
        for (Student x : lst) {
            model.addRow(new Object[]{x.getId(), x.getName(), x.getGender(), x.getMarkAvg(), x.getStatus(x.getMarkAvg())});
        }
    }

    private void showDetail() {
        Student x = lst.get(index);
        txtMa.setText(x.getId());
        txtTen.setText(x.getName());
        txtDiem.setText(x.getMarkAvg() + "");
        if (x.getGender().equals("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        tbl.setRowSelectionInterval(index, index);
    }

    private void dongHo() {
        Thread t = new Thread() {
            int gio = 0, p = 0, s = 0;

            @Override
            public void run() {
                while (true) {
                    s++;
                    if (s == 60) {
                        p++;
                        s = 0;
                    }
                    if (p == 60) {
                        gio++;
                    }
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Gio.setText(gio + "");
                    Phut.setText(p + "");
                    Giay.setText(s + "");
                }
            }

        };
        t.start();
    }
}
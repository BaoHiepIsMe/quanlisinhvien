/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author hiep1
 */
public class MainForm extends javax.swing.JFrame {
private StudentMangagementPanel mStudentPanel;
private GPAManagementPanel mGPAPanel;
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(  getExtendedState() | JFrame.MAXIMIZED_BOTH);
        
        
        LoginDialog dn = new LoginDialog(this,true);
        dn.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        dangxuat = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        quanlisinhvien = new javax.swing.JButton();
        quanlidiem = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        gioithieu = new javax.swing.JButton();
        hienthi = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menudangxuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuthoat = new javax.swing.JMenuItem();
        quanli = new javax.swing.JMenu();
        menuquanlisinhvien = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuquanlidiem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menunoidung = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menugioithieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        dangxuat.setBackground(new java.awt.Color(242, 242, 242));
        dangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Log-Out-icon.png"))); // NOI18N
        dangxuat.setText("????ng xu???t");
        dangxuat.setFocusable(false);
        dangxuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dangxuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangxuatActionPerformed(evt);
            }
        });
        jToolBar1.add(dangxuat);
        jToolBar1.add(jSeparator2);

        quanlisinhvien.setBackground(new java.awt.Color(242, 242, 242));
        quanlisinhvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/33.png"))); // NOI18N
        quanlisinhvien.setText("Qu???n l?? sinh vi??n");
        quanlisinhvien.setFocusable(false);
        quanlisinhvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quanlisinhvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(quanlisinhvien);

        quanlidiem.setBackground(new java.awt.Color(242, 242, 242));
        quanlidiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/keyring-icon.png"))); // NOI18N
        quanlidiem.setText("Qu???n l?? ??i???m");
        quanlidiem.setFocusable(false);
        quanlidiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quanlidiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(quanlidiem);
        jToolBar1.add(jSeparator5);

        gioithieu.setBackground(new java.awt.Color(242, 242, 242));
        gioithieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Help-icon.png"))); // NOI18N
        gioithieu.setText("Gi???i thi???u");
        gioithieu.setFocusable(false);
        gioithieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gioithieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gioithieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gioithieuActionPerformed(evt);
            }
        });
        jToolBar1.add(gioithieu);

        jMenu1.setText("H??? th???ng");

        menudangxuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menudangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-log-out-30.png"))); // NOI18N
        menudangxuat.setText("????ng xu???t");
        menudangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menudangxuatActionPerformed(evt);
            }
        });
        jMenu1.add(menudangxuat);
        jMenu1.add(jSeparator1);

        menuthoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-close-window-30.png"))); // NOI18N
        menuthoat.setText("Tho??t");
        menuthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuthoatActionPerformed(evt);
            }
        });
        jMenu1.add(menuthoat);

        jMenuBar1.add(jMenu1);

        quanli.setText("Qu???n l??");

        menuquanlisinhvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuquanlisinhvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-man-student-30.png"))); // NOI18N
        menuquanlisinhvien.setText("Qu???n l?? sinh vi??n");
        menuquanlisinhvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuquanlisinhvienActionPerformed(evt);
            }
        });
        quanli.add(menuquanlisinhvien);
        quanli.add(jSeparator3);

        menuquanlidiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuquanlidiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-sidebar-menu-30.png"))); // NOI18N
        menuquanlidiem.setText("Qu???n l?? ??i???m");
        menuquanlidiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuquanlidiemActionPerformed(evt);
            }
        });
        quanli.add(menuquanlidiem);

        jMenuBar1.add(quanli);

        jMenu3.setText("H??? th???ng");

        menunoidung.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menunoidung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Chat-icon.png"))); // NOI18N
        menunoidung.setText("N???i dung");
        jMenu3.add(menunoidung);
        jMenu3.add(jSeparator4);

        menugioithieu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menugioithieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Help-icon.png"))); // NOI18N
        menugioithieu.setText("Gi???i thi???u");
        menugioithieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menugioithieuActionPerformed(evt);
            }
        });
        jMenu3.add(menugioithieu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hienthi)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hienthi, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuthoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuthoatActionPerformed

    private void menudangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menudangxuatActionPerformed
        dangxuatActionPerformed(evt);
    }//GEN-LAST:event_menudangxuatActionPerformed

    private void menuquanlisinhvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuquanlisinhvienActionPerformed
      if(mStudentPanel == null){
        mStudentPanel = new StudentMangagementPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/icons8-man-student-16.png"));
        hienthi.addTab("Qu???n l?? sinh vi??n", icon, mStudentPanel,"Qu???n l?? sinh vi??n");   
    }
      hienthi.setSelectedComponent(mStudentPanel);
                
    }//GEN-LAST:event_menuquanlisinhvienActionPerformed

    private void menuquanlidiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuquanlidiemActionPerformed
        if(mGPAPanel == null){
            mGPAPanel = new GPAManagementPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Icons/icons8-sidebar-menu-16.png"));
            hienthi.addTab("Qu???n l?? ??i???m",icon, mGPAPanel,"Qu???n l?? ??i???m");
        }
        hienthi.setSelectedComponent(mGPAPanel);
    }//GEN-LAST:event_menuquanlidiemActionPerformed

    private void gioithieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gioithieuActionPerformed
        // TODO add your handling code here:
       GioiThieu gt = new GioiThieu(this, true);
       gt.setVisible(true);
    }//GEN-LAST:event_gioithieuActionPerformed

    private void menugioithieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menugioithieuActionPerformed
        // TODO add your handling code here:
        gioithieuActionPerformed(evt);
    }//GEN-LAST:event_menugioithieuActionPerformed

    private void dangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangxuatActionPerformed
       LoginDialog dx = new LoginDialog(this,true);
       dx.setVisible(true);
        
    }//GEN-LAST:event_dangxuatActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dangxuat;
    private javax.swing.JButton gioithieu;
    private javax.swing.JTabbedPane hienthi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menudangxuat;
    private javax.swing.JMenuItem menugioithieu;
    private javax.swing.JMenuItem menunoidung;
    private javax.swing.JMenuItem menuquanlidiem;
    private javax.swing.JMenuItem menuquanlisinhvien;
    private javax.swing.JMenuItem menuthoat;
    private javax.swing.JMenu quanli;
    private javax.swing.JButton quanlidiem;
    private javax.swing.JButton quanlisinhvien;
    // End of variables declaration//GEN-END:variables
}

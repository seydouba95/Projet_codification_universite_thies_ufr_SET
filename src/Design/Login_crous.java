/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import BaseDonnees.BDD;
import BaseDonnees.Parametre;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author seydou
 */
public class Login_crous extends javax.swing.JFrame {

   ResultSet rs;
    BDD db;
    String username2;
    String password2;
    String type;

    public Login_crous() {
        
          db = new BDD(new Parametre().url, new Parametre().username_bdd, new Parametre().password_bdd,
                new Parametre().host_bdd, new Parametre().port);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_username_crous = new javax.swing.JTextField();
        txt_password_crous = new javax.swing.JPasswordField();
        CheckBox = new javax.swing.JCheckBox();
        login_crous = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outils/icons8-go-back-30.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 1, 1)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, 50));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GESTION SYSTEME HEBERGEMENT");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1050, -1));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CROUS LOGIN PANEL");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 440, 60));

        txt_username_crous.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        txt_username_crous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_username_crousActionPerformed(evt);
            }
        });
        jPanel3.add(txt_username_crous, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 200, 30));

        txt_password_crous.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jPanel3.add(txt_password_crous, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 200, 30));

        CheckBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });
        jPanel3.add(CheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 20, 30));

        login_crous.setBackground(new java.awt.Color(255, 102, 0));
        login_crous.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        login_crous.setForeground(new java.awt.Color(51, 0, 51));
        login_crous.setText("Login");
        login_crous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_crousActionPerformed(evt);
            }
        });
        jPanel3.add(login_crous, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 140, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outils/icons8-enter-30.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 30, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outils/user1.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 30, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outils/lock.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 30, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 440, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outils/login.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_username_crousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_username_crousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_username_crousActionPerformed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        if (CheckBox.isSelected()) {
            txt_password_crous.setEchoChar((char) 0);

        }
        else{
            txt_password_crous.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void login_crousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_crousActionPerformed
               rs = db.querySelectAll("user", "Login='" + txt_username_crous.getText()
                + "' and Password='" + txt_password_crous.getText() + "'");

        try {

            while (rs.next()) {

                username2 = rs.getString("Login");
                password2 = rs.getString("Password");
                type = rs.getString("type");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_crous.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (username2 == null && password2 == null) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner le login et le mot de passe corrects");
        } else {
            if (type.equals("crous")) {
                Accueil_crous d = new Accueil_crous();
                d.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Vous faites pas parti du Crous !!");
            }

        }
    }//GEN-LAST:event_login_crousActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Accueil m = new Accueil();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login_crous.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_crous.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_crous.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_crous.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_crous().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login_crous;
    private javax.swing.JPasswordField txt_password_crous;
    private javax.swing.JTextField txt_username_crous;
    // End of variables declaration//GEN-END:variables
}

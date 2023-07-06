/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Vista;

import com.mycompany.Controlador.Connect;
import com.mycompany.Controlador.Users;
import com.mycompany.musictraining.User;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class ChangePassword extends javax.swing.JFrame {
    int Option;
    public Connect connect;
    public Connection link;
    public ChangePassword() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Change password");
    }
    public ChangePassword(int op) {
        initComponents();
        Option=op;
        this.setLocationRelativeTo(null);
        this.setTitle("Change password");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Mail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        User = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        ChPass = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ConfPass = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dylan\\OneDrive\\Documentos\\NetBeansProjects\\MusicTraining\\src\\test\\Images\\Logo.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 160, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dylan\\OneDrive\\Documentos\\NetBeansProjects\\MusicTraining\\src\\test\\Images\\Music.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\dylan\\OneDrive\\Documentos\\NetBeansProjects\\MusicTraining\\src\\test\\Images\\Training.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 200, 40));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cambia tu contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 210, 50));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirme contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 250, 30));

        Mail.setBackground(new java.awt.Color(0, 0, 0));
        Mail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Mail.setForeground(new java.awt.Color(255, 255, 255));
        Mail.setBorder(null);
        jPanel1.add(Mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 210, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese su correo electronico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 280, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 210, 10));

        User.setBackground(new java.awt.Color(0, 0, 0));
        User.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setBorder(null);
        User.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 210, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 210, 10));

        ChPass.setBackground(new java.awt.Color(0, 0, 0));
        ChPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ChPass.setForeground(new java.awt.Color(255, 255, 255));
        ChPass.setText("Cambiar");
        ChPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChPassActionPerformed(evt);
            }
        });
        jPanel1.add(ChPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 130, 50));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingrese su usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 180, 30));

        ConfPass.setBackground(new java.awt.Color(0, 0, 0));
        ConfPass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ConfPass.setForeground(new java.awt.Color(255, 255, 255));
        ConfPass.setBorder(null);
        jPanel1.add(ConfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 210, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 210, 10));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingrese nueva contraseña");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 250, 30));

        Pass.setBackground(new java.awt.Color(0, 0, 0));
        Pass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        Pass.setBorder(null);
        jPanel1.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 210, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 210, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChPassActionPerformed
        User user=new User();
        Users users=new Users();
        connect=new Connect();
        link=connect.ConnectToDB();
        user=users.SearchUser(link, User.getText(), Mail.getText());
        if(user!=null){
            user.setPassword(Pass.getText());
            boolean update=users.Update(user);
            if(update){
                if(Pass.getText().equals(ConfPass.getText())){
                    JOptionPane.showMessageDialog(null, "Cuenta Actualizada Correctamente");
                    if(Option!=1){
                        Login login=new Login();
                        login.setVisible(true);
                    }
                    connect.CloseConection();
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error: Contraseñas No Coinciden");
                    connect.CloseConection();
                    Pass.setText("");
                    ConfPass.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Error: Usuario o Correo Son Incorrectos");
                connect.CloseConection();
                User.setText("");
                Pass.setText("");
                ConfPass.setText("");
                Mail.setText("");                
            }
        }
        else{
           JOptionPane.showMessageDialog(null, "Error: Usuario no encontrado");
           connect.CloseConection();
           User.setText("");
           Pass.setText("");
           ConfPass.setText("");
           Mail.setText("");            
        }
    }//GEN-LAST:event_ChPassActionPerformed
    
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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChPass;
    private javax.swing.JPasswordField ConfPass;
    private javax.swing.JTextField Mail;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Vista;

import com.mycompany.Controlador.Connect;
import com.mycompany.Controlador.Users;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class Login extends javax.swing.JFrame {
    
    public Connection link;
    public Connect connect;
    
    public Login() {
        initComponents();
        Users user=new Users();
        connect=new Connect();
        link=connect.ConnectToDB();
        user.Read(link);
        connect.CloseConection();
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
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
        jLabel3 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SignUp = new javax.swing.JButton();
        ChangePass = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de usuario");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 200, 200, 30);

        User.setBackground(new java.awt.Color(0, 0, 0));
        User.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setBorder(null);
        User.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        User.setName(""); // NOI18N
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        jPanel1.add(User);
        User.setBounds(120, 230, 200, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 270, 110, 30);

        Pass.setBackground(new java.awt.Color(0, 0, 0));
        Pass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        Pass.setBorder(null);
        Pass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });
        jPanel1.add(Pass);
        Pass.setBounds(120, 300, 200, 20);

        jSeparator1.setEnabled(false);
        jSeparator1.setRequestFocusEnabled(false);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(140, 440, 160, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(120, 250, 200, 10);

        btnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(160, 340, 120, 50);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dylan\\OneDrive\\Documentos\\NetBeansProjects\\MusicTraining\\src\\main\\java\\images\\Logo.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 10, 200, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dylan\\OneDrive\\Documentos\\NetBeansProjects\\MusicTraining\\src\\test\\Images\\MusicTraining.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 150, 360, 40);

        SignUp.setBackground(new java.awt.Color(0, 0, 0));
        SignUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setText("Registrate!");
        SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        jPanel1.add(SignUp);
        SignUp.setBounds(140, 470, 160, 50);

        ChangePass.setBackground(new java.awt.Color(0, 0, 0));
        ChangePass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChangePass.setForeground(new java.awt.Color(255, 255, 255));
        ChangePass.setText("Olvide mi contraseña");
        ChangePass.setBorder(null);
        ChangePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassActionPerformed(evt);
            }
        });
        jPanel1.add(ChangePass);
        ChangePass.setBounds(100, 410, 240, 30);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(120, 320, 200, 10);

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

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        SignUp signUp=new SignUp();
        signUp.setVisible(true);
    }//GEN-LAST:event_SignUpActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        connect=new Connect();
        link=connect.ConnectToDB();
        Users user=new Users();
        int id=user.SingIn(link, User.getText(), Pass.getText());
        if(id!=-1){
            App app=new App(User.getText(),id);
            connect.CloseConection();
            app.setVisible(true); 
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Error: Usuario o Contraseña Incorrecto");
            connect.CloseConection();
            User.setText("");
            Pass.setText("");
        }
        
        //Sistema();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void ChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassActionPerformed
        ChangePassword CP=new ChangePassword();
        CP.setVisible(true);
    }//GEN-LAST:event_ChangePassActionPerformed

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangePass;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JButton SignUp;
    private javax.swing.JTextField User;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPrincipal;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author pablo
 */
public class Login extends javax.swing.JFrame {

    private VistaPrincipal vistaPrincipal;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.vistaPrincipal = new VistaPrincipal();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuarioLogin = new javax.swing.JTextField();
        jButton1entrarLogin = new javax.swing.JButton();
        jPasswordField1contraseñaLogin = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton1salirLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 0));
        setMinimumSize(new java.awt.Dimension(571, 240));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 50, 90, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 100, 120, 26);
        getContentPane().add(usuarioLogin);
        usuarioLogin.setBounds(280, 50, 170, 30);

        jButton1entrarLogin.setBackground(new java.awt.Color(0, 0, 0));
        jButton1entrarLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1entrarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButton1entrarLogin.setText("Entrar");
        jButton1entrarLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1entrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1entrarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1entrarLogin);
        jButton1entrarLogin.setBounds(300, 160, 125, 30);
        getContentPane().add(jPasswordField1contraseñaLogin);
        jPasswordField1contraseñaLogin.setBounds(280, 100, 170, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario copia.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 50, 110, 90);

        jButton1salirLogin.setBackground(new java.awt.Color(0, 0, 0));
        jButton1salirLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1salirLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButton1salirLogin.setText("Salir");
        jButton1salirLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1salirLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1salirLogin);
        jButton1salirLogin.setBounds(150, 160, 70, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo login con foto.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 570, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1entrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1entrarLoginActionPerformed
        String usuario = "valentino";
        String contraseña = "calas";

        String usuario1 = "graciela";
        String contraseña1 = "ducatto";

        String nombrePropietario = "pablo";
        String contraseñaPropietario = "peruchi";

        if (usuarioLogin.getText().equals(usuario) && jPasswordField1contraseñaLogin.getText().equals(contraseña)) {

            this.vistaPrincipal.setVisible(true);
            this.vistaPrincipal.getjButton2Propietario().setEnabled(false);

        } else if (usuarioLogin.getText().equals(usuario1) && jPasswordField1contraseñaLogin.getText().equals(contraseña1)) {

            this.vistaPrincipal.setVisible(true);
            this.vistaPrincipal.getjButton2Propietario().setEnabled(false);

        } else if (usuarioLogin.getText().equals(nombrePropietario) && jPasswordField1contraseñaLogin.getText().equals(contraseñaPropietario)) {

            this.vistaPrincipal.setVisible(true);
            this.vistaPrincipal.getjButton2Propietario().setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "usuario o contraseña incorrecta");
        }
    }//GEN-LAST:event_jButton1entrarLoginActionPerformed

    private void jButton1salirLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1salirLoginActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1salirLoginActionPerformed

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

    public JTextField getUsuarioLogin() {
        return usuarioLogin;
    }

    public JPasswordField getjPasswordField1contraseñaLogin() {
        return jPasswordField1contraseñaLogin;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1entrarLogin;
    private javax.swing.JButton jButton1salirLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1contraseñaLogin;
    private javax.swing.JTextField usuarioLogin;
    // End of variables declaration//GEN-END:variables
}

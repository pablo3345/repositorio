/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author pablo
 */
public class Login extends javax.swing.JFrame {
    
    private vistaPrincipal visPrincipal;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(this);
        this.visPrincipal = new vistaPrincipal();
    }

    public JTextField getjTextField1usuarioLogin() {
        return jTextField1usuarioLogin;
    }

    public JPasswordField getjPasswordField1contraseñaLogin() {
        return jPasswordField1contraseñaLogin;
    }

    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1usuarioLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1entrarLogin = new javax.swing.JButton();
        jPasswordField1contraseñaLogin = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1salirLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 200));
        setPreferredSize(new java.awt.Dimension(601, 230));
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1usuarioLogin);
        jTextField1usuarioLogin.setBounds(230, 22, 200, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 30, 80, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 60, 110, 40);

        jButton1entrarLogin.setBackground(new java.awt.Color(0, 0, 0));
        jButton1entrarLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1entrarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButton1entrarLogin.setText("Entrar");
        jButton1entrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1entrarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1entrarLogin);
        jButton1entrarLogin.setBounds(270, 130, 142, 40);
        getContentPane().add(jPasswordField1contraseñaLogin);
        jPasswordField1contraseñaLogin.setBounds(230, 70, 200, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 10, 130, 110);

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
        jButton1salirLogin.setBounds(140, 130, 69, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo login jpg.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 610, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1entrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1entrarLoginActionPerformed
      String usuario = "graciela";
      String contraseña = "ducatto";
      
      String propietario = "pablo";
      String contraseñaPropietario = "peruchi";
      
      if (getjTextField1usuarioLogin().getText().equals(usuario) && getjPasswordField1contraseñaLogin().getText().equals(contraseña)){
      this.visPrincipal.setVisible(true);
      this.visPrincipal. getjButton1propietarioPrincipal().setEnabled(false);
      
      
      }
      
      else if(getjTextField1usuarioLogin().getText().equals(propietario) && getjPasswordField1contraseñaLogin().getText().equals(contraseñaPropietario)){
      this.visPrincipal.setVisible(true);
      
      }
      else
      {JOptionPane.showMessageDialog(null, "usuario o contraseña incorrecta");}
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1entrarLogin;
    private javax.swing.JButton jButton1salirLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1contraseñaLogin;
    private javax.swing.JTextField jTextField1usuarioLogin;
    // End of variables declaration//GEN-END:variables
}

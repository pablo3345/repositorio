/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import presentador.Presentador;

/**
 *
 * @author pablo
 */
public class MesaVistas extends javax.swing.JFrame {
    
    private Presentador presentador;

    /**
     * Creates new form MesaVistas
     */
    public MesaVistas() {
        initComponents();
        setLocationRelativeTo(this);
        this.presentador = new Presentador(this);
       // this.jRadioButton1disponible.setSelected(true);
        
      
                
    }

    public JTextField getjTextField1numeroMesa() {
        return jTextField1;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JRadioButton getjRadioButton1disponible() {
        return jRadioButton1disponible;
    }

    public JRadioButton getjRadioButton2ocupado() {
        return jRadioButton2ocupado;
    }

    public JTable getjTable1tablaMesa_mesa() {
        return jTable1tablaMesa_mesa;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1disponible = new javax.swing.JRadioButton();
        jRadioButton2ocupado = new javax.swing.JRadioButton();
        jButton1guardarMesa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1salirMesa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1tablaMesa_mesa = new javax.swing.JTable();
        jButton1mostrarMesas_mesas = new javax.swing.JButton();
        jButton1mesasDisponibles = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(780, 570));
        setPreferredSize(new java.awt.Dimension(780, 530));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 100, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 50, 80, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(330, 50, 220, 30);

        jRadioButton1disponible.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1disponible);
        jRadioButton1disponible.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1disponible.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1disponible.setText("DISPONIBLE");
        getContentPane().add(jRadioButton1disponible);
        jRadioButton1disponible.setBounds(330, 100, 110, 25);

        jRadioButton2ocupado.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2ocupado);
        jRadioButton2ocupado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2ocupado.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2ocupado.setText("OCUPADA");
        getContentPane().add(jRadioButton2ocupado);
        jRadioButton2ocupado.setBounds(470, 100, 93, 25);

        jButton1guardarMesa.setBackground(new java.awt.Color(0, 0, 0));
        jButton1guardarMesa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1guardarMesa.setForeground(new java.awt.Color(255, 255, 255));
        jButton1guardarMesa.setText("Guardar");
        jButton1guardarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1guardarMesaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1guardarMesa);
        jButton1guardarMesa.setBounds(620, 40, 130, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MESA.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 30, 140, 110);

        jButton1salirMesa.setBackground(new java.awt.Color(0, 0, 0));
        jButton1salirMesa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1salirMesa.setForeground(new java.awt.Color(255, 255, 255));
        jButton1salirMesa.setText("Salir");
        jButton1salirMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1salirMesaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1salirMesa);
        jButton1salirMesa.setBounds(650, 100, 70, 40);

        jTable1tablaMesa_mesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Numero", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1tablaMesa_mesa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 200, 440, 240);

        jButton1mostrarMesas_mesas.setBackground(new java.awt.Color(0, 0, 0));
        jButton1mostrarMesas_mesas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1mostrarMesas_mesas.setForeground(new java.awt.Color(255, 255, 255));
        jButton1mostrarMesas_mesas.setText("Mesas Disponibles");
        jButton1mostrarMesas_mesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1mostrarMesas_mesasActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1mostrarMesas_mesas);
        jButton1mostrarMesas_mesas.setBounds(180, 470, 170, 40);

        jButton1mesasDisponibles.setBackground(new java.awt.Color(0, 0, 0));
        jButton1mesasDisponibles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1mesasDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        jButton1mesasDisponibles.setText("Mesas Ocupadas");
        jButton1mesasDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1mesasDisponiblesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1mesasDisponibles);
        jButton1mesasDisponibles.setBounds(470, 470, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo negro.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1salirMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1salirMesaActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1salirMesaActionPerformed

    private void jButton1guardarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1guardarMesaActionPerformed
      this.presentador.guardarMesaApretado();
    }//GEN-LAST:event_jButton1guardarMesaActionPerformed

    private void jButton1mostrarMesas_mesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1mostrarMesas_mesasActionPerformed
       this.presentador.mesasDisponiblesApretado();
    }//GEN-LAST:event_jButton1mostrarMesas_mesasActionPerformed

    private void jButton1mesasDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1mesasDisponiblesActionPerformed
        this.presentador.mesasOcupadaspretado();
    }//GEN-LAST:event_jButton1mesasDisponiblesActionPerformed

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
            java.util.logging.Logger.getLogger(MesaVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesaVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesaVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesaVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MesaVistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1guardarMesa;
    private javax.swing.JButton jButton1mesasDisponibles;
    private javax.swing.JButton jButton1mostrarMesas_mesas;
    private javax.swing.JButton jButton1salirMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1disponible;
    private javax.swing.JRadioButton jRadioButton2ocupado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1tablaMesa_mesa;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

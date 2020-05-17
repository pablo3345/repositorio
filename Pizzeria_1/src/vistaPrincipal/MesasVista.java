/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPrincipal;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import presentador.Presentador;

/**
 *
 * @author pablo
 */
public class MesasVista extends javax.swing.JFrame {
    private Presentador presentador;

    /**
     * Creates new form Mesas
     */
    public MesasVista() {
        initComponents();
        setLocationRelativeTo(this);
        this.presentador = new Presentador(this);
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
        jTextField1numero_mesa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1disponible = new javax.swing.JRadioButton();
        jRadioButton2ocupada = new javax.swing.JRadioButton();
        jButton1salir = new javax.swing.JButton();
        jButton2guardarMesa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1mesa_mesa = new javax.swing.JTable();
        jButton1mostrarTabla_tabla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1007, 610));
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1numero_mesa);
        jTextField1numero_mesa.setBounds(450, 40, 210, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 100, 60, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 40, 80, 30);

        jRadioButton1disponible.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1disponible);
        jRadioButton1disponible.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jRadioButton1disponible.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1disponible.setText("Disponible");
        getContentPane().add(jRadioButton1disponible);
        jRadioButton1disponible.setBounds(450, 100, 100, 25);

        buttonGroup1.add(jRadioButton2ocupada);
        jRadioButton2ocupada.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jRadioButton2ocupada.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2ocupada.setText("Ocupada");
        getContentPane().add(jRadioButton2ocupada);
        jRadioButton2ocupada.setBounds(570, 100, 90, 25);

        jButton1salir.setBackground(new java.awt.Color(0, 0, 0));
        jButton1salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton1salir.setText("Salir");
        jButton1salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1salirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1salir);
        jButton1salir.setBounds(870, 470, 80, 40);

        jButton2guardarMesa.setBackground(new java.awt.Color(0, 0, 0));
        jButton2guardarMesa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2guardarMesa.setForeground(new java.awt.Color(255, 255, 255));
        jButton2guardarMesa.setText("Guardar");
        jButton2guardarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2guardarMesaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2guardarMesa);
        jButton2guardarMesa.setBounds(750, 70, 130, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MESA.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 20, 130, 110);

        jTable1mesa_mesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "numero", "estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1mesa_mesa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 220, 460, 290);

        jButton1mostrarTabla_tabla.setBackground(new java.awt.Color(0, 0, 0));
        jButton1mostrarTabla_tabla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1mostrarTabla_tabla.setForeground(new java.awt.Color(255, 255, 255));
        jButton1mostrarTabla_tabla.setText("Mostrar Tabla");
        jButton1mostrarTabla_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1mostrarTabla_tablaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1mostrarTabla_tabla);
        jButton1mostrarTabla_tabla.setBounds(833, 363, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo rojo pizzeria2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 1100, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1salirActionPerformed
     dispose();
    }//GEN-LAST:event_jButton1salirActionPerformed

    private void jButton2guardarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2guardarMesaActionPerformed
      this.presentador.guardarMesaApretado();
    }//GEN-LAST:event_jButton2guardarMesaActionPerformed

    private void jButton1mostrarTabla_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1mostrarTabla_tablaActionPerformed
       this.presentador.mostrarTablaMesaApretado();
    }//GEN-LAST:event_jButton1mostrarTabla_tablaActionPerformed

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
            java.util.logging.Logger.getLogger(MesasVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesasVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesasVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesasVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MesasVista().setVisible(true);
            }
        });
    }

    public JTextField getjTextField1numero_mesa() {
        return jTextField1numero_mesa;
    }

    public JRadioButton getjRadioButton1disponible() {
        return jRadioButton1disponible;
    }

    public JRadioButton getjRadioButton2ocupada() {
        return jRadioButton2ocupada;
    }

    public JTable getjTable1mesa_mesa() {
        return jTable1mesa_mesa;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1mostrarTabla_tabla;
    private javax.swing.JButton jButton1salir;
    private javax.swing.JButton jButton2guardarMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1disponible;
    private javax.swing.JRadioButton jRadioButton2ocupada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1mesa_mesa;
    private javax.swing.JTextField jTextField1numero_mesa;
    // End of variables declaration//GEN-END:variables
}

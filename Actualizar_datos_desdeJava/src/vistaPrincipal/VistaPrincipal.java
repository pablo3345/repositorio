/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPrincipal;

import com.mysql.jdbc.Connection;
import conexion.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import presentador.Presentador;
import repositorio.RepositorioBicicleta;
import java.sql.SQLException;

/**
 *
 * @author pablo
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private Presentador presentador;
    private Conexion conexion;
    private RepositorioBicicleta repositorioBicicleta;

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        this.presentador = new Presentador(this);
        setLocationRelativeTo(this);
//        this.llenarTabla();

    }

//     private void llenarTabla(){
//         try{
//         
//         DefaultTableModel modelo;
//         Conexion con = new Conexion();
//         Connection registros = (Connection) con.getConexion();
//         String[] nombre_atributos = {"idbicicleta", "tipo", "costo", "ganancia", "stockActual"};
//         String sql = ("SELECT * FROM bicicleta");
//         modelo = new DefaultTableModel(null, nombre_atributos);
//         Statement statement = (Statement) registros.createStatement();
//         ResultSet rs = statement.executeQuery(sql);
//         String[] filas = new String[5];
//         
//       while(rs.next()){
//       filas[0] = rs.getString("idbicicleta");
//       filas[1] = rs.getString("tipo");
//       filas[2] = rs.getString("costo");
//       filas[3] = rs.getString("ganancia");
//       filas[4] = rs.getString("stockActual");
//       modelo.addRow(filas);
//       
//       
//       }
//       
//       jTable1Tabla_Bicicleta.setModel(modelo);
//       registros.close();
//         }
//         catch(SQLException ex){
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//         
//         
//         
//         
//         }
//        
//       
//         
//        
//        
//        
//        }
    public JTextField getjTextField1MontoTotal() {
        return jTextField1MontoTotal;
    }

    public JTextField getjTextField2Proveedor() {
        return jTextField2Proveedor;
    }

    public JTextField getjTextField1Tipo() {
        return jTextField1Tipo;
    }

    public JTextField getjTextField2Costo() {
        return jTextField2Costo;
    }

    public JTextField getjTextField3Ganancia() {
        return jTextField3Ganancia;
    }

    public JTextField getjTextField4StockActual() {
        return jTextField4StockActual;
    }

    public JTextField getjTextField2PrecioUnitario_DC() {
        return jTextField2PrecioUnitario_DC;
    }

    public JTextField getjTextFieldCantidad_DC() {
        return jTextFieldCantidad_DC;
    }

    public JComboBox<Object> getjComboBox1Compra() {
        return jComboBox1Compra;
    }

    public JComboBox<Object> getjComboBox2Bicicleta() {
        return jComboBox2Bicicleta;
    }

    public JTable getjTable1Tabla_Bicicleta() {
        return jTable1Tabla_Bicicleta;
    }

    public JTextField getjTextField_id_bicicleta() {
        return jTextField_id_bicicleta;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1MontoTotal = new javax.swing.JTextField();
        jTextField2Proveedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1GuardarCompra = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1Tipo = new javax.swing.JTextField();
        jTextField2Costo = new javax.swing.JTextField();
        jTextField3Ganancia = new javax.swing.JTextField();
        jTextField4StockActual = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1GuardarBicicleta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Tabla_Bicicleta = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1Modificar = new javax.swing.JButton();
        jButton1Actualizar = new javax.swing.JButton();
        jTextField_id_bicicleta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldCantidad_DC = new javax.swing.JTextField();
        jTextField2PrecioUnitario_DC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1GuardarDetalleCompra = new javax.swing.JButton();
        jComboBox1Compra = new javax.swing.JComboBox<>();
        jComboBox2Bicicleta = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaPrincipal/gt_fury_3.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 798, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 495, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("PORTADA", jPanel4);

        jLabel1.setText("MONTO TOTAL:");

        jLabel2.setText("PROVEEDOR:");

        jButton1GuardarCompra.setText("Guardar");
        jButton1GuardarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GuardarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2Proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jTextField1MontoTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(390, Short.MAX_VALUE)
                .addComponent(jButton1GuardarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1MontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(120, 120, 120)
                .addComponent(jButton1GuardarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("COMPRA", jPanel1);

        jPanel2.setLayout(null);
        jPanel2.add(jTextField1Tipo);
        jTextField1Tipo.setBounds(210, 50, 283, 30);
        jPanel2.add(jTextField2Costo);
        jTextField2Costo.setBounds(210, 90, 283, 30);
        jPanel2.add(jTextField3Ganancia);
        jTextField3Ganancia.setBounds(210, 130, 283, 30);
        jPanel2.add(jTextField4StockActual);
        jTextField4StockActual.setBounds(210, 170, 283, 30);

        jLabel3.setText("TIPO:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(100, 60, 136, 14);

        jLabel4.setText("COSTO:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(100, 100, 153, 14);

        jLabel5.setText("GANANCIA:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(100, 140, 153, 14);

        jLabel6.setText("STOCK ACTUAL:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(100, 180, 144, 14);

        jButton1GuardarBicicleta.setText("Guardar");
        jButton1GuardarBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GuardarBicicletaActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1GuardarBicicleta);
        jButton1GuardarBicicleta.setBounds(570, 70, 140, 30);

        jTable1Tabla_Bicicleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "tipo", "costo", "ganancia", "stock actual"
            }
        ));
        jScrollPane1.setViewportView(jTable1Tabla_Bicicleta);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(140, 240, 650, 240);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(10, 210, 780, 10);

        jButton1Modificar.setText("Modificar");
        jButton1Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ModificarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1Modificar);
        jButton1Modificar.setBounds(10, 340, 120, 23);

        jButton1Actualizar.setText("Actualizar");
        jButton1Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1Actualizar);
        jButton1Actualizar.setBounds(10, 400, 120, 23);
        jPanel2.add(jTextField_id_bicicleta);
        jTextField_id_bicicleta.setBounds(210, 10, 280, 30);

        jLabel12.setText("ID:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(100, 20, 15, 14);

        jTabbedPane1.addTab("BICICLETA", jPanel2);

        jLabel7.setText("CANTIDAD:");

        jLabel8.setText("PRECIO UNITARIO:");

        jButton1GuardarDetalleCompra.setText("Guardar");
        jButton1GuardarDetalleCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GuardarDetalleCompraActionPerformed(evt);
            }
        });

        jLabel9.setText("COMPRA:");

        jLabel10.setText("BICICLETA:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addComponent(jButton1GuardarDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2Bicicleta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1Compra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2PrecioUnitario_DC, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(jTextFieldCantidad_DC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2Bicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCantidad_DC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2PrecioUnitario_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(54, 54, 54)
                .addComponent(jButton1GuardarDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jTabbedPane1.addTab("DETALLE COMPRA", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1GuardarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GuardarCompraActionPerformed
        this.presentador.guardarCompraApretado();
    }//GEN-LAST:event_jButton1GuardarCompraActionPerformed

    private void jButton1GuardarBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GuardarBicicletaActionPerformed
        this.presentador.guardarBicicletaApretado();
    }//GEN-LAST:event_jButton1GuardarBicicletaActionPerformed

    private void jButton1GuardarDetalleCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GuardarDetalleCompraActionPerformed
        this.presentador.guardarDetalleCompra_apretado();
    }//GEN-LAST:event_jButton1GuardarDetalleCompraActionPerformed

    private void jButton1ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ModificarActionPerformed
        int fila = this.jTable1Tabla_Bicicleta.getSelectedRow();
        if (fila != -1) {
            this.jTextField_id_bicicleta.setText(jTable1Tabla_Bicicleta.getValueAt(fila, 0).toString());
            this.jTextField1Tipo.setText(jTable1Tabla_Bicicleta.getValueAt(fila, 1).toString());
            this.jTextField2Costo.setText(jTable1Tabla_Bicicleta.getValueAt(fila, 2).toString());
            this.jTextField3Ganancia.setText(jTable1Tabla_Bicicleta.getValueAt(fila, 3).toString());
            this.jTextField4StockActual.setText(jTable1Tabla_Bicicleta.getValueAt(fila, 4).toString());
           
            //////
            this.jTextField_id_bicicleta.setEditable(false);

        } else {
            JOptionPane.showMessageDialog(null, "mensaje error");

        }
    }//GEN-LAST:event_jButton1ModificarActionPerformed

    private void jButton1ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActualizarActionPerformed

        Conexion conexionn = new Conexion();
        Connection con;
        con = (Connection) conexionn.getConexion();

        String sql = "UPDATE bicicleta SET tipo='" + this.jTextField1Tipo.getText() + "',"
                + "costo='" + this.jTextField2Costo.getText() + "',"
                + "ganancia='" + this.jTextField3Ganancia.getText() + "',"
                + "stockActual='" + this.jTextField4StockActual.getText()
                + "'WHERE idbicicleta='" + jTextField_id_bicicleta.getText() + "'";

        try {
            PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
            preparedStatement.executeUpdate();
            this.presentador.rellenarTable();
            JOptionPane.showMessageDialog(null, "los datos se actualizaron correctamente");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_jButton1ActualizarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Actualizar;
    private javax.swing.JButton jButton1GuardarBicicleta;
    private javax.swing.JButton jButton1GuardarCompra;
    private javax.swing.JButton jButton1GuardarDetalleCompra;
    private javax.swing.JButton jButton1Modificar;
    private javax.swing.JComboBox<Object> jComboBox1Compra;
    private javax.swing.JComboBox<Object> jComboBox2Bicicleta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1Tabla_Bicicleta;
    private javax.swing.JTextField jTextField1MontoTotal;
    private javax.swing.JTextField jTextField1Tipo;
    private javax.swing.JTextField jTextField2Costo;
    private javax.swing.JTextField jTextField2PrecioUnitario_DC;
    private javax.swing.JTextField jTextField2Proveedor;
    private javax.swing.JTextField jTextField3Ganancia;
    private javax.swing.JTextField jTextField4StockActual;
    private javax.swing.JTextField jTextFieldCantidad_DC;
    private javax.swing.JTextField jTextField_id_bicicleta;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import presentador.Presentador;

/**
 *
 * @author pablo
 */
public class VistaPrincipal extends javax.swing.JFrame {
    private Presentador presentador;
   

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
         this.presentador = new Presentador(this);
         setLocationRelativeTo(this);
       
        
    }

    public JTextField getjTextFieldDescripcion() {
        return jTextFieldDescripcion;
    }

    public JTextField getjTextFieldNombreArchivo() {
        return jTextFieldNombreArchivo;
    }

    

    public JTextField getjTextFieldTamaño() {
        return jTextFieldTamaño;
    }

    public JTextField getjTextFieldCantidadMaxima() {
        return jTextFieldCantidadMaxima;
    }

   

    public JTextField getjTextFieldNombre() {
        return jTextFieldNombre;
    }

    public JTextField getjTextField_Id_album() {
        return jTextField_Id_album;
    }

    public JComboBox<Object> getjComboBox1Album() {
        return jComboBox1Album;
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
        jPanel2 = new javax.swing.JPanel();
        jTextFieldCantidadMaxima = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonMostrarAlbum = new javax.swing.JButton();
        jButtonGuardarAlbum = new javax.swing.JButton();
        jComboBox1Album = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldNombreArchivo = new javax.swing.JTextField();
        jTextFieldTamaño = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonAgregarPersonasFoto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Id_album = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(750, 620));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(685, 300));

        jLabel6.setText("ALBUNES:");

        jLabel7.setText("CANTIDAD MAXIMA:");

        jButtonMostrarAlbum.setText("Mostrar Album");
        jButtonMostrarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAlbum(evt);
            }
        });

        jButtonGuardarAlbum.setText("Guardar Album");
        jButtonGuardarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarAlbum(evt);
            }
        });

        jLabel8.setText("NOMBRE: ");

        jButton2.setText("Mostrar Fotos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarFotos(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButtonGuardarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(jButtonMostrarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCantidadMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1Album, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1Album, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jTextFieldCantidadMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMostrarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("ALBUM", jPanel2);

        jPanel1.setLayout(null);
        jPanel1.add(jTextFieldNombreArchivo);
        jTextFieldNombreArchivo.setBounds(350, 140, 239, 30);
        jPanel1.add(jTextFieldTamaño);
        jTextFieldTamaño.setBounds(350, 220, 239, 30);
        jPanel1.add(jTextFieldDescripcion);
        jTextFieldDescripcion.setBounds(350, 290, 239, 30);

        jLabel3.setText("TAMAÑO:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 220, 59, 33);

        jLabel4.setText("DESCRIPCION:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 290, 90, 30);

        jButton1.setText("Guardar Foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarFoto(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 420, 174, 33);

        jButtonAgregarPersonasFoto.setText("Mostrar Informacion Guardada");
        jButtonAgregarPersonasFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarFotosGuardadas(evt);
            }
        });
        jPanel1.add(jButtonAgregarPersonasFoto);
        jButtonAgregarPersonasFoto.setBounds(390, 420, 192, 36);

        jLabel5.setText("ID Album:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 60, 70, 42);
        jPanel1.add(jTextField_Id_album);
        jTextField_Id_album.setBounds(350, 60, 240, 30);

        jLabel9.setText("NOMBRE ARCHIVO:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(170, 140, 121, 42);

        jTabbedPane1.addTab("FOTO", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarFoto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarFoto
      this.presentador.guardarFotoApretado();
    }//GEN-LAST:event_BotonGuardarFoto

    private void mostrarFotosGuardadas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarFotosGuardadas
      this.presentador.mostrarFotosApretado();
    }//GEN-LAST:event_mostrarFotosGuardadas

    private void guardarAlbum(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarAlbum
       this.presentador.guardarAlbumApretado();
    }//GEN-LAST:event_guardarAlbum

    private void mostrarAlbum(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarAlbum
      this.presentador.mostrarAlbumApretado();
    }//GEN-LAST:event_mostrarAlbum

    private void botonAgregarFotos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarFotos
       this.presentador.obtenerFotosPorAlbum();
    }//GEN-LAST:event_botonAgregarFotos

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAgregarPersonasFoto;
    private javax.swing.JButton jButtonGuardarAlbum;
    private javax.swing.JButton jButtonMostrarAlbum;
    private javax.swing.JComboBox<Object> jComboBox1Album;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldCantidadMaxima;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombreArchivo;
    private javax.swing.JTextField jTextFieldTamaño;
    private javax.swing.JTextField jTextField_Id_album;
    // End of variables declaration//GEN-END:variables

  
}

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

    public JComboBox<Object> getjComboBoxEliminarAlbum() {
        return jComboBoxEliminarAlbum;
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
        jLabel2 = new javax.swing.JLabel();
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
        jButtonCantidadTotalFotos = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonEliminar = new javax.swing.JButton();
        jComboBoxEliminarAlbum = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(750, 620));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(685, 300));

        jPanel2.setLayout(null);
        jPanel2.add(jTextFieldCantidadMaxima);
        jTextFieldCantidadMaxima.setBounds(250, 231, 232, 40);
        jPanel2.add(jTextFieldNombre);
        jTextFieldNombre.setBounds(250, 147, 232, 40);

        jLabel6.setText("ALBUNES:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 70, 90, 42);

        jLabel7.setText("CANTIDAD MAXIMA:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(111, 229, 121, 42);

        jButtonMostrarAlbum.setText("Mostrar Album");
        jButtonMostrarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAlbum(evt);
            }
        });
        jPanel2.add(jButtonMostrarAlbum);
        jButtonMostrarAlbum.setBounds(500, 377, 180, 40);

        jButtonGuardarAlbum.setText("Guardar Album");
        jButtonGuardarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarAlbum(evt);
            }
        });
        jPanel2.add(jButtonGuardarAlbum);
        jButtonGuardarAlbum.setBounds(110, 377, 190, 40);

        jPanel2.add(jComboBox1Album);
        jComboBox1Album.setBounds(143, 71, 366, 39);

        jLabel8.setText("NOMBRE: ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(111, 143, 60, 42);

        jButton2.setText("Mostrar Fotos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarFotos(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(537, 69, 143, 42);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fondo azul.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(4, 0, 710, 490);

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
        jButton1.setBounds(30, 420, 174, 40);

        jButtonAgregarPersonasFoto.setText("Mostrar Informacion Guardada");
        jButtonAgregarPersonasFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarFotosGuardadas(evt);
            }
        });
        jPanel1.add(jButtonAgregarPersonasFoto);
        jButtonAgregarPersonasFoto.setBounds(250, 420, 192, 40);

        jLabel5.setText("ID Album:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 60, 70, 42);
        jPanel1.add(jTextField_Id_album);
        jTextField_Id_album.setBounds(350, 60, 240, 30);

        jLabel9.setText("NOMBRE ARCHIVO:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(170, 140, 121, 42);

        jButtonCantidadTotalFotos.setText("Total de Fotos");
        jButtonCantidadTotalFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadFotosTotal(evt);
            }
        });
        jPanel1.add(jButtonCantidadTotalFotos);
        jButtonCantidadTotalFotos.setBounds(480, 420, 200, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fondo azul.jpg"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 710, 490);

        jTabbedPane1.addTab("FOTO", jPanel1);

        jPanel3.setLayout(null);

        jButtonEliminar.setText("Eliminar Album");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarAlbum(evt);
            }
        });
        jPanel3.add(jButtonEliminar);
        jButtonEliminar.setBounds(307, 283, 211, 38);

        jPanel3.add(jComboBoxEliminarAlbum);
        jComboBoxEliminarAlbum.setBounds(235, 95, 361, 32);

        jLabel1.setText("ALBUM:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(136, 104, 49, 14);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fondo azul.jpg"))); // NOI18N
        jPanel3.add(jLabel10);
        jLabel10.setBounds(0, 0, 710, 490);

        jTabbedPane1.addTab("ELIMINAR ALBUM", jPanel3);

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

    private void guardarAlbum(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarAlbum
       this.presentador.guardarAlbumApretado();
    }//GEN-LAST:event_guardarAlbum

    private void mostrarAlbum(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarAlbum
      this.presentador.mostrarAlbumApretado();
    }//GEN-LAST:event_mostrarAlbum

    private void botonAgregarFotos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarFotos
       this.presentador.obtenerFotosPorAlbum();
    }//GEN-LAST:event_botonAgregarFotos

    private void botonEliminarAlbum(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarAlbum
       this.presentador.botonEliminarAlbumApretado();
    }//GEN-LAST:event_botonEliminarAlbum

    private void cantidadFotosTotal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadFotosTotal
        this.presentador.fotosTotalApretado();
    }//GEN-LAST:event_cantidadFotosTotal

    private void mostrarFotosGuardadas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarFotosGuardadas
        this.presentador.mostrarFotosApretado();
    }//GEN-LAST:event_mostrarFotosGuardadas

    private void BotonGuardarFoto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarFoto
        this.presentador.guardarFotoApretado();
    }//GEN-LAST:event_BotonGuardarFoto

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAgregarPersonasFoto;
    private javax.swing.JButton jButtonCantidadTotalFotos;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardarAlbum;
    private javax.swing.JButton jButtonMostrarAlbum;
    private javax.swing.JComboBox<Object> jComboBox1Album;
    private javax.swing.JComboBox<Object> jComboBoxEliminarAlbum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldCantidadMaxima;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombreArchivo;
    private javax.swing.JTextField jTextFieldTamaño;
    private javax.swing.JTextField jTextField_Id_album;
    // End of variables declaration//GEN-END:variables

  
}

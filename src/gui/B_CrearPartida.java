package gui;

import aplicacion.ManejoJSON;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import logicadenegocios.Ciudad;
import logicadenegocios.ServidorLocal;



/**
 *
 * @author Ginge
 */
public class B_CrearPartida extends javax.swing.JFrame {

    /**
     * Creates new form C_GestionPartida
     */
    public B_CrearPartida() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputCiudad = new javax.swing.JTextField();
        labelCiudad = new javax.swing.JLabel();
        inputNombreServidor = new javax.swing.JTextField();
        bottonSeleccionar = new javax.swing.JButton();
        labelNombreServidor = new javax.swing.JLabel();
        labelCrearPartida = new javax.swing.JLabel();
        panelCrearServidor = new javax.swing.JPanel();
        labelCrearServidor = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        labelSalir = new javax.swing.JLabel();
        panelAtras = new javax.swing.JPanel();
        labelAtras = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputCiudad.setEditable(false);
        inputCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(inputCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 212, 140, 30));

        labelCiudad.setFont(new java.awt.Font("Comic Book", 0, 24)); // NOI18N
        labelCiudad.setForeground(new java.awt.Color(255, 255, 255));
        labelCiudad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCiudad.setText("Ciudad");
        getContentPane().add(labelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 200, 20));

        inputNombreServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombreServidorActionPerformed(evt);
            }
        });
        getContentPane().add(inputNombreServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 140, 30));

        bottonSeleccionar.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        bottonSeleccionar.setText("Seleccionar");
        bottonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(bottonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 140, -1));

        labelNombreServidor.setFont(new java.awt.Font("Comic Book", 0, 24)); // NOI18N
        labelNombreServidor.setForeground(new java.awt.Color(255, 255, 255));
        labelNombreServidor.setText("Nombre del servidor");
        getContentPane().add(labelNombreServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 270, 20));

        labelCrearPartida.setFont(new java.awt.Font("Comic Book", 0, 36)); // NOI18N
        labelCrearPartida.setForeground(new java.awt.Color(255, 255, 255));
        labelCrearPartida.setText("Crear Partida");
        getContentPane().add(labelCrearPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 300, -1));

        panelCrearServidor.setBackground(new java.awt.Color(255, 255, 255));

        labelCrearServidor.setFont(new java.awt.Font("Comic Book", 0, 18)); // NOI18N
        labelCrearServidor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCrearServidor.setText("Crear Servidor");
        labelCrearServidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearServidorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCrearServidorLayout = new javax.swing.GroupLayout(panelCrearServidor);
        panelCrearServidor.setLayout(panelCrearServidorLayout);
        panelCrearServidorLayout.setHorizontalGroup(
            panelCrearServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCrearServidor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        panelCrearServidorLayout.setVerticalGroup(
            panelCrearServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCrearServidor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(panelCrearServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 240, 30));

        panelSalir.setBackground(new java.awt.Color(255, 255, 255));

        labelSalir.setFont(new java.awt.Font("Comic Book", 0, 18)); // NOI18N
        labelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalir.setText("Salir");
        labelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 30));

        panelAtras.setBackground(new java.awt.Color(255, 255, 255));

        labelAtras.setFont(new java.awt.Font("Comic Book", 0, 18)); // NOI18N
        labelAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAtras.setText("Atr??s");
        labelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAtrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelAtrasLayout = new javax.swing.GroupLayout(panelAtras);
        panelAtras.setLayout(panelAtrasLayout);
        panelAtrasLayout.setHorizontalGroup(
            panelAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelAtrasLayout.setVerticalGroup(
            panelAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(panelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 70, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg/crearPartida.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelSalirMouseClicked

    private void labelAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAtrasMouseClicked
        A_MenuServidor nf = new A_MenuServidor();
        nf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelAtrasMouseClicked

    private void bottonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonSeleccionarActionPerformed
        SeleccionarCiudad sc = new SeleccionarCiudad(this);
        sc.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_bottonSeleccionarActionPerformed

    private void inputNombreServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombreServidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNombreServidorActionPerformed

    private void crearServidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearServidorMouseClicked
        if(inputNombreServidor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene el nombre del servidor", "Error", JOptionPane.WARNING_MESSAGE);          
            
        }else if (inputCiudad.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione la ciudad", "Error", JOptionPane.WARNING_MESSAGE);         
        }else{
            
      

        String nombre = inputNombreServidor.getText();
        ArrayList ciudades = ManejoJSON.leerJSON(Ciudad.RUTA, Ciudad.class);
        Ciudad ciudad = (Ciudad) ciudades.get(SeleccionarCiudad.slotSeleccionadoNum);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.now();
        String strDate = dateTime.format(dateFormat);
        ArrayList servidores = ManejoJSON.leerJSON(ServidorLocal.RUTA, ServidorLocal.class);
        ServidorLocal servidor = new ServidorLocal(nombre, ciudad, strDate, 5000 + (servidores.size() + 1) );
        ManejoJSON.guardarJSON(servidor, ServidorLocal.RUTA);
        SeleccionarHeroe sh = new SeleccionarHeroe("Servidor", servidor);
        sh.setVisible(true);
        this.dispose();}
        
        
    }//GEN-LAST:event_crearServidorMouseClicked

    private void inputCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCiudadActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(B_CrearPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new B_CrearPartida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottonSeleccionar;
    private javax.swing.JLabel fondo;
    public static javax.swing.JTextField inputCiudad;
    private javax.swing.JTextField inputNombreServidor;
    private javax.swing.JLabel labelAtras;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelCrearPartida;
    private javax.swing.JLabel labelCrearServidor;
    private javax.swing.JLabel labelNombreServidor;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JPanel panelAtras;
    private javax.swing.JPanel panelCrearServidor;
    private javax.swing.JPanel panelSalir;
    // End of variables declaration//GEN-END:variables
}

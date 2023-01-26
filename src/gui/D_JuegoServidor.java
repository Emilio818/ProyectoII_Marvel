package gui;


import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import logicadenegocios.Cliente;
import logicadenegocios.Escenario;

import logicadenegocios.ServidorLocal;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author emifu
 */
public class D_JuegoServidor extends javax.swing.JFrame {
    
    private ServerSocket ss;
    private Socket s;
    private DataInputStream din;
    private DataOutputStream dout;
    private ServidorLocal servidorLocal;
    
    /**
     * Creates new form Escenario
     * @param servidorLocal
     */
    public D_JuegoServidor(ServidorLocal servidorLocal) {
        this.servidorLocal = servidorLocal;
        this.setLocationRelativeTo(null);
        initComponents();
        panelChat.setVisible(false);
        ponerBg();
        ponerSprites();
        
        String ip = null;
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
        }
        
        try {
            Socket s = new Socket(ip, servidorLocal.getPuerto());
        } catch (IOException ex) {            
        }
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelbg = new java.awt.Panel();
        panelChat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msg_area = new javax.swing.JTextArea();
        msg_text = new javax.swing.JTextField();
        msg_send = new javax.swing.JButton();
        slotPersonaje1 = new javax.swing.JPanel();
        slotPersonaje2 = new javax.swing.JPanel();
        infoPersonaje1 = new javax.swing.JPanel();
        labelNombre1 = new javax.swing.JLabel();
        barVida1 = new javax.swing.JProgressBar();
        labelVida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        infoPersonaje2 = new javax.swing.JPanel();
        labelNombre2 = new javax.swing.JLabel();
        barVida2 = new javax.swing.JProgressBar();
        labelVida1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelbg.setMaximumSize(new java.awt.Dimension(900, 500));
        panelbg.setMinimumSize(new java.awt.Dimension(900, 500));
        panelbg.setName(""); // NOI18N
        panelbg.setPreferredSize(new java.awt.Dimension(900, 500));
        panelbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelChat.setOpaque(false);
        panelChat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg_area.setColumns(20);
        msg_area.setRows(5);
        jScrollPane1.setViewportView(msg_area);

        panelChat.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 120));

        msg_text.setText("Escribe algo . . .");
        msg_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msg_textActionPerformed(evt);
            }
        });
        panelChat.add(msg_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 260, 30));

        msg_send.setText("Enviar");
        msg_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msg_sendActionPerformed(evt);
            }
        });
        panelChat.add(msg_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 70, 30));

        panelbg.add(panelChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 360, 180));

        slotPersonaje1.setOpaque(false);
        slotPersonaje1.setPreferredSize(new java.awt.Dimension(300, 300));
        slotPersonaje1.setLayout(new java.awt.BorderLayout());
        panelbg.add(slotPersonaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        slotPersonaje2.setOpaque(false);
        slotPersonaje2.setPreferredSize(new java.awt.Dimension(300, 300));
        slotPersonaje2.setLayout(new java.awt.BorderLayout());
        panelbg.add(slotPersonaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        infoPersonaje1.setOpaque(false);
        infoPersonaje1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre1.setText("jLabel1");
        infoPersonaje1.add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 30));

        barVida1.setValue(100);
        infoPersonaje1.add(barVida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 160, 20));

        labelVida.setText("jLabel1");
        infoPersonaje1.add(labelVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 26, 50, 20));

        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(20, 20));
        infoPersonaje1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 20));

        jLabel2.setText("jLabel1");
        jLabel2.setPreferredSize(new java.awt.Dimension(20, 20));
        infoPersonaje1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        panelbg.add(infoPersonaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 300, -1));

        infoPersonaje2.setOpaque(false);
        infoPersonaje2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre2.setText("jLabel1");
        infoPersonaje2.add(labelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 30));

        barVida2.setValue(100);
        infoPersonaje2.add(barVida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 160, 20));

        labelVida1.setText("jLabel1");
        infoPersonaje2.add(labelVida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 26, 50, 20));

        jLabel3.setText("jLabel1");
        jLabel3.setPreferredSize(new java.awt.Dimension(20, 20));
        infoPersonaje2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 20));

        jLabel4.setText("jLabel1");
        jLabel4.setPreferredSize(new java.awt.Dimension(20, 20));
        infoPersonaje2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        panelbg.add(infoPersonaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 300, -1));

        jButton1.setText("Chat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelbg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 30));
        panelbg.add(labelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(panelbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (panelChat.isVisible()){
            panelChat.setVisible(false);
        } else{
            panelChat.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void msg_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msg_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msg_textActionPerformed

    private void msg_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msg_sendActionPerformed
       
    }//GEN-LAST:event_msg_sendActionPerformed

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
            java.util.logging.Logger.getLogger(D_JuegoServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new D_JuegoServidor(null).setVisible(true);
            }
        });
    }

            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barVida1;
    private javax.swing.JProgressBar barVida2;
    private javax.swing.JPanel infoPersonaje1;
    private javax.swing.JPanel infoPersonaje2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBg;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JLabel labelVida;
    private javax.swing.JLabel labelVida1;
    private static javax.swing.JTextArea msg_area;
    private javax.swing.JButton msg_send;
    private javax.swing.JTextField msg_text;
    private javax.swing.JPanel panelChat;
    private java.awt.Panel panelbg;
    private javax.swing.JPanel slotPersonaje1;
    private javax.swing.JPanel slotPersonaje2;
    // End of variables declaration//GEN-END:variables


    private void panelChat(){
        
    }
    private void ponerSprites() {
      /*  System.out.println(ControlJuego.personaje1);
        System.out.println(ControlJuego.personaje2);
        SpritePersonaje personaje1 = new SpritePersonaje(ControlJuego.personaje1,"1");
        SpritePersonaje personaje2 = new SpritePersonaje(ControlJuego.personaje2,"2");
        
        personaje1.setSize(300, 300);
        personaje2.setSize(300, 300);
        personaje1.setLocation(0, 0);
        personaje2.setLocation(0, 0);
        slotPersonaje1.removeAll();
        slotPersonaje2.removeAll();
        slotPersonaje1.add(personaje1);
        slotPersonaje2.add(personaje2);
        slotPersonaje1.revalidate();
        slotPersonaje2.revalidate();
        slotPersonaje1.repaint();
        slotPersonaje2.repaint();
        // Fondo Correspondiente*/
    
    }
    private void ponerBg() {
        switch (servidorLocal.getCiudad().getEscenario()) {
            case CIUDAD -> labelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg/Ciudad.jpg"))); // NOI18N
            case MONTAÑA -> labelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg/Montaña.jpg"))); // NOI18N
            case BOSQUE -> labelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg/Bosque.jpg"))); // NOI18N
            case DESIERTO -> labelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg/Desierto.jpg"))); // NOI18N
            default -> {
            }
        }
    }
}   

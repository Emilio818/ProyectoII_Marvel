/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import gui.B_Servidores;

/**
 *
 * @author Ginge
 */
public class A_MenuCliente extends javax.swing.JFrame {

    /**
     * Creates new form A_MenuCliente
     */
    public A_MenuCliente() {
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

        atras = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        verServidores = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        estadisticas = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setFont(new java.awt.Font("Comic Book", 0, 24)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("Atrás");
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 80, 20));

        salir.setFont(new java.awt.Font("Comic Book", 0, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 70, 30));

        jLabel1.setBackground(new java.awt.Color(102, 0, 102));
        jLabel1.setFont(new java.awt.Font("Comic Book", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 370, 110));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verServidores.setFont(new java.awt.Font("Comic Book", 0, 18)); // NOI18N
        verServidores.setForeground(new java.awt.Color(0, 0, 51));
        verServidores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verServidores.setText("Servidores");
        verServidores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verServidoresMouseClicked(evt);
            }
        });
        jPanel1.add(verServidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 270, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        estadisticas.setFont(new java.awt.Font("Comic Book", 0, 18)); // NOI18N
        estadisticas.setForeground(new java.awt.Color(0, 0, 51));
        estadisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadisticas.setText("Estadisticas");
        estadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estadisticasMouseClicked(evt);
            }
        });
        jPanel2.add(estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 270, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 123, 250, 20));

        fondo.setFont(new java.awt.Font("Comic Book", 0, 18)); // NOI18N
        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg/menuCliente.png"))); // NOI18N
        fondo.setText("jLabel2");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -10, 970, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void estadisticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadisticasMouseClicked
        B_Estadisticas nf = new B_Estadisticas();
        nf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_estadisticasMouseClicked

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        A_ControlAcceso nf = new A_ControlAcceso();
        nf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasMouseClicked

    private void verServidoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verServidoresMouseClicked
        B_Servidores nf = new B_Servidores();
        nf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_verServidoresMouseClicked

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
            java.util.logging.Logger.getLogger(A_MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_MenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JLabel estadisticas;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel verServidores;
    // End of variables declaration//GEN-END:variables
}

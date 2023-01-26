/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import aplicacion.ManejoJSON;
import gui.C_EliminarUsuario;
import javax.swing.JOptionPane;
import logicadenegocios.Usuario;

/**
 *
 * @author Ginge
 */
public class C_EditarUsuarioAux extends javax.swing.JFrame {

    /**
     * Creates new form B_RegistroUsuario
     */
    public C_EditarUsuarioAux() {
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

        panelRegistroUsuario = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        inputApellidos = new javax.swing.JTextField();
        inputCorreo = new javax.swing.JTextField();
        inputNombre = new javax.swing.JTextField();
        inputUsuario = new javax.swing.JTextField();
        inputContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        labelRegistroUsuario = new javax.swing.JLabel();
        panelAñadir = new javax.swing.JPanel();
        labelAñadir = new javax.swing.JLabel();
        panelAtras = new javax.swing.JPanel();
        labelAtras = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        labelSalir = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegistroUsuario.setBackground(new java.awt.Color(255, 255, 255, 220));
        panelRegistroUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        panelRegistroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        panelRegistroUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        labelNombre.setText("Nombre");
        panelRegistroUsuario.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 90, -1));

        labelApellidos.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        labelApellidos.setText("Apellidos");
        panelRegistroUsuario.add(labelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 90, -1));

        labelUsuario.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        labelUsuario.setText("Nombre de Usuario");
        panelRegistroUsuario.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 180, -1));

        labelCorreo.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        labelCorreo.setText("Correo");
        panelRegistroUsuario.add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 90, -1));

        labelContraseña.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        labelContraseña.setText("Contraseña");
        panelRegistroUsuario.add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 120, -1));

        inputApellidos.setForeground(new java.awt.Color(153, 153, 153));
        inputApellidos.setBorder(null);
        panelRegistroUsuario.add(inputApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 140, 30));

        inputCorreo.setForeground(new java.awt.Color(153, 153, 153));
        inputCorreo.setBorder(null);
        panelRegistroUsuario.add(inputCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 150, 30));

        inputNombre.setForeground(new java.awt.Color(153, 153, 153));
        inputNombre.setBorder(null);
        panelRegistroUsuario.add(inputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 150, 30));

        inputUsuario.setBackground(new java.awt.Color(242, 242, 242));
        inputUsuario.setForeground(new java.awt.Color(153, 153, 153));
        inputUsuario.setBorder(null);
        inputUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputUsuarioFocusLost(evt);
            }
        });
        inputUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputUsuarioMouseClicked(evt);
            }
        });
        panelRegistroUsuario.add(inputUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, 20));

        inputContraseña.setForeground(new java.awt.Color(153, 153, 153));
        inputContraseña.setBorder(null);
        panelRegistroUsuario.add(inputContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 140, 30));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        panelRegistroUsuario.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        panelRegistroUsuario.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 130, 10));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        panelRegistroUsuario.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 130, 20));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        panelRegistroUsuario.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 130, 10));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        panelRegistroUsuario.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 130, 10));

        labelRegistroUsuario.setFont(new java.awt.Font("Comic Book", 1, 24)); // NOI18N
        labelRegistroUsuario.setText("Editar Usuario");
        panelRegistroUsuario.add(labelRegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 490, -1));

        panelAñadir.setBackground(new java.awt.Color(255, 255, 255));

        labelAñadir.setBackground(new java.awt.Color(255, 255, 255));
        labelAñadir.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        labelAñadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAñadir.setText("Agregar");
        labelAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickAñadir(evt);
            }
        });

        javax.swing.GroupLayout panelAñadirLayout = new javax.swing.GroupLayout(panelAñadir);
        panelAñadir.setLayout(panelAñadirLayout);
        panelAñadirLayout.setHorizontalGroup(
            panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAñadirLayout.setVerticalGroup(
            panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(labelAñadir))
        );

        panelRegistroUsuario.add(panelAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 20));

        getContentPane().add(panelRegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 500, 280));

        panelAtras.setBackground(new java.awt.Color(51, 51, 51));
        panelAtras.setForeground(new java.awt.Color(255, 255, 255));

        labelAtras.setFont(new java.awt.Font("Comic Book", 1, 18)); // NOI18N
        labelAtras.setForeground(new java.awt.Color(255, 255, 255));
        labelAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAtras.setText("Atras");
        labelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAtrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelAtrasLayout = new javax.swing.GroupLayout(panelAtras);
        panelAtras.setLayout(panelAtrasLayout);
        panelAtrasLayout.setHorizontalGroup(
            panelAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelAtrasLayout.setVerticalGroup(
            panelAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(panelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 70, 30));

        panelSalir.setBackground(new java.awt.Color(51, 51, 51));
        panelSalir.setForeground(new java.awt.Color(255, 255, 255));
        panelSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSalir.setFont(new java.awt.Font("Comic Book", 1, 18)); // NOI18N
        labelSalir.setForeground(new java.awt.Color(255, 255, 255));
        labelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalir.setText("Salir");
        labelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSalirMouseClicked(evt);
            }
        });
        panelSalir.add(labelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        getContentPane().add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 30));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg/registroUsarios.png"))); // NOI18N
        labelFondo.setText("jLabel1");
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelSalirMouseClicked

    private void labelAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAtrasMouseClicked
        C_EditarUsuario newframe = new C_EditarUsuario();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelAtrasMouseClicked

    private void clickAñadir(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAñadir
        if(inputNombre.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene el nombre", "Error", JOptionPane.WARNING_MESSAGE);      
        }else if (inputApellidos.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene los apellidos", "Error", JOptionPane.WARNING_MESSAGE);
        }else if (inputCorreo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene el correo", "Error", JOptionPane.WARNING_MESSAGE); 
        }else if (inputContraseña.getPassword().length == 0 | inputContraseña.getPassword().equals("jPasswordField1")){
            JOptionPane.showMessageDialog(null, "Rellene la contraseña", "Error", JOptionPane.WARNING_MESSAGE);
        }else if (inputUsuario.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene el nombre de usuario", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            Usuario usuario = getInformacion();
            ManejoJSON.guardarJSON(usuario, Usuario.RUTA);
            limpiarInputs();
            JOptionPane.showMessageDialog(null, "Usuario modificado correctamente");
            B_RegistroUsuario nf = new B_RegistroUsuario();
            nf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_clickAñadir

    private void inputUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputUsuarioFocusLost

    }//GEN-LAST:event_inputUsuarioFocusLost

    private void inputUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputUsuarioMouseClicked

    }//GEN-LAST:event_inputUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(C_EditarUsuarioAux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_EditarUsuarioAux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_EditarUsuarioAux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_EditarUsuarioAux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_EditarUsuarioAux().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputApellidos;
    private javax.swing.JPasswordField inputContraseña;
    private javax.swing.JTextField inputCorreo;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelAtras;
    private javax.swing.JLabel labelAñadir;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRegistroUsuario;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelAtras;
    private javax.swing.JPanel panelAñadir;
    private javax.swing.JPanel panelRegistroUsuario;
    private javax.swing.JPanel panelSalir;
    // End of variables declaration//GEN-END:variables

    private Usuario getInformacion() {
        String nombre = inputNombre.getText();
        String apellidos = inputApellidos.getText();
        String correo = inputCorreo.getText();
        char[] contraseña = inputContraseña.getPassword();
        String nombreUsuario = inputUsuario.getText();
        Usuario usuario= new Usuario(nombre, apellidos, nombreUsuario, correo, contraseña);
        return usuario;
    }

    private void limpiarInputs() {
        inputNombre.setText("");
        inputApellidos.setText("");
        inputCorreo.setText("");
        inputContraseña.setText("");
        inputUsuario.setText("");
    }
}

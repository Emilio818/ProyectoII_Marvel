package gui;

import aplicacion.ManejoJSON;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import logicadenegocios.Usuario;

/**
 *
 * @author Ginge
 */
public class A_ControlAcceso extends javax.swing.JFrame {
    
    public static String usuario;
    /**
     * Creates new form ControlAcceso
     */
    public A_ControlAcceso() {
        initComponents();
        tipoUsuario.add(inputServidor);
        tipoUsuario.add(inputCliente);
        this.setLocationRelativeTo(null);
        txtusuarioObligatorio.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoUsuario = new javax.swing.ButtonGroup();
        panelblanco = new javax.swing.JPanel();
        inputUsuario = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        inputCliente = new javax.swing.JRadioButton();
        inputServidor = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        inputContraseña = new javax.swing.JPasswordField();
        ingresar = new javax.swing.JLabel();
        registroUsuario = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        txtusuarioObligatorio = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        txtcontraseñaObligatoria = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelblanco.setBackground(new java.awt.Color(255, 255, 255));
        panelblanco.setBorder(new javax.swing.border.MatteBorder(null));
        panelblanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputUsuario.setForeground(new java.awt.Color(204, 204, 204));
        inputUsuario.setBorder(null);
        inputUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputUsuarioFocusLost(evt);
            }
        });
        panelblanco.add(inputUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 240, 20));

        labelUsuario.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        labelUsuario.setText("Usuario");
        panelblanco.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, 20));

        labelContraseña.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        labelContraseña.setText("Contraseña");
        panelblanco.add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 110, -1));

        inputCliente.setFont(new java.awt.Font("Comic Book", 0, 12)); // NOI18N
        inputCliente.setText("Cliente");
        inputCliente.setBorder(null);
        inputCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClienteActionPerformed(evt);
            }
        });
        panelblanco.add(inputCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 100, -1));

        inputServidor.setFont(new java.awt.Font("Comic Book", 0, 12)); // NOI18N
        inputServidor.setText("Servidor");
        inputServidor.setBorder(null);
        inputServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputServidorActionPerformed(evt);
            }
        });
        panelblanco.add(inputServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 110, -1));
        panelblanco.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 250, -1));
        panelblanco.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 293, 250, -1));

        inputContraseña.setForeground(new java.awt.Color(204, 204, 204));
        inputContraseña.setBorder(null);
        inputContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputContraseñaFocusLost(evt);
            }
        });
        panelblanco.add(inputContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 250, 30));

        ingresar.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresar.setText("Ingresar");
        ingresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
        });
        panelblanco.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 190, 30));

        registroUsuario.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        registroUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registroUsuario.setText("Registrar Usuario");
        registroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroUsuarioMouseClicked(evt);
            }
        });
        panelblanco.add(registroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 190, 30));

        salir.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        salir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        salir.setText("Salir");
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        panelblanco.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 50, 50));

        txtusuarioObligatorio.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtusuarioObligatorio.setForeground(new java.awt.Color(204, 0, 0));
        txtusuarioObligatorio.setText("* Usuario Obligatorio");
        panelblanco.add(txtusuarioObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, 20));

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg/logoMarvel.png"))); // NOI18N
        panelblanco.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtcontraseñaObligatoria.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtcontraseñaObligatoria.setForeground(new java.awt.Color(204, 0, 0));
        txtcontraseñaObligatoria.setText("* Contraseña Obligatoria");
        panelblanco.add(txtcontraseñaObligatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 120, 30));

        getContentPane().add(panelblanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 340, 500));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg/controlAcceso.png"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputServidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputServidorActionPerformed

    private void inputClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputClienteActionPerformed

    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
        A_ControlAcceso.usuario = inputUsuario.getText();
        if(inputUsuario.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene el nombre de usuario", "Error", JOptionPane.WARNING_MESSAGE);         
            txtusuarioObligatorio.setVisible(true);
            return;
            
        }else if (inputContraseña.getPassword().length == 0){
            JOptionPane.showMessageDialog(null, "Rellene la contraseña", "Error", JOptionPane.WARNING_MESSAGE);  
            return;}
        
        txtusuarioObligatorio.setVisible(false);
        txtcontraseñaObligatoria.setVisible(false);
        
                 
        ArrayList<Usuario> usuarios = ManejoJSON.leerJSON(Usuario.RUTA, Usuario.class);
        if (usuarios.isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: Usuario no registrado");
            return;
        }
        for ( int i = 0 ; i < usuarios.size() ; i++){
            if (Arrays.equals(usuarios.get(i).getContraseña(), inputContraseña.getPassword()) &&
                    usuarios.get(i).getNombreUsuario().equals(inputUsuario.getText())){
                if (inputServidor.isSelected()){
                    A_MenuServidor newframe = new A_MenuServidor();
                    newframe.setVisible(true);
                    this.dispose();
                }else if (inputCliente.isSelected()){
                    A_MenuCliente newframe = new A_MenuCliente();
                    newframe.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione ingresar como Servidor o Cliente");
                }
                return ;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
    }//GEN-LAST:event_ingresarMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void registroUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroUsuarioMouseClicked
        
        B_RegistroUsuario nf = new B_RegistroUsuario();
        nf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registroUsuarioMouseClicked

    private void inputContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputContraseñaFocusLost
        if(inputContraseña.getPassword().length == 0){
            txtcontraseñaObligatoria.setVisible(true);
        }else{
            txtcontraseñaObligatoria.setVisible(false);
        }
    }//GEN-LAST:event_inputContraseñaFocusLost

    private void inputUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputUsuarioFocusLost

        if(inputUsuario.getText().trim().isEmpty()){
            txtusuarioObligatorio.setVisible(true);
        }else{
            txtusuarioObligatorio.setVisible(false);
        }
    }//GEN-LAST:event_inputUsuarioFocusLost

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
            java.util.logging.Logger.getLogger(A_ControlAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new A_ControlAcceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel ingresar;
    private javax.swing.JRadioButton inputCliente;
    private javax.swing.JPasswordField inputContraseña;
    private javax.swing.JRadioButton inputServidor;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel panelblanco;
    private javax.swing.JLabel registroUsuario;
    private javax.swing.JLabel salir;
    private javax.swing.ButtonGroup tipoUsuario;
    private javax.swing.JLabel txtcontraseñaObligatoria;
    private javax.swing.JLabel txtusuarioObligatorio;
    // End of variables declaration//GEN-END:variables
}

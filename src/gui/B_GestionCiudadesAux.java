package gui;//GEN-FIRST:event_inputEstadoActionPerformed
//GEN-LAST:event_inputEstadoActionPerformed
import aplicacion.ManejoJSON;

import java.util.ArrayList;
import logicadenegocios.Escenario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import logicadenegocios.*;
/**
 *
 * @author emifu
 */
public class B_GestionCiudadesAux extends javax.swing.JFrame {
    public char modo;
    /**
     * Creates new form I_MenuInicio
     * @param modo
     */
    public B_GestionCiudadesAux(char modo) {
        this.modo = modo;
        initComponents();
        this.setLocationRelativeTo(null);
        inputEscenario.setModel(new DefaultComboBoxModel<>(Escenario.values())); 
        if (modo == 'a'){
            labelTitulo.setText("Nueva Ciudad");
        } else if (modo == 'm'){
            labelTitulo.setText("Modificar Ciudad");
            llenarInputs();
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panel1 = new java.awt.Panel();
        inputPais = new javax.swing.JTextField();
        labelPais = new javax.swing.JLabel();
        inputEstado = new javax.swing.JTextField();
        labelEstado = new javax.swing.JLabel();
        labelEscenario = new javax.swing.JLabel();
        inputCiudad = new javax.swing.JTextField();
        labelCiudad = new javax.swing.JLabel();
        inputEscenario = new javax.swing.JComboBox<>();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Confirmar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setPreferredSize(new java.awt.Dimension(900, 500));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputPais.setFont(new java.awt.Font("Comic Book", 0, 12)); // NOI18N
        inputPais.setForeground(new java.awt.Color(153, 153, 153));
        inputPais.setText("Nombre de país");
        inputPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPaisActionPerformed(evt);
            }
        });
        panel1.add(inputPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 170, 30));

        labelPais.setFont(new java.awt.Font("Comic Book", 0, 24)); // NOI18N
        labelPais.setForeground(new java.awt.Color(255, 255, 255));
        labelPais.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPais.setText("Pais");
        panel1.add(labelPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 60, 30));

        inputEstado.setFont(new java.awt.Font("Comic Book", 0, 12)); // NOI18N
        inputEstado.setForeground(new java.awt.Color(153, 153, 153));
        inputEstado.setText("Nombre de estado");
        inputEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEstadoActionPerformed(evt);
            }
        });
        panel1.add(inputEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 170, 30));

        labelEstado.setFont(new java.awt.Font("Comic Book", 0, 24)); // NOI18N
        labelEstado.setForeground(new java.awt.Color(255, 255, 255));
        labelEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEstado.setText("Estado");
        panel1.add(labelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 100, 30));

        labelEscenario.setFont(new java.awt.Font("Comic Book", 0, 24)); // NOI18N
        labelEscenario.setForeground(new java.awt.Color(255, 255, 255));
        labelEscenario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEscenario.setText("Escenario");
        panel1.add(labelEscenario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 140, 30));

        inputCiudad.setFont(new java.awt.Font("Comic Book", 0, 12)); // NOI18N
        inputCiudad.setForeground(new java.awt.Color(153, 153, 153));
        inputCiudad.setText("Nombre de ciudad");
        inputCiudad.setDoubleBuffered(true);
        inputCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCiudadActionPerformed(evt);
            }
        });
        panel1.add(inputCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 170, 30));

        labelCiudad.setFont(new java.awt.Font("Comic Book", 0, 24)); // NOI18N
        labelCiudad.setForeground(new java.awt.Color(255, 255, 255));
        labelCiudad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCiudad.setText("Ciudad");
        panel1.add(labelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 110, 30));

        inputEscenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEscenarioActionPerformed(evt);
            }
        });
        panel1.add(inputEscenario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 170, 30));

        labelTitulo.setFont(new java.awt.Font("Comic Book", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Gestion Ciudades");
        panel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 350, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Confirmar.setFont(new java.awt.Font("Comic Book", 0, 14)); // NOI18N
        Confirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Confirmar.setText("Confirmar");
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
            }
        });
        jPanel1.add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 30));

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 170, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bg/gestionCiudades.png"))); // NOI18N
        fondo.setToolTipText("");
        panel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>                        

    private void inputPaisActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void inputEstadoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void inputCiudadActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void inputEscenarioActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {                                       
        if(inputPais.getText().trim().isEmpty() | inputPais.getText().equals("Nombre de país")){
            JOptionPane.showMessageDialog(null, "Rellene el país", "Error", JOptionPane.WARNING_MESSAGE);      
        }else if (inputCiudad.getText().trim().isEmpty() | inputCiudad.getText().equals("Nombre de ciudad")){
            JOptionPane.showMessageDialog(null, "Rellene la ciudad", "Error", JOptionPane.WARNING_MESSAGE);
        }else if (inputEstado.getText().trim().isEmpty() | inputEstado.getText().equals("Nombre de estado")){
            JOptionPane.showMessageDialog(null, "Rellene el estado", "Error", JOptionPane.WARNING_MESSAGE); 
        }else{
            Ciudad ciudad = getInformacion();
            if (modo == 'a'){
                ManejoJSON.guardarJSON(ciudad, Ciudad.RUTA);
            } else if (modo == 'm'){
                ManejoJSON.modificarJSON(ciudad, B_GestionCiudades.slotSeleccionadoNum, Ciudad.RUTA);
            }
            B_GestionCiudades gestionCiudades = new B_GestionCiudades();
            gestionCiudades.setVisible(true);
            this.dispose();
        }
    }                                      
    
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
            java.util.logging.Logger.getLogger(B_GestionCiudadesAux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            private char modo;
            @Override
            public void run() {
                new B_GestionCiudadesAux(modo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Confirmar;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField inputCiudad;
    private javax.swing.JComboBox<Escenario> inputEscenario;
    private javax.swing.JTextField inputEstado;
    private javax.swing.JTextField inputPais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelEscenario;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelPais;
    private javax.swing.JLabel labelTitulo;
    private java.awt.Panel panel1;
    // End of variables declaration                   

    private Ciudad getInformacion() {
        String nombre = inputCiudad.getText();
        String pais = inputPais.getText();
        String estado = inputEstado.getText();
        Escenario escenario = (Escenario) inputEscenario.getSelectedItem();
        Ciudad ciudad = new Ciudad(pais, estado, nombre, escenario);
        return ciudad;
        
    }
    
    private void llenarInputs() {
        ArrayList lista = ManejoJSON.leerJSON(Ciudad.RUTA, Ciudad.class);
        Ciudad ciudad = (Ciudad) lista.get(B_GestionCiudades.slotSeleccionadoNum);
        inputCiudad.setText(ciudad.getCiudad());
        inputPais.setText(ciudad.getPais());
        inputEstado.setText(ciudad.getEstado());
        inputEscenario.setSelectedItem(ciudad.getEscenario());
    }

    
}

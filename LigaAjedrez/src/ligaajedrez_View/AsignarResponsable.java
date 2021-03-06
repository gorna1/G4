package ligaajedrez_View;


import Controlador.Administrador;
import javax.swing.JFrame;
import ligaajedrez_View.AdminView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class AsignarResponsable extends javax.swing.JFrame {

    /**
     * Creates new form asignarResponsable
     */
    JFrame vAnterior;
    private Administrador admin;
    public AsignarResponsable(javax.swing.JFrame vAnterior, Administrador admin) {
        this.admin = admin;
        this.vAnterior = vAnterior;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNmbNinyo = new javax.swing.JLabel();
        jTextFieldNmbNinyo = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabelNmbAdulto = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jTextFieldNmbAdulto = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButtonAtras = new javax.swing.JButton();
        jButtonContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asignar Responsable");
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new java.awt.BorderLayout(20, 20));

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(200, 200, 200));

        jLabelNmbNinyo.setText("Nombre Niño");
        jPanel2.add(jLabelNmbNinyo);

        jTextFieldNmbNinyo.setColumns(10);
        jPanel2.add(jTextFieldNmbNinyo);

        jPanel1.add(jPanel2);

        jTextField5.setBackground(new java.awt.Color(200, 200, 200));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Datos Responsable");
        jTextField5.setBorder(null);
        jPanel1.add(jTextField5);

        jPanel4.setBackground(new java.awt.Color(200, 200, 200));
        jPanel4.setLayout(new java.awt.GridLayout(4, 2));

        jLabelNmbAdulto.setText("Nombre");
        jPanel4.add(jLabelNmbAdulto);

        jLabelDNI.setText("DNI");
        jPanel4.add(jLabelDNI);
        jPanel4.add(jTextFieldNmbAdulto);
        jPanel4.add(jTextFieldDNI);

        jLabelTelefono.setText("Teléfono");
        jPanel4.add(jLabelTelefono);

        jLabelDireccion.setText("Dirección");
        jPanel4.add(jLabelDireccion);
        jPanel4.add(jTextFieldTelefono);
        jPanel4.add(jTextFieldDireccion);

        jPanel1.add(jPanel4);

        jButtonAtras.setText("ATRAS");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonAtras);

        jButtonContinuar.setText("CONTINUAR");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonContinuar);

        jPanel1.add(jPanel5);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        setVisible(false);
        vAnterior.setVisible(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        setVisible(false);
        vAnterior.setVisible(true);
    }//GEN-LAST:event_jButtonContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelNmbAdulto;
    private javax.swing.JLabel jLabelNmbNinyo;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNmbAdulto;
    private javax.swing.JTextField jTextFieldNmbNinyo;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}

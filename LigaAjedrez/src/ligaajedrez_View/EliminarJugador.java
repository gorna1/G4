/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez_View;

import Controlador.Administrador;
import javax.swing.JFrame;
import ligaajedrez_Model.LigaAjedrez;

/**
 *
 * @author lucas
 */
public class EliminarJugador extends javax.swing.JFrame {

    /**
     * Creates new form eliminarJugador
     */
    JFrame vAnterior;
    JFrame vPrincipal;
    LigaAjedrez liga;
    private String sDNI;
    private Administrador admin;
    public EliminarJugador(javax.swing.JFrame vAnterior, javax.swing.JFrame vPrincipal,LigaAjedrez liga, Administrador admin) {
        this.admin = admin;
        this.vAnterior = vAnterior;
        this.vPrincipal = vPrincipal;
        this.liga = liga;
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
        jLabelDNI = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonAtras = new javax.swing.JButton();
        jButtonContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jLabelDNI.setText("DNI");
        jPanel2.add(jLabelDNI);

        jTextFieldDNI.setColumns(10);
        jPanel2.add(jTextFieldDNI);

        jPanel1.add(jPanel2);

        jButtonAtras.setText("ATRAS");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAtras);

        jButtonContinuar.setText("CONTINUAR");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonContinuar);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        jTextFieldDNI.setEditable(true) ;
        jTextFieldDNI.setText("") ;
        
        setVisible(false);
        vAnterior.setVisible(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        sDNI = jTextFieldDNI.getText() ;
        try {
            admin.eliminarJugador(sDNI);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        jTextFieldDNI.setEditable(true) ;
        jTextFieldDNI.setText("") ;
        
        setVisible(false);
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldDNI;
    // End of variables declaration//GEN-END:variables
}

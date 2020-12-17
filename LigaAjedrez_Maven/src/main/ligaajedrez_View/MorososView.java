/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez_View;

import Controlador.Administrador;
import javax.swing.JFrame;

/**
 *
 * @author alberto
 */
public class MorososView extends javax.swing.JFrame {

    /**
     * Creates new form MorososView
     */
    JFrame vAnterior;
    private Administrador admin;
    public MorososView(javax.swing.JFrame vAnterior, Administrador admin) {
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

        jPanelView = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jComboBoxMorosos = new javax.swing.JComboBox<>();
        jButtonCobrar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNombre.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelApellidos.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabelApellidos.setText("Apellidos: ");

        jTextFieldNombre.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jTextFieldApellidos.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jButtonBuscar.setText("Buscar");

        jComboBoxMorosos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonCobrar.setText("Cobrar Multa");
        jButtonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCobrarActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jButtonCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addComponent(jComboBoxMorosos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelViewLayout.createSequentialGroup()
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApellidos)
                            .addComponent(jLabelNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelViewLayout.createSequentialGroup()
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBuscar))
                            .addComponent(jTextFieldApellidos))))
                .addGap(17, 17, 17))
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jComboBoxMorosos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        setVisible(false);
        vAnterior.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCobrarActionPerformed
        setVisible(false);
        vAnterior.setVisible(true);
    }//GEN-LAST:event_jButtonCobrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCobrar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxMorosos;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}

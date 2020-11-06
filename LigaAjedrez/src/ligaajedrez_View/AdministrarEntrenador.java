/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez_View;

import javax.swing.JFrame;

/**
 *
 * @author alumno
 */
public class AdministrarEntrenador extends javax.swing.JFrame {

    /**
     * Creates new form AdministrarEntrenador
     */
    private RegEntrenadorView registroEntrenador ;
    private EliminarEntrenador eliminar;
    JFrame vAnterior;
    public AdministrarEntrenador(javax.swing.JFrame vAnterior) {
        this.vAnterior = vAnterior;
        registroEntrenador = new RegEntrenadorView(this,vAnterior);
        eliminar = new EliminarEntrenador(this,vAnterior);
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

        jButtonAnyadirEnt = new javax.swing.JButton();
        jButtonEliminarEnt = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAnyadirEnt.setText("Añadir entrenador");
        jButtonAnyadirEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnyadirEntActionPerformed(evt);
            }
        });

        jButtonEliminarEnt.setText("Eliminar entrenador");
        jButtonEliminarEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarEntActionPerformed(evt);
            }
        });

        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEliminarEnt)
                            .addComponent(jButtonAnyadirEnt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButtonAtras)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButtonAnyadirEnt)
                .addGap(18, 18, 18)
                .addComponent(jButtonEliminarEnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAtras)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnyadirEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnyadirEntActionPerformed
       
       this.setVisible(false);
       registroEntrenador.setVisible(true);
    }//GEN-LAST:event_jButtonAnyadirEntActionPerformed

    private void jButtonEliminarEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarEntActionPerformed
        
        this.setVisible(false);
        eliminar.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarEntActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        this.setVisible(false);
        vAnterior.setVisible(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnyadirEnt;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonEliminarEnt;
    // End of variables declaration//GEN-END:variables
}

package ligaajedrez_View;

import javax.swing.JFrame;
import ligaajedrez_Model.LigaAjedrez;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gor
 */
public class InformacionPartidas extends javax.swing.JFrame {

    /**
     * Creates new form InformacionPartidas
     */
    JFrame vAnterior;
    private LigaAjedrez liga;
    public InformacionPartidas(javax.swing.JFrame vAnterior,LigaAjedrez liga) {
        this.liga = liga;
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

        labelNombreJugador = new javax.swing.JLabel();
        labelPartidasJugador = new javax.swing.JLabel();
        comboBoxJugadores = new javax.swing.JComboBox<>();
        comboBoxPartidas = new javax.swing.JComboBox<>();
        labelRival = new javax.swing.JLabel();
        labelGanador = new javax.swing.JLabel();
        labelFechaPartida = new javax.swing.JLabel();
        labelDuracionPartida = new javax.swing.JLabel();
        textFieldRival = new javax.swing.JTextField();
        textFieldGanador = new javax.swing.JTextField();
        textFieldFechaPartida = new javax.swing.JTextField();
        textFieldDuracionPartida = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNombreJugador.setText("Jugador");

        labelPartidasJugador.setText("Partida");

        comboBoxPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPartidasActionPerformed(evt);
            }
        });

        labelRival.setText("Rival: ");

        labelGanador.setText("Ganador: ");

        labelFechaPartida.setText("Fecha de la partida:");

        labelDuracionPartida.setText("Duracion de la partida: ");

        textFieldRival.setEditable(false);
        textFieldRival.setText(" ");
        textFieldRival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldRivalActionPerformed(evt);
            }
        });

        textFieldGanador.setEditable(false);

        textFieldFechaPartida.setEditable(false);

        textFieldDuracionPartida.setEditable(false);

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(labelNombreJugador)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelDuracionPartida)
                                    .addGap(18, 18, 18)
                                    .addComponent(textFieldDuracionPartida))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelRival)
                                        .addComponent(labelGanador)
                                        .addComponent(labelFechaPartida))
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textFieldFechaPartida)
                                        .addComponent(textFieldGanador, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textFieldRival, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(labelPartidasJugador)
                                .addGap(45, 45, 45)
                                .addComponent(comboBoxPartidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(botonVolver)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreJugador)
                    .addComponent(labelPartidasJugador)
                    .addComponent(comboBoxJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxPartidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRival)
                    .addComponent(textFieldRival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGanador)
                    .addComponent(textFieldGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFechaPartida)
                    .addComponent(textFieldFechaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDuracionPartida)
                    .addComponent(textFieldDuracionPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldRivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldRivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldRivalActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        setVisible(false);
        vAnterior.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void comboBoxPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPartidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPartidasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> comboBoxJugadores;
    private javax.swing.JComboBox<String> comboBoxPartidas;
    private javax.swing.JLabel labelDuracionPartida;
    private javax.swing.JLabel labelFechaPartida;
    private javax.swing.JLabel labelGanador;
    private javax.swing.JLabel labelNombreJugador;
    private javax.swing.JLabel labelPartidasJugador;
    private javax.swing.JLabel labelRival;
    private javax.swing.JTextField textFieldDuracionPartida;
    private javax.swing.JTextField textFieldFechaPartida;
    private javax.swing.JTextField textFieldGanador;
    private javax.swing.JTextField textFieldRival;
    // End of variables declaration//GEN-END:variables
}

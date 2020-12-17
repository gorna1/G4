package ligaajedrez_View;
import Controlador.Administrador;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ligaajedrez_Model.Club;
import ligaajedrez_Model.Jugador;
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
public class CambiarJugadorClub extends javax.swing.JFrame {

    /**
     * Creates new form CambiarJugadorSede
     */
    JFrame vAnterior;
    JFrame vPrincipal;
    private LigaAjedrez liga;
    private String sDNI, sClb_Act, sClb_Nvo ;
    private Jugador jugador ;
    private boolean bCmp = false ;
    private ArrayList<Club> listaClubs = new ArrayList<Club>();
    private Administrador admin;
    
    public CambiarJugadorClub(javax.swing.JFrame vAnterior, javax.swing.JFrame vPrincipal, LigaAjedrez liga, Administrador admin) {
        this.admin = admin;
        this.liga = liga;
        this.vAnterior = vAnterior;
        this.vPrincipal = vPrincipal;
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

        labelJugador = new javax.swing.JLabel();
        labelClubActual = new javax.swing.JLabel();
        textFieldClubActual = new javax.swing.JTextField();
        labelClubNuevo = new javax.swing.JLabel();
        botonConfirmar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jTextFieldDNI = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jComboBoxClubs = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelJugador.setText("DNI Jugador");

        labelClubActual.setText("Club actual");

        textFieldClubActual.setEditable(false);
        textFieldClubActual.setText(" ");
        textFieldClubActual.setFocusable(false);

        labelClubNuevo.setText("Nuevo club");

        botonConfirmar.setText("Confirmar");
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        botonAtras.setText("Atras");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelJugador)
                    .addComponent(labelClubActual)
                    .addComponent(labelClubNuevo))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldClubActual)
                    .addComponent(jTextFieldDNI)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxClubs, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonBuscar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonAtras)
                        .addGap(44, 44, 44)
                        .addComponent(botonConfirmar)
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJugador)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClubActual)
                    .addComponent(textFieldClubActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClubNuevo)
                    .addComponent(jComboBoxClubs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonConfirmar)
                    .addComponent(botonAtras))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        if(bCmp){
            sClb_Nvo = jComboBoxClubs.getSelectedItem().toString() ;
            admin.cambiarClubJugador(jugador, sClb_Nvo);
            
            
            this.setVisible(false) ;
            vPrincipal.setVisible(true) ;
        }
        else
            JOptionPane.showMessageDialog(null, "Debes buscar primero por el DNI") ;
        
        jTextFieldDNI.setEditable(true) ;
        jTextFieldDNI.setText("") ;
        textFieldClubActual.setEditable(true) ;
        textFieldClubActual.setText("") ;
        jComboBoxClubs.removeAllItems() ;
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        jTextFieldDNI.setEditable(true) ;
        jTextFieldDNI.setText("") ;
        textFieldClubActual.setEditable(true) ;
        textFieldClubActual.setText("") ;
        jComboBoxClubs.removeAllItems() ;

        this.setVisible(false) ;
        vAnterior.setVisible(true) ;  
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        sDNI = jTextFieldDNI.getText() ;
        jugador = admin.buscarJugador(sDNI);
        
        textFieldClubActual.setText(jugador.getsClb()) ;
        
        if (!textFieldClubActual.getText().isEmpty()) {
            listaClubs = admin.getClubs(textFieldClubActual.getText());
            
            for (Club c: listaClubs)
                jComboBoxClubs.addItem(c.getNombre());
        }
        bCmp = true ; //Para comprobar si se ha hecho la busqueda del jugador
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox<String> jComboBoxClubs;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JLabel labelClubActual;
    private javax.swing.JLabel labelClubNuevo;
    private javax.swing.JLabel labelJugador;
    private javax.swing.JTextField textFieldClubActual;
    // End of variables declaration//GEN-END:variables
}

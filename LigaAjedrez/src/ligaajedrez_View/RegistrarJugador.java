package ligaajedrez_View;

import Controlador.Administrador;
import java.util.ArrayList;
import ligaajedrez_Model.Jugador ;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ligaajedrez_Model.Factory;
import ligaajedrez_Model.LigaAjedrez;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class RegistrarJugador extends javax.swing.JFrame {

    /**
     * Creates new form registrarJugador
     */
    JFrame vAnterior;
    JFrame vPrincipal;
    private String sNmb, sApe, sTel, sDNI,sEdad, sElo, sClb;
    private Jugador jugador;
    private LigaAjedrez liga;
    private Administrador admin;
    private ArrayList<String> listaArg = new ArrayList<String>() ;
    private ArrayList<String> listaClubsVacio = new ArrayList<String>() ;

    
    public RegistrarJugador(javax.swing.JFrame vAnterior, javax.swing.JFrame vPrincipal, LigaAjedrez liga,Administrador admin) {
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

        jPanel3 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelDNI = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelElo = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jComboBoxElo = new javax.swing.JComboBox<>();
        jTextFieldEdad = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        jButtonContinuar = new javax.swing.JButton();
        jLabelClub = new javax.swing.JLabel();
        jTextFieldClub = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setBackground(new java.awt.Color(200, 200, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setText("Nombre");
        jPanel3.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabelApellidos.setText("Apellidos");
        jPanel3.add(jLabelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));
        jPanel3.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 30));
        jPanel3.add(jTextFieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 160, 30));

        jLabelDNI.setText("DNI");
        jPanel3.add(jLabelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabelTelefono.setText("Teléfono");
        jPanel3.add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));
        jPanel3.add(jTextFieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, 30));
        jPanel3.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 170, 30));

        jLabelElo.setText("Nivel de Habilidad");
        jPanel3.add(jLabelElo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabelEdad.setText("Edad");
        jPanel3.add(jLabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jComboBoxElo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principiante", "Intermedio", "Experto" }));
        jPanel3.add(jComboBoxElo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, -1));
        jPanel3.add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 170, 30));

        jButtonAtras.setText("ATRAS");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jButtonContinuar.setText("CONTINUAR");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jLabelClub.setText("Club");
        jPanel3.add(jLabelClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        jPanel3.add(jTextFieldClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, -1));

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        jTextFieldNombre.setEditable(true) ;
        jTextFieldApellidos.setEditable(true) ;
        jTextFieldTelefono.setEditable(true) ;
        jTextFieldDNI.setEditable(true) ;
        jTextFieldEdad.setEditable(true) ;
        jTextFieldClub.setEditable(true) ;
        
        jTextFieldNombre.setText("") ;
        jTextFieldApellidos.setText("") ;
        jTextFieldTelefono.setText("") ;
        jTextFieldDNI.setText("") ;
        jTextFieldEdad.setText("") ;
        jTextFieldClub.setText("") ;
        
        setVisible(false);
        vAnterior.setVisible(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        sNmb = jTextFieldNombre.getText() ;
        sApe = jTextFieldApellidos.getText() ;
        sTel = jTextFieldTelefono.getText() ;
        sDNI = jTextFieldDNI.getText() ;
        sEdad = jTextFieldEdad.getText() ;
        sClb = jTextFieldClub.getText() ;
        
        
        switch (jComboBoxElo.getSelectedIndex()) {
                    case 0:
                        sElo = "Principiante";
                        break;
                    case 1:
                        sElo = "Intermedio";
                        break;
                    case 2:
                        sElo = "Experto";
                        break;
                    default:
                        sElo = "Principiante";
                        break;
                }
        if(!(sDNI.equals(""))){
            Factory fac = new Factory() ;
            listaArg.add(sApe) ;
            listaArg.add(sTel) ;
            listaArg.add(sEdad) ;
            listaArg.add(sElo) ; 
            listaArg.add(sClb) ;
            jugador = (Jugador) fac.crearPersona(1, sNmb, sDNI, listaArg, listaClubsVacio) ;
            listaArg.clear() ;
            admin.anyadirJugadores(jugador);
           
        }
        else
            JOptionPane.showMessageDialog(null, "Debes introducir el DNI") ;
        
        
        jTextFieldNombre.setEditable(true) ;
        jTextFieldApellidos.setEditable(true) ;
        jTextFieldTelefono.setEditable(true) ;
        jTextFieldDNI.setEditable(true) ;
        jTextFieldEdad.setEditable(true) ;
        jTextFieldClub.setEditable(true) ;
        
        jTextFieldNombre.setText("") ;
        jTextFieldApellidos.setText("") ;
        jTextFieldTelefono.setText("") ;
        jTextFieldDNI.setText("") ;
        jTextFieldEdad.setText("") ;
        jTextFieldClub.setText("") ;
        
        setVisible(false);
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JComboBox<String> jComboBoxElo;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelClub;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelElo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldClub;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}

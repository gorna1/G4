/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez;

/**
 *
 * @author alberto
 */
public class AdminView extends javax.swing.JFrame {

    /**
     * Creates new form AdminView
     */
    public AdminView() {
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
        jButtonSede = new javax.swing.JButton();
        jButtonCambiarClub = new javax.swing.JButton();
        jButtonInfoPartidas = new javax.swing.JButton();
        jButtonAnyadirGerente = new javax.swing.JButton();
        jButtonAnyadirEntrenador = new javax.swing.JButton();
        jButtonMultasMorosos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSede.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButtonSede.setText("Elegir sede para partida");

        jButtonCambiarClub.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButtonCambiarClub.setText("Cambiar de club jugador/gerente");

        jButtonInfoPartidas.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButtonInfoPartidas.setText("Ver info partidas para cada jugador");

        jButtonAnyadirGerente.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButtonAnyadirGerente.setText("Añadir gerente");

        jButtonAnyadirEntrenador.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButtonAnyadirEntrenador.setText("Registrar Entrenador");

        jButtonMultasMorosos.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButtonMultasMorosos.setText("Pago multas de morosos");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButton1.setText("Asignar Responsable");

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButton2.setText("Introducir Resultados");

        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButton3.setText("Realizar Reserva");

        jButton4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButton4.setText("Administrar jugadores");

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCambiarClub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInfoPartidas, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(jButtonAnyadirGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnyadirEntrenador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMultasMorosos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButtonSede)
                .addGap(18, 18, 18)
                .addComponent(jButtonInfoPartidas)
                .addGap(18, 18, 18)
                .addComponent(jButtonCambiarClub)
                .addGap(18, 18, 18)
                .addComponent(jButtonAnyadirGerente)
                .addGap(18, 18, 18)
                .addComponent(jButtonAnyadirEntrenador)
                .addGap(18, 18, 18)
                .addComponent(jButtonMultasMorosos)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAnyadirEntrenador;
    private javax.swing.JButton jButtonAnyadirGerente;
    private javax.swing.JButton jButtonCambiarClub;
    private javax.swing.JButton jButtonInfoPartidas;
    private javax.swing.JButton jButtonMultasMorosos;
    private javax.swing.JButton jButtonSede;
    private javax.swing.JPanel jPanelView;
    // End of variables declaration//GEN-END:variables
}

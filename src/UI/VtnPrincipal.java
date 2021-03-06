/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;

/**
 *
 * @author labctr
 */
public class VtnPrincipal extends javax.swing.JFrame {

    public static void verMensaje(String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);
    }

    /**
     * Creates new form VtnPrincipal
     */
    public VtnPrincipal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnuCuentas = new javax.swing.JMenu();
        mniCalificar = new javax.swing.JMenuItem();
        mniMatricula = new javax.swing.JMenuItem();
        mnuEstudiante = new javax.swing.JMenu();
        mninuevoestudiante = new javax.swing.JMenuItem();
        mnireporteCalificaciones = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuCuentas.setText("Matricula");

        mniCalificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mniCalificar.setMnemonic('o');
        mniCalificar.setText("Registro Calificaciones");
        mniCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCalificarActionPerformed(evt);
            }
        });
        mnuCuentas.add(mniCalificar);

        mniMatricula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mniMatricula.setMnemonic('s');
        mniMatricula.setText("Regsitro Matricula");
        mniMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMatriculaActionPerformed(evt);
            }
        });
        mnuCuentas.add(mniMatricula);

        menuBar.add(mnuCuentas);

        mnuEstudiante.setMnemonic('h');
        mnuEstudiante.setText("Estudiante");

        mninuevoestudiante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mninuevoestudiante.setMnemonic('c');
        mninuevoestudiante.setText("Nuevo Estudiante");
        mninuevoestudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mninuevoestudianteActionPerformed(evt);
            }
        });
        mnuEstudiante.add(mninuevoestudiante);

        mnireporteCalificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnireporteCalificaciones.setMnemonic('c');
        mnireporteCalificaciones.setText("Reporte de Calificaciones");
        mnireporteCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnireporteCalificacionesActionPerformed(evt);
            }
        });
        mnuEstudiante.add(mnireporteCalificaciones);

        menuBar.add(mnuEstudiante);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMatriculaActionPerformed
        FrmRegistroMatricula a = new FrmRegistroMatricula();
        this.desktopPane.add(a);
        a.show();
    }//GEN-LAST:event_mniMatriculaActionPerformed

    private void mniCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCalificarActionPerformed
        FrmRegistroCalificaciones a = new FrmRegistroCalificaciones();
        this.desktopPane.add(a);
        a.show();
    }//GEN-LAST:event_mniCalificarActionPerformed

    private void mninuevoestudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mninuevoestudianteActionPerformed
        FrmRegistroEstudiantes a = new FrmRegistroEstudiantes();
        this.desktopPane.add(a);
        a.show();
    }//GEN-LAST:event_mninuevoestudianteActionPerformed

    private void mnireporteCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnireporteCalificacionesActionPerformed
        frmReporteCalificaciones c = new frmReporteCalificaciones();
        this.desktopPane.add(c);
        c.show();
    }//GEN-LAST:event_mnireporteCalificacionesActionPerformed

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
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniCalificar;
    private javax.swing.JMenuItem mniMatricula;
    private javax.swing.JMenuItem mninuevoestudiante;
    private javax.swing.JMenuItem mnireporteCalificaciones;
    private javax.swing.JMenu mnuCuentas;
    private javax.swing.JMenu mnuEstudiante;
    // End of variables declaration//GEN-END:variables
}

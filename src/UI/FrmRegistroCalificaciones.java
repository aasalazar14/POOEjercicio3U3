/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BLL.GestionMatricula;
import Salazar.Util;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author labctr
 */
public class FrmRegistroCalificaciones extends javax.swing.JInternalFrame {
 private  final String titulo = "Registro de calificaciones";
   private GestionMatricula matriculaBll = new GestionMatricula();

 private boolean validar(){
        float nota = (float)this.snnValor.getValue();
        if(nota==0f){
            VtnPrincipal.verMensaje("Calificacion no válida", titulo, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void consultarMatricula() throws IOException{
        String numero = this.txtnmatricula.getText();
        matriculaBll.consultar(numero);
       
        this.txtDatosMatricula.setText(matriculaBll.imprimir());
    }
    
    private String Calificar() throws IOException{
        float nota = (float)this.snnValor.getValue();
        String mensaje = matriculaBll.Calificar(nota);
        matriculaBll.archivar();
        return mensaje;
    }

    
    public FrmRegistroCalificaciones() {
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

        lbltitulo = new javax.swing.JLabel();
        pnlRegistromatricula = new javax.swing.JPanel();
        txtnmatricula = new javax.swing.JTextField();
        lblnmatricula = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        pnlmatricularegistrada = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatosMatricula = new javax.swing.JTextPane();
        pnlCalificaciones = new javax.swing.JPanel();
        lblValor = new javax.swing.JLabel();
        snnValor = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lbltitulo.setFont(new java.awt.Font("TakaoPGothic", 1, 22)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(51, 224, 235));
        lbltitulo.setText("Registro de Calificaciones");

        pnlRegistromatricula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Registro de matrícula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        lblnmatricula.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        lblnmatricula.setText("N° de matrícula: ");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/search.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        pnlmatricularegistrada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Matricula Registrada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        txtDatosMatricula.setEditable(false);
        jScrollPane1.setViewportView(txtDatosMatricula);

        pnlCalificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Calificaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        lblValor.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        lblValor.setText("Valor: ");

        snnValor.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(20.0f), Float.valueOf(1.0f)));

        btnGuardar.setBackground(new java.awt.Color(76, 213, 28));
        btnGuardar.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCalificacionesLayout = new javax.swing.GroupLayout(pnlCalificaciones);
        pnlCalificaciones.setLayout(pnlCalificacionesLayout);
        pnlCalificacionesLayout.setHorizontalGroup(
            pnlCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalificacionesLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblValor)
                .addGap(129, 129, 129)
                .addComponent(snnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        pnlCalificacionesLayout.setVerticalGroup(
            pnlCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalificacionesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(snnValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlmatricularegistradaLayout = new javax.swing.GroupLayout(pnlmatricularegistrada);
        pnlmatricularegistrada.setLayout(pnlmatricularegistradaLayout);
        pnlmatricularegistradaLayout.setHorizontalGroup(
            pnlmatricularegistradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmatricularegistradaLayout.createSequentialGroup()
                .addGroup(pnlmatricularegistradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlmatricularegistradaLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlmatricularegistradaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(pnlCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pnlmatricularegistradaLayout.setVerticalGroup(
            pnlmatricularegistradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmatricularegistradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pnlCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRegistromatriculaLayout = new javax.swing.GroupLayout(pnlRegistromatricula);
        pnlRegistromatricula.setLayout(pnlRegistromatriculaLayout);
        pnlRegistromatriculaLayout.setHorizontalGroup(
            pnlRegistromatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistromatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblnmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(txtnmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistromatriculaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlmatricularegistrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlRegistromatriculaLayout.setVerticalGroup(
            pnlRegistromatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistromatriculaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlRegistromatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar)
                    .addGroup(pnlRegistromatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblnmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(pnlmatricularegistrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(pnlRegistromatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlRegistromatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
try{
         this.consultarMatricula();
            VtnPrincipal.verMensaje("Busqueda correcta ",titulo,JOptionPane.INFORMATION_MESSAGE);
       
      }catch(Exception e ){
          Util.imprimir("Error: "+ e.toString()); 
          VtnPrincipal.verMensaje("Error al crear la matricula: ", titulo, JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       try{
          if(validar()){
                String mensaje = this.Calificar();
                VtnPrincipal.verMensaje(mensaje,titulo,JOptionPane.INFORMATION_MESSAGE);
            }
       
           
      }catch(Exception e ){
          Util.imprimir("Error: "+ e.toString()); 
          VtnPrincipal.verMensaje("Error al calificar la matricula: ", titulo, JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblnmatricula;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel pnlCalificaciones;
    private javax.swing.JPanel pnlRegistromatricula;
    private javax.swing.JPanel pnlmatricularegistrada;
    private javax.swing.JSpinner snnValor;
    private javax.swing.JTextPane txtDatosMatricula;
    private javax.swing.JTextField txtnmatricula;
    // End of variables declaration//GEN-END:variables
}

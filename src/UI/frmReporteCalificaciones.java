/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BEU.Curso;
import BEU.Matricula;
import BLL.GestionCurso;
import BLL.GestionMatricula;
import Salazar.Util;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labctr
 */
public class frmReporteCalificaciones extends javax.swing.JInternalFrame {

    private final String titulo = "Reporte de Calificaciones";
    private GestionCurso cursosBll = new GestionCurso();
    private GestionMatricula matriculaBll = new GestionMatricula();
    private List<Curso> cursos;
    private final DefaultTableModel dtmCalificaciones = new DefaultTableModel();
    private List<Matricula> calificaciones;

    private void configurarModeloTabla() {
        String[] columnas = {"Nombre", "Promedio", "Estado"};
        this.dtmCalificaciones.setColumnIdentifiers(columnas);
        this.tblReporteCalificaciones.setModel(dtmCalificaciones);
    }

    private void BuscarMatriculas() throws IOException {
        Curso seleccionado = (Curso) this.cmbCurso.getSelectedItem();
        calificaciones = matriculaBll.reportar(seleccionado.getTitulo());
        MostrarCalificaciones();

    }

    private void MostrarCalificaciones() {
        int lim = dtmCalificaciones.getRowCount() - 1;
        for (int i = lim; i >= 0; i--) {
            this.dtmCalificaciones.removeRow(i);
        }
        for (Matricula m : calificaciones) {
            Vector fila = new Vector();
            fila.addElement(m.getEstudiante());
            fila.addElement(m.getPromedio());
            fila.addElement(m.getEstado());
            
            this.dtmCalificaciones.addRow(fila);
        }
        this.tblReporteCalificaciones.setModel(dtmCalificaciones);
    }

    private void leerCurso() {
        try {
            Curso ficticio = new Curso("-Seleccione-", 0.0f, "");
            this.cmbCurso.addItem(ficticio);
            cursos = cursosBll.getCurso();
            //Exprecion lambda
            cursos.forEach((c) -> {
                this.cmbCurso.addItem(c);
            });
        } catch (Exception e) {
            Util.imprimir("Error: " + e.toString() + "\n");
            VtnPrincipal.verMensaje("Error al leer cursos", titulo, JOptionPane.ERROR_MESSAGE);
        }
    }

    public frmReporteCalificaciones() {
        initComponents();
        leerCurso();
        configurarModeloTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        cmbCurso = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporteCalificaciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reporte de calificaciones");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel1.setText("Curso:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/search.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblReporteCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblReporteCalificaciones);

        jLabel2.setFont(new java.awt.Font("TakaoPGothic", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(19, 217, 232));
        jLabel2.setText("Reporte de Calificaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(cmbCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
          this.BuscarMatriculas();
        } catch (Exception e) {
            Util.imprimir("\nError" + e.toString() + "\n");
            VtnPrincipal.verMensaje("Error al buscar Matrícula ",titulo,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<Curso> cmbCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReporteCalificaciones;
    // End of variables declaration//GEN-END:variables
}

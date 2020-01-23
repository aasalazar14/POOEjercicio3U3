package UI;

import BEU.Curso;
import BEU.Estudiante;
import BLL.GestionCurso;
import BLL.GestionEstudiante;
import BLL.GestionMatricula;
import Salazar.Util;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

public class FrmRegistroMatricula extends javax.swing.JInternalFrame {

    private final String titulo = "Registro de calificaciones";
//Servicion //Bussines Logic Layer 

    private GestionCurso cursoBll = new GestionCurso();
    private GestionMatricula matriculaBll = new GestionMatricula();
    private GestionEstudiante estudianteBll = new GestionEstudiante();
    private List<Curso> cursos;
    private List<Estudiante> estudiantes;

    private boolean Validar() {
        Curso cr = (Curso) this.cmbcursos.getSelectedItem();
        if (cr.getTitulo().equals("Seleccione-")) {
            VtnPrincipal.verMensaje("Curso no valido ", titulo, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        Estudiante est = (Estudiante) cmbestudiantes.getSelectedItem();
        if (est.getNombre().equals("---Seleccione----")) {
            VtnPrincipal.verMensaje("Curso no valido ", titulo, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void CrearMatricula() throws IOException {
        if (Validar()) {
            Curso cr = (Curso) this.cmbcursos.getSelectedItem();
            Estudiante est = (Estudiante) cmbestudiantes.getSelectedItem();
            matriculaBll.crear();
            matriculaBll.configurar(cr, est);
            matriculaBll.archivar();
        }

    }

    private void leerCursos() {
        try {
            Curso ficticio = new Curso("Seleccione-", 0.0f, "");
            this.cmbcursos.addItem(ficticio);
            cursos = cursoBll.getCurso();
            cursos.forEach((c) -> {
                this.cmbcursos.addItem(c);
            });
        } catch (Exception e) {
            Util.imprimir("Error: " + e.toString());
            VtnPrincipal.verMensaje("Error al leer los estudiantes"
                    + ": ", titulo, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void leerEstudiantes() {
        try {
            Estudiante ficticio = new Estudiante();
            ficticio.setNombre("---Seleccione----");
            ficticio.setApellido("");
            this.cmbestudiantes.addItem(ficticio);
            estudiantes = estudianteBll.LeerEstudiantes();
            estudiantes.forEach((est) -> {
                this.cmbestudiantes.addItem(est);
            });
        } catch (Exception e) {
            Util.imprimir("Error: " + e.toString());
            VtnPrincipal.verMensaje("Error al leer los estudiantes: ", titulo, JOptionPane.ERROR_MESSAGE);
        }
    }

    public FrmRegistroMatricula() {
        initComponents();
        leerCursos();
        this.leerEstudiantes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitulo = new javax.swing.JLabel();
        pnlRegistroMatricula = new javax.swing.JPanel();
        lblCurso = new javax.swing.JLabel();
        cmbcursos = new javax.swing.JComboBox<>();
        lblEstudiante = new javax.swing.JLabel();
        cmbestudiantes = new javax.swing.JComboBox<>();
        BtnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lbltitulo.setFont(new java.awt.Font("TakaoPGothic", 1, 22)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(249, 27, 27));
        lbltitulo.setText("Registro de Matrícula");

        pnlRegistroMatricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblCurso.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        lblCurso.setText("Curso: ");

        lblEstudiante.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        lblEstudiante.setText("Estudiante: ");

        BtnGuardar.setBackground(new java.awt.Color(49, 228, 30));
        BtnGuardar.setForeground(new java.awt.Color(41, 52, 41));
        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/save.png"))); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistroMatriculaLayout = new javax.swing.GroupLayout(pnlRegistroMatricula);
        pnlRegistroMatricula.setLayout(pnlRegistroMatriculaLayout);
        pnlRegistroMatriculaLayout.setHorizontalGroup(
            pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroMatriculaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbestudiantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbcursos, 0, 263, Short.MAX_VALUE))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistroMatriculaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        pnlRegistroMatriculaLayout.setVerticalGroup(
            pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroMatriculaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbestudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbcursos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(pnlRegistroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(pnlRegistroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        try {
            CrearMatricula();
            VtnPrincipal.verMensaje("Matricula creada correctamente", titulo, JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            Util.imprimir("Error: " + e.toString());
            VtnPrincipal.verMensaje("Error al crear la matricula: ", titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JComboBox<Curso> cmbcursos;
    private javax.swing.JComboBox<Estudiante> cmbestudiantes;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel pnlRegistroMatricula;
    // End of variables declaration//GEN-END:variables
}

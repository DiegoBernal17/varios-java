/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterBoardSM;


import InterBoardSM.Login;
import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Jerry
 */
public class BienvenidoPadre extends javax.swing.JFrame {

    /**
     * Creates new form GenericClassBienvenidoPadre
     */
    public BienvenidoPadre() {
        initComponents();
         panelComponentes.setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setTitle("Bienvenido");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
       
       // Para que se partan automáticamente las líneas al llegar al final 
        areaTextoAvisos.setLineWrap(true); 
        areaTextoTareas.setLineWrap(true); 
        areaTextoReportes.setLineWrap(true); 
        areaTextoNotas.setLineWrap(true);
        areaTextoEventos.setLineWrap(true);

        // Para que el partido se haga respetando las palabras. Sólo se parte la 
        // línea en los espacios entre palabras. 
        areaTextoAvisos.setWrapStyleWord(true); 
        areaTextoTareas.setWrapStyleWord(true); 
        areaTextoReportes.setWrapStyleWord(true); 
        areaTextoNotas.setWrapStyleWord(true);
        areaTextoEventos.setWrapStyleWord(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelComponentes = new javax.swing.JPanel();
        etiquetaPeriodoEscolar = new javax.swing.JLabel();
        boxNombre = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        comboBoxNombreAlumno = new javax.swing.JComboBox<>();
        etiquetaAlumno = new javax.swing.JLabel();
        etiquetaMatricula = new javax.swing.JLabel();
        boxPeriodoEscolar = new javax.swing.JTextField();
        boxMatricula = new javax.swing.JTextField();
        etiquetaGrupo = new javax.swing.JLabel();
        boxGrupo = new javax.swing.JTextField();
        tabPestañas = new javax.swing.JTabbedPane();
        ScrollPanelAvisos = new javax.swing.JScrollPane();
        areaTextoAvisos = new javax.swing.JTextArea();
        ScrollPaneTareas = new javax.swing.JScrollPane();
        areaTextoTareas = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCalificaciones = new javax.swing.JTable();
        ScrollPaneReportes = new javax.swing.JScrollPane();
        areaTextoReportes = new javax.swing.JTextArea();
        ScrollPaneNotas = new javax.swing.JScrollPane();
        areaTextoNotas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTextoEventos = new javax.swing.JTextArea();
        botonEnviarComentarios = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelComponentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaPeriodoEscolar.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        etiquetaPeriodoEscolar.setText("Periodo escolar;");
        panelComponentes.add(etiquetaPeriodoEscolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        boxNombre.setText("Nombre del padre");
        panelComponentes.add(boxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 410, 30));

        etiquetaNombre.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        etiquetaNombre.setText("Nombre:");
        panelComponentes.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        comboBoxNombreAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar alumno", "Jesus Gerardo Saucedo Gonzalez", "Roberto Alejandro Benitez Guerra", "Diego Ivan Padila Bernal" }));
        panelComponentes.add(comboBoxNombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 410, 30));

        etiquetaAlumno.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        etiquetaAlumno.setText("Alumno:");
        panelComponentes.add(etiquetaAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        etiquetaMatricula.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        etiquetaMatricula.setText("Matricula:");
        panelComponentes.add(etiquetaMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        boxPeriodoEscolar.setText("Periodo");
        panelComponentes.add(boxPeriodoEscolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 140, 30));

        boxMatricula.setText("Matricula");
        panelComponentes.add(boxMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 110, 30));

        etiquetaGrupo.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        etiquetaGrupo.setText("Grupo:");
        panelComponentes.add(etiquetaGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        boxGrupo.setText("grupo");
        panelComponentes.add(boxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 110, 30));

        tabPestañas.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N

        areaTextoAvisos.setColumns(20);
        areaTextoAvisos.setRows(5);
        ScrollPanelAvisos.setViewportView(areaTextoAvisos);

        tabPestañas.addTab("Avisos", ScrollPanelAvisos);

        areaTextoTareas.setColumns(20);
        areaTextoTareas.setRows(5);
        ScrollPaneTareas.setViewportView(areaTextoTareas);

        tabPestañas.addTab("Tareas", ScrollPaneTareas);

        tablaCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Materia", "Calificacion"
            }
        ));
        jScrollPane1.setViewportView(tablaCalificaciones);

        tabPestañas.addTab("Calificaciones", jScrollPane1);

        areaTextoReportes.setColumns(20);
        areaTextoReportes.setRows(5);
        areaTextoReportes.setText("\n\n\n\n\n\n\n\n\n\n\n");
        ScrollPaneReportes.setViewportView(areaTextoReportes);

        tabPestañas.addTab("Reportes", ScrollPaneReportes);

        areaTextoNotas.setColumns(20);
        areaTextoNotas.setRows(5);
        areaTextoNotas.setText("Si desea enviar algun comentario debe presionar el boton\nenviar comentarios, esto lo llevara a una nueva ventana donde\npodra llenar el formulario correcto para enviar el comentario");
        ScrollPaneNotas.setViewportView(areaTextoNotas);

        tabPestañas.addTab("Notas", ScrollPaneNotas);

        areaTextoEventos.setColumns(20);
        areaTextoEventos.setRows(5);
        jScrollPane2.setViewportView(areaTextoEventos);

        tabPestañas.addTab("Eventos", jScrollPane2);

        panelComponentes.add(tabPestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 520, 260));

        botonEnviarComentarios.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        botonEnviarComentarios.setText("Enviar comentarios");
        botonEnviarComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarComentariosActionPerformed(evt);
            }
        });
        panelComponentes.add(botonEnviarComentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 280, 30));

        botonCerrarSesion.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        botonCerrarSesion.setText("Cerrar sesion");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });
        panelComponentes.add(botonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 160, 30));

        getContentPane().add(panelComponentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        if(evt.getSource()==botonCerrarSesion){
           Login login = new Login(); //SE CREA OBJETO TIPO MIS GRUPOS PARA LLAMAR AL FRAME
           login.setVisible(true); //SE LLAMA AL FRAME
           this.dispose(); //CIERRA LA VENTANA 
        }
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void botonEnviarComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarComentariosActionPerformed
        JOptionPane.showMessageDialog(null,"SE PRESIONO ENVIAR COMENTARIOS");
        EnviarComentarios enviarComentarios = new EnviarComentarios();
        enviarComentarios.setVisible(true);
//this.dispose();
    }//GEN-LAST:event_botonEnviarComentariosActionPerformed

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
            java.util.logging.Logger.getLogger(BienvenidoPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BienvenidoPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BienvenidoPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BienvenidoPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BienvenidoPadre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneNotas;
    private javax.swing.JScrollPane ScrollPaneReportes;
    private javax.swing.JScrollPane ScrollPaneTareas;
    private javax.swing.JScrollPane ScrollPanelAvisos;
    private javax.swing.JTextArea areaTextoAvisos;
    private javax.swing.JTextArea areaTextoEventos;
    private javax.swing.JTextArea areaTextoNotas;
    private javax.swing.JTextArea areaTextoReportes;
    private javax.swing.JTextArea areaTextoTareas;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonEnviarComentarios;
    private javax.swing.JTextField boxGrupo;
    private javax.swing.JTextField boxMatricula;
    private javax.swing.JTextField boxNombre;
    private javax.swing.JTextField boxPeriodoEscolar;
    private javax.swing.JComboBox<String> comboBoxNombreAlumno;
    private javax.swing.JLabel etiquetaAlumno;
    private javax.swing.JLabel etiquetaGrupo;
    private javax.swing.JLabel etiquetaMatricula;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPeriodoEscolar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelComponentes;
    private javax.swing.JTabbedPane tabPestañas;
    private javax.swing.JTable tablaCalificaciones;
    // End of variables declaration//GEN-END:variables
}

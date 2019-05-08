/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterBoardSM;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Jerry
 */
public class ReportarCalificaciones extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenido
     */
    public ReportarCalificaciones() {
        initComponents();
       panelComponentes.setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setTitle("Inicio");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
       
    
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
        etiquetaGrupo = new javax.swing.JLabel();
        comboBoxGrupo = new javax.swing.JComboBox<>();
        comboBoxMateria = new javax.swing.JComboBox<>();
        etiquetaMateria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        botonCancelar = new javax.swing.JButton();
        botonEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelComponentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaGrupo.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        etiquetaGrupo.setText("Grupo:");
        panelComponentes.add(etiquetaGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 70, 30));

        comboBoxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G" }));
        panelComponentes.add(comboBoxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 220, 30));

        comboBoxMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G" }));
        panelComponentes.add(comboBoxMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 220, 30));

        etiquetaMateria.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        etiquetaMateria.setText("Materia:");
        panelComponentes.add(etiquetaMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 90, 30));

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null},
                {"2", null, null},
                {"3", null, null},
                {"4", null, null},
                {"5", null, null},
                {"6", null, null},
                {"7", null, null},
                {"8", null, null},
                {"9", null, null},
                {"10", null, null},
                {"11", "", null},
                {"12", null, null},
                {"13", null, null},
                {"14", null, null},
                {"15", null, null},
                {"16", null, null},
                {"17", null, null},
                {"18", null, null},
                {"19", null, null},
                {"20", null, null},
                {"21", null, null},
                {"22", null, null},
                {"23", null, null},
                {"24", null, null},
                {"25", null, null}
            },
            new String [] {
                "#", "Nombre", "Calificacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAlumnos);
        if (tablaAlumnos.getColumnModel().getColumnCount() > 0) {
            tablaAlumnos.getColumnModel().getColumn(0).setResizable(false);
            tablaAlumnos.getColumnModel().getColumn(0).setPreferredWidth(25);
            tablaAlumnos.getColumnModel().getColumn(1).setPreferredWidth(370);
            tablaAlumnos.getColumnModel().getColumn(2).setResizable(false);
            tablaAlumnos.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        panelComponentes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 470, -1));

        botonCancelar.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        panelComponentes.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, -1, -1));

        botonEnviar.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        botonEnviar.setText("Enviar");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });
        panelComponentes.add(botonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 110, -1));

        getContentPane().add(panelComponentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
         if(evt.getSource()==botonCancelar){
           this.dispose(); //CIERRA LA VENTANA 
        
        }
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
         if(evt.getSource()==botonEnviar){
          JOptionPane.showMessageDialog(null,"CALIFICACIONES publicadas exitosamente");
           this.dispose(); //CIERRA LA VENTANA 
        
        }
    }//GEN-LAST:event_botonEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(ReportarCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportarCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportarCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportarCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportarCalificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JComboBox<String> comboBoxGrupo;
    private javax.swing.JComboBox<String> comboBoxMateria;
    private javax.swing.JLabel etiquetaGrupo;
    private javax.swing.JLabel etiquetaMateria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelComponentes;
    private javax.swing.JTable tablaAlumnos;
    // End of variables declaration//GEN-END:variables
}
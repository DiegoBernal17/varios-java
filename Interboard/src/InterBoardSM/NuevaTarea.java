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
public class NuevaTarea extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenido
     */
    public NuevaTarea() {
        initComponents();
       panelComponentes.setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setTitle("Nueva tarea");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
       
       // Para que se partan automáticamente las líneas al llegar al final 
        areaTextoTareas.setLineWrap(true); 

        // Para que el partido se haga respetando las palabras. Sólo se parte la 
        // línea en los espacios entre palabras. 
        areaTextoTareas.setWrapStyleWord(true); 
    
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
        etiquetaNombreTarea = new javax.swing.JLabel();
        boxNombreTareas = new javax.swing.JTextField();
        etiquetaFechaEntrega = new javax.swing.JLabel();
        comboBoxDia = new javax.swing.JComboBox<>();
        comboBoxMes = new javax.swing.JComboBox<>();
        comboBoxAnio = new javax.swing.JComboBox<>();
        etiquetaGrupo = new javax.swing.JLabel();
        comboBoxGrupos = new javax.swing.JComboBox<>();
        etiquetaDescripcionTarea = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoTareas = new javax.swing.JTextArea();
        botonCancelar = new javax.swing.JButton();
        botonEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelComponentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaNombreTarea.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        etiquetaNombreTarea.setText("Nombre de la tarea:");
        panelComponentes.add(etiquetaNombreTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, 30));

        boxNombreTareas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelComponentes.add(boxNombreTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 260, 30));

        etiquetaFechaEntrega.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        etiquetaFechaEntrega.setText("Fecha de entrega:");
        panelComponentes.add(etiquetaFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 20));

        comboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        panelComponentes.add(comboBoxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        comboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octube", "Noviembre", "Diciembre" }));
        panelComponentes.add(comboBoxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        comboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2015", "2016", "2017", "2018", "2019", "2020" }));
        panelComponentes.add(comboBoxAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        etiquetaGrupo.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        etiquetaGrupo.setText("Grupo:");
        panelComponentes.add(etiquetaGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, 30));

        comboBoxGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelComponentes.add(comboBoxGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 200, 30));

        etiquetaDescripcionTarea.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        etiquetaDescripcionTarea.setText("Descripcion de la tarea:");
        panelComponentes.add(etiquetaDescripcionTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 30));

        areaTextoTareas.setColumns(20);
        areaTextoTareas.setRows(5);
        jScrollPane1.setViewportView(areaTextoTareas);

        panelComponentes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 450, 140));

        botonCancelar.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        panelComponentes.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        botonEnviar.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        botonEnviar.setText("Enviar");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });
        panelComponentes.add(botonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 110, -1));

        getContentPane().add(panelComponentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
          if(evt.getSource()==botonCancelar){
             this.dispose(); //CIERRA LA VENTANA 
        
        }
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        if(evt.getSource()==botonEnviar){
          JOptionPane.showMessageDialog(null,"Tarea enviada exitosamente");
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
            java.util.logging.Logger.getLogger(NuevaTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoTareas;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JTextField boxNombreTareas;
    private javax.swing.JComboBox<String> comboBoxAnio;
    private javax.swing.JComboBox<String> comboBoxDia;
    private javax.swing.JComboBox<String> comboBoxGrupos;
    private javax.swing.JComboBox<String> comboBoxMes;
    private javax.swing.JLabel etiquetaDescripcionTarea;
    private javax.swing.JLabel etiquetaFechaEntrega;
    private javax.swing.JLabel etiquetaGrupo;
    private javax.swing.JLabel etiquetaNombreTarea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelComponentes;
    // End of variables declaration//GEN-END:variables
}

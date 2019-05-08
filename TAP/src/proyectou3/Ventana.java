package proyectou3;

public class Ventana extends javax.swing.JFrame {
    int IncX=1;
    int IncY=1;
     boolean salir=false;
    
     public Ventana() {
        initComponents();
     }
    
                           
     private void initComponents() {

        jButton1 = new javax.swing.JButton();
         jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
         jButton4 = new javax.swing.JButton();
         jLabel1 = new javax.swing.JLabel();

         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setTitle("Control de Hilos");
 
         jButton1.setText("Pausar");
         jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton1ActionPerformed(evt);
             }
        });
 
         jButton2.setText("Disminuir");
         jButton2.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton2ActionPerformed(evt);
            }
       });

        jButton3.setText("Aumentar");
         jButton3.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
         });
 
         jButton4.setText("Terminar");
         jButton4.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
             }
         });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
         jLabel1.setText("Control de los Hilos");
 
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGap(106, 106, 106)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                         .addContainerGap())
                     .addGroup(layout.createSequentialGroup()
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                             .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                             .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                         .addContainerGap())))
             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                 .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
         );
         layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()                 .addContainerGap()
                .addComponent(jLabel1)
                 .addGap(11, 11, 11)
                 .addComponent(jButton1)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addComponent(jButton2)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addComponent(jButton3)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addComponent(jButton4)
                 .addContainerGap(37, Short.MAX_VALUE))
         );
 
         pack();
     }// </editor-fold>                        

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     IncX=0;
     IncY=0;
         // TODO add your handling code here:
     }                                        
 
     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
   IncX+=1;
     IncY+=1;
     if(IncX>10)IncX=10;
    if(IncY>10)IncY=10;
         // TODO add your handling code here:
     }                                        
 
     private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     IncX-=1;
     IncY-=1;
     if(IncX>-10)IncX=-10;
     if(IncY>-10)IncY=-10;
         // TODO add your handling code here:
     }                                        
 
     private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         System.exit(0);
        // TODO add your handling code here:
     }                                        
     
     
     // Variables declaration - do not modify                     
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton2;
     private javax.swing.JButton jButton3;
     private javax.swing.JButton jButton4;
     private javax.swing.JLabel jLabel1;
     // End of variables declaration                   
 
 }

package metodosnumericos;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {
    errores er = new errores();
    WinBiseccion Unidad2Bi = new WinBiseccion();
    VentanaPuntoFIjo Unidad2PuntoFijo = new VentanaPuntoFIjo();
    VentanaNewton VNewton = new VentanaNewton();
    VentanaSecante Unidad2Sec = new VentanaSecante(); 
    Gauss MG = new Gauss();
    Jacobi MJ = new Jacobi();
    NewtonRaphson MNR = new NewtonRaphson();
    MetodoDelPuntoFijo MPF = new MetodoDelPuntoFijo();
 
    public Principal() {
        initComponents();
        //this.setLayout(null);
        this.setSize(1024, 600);
        this.setTitle("Metodo de Biseccion");
        //this.setResizable(false);
        this.setLocationRelativeTo(null);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Errores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        Newton = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        Unidad3 = new javax.swing.JMenu();
        MGauss = new javax.swing.JMenuItem();
        MJacobi = new javax.swing.JMenuItem();
        MPuntoFijo = new javax.swing.JMenuItem();
        MNewtonRapson = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(153, 204, 255));

        jTextField1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jTextField1.setText("OSCAR DAVID AGUILAR CAMARA");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jTextField4.setText("LUIS MANUEL LORIA PECH");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jTextField5.setText("LUIS RICARDO SALAZAR CETINA");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        desktopPane.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jTextField5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jMenu1.setText("MétodosNúmericos");

        jMenu4.setText("Unidad 1");

        Errores.setText("Errores Absoluto y Relativo con los metodos Redondeo y Truncamiento");
        Errores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErroresActionPerformed(evt);
            }
        });
        jMenu4.add(Errores);

        jMenu1.add(jMenu4);

        jMenu3.setText("Unidad 2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Metodo Bisección ");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Punto Fijo");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem2);

        Newton.setSelected(true);
        Newton.setText("Método Newton");
        Newton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewtonActionPerformed(evt);
            }
        });
        jMenu3.add(Newton);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Método Secante");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem3);

        jMenu1.add(jMenu3);

        Unidad3.setText("Unidad 3");

        MGauss.setText("Metodo Gauss");
        MGauss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MGaussActionPerformed(evt);
            }
        });
        Unidad3.add(MGauss);

        MJacobi.setText("Metodo Jacobi");
        MJacobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MJacobiActionPerformed(evt);
            }
        });
        Unidad3.add(MJacobi);

        MPuntoFijo.setText("Metodo Punto Fijo");
        MPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPuntoFijoActionPerformed(evt);
            }
        });
        Unidad3.add(MPuntoFijo);

        MNewtonRapson.setText("Metodo Newton Rapson");
        MNewtonRapson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNewtonRapsonActionPerformed(evt);
            }
        });
        Unidad3.add(MNewtonRapson);

        jMenu1.add(Unidad3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPuntoFijoActionPerformed
    if (!desktopPane.isAncestorOf(MPF)) {
            int x = (desktopPane.getWidth() / 2) - (MPF.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (MPF.getHeight() / 2);
            desktopPane.add(MPF);
            MPF.toFront();
            MPF.setLocation(x, y + 50);
            MPF.setVisible(true);
            MPF.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } else {
            desktopPane.setSelectedFrame(MPF);
        }    
    }//GEN-LAST:event_MPuntoFijoActionPerformed

    private void MGaussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MGaussActionPerformed
    if (!desktopPane.isAncestorOf(MG)) {
            int x = (desktopPane.getWidth() / 2) - (MG.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (MG.getHeight() / 2);
            desktopPane.add(MG);
            MG.toFront();
            MG.setLocation(x, y + 50);
            MG.setVisible(true);
            MG.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } else {
            desktopPane.setSelectedFrame(MG);
        }    
    }//GEN-LAST:event_MGaussActionPerformed
    
    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        // TODO add your handling code here:
        if (!desktopPane.isAncestorOf(Unidad2Sec)) {
            int x = (desktopPane.getWidth() / 2) - (Unidad2Sec.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (Unidad2Sec.getHeight() / 2);
            desktopPane.add(Unidad2Sec);
            Unidad2Sec.toFront();
            Unidad2Sec.setLocation(x, y + 50);
            Unidad2Sec.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(Unidad2Sec);
        }

    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    private void NewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewtonActionPerformed
        // TODO add your handling code here:
        if (!desktopPane.isAncestorOf(VNewton)) {
            int x = (desktopPane.getWidth() / 2) - (VNewton.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (VNewton.getHeight() / 2);
            desktopPane.add(VNewton);
            VNewton.toFront();
            VNewton.setLocation(x, y + 50);
            VNewton.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(VNewton);
        }
    }//GEN-LAST:event_NewtonActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
        //mostrar ventana Punto Fijo
        if (!desktopPane.isAncestorOf(Unidad2PuntoFijo)) {
            int x = (desktopPane.getWidth() / 2) - (Unidad2PuntoFijo.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (Unidad2PuntoFijo.getHeight() / 2);
            desktopPane.add(Unidad2PuntoFijo);
            Unidad2PuntoFijo.toFront();
            Unidad2PuntoFijo.setLocation(x, y + 50);
            Unidad2PuntoFijo.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(Unidad2PuntoFijo);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
        //Mostrar Ventana Biseccion
        if (!desktopPane.isAncestorOf(Unidad2Bi)) {
            int x = (desktopPane.getWidth() / 2) - (Unidad2Bi.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (Unidad2Bi.getHeight() / 2);
            desktopPane.add(Unidad2Bi);
            Unidad2Bi.toFront();
            Unidad2Bi.setLocation(x, y + 50);
            Unidad2Bi.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(Unidad2Bi);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void MJacobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MJacobiActionPerformed
    if (!desktopPane.isAncestorOf(MJ)) {
            int x = (desktopPane.getWidth() / 2) - (MJ.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (MJ.getHeight() / 2);
            desktopPane.add(MJ);
            MJ.toFront();
            MJ.setLocation(x, y + 50);
            MJ.setVisible(true);
            MJ.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } else {
            desktopPane.setSelectedFrame(MJ);
        }      
    }//GEN-LAST:event_MJacobiActionPerformed

    private void MNewtonRapsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNewtonRapsonActionPerformed
        if (!desktopPane.isAncestorOf(MNR)) {
            int x = (desktopPane.getWidth() / 2) - (MNR.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (MNR.getHeight() / 2);
            desktopPane.add(MNR);
            MNR.toFront();
            MNR.setLocation(x, y + 50);
            MNR.setVisible(true);
            MNR.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } else {
            desktopPane.setSelectedFrame(MNR);
        }    
    }//GEN-LAST:event_MNewtonRapsonActionPerformed

    private void ErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErroresActionPerformed
        if (!desktopPane.isAncestorOf(er)) {
            int x = (desktopPane.getWidth() / 2) - (er.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (er.getHeight() / 2);
            desktopPane.add(er);
            er.toFront();
            er.setLocation(x, y + 50);
            er.setVisible(true);
            er.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } else {
            desktopPane.setSelectedFrame(er);
        }   
    }//GEN-LAST:event_ErroresActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Errores;
    private javax.swing.JMenuItem MGauss;
    private javax.swing.JMenuItem MJacobi;
    private javax.swing.JMenuItem MNewtonRapson;
    private javax.swing.JMenuItem MPuntoFijo;
    private javax.swing.JCheckBoxMenuItem Newton;
    private javax.swing.JMenu Unidad3;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}

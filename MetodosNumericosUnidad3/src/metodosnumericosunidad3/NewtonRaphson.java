
package metodosnumericos;

import javax.swing.JOptionPane;
import org.nfunk.jep.ParseException;

public class NewtonRaphson extends javax.swing.JInternalFrame {

    private Funcion F;
    
    public NewtonRaphson() {
        initComponents();
        fun.requestFocus();
        this.setTitle("METODO DE NEWTON RAPHSON");
        this.setResizable(false);
        this.setClosable(true);
        this.setIconifiable(true);
        this.setMaximizable(false);   
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Aceptar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        fun = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Res = new javax.swing.JTextArea();
        txtx0 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método de Newton-Raphson");

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        fun.setFont(new java.awt.Font("Liberation Serif", 0, 15)); // NOI18N
        fun.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Res.setColumns(20);
        Res.setEditable(false);
        Res.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        Res.setRows(5);
        jScrollPane1.setViewportView(Res);

        txtx0.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        txtx0.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Xo");

        jLabel3.setText("Función");

        salir.setBackground(new java.awt.Color(242, 241, 240));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodosnumericos/salir.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fun, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(salir)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtx0, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtx0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Aceptar)
                .addGap(16, 16, 16)
                .addComponent(Borrar)
                .addGap(30, 30, 30)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        double x = 0;
        double x0 = 0;
        double Ear = 0;
        int max = 0;
        int dec = 0;
        String deri = null;

        Res.setText(null);
        F = new Funcion(fun.getText());
        String r = "";
        int i = 0;
        boolean si = true;
        double tol = 0;
        max = 0;
        do {
            try {
                double xAnt = x;
                F.setF(fun.getText());
                if (i == 0) {
                    deri = F.Derivada();
                    x0 = Double.parseDouble(txtx0.getText());
                    xAnt = x0;
                    dec = F.decimales();
                    if (F.menu() == 1) {
                        max = F.iteraciones();
                    } else {
                        tol = F.tolerancia();
                    }
                }
                double fx = F.Evaluar(xAnt);
                F.setF(deri);
                x = F.Redondear(xAnt - (fx/F.Evaluar(xAnt)), dec);
                Ear = F.Redondear(Math.abs((x - xAnt) / x), dec > 10 ? dec : 8);
                if (Ear == 0) {
                    max = 0;
                    tol = 0;
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Función Incorrecta", "ERROR", 0);
                max = 0;
                tol = 0;
                fun.requestFocus();
                si = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor Inicial Incorrecto", "ERROR", 0);
                max = 0;
                tol = 0;
                txtx0.setText(null);
                txtx0.requestFocus();
                si = false;
            }
            i++;
            if (tol == 0) {
                max--;
            } else if (Ear < tol && i != 1) {
                tol = 0;
            }
        } while (max > 0 || tol > 0 && i < 500);
        if (i == 500) {
            r = "La Función Diverge\n\n";
        }
        r += ("Iteración: " + i + "\nX" + i + "        : " + x + "\n"
                + "Er         : " + Ear + "\n\n");

        if (si) {
            JOptionPane.showMessageDialog(null, "Iteraciones Realizadas!", "Resultados", JOptionPane.INFORMATION_MESSAGE);
            Res.setText(r + "\nRespuesta Aproximada\nX ≈ " + x);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        Res.setText(null);
        txtx0.setText(null);
        fun.setText(null);
        fun.requestFocus();
    }//GEN-LAST:event_BorrarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewtonRaphson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new NewtonRaphson().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Borrar;
    private javax.swing.JTextArea Res;
    private javax.swing.JTextField fun;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txtx0;
    // End of variables declaration//GEN-END:variables
}

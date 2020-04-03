
package metodosnumericostema3;

import java.math.RoundingMode;
import java.text.NumberFormat;


public class errores extends javax.swing.JInternalFrame {
public String resultado;
    /**
     * Creates new form errores
     */
   
    
    public errores() {
        initComponents();
        this.setTitle("ERRORES");
        this.setResizable(false);
        this.setClosable(true);
        this.setIconifiable(true);
        this.setMaximizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
       //boton para mostrar el resultado
        System.exit(0);
   
    }                                        

    private void truncamientoActionPerformed(java.awt.event.ActionEvent evt) {                                             

        //metodo trunck
    String primera,segunda,obde;
    int d;
    primera=p.getText();
    segunda=pa.getText();
    double pri,pro;
    pri=Double.parseDouble(primera);
    pro=Double.parseDouble(segunda);
    
    double P,Q;
    P=pri;
    Q=pro;
    double EA,ER;
    EA = Math.abs(P - Q);
    ER = Math.abs((P - Q) / P);
    
    
   
    obde=decimal.getText();
    d=Integer.parseInt(obde);
    
    // metodo trunk 
    NumberFormat numberFormat = NumberFormat.getInstance();
    numberFormat.setMaximumFractionDigits(d);
    numberFormat.setRoundingMode( RoundingMode.DOWN);
    
     String nueva=numberFormat.format(EA);
     String nuevaa=numberFormat.format(ER);
// truncamos un número
    
    ///
    resultado n = new resultado();
    n.ere.setText(nueva);
    n.era1.setText(nuevaa);
    
    n.setVisible(true);
    this.setVisible(false);    
    }                                            

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // metodo redondeo
    }                                       

    private void redondeoActionPerformed(java.awt.event.ActionEvent evt) {                                         
String primera,segunda,obde;
    int d;
    primera=p.getText();
    segunda=pa.getText();
    double pri,pro;
    pri=Double.parseDouble(primera);
    pro=Double.parseDouble(segunda);
    
    double P,Q;
    P=pri;
    Q=pro;
    double EA,ER;
    EA = Math.abs(P - Q);
    ER = Math.abs((P - Q) / P);
    
    
   
    obde=decimal.getText();
    d=Integer.parseInt(obde);     
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(d);
            numberFormat.setRoundingMode(RoundingMode.HALF_UP);
            
            double resulf;
            String resulf2;
            String l =numberFormat.format(EA);
            String lL =numberFormat.format(ER);
            resultado n = new resultado();
            
            n.ere.setText(l);
            n.era1.setText(lL);
    
    n.setVisible(true);
    
    
    }                                        
  

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
            java.util.logging.Logger.getLogger(errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new errores().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify                     
    public static javax.swing.JTextField decimal;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextPane p;
    public static javax.swing.JTextPane pa;
    public static javax.swing.JRadioButton redondeo;
    public static javax.swing.JRadioButton truncamiento;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

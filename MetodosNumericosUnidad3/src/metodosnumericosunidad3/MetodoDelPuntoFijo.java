
package metodosnumericosunidad3;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;

public class MetodoDelPuntoFijo extends  javax.swing.JInternalFrame {

    public MetodoDelPuntoFijo() {
        initComponents();
        this.setTitle("METODO DEL PUNTO FIJO");
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
 private void funcion_gxActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          
    
    private void eActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
    }                                 
    
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:

        PuntoFijo m = new PuntoFijo();
        m.borrarColeccion();// llamamos al metodo que borra todos los elemento de la coleccion pasada
        try {
            JEP j = new JEP();
            j.addStandardConstants();
            j.addStandardFunctions();
            
            String def = funcion.getText();
            String gx = funcion_gx.getText();
            
            
            j.parseExpression(x0.getText());// pasamos a convertr la expresion ingresada en la casilla x0
            double lx0 = j.getValue();
            
            j.parseExpression(funcion_gx.getText());// pasamos a convertr la expresion ingresada en la casilla x1
            double lx1 = j.getValue();
            
            j.parseExpression(e.getText());// pasamos a convertr la expresion ingresada en la casilla  de tolerancia
            double tolerancia = j.getValue();
            
            int ln = Integer.parseInt(n.getText());// pasamos a convertr la expresion ingresada en la casilla  de numero maximo de iteraciones

            FuncionPf f = new FuncionPf(def, gx);
            PuntoFijo s = new PuntoFijo();
            String r = s.raiz(f, lx0, ln, tolerancia);
            if (r.equals("la funcion x=g(x)\n No converge \n al punto fijo buscado\n o el número de iteraciones \nes insuficiente")  || r.equals("Infinity")||r.equals("-Infinity")) {
                imprimeIteraciones.setText(" la funcion x=g(x)\n No converge \n al punto fijo buscado\n o el número de iteraciones \nes insuficiente");
            } else {
                raiz.setText(r);
                
                // pasamos a graficar a la funcion
                // arreglos usados para almacenar una particion en un intervalo en el que esta definoda la funcion ingresada
                double x[] = new double[200];
                double y[] = new double[200];
                
                double xi = lx0-10;//variable usada para los puntos dentro de la particion
                for (int i = 0; i < 200; i++) {
                    x[i] = xi + i * 0.1; //almacenamos valores xi que seran evaluados en la funcion ingresada es decir f(xi)

                    JEP funcionx_h = new JEP();
                    funcionx_h.addStandardFunctions(); // adiciona las funciones matem´aticas
                    funcionx_h.addStandardConstants(); // adiciona las constantes matem´aticas
                    funcionx_h.setImplicitMul(true);
                    funcionx_h.addVariable("x", x[i]);// evaluamos la funcion ingresada en el funto xi
                    // obtener el resultado de evaluar la expresi´on
                    funcionx_h.parseExpression(def); // paso de la expresi´on a evaluar
                    String inde=Double.toString(funcionx_h.getValue());// variable usada para verificar asintodas en la grafica de f(x)
                        if ( inde.equals("NaN") || inde.equals("-Infinity") || inde.equals("Infinity") ) {
                            
                        }else  {
                            y[i] = funcionx_h.getValue();// almacenamos el valor f(xi)  en el arreglo y
                        }

                }
//                grafica.addLegend("SOUTH");
//                grafica.removeAllPlots();//borrar la grafica anterior
//                grafica.addLinePlot(def, x, y);// aderios a la grafica el nombre de la funcion a rencontrar la raiz y los puntos que se usaran para obtener la grafic f(x)

                numIteraciones.setText("");
                imprimeIteraciones.setText("");
                ArrayList iteraciones = new ArrayList();
                iteraciones = PuntoFijo.getIteraciones();
                numIteraciones.setText(Integer.toString(iteraciones.size() - 1));// muestra el numero de iteraciones realizadas
                // pasamos a mostrar todas las iteraciones realizadas
                for (int i = 1; i < iteraciones.size(); i++) {
                    
                    imprimeIteraciones.append("x" + i + "=" + iteraciones.get(i) + "\n");
                }// fin for             
            
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA LECTURA DE DATOS", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }                                        
    
    private void x3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  
    
    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  
    
    private void calcular1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

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
            java.util.logging.Logger.getLogger(MetodoDelPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodoDelPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodoDelPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodoDelPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodoDelPuntoFijo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton calcular;
    private javax.swing.JButton calcular1;
    private javax.swing.JTextField e;
    private javax.swing.JTextField e1;
    private javax.swing.JTextField funcion;
    private javax.swing.JTextField funcion1;
    private javax.swing.JTextField funcion_gx;
    private javax.swing.JTextArea imprimeIteraciones;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField n;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField numIteraciones;
    private javax.swing.JTextField raiz;
    private javax.swing.JTextField raiz1;
    private javax.swing.JTextField x0;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

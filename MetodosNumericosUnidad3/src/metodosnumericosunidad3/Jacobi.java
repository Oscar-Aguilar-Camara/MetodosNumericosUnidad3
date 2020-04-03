
package metodosnumericosunidad3;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Jacobi extends javax.swing.JInternalFrame {
   
    public Jacobi() {
        initComponents();
        this.setTitle("Metodo Jacobi");
        this.setResizable(false);
        this.setClosable(true);
        this.setIconifiable(true);
        this.setMaximizable(false);
    }
//------------------------------------------------------------------------------   
    double arreglo_x []= new double[10000];  // arreglos donde se guardaran
    double arreglo_y []= new double[10000];  //los valores de x,y,z en cada   
    double arreglo_z []= new double[10000];  //en cada iteracion
   
    int metodo;  //guarda el numero de seleccion despeglable (pa saber q metodo elige el usuario    gauss o jacobi)
    int indice;  //indice para recorrer los arreglos
    double error;  // variable pal error que ingrese el usuario  
   
    double errorX ;  // arreglos donde almaceno los valores de errores de cada una
    double errorY ;  // de las incognitas X,Y,Z cada vez
    double errorZ ; 
   
    double X1,X2,X3,  Y1,Y2,Y3,   Z1,Z2,Z3;  // variables pa guardar los valores de los textfield
    double val1,val2,val3;         //variables de igualacion de la ecuacion;  osea despues del signo igual
//------------------------------------------------------------------------------    
public void getvalors (){
 error = Double.parseDouble(valorerror.getText()); // guardadando el valor de error porcentual
     
            X1 = Double.parseDouble(jTextField1.getText());               
            X2 = Double.parseDouble(jTextField2.getText());
            X3 = Double.parseDouble(jTextField3.getText());
       
            Y1 = Double.parseDouble(jTextField4.getText());
            Y2 = Double.parseDouble(jTextField5.getText());
            Y3 = Double.parseDouble(jTextField6.getText());
       
            Z1 = Double.parseDouble(jTextField7.getText());
            Z2 = Double.parseDouble(jTextField8.getText());
            Z3 = Double.parseDouble(jTextField9.getText());
       
            val1 = Double.parseDouble(jTextField10.getText());
            val2 = Double.parseDouble(jTextField11.getText());
            val3 = Double.parseDouble(jTextField12.getText());
             
//asigno en la primera posicion de los arreglos el valor que nos dan de inicio
            arreglo_x [0] = Double.parseDouble(valx.getText());  
            arreglo_y [0] = Double.parseDouble(valy.getText());  
            arreglo_z [0] = Double.parseDouble(valz.getText());
            
//a variables error guardo el error porcentual +1  
            errorX = Double.parseDouble(valorerror.getText())+1;
            errorY = Double.parseDouble(valorerror.getText())+1;
            errorZ = Double.parseDouble(valorerror.getText())+1;
}//fin del metodo getvalors
//------------------------------------------------------------------------------
public void metodo_jacobi (){
indice = 1;           
        while (errorX > error || errorY > error || errorZ > error){
            
           //despejo y guardo el valor nuevo de cada variable en el arreglo correspondiente
arreglo_x [indice] = (val1-(Y1*arreglo_y[indice-1])-(Z1*arreglo_z[indice-1]))/X1;

arreglo_y [indice] = (val2-(X2*arreglo_x[indice-1])-(Z2*arreglo_z[indice-1]))/Y2;
  
arreglo_z [indice] = (val3-(X3*arreglo_x[indice-1])-(Y3*arreglo_y[indice-1]))/Z3;
       
           //calculamos los errorres de cada variables  
 errorX  = Math.abs((arreglo_x[indice] - arreglo_x[indice-1])/arreglo_x[indice])*100; 
 errorY  = Math.abs((arreglo_y[indice] - arreglo_y[indice-1])/arreglo_y[indice])*100; 
 errorZ  = Math.abs((arreglo_z[indice] - arreglo_z[indice-1])/arreglo_z[indice])*100; 
                       
  //aqui solo se manda a imprimir en TextArea los resultado de esta iteracion
            resultado.append("iteracion numero <-----> " + indice +"\n");
            resultado.append("valor de 'x1' = "+ arreglo_x[indice]+"\n");
            resultado.append("valor de 'x2' = "+ arreglo_y[indice]+"\n");
            resultado.append("valor de 'x3' = "+ arreglo_z[indice]+"\n\n");
            resultado.append("el error de x1 es = " + errorX  +"\n");        
            resultado.append("el error de x2 es = " + errorY  +"\n");        
            resultado.append("el error de x3 es = " + errorZ  +"\n");           
            resultado.append("------------------------------------\n\n");           
           
            ++indice;
    }//fin del ciclo mientras
} // fin del metodo de calculo jacobi


//------------------------------------------------------------------------------
public void clean () {  // para limpiar todos los campos
    jTextField1.setText("");    
    jTextField2.setText("");    
    jTextField3.setText("");    
    jTextField4.setText("");    
    jTextField5.setText("");    
    jTextField6.setText("");    
    jTextField7.setText("");    
    jTextField8.setText("");    
    jTextField9.setText("");    
    jTextField10.setText("");    
    jTextField11.setText("");    
    jTextField12.setText("");  
    valorerror.setText("");
    valx.setText("");
    valy.setText("");
    valz.setText("");
    resultado.setText("");    
    indice = 1;
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
 private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void valxActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {                                         
        getvalors();  //llamo al metodo para recuperar los valores primero
        if (metodo==0){
            metodo_jacobi();
        }
    }                                        

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {                                        
         clean(); 
    }                                       

    private void valyActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Jacobi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel ASIGNACIONES;
    private javax.swing.JLabel ECUACIONES;
    private javax.swing.JLabel Error;
    private javax.swing.JLabel METODOS;
    private javax.swing.JButton calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextArea resultado;
    private javax.swing.JLabel valor1;
    private javax.swing.JLabel valor2;
    private javax.swing.JLabel valor3;
    private javax.swing.JTextField valorerror;
    private javax.swing.JTextField valx;
    private javax.swing.JTextField valy;
    private javax.swing.JTextField valz;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}


package metodosnumericosunidad3;
import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;


public class Funciones {

    JEP j = new JEP();
    JEP g = new JEP();

    public Funciones(String def,String gx) {
        j.addVariable("x", 0);
        j.addStandardConstants();
        j.addStandardFunctions();
         j.setImplicitMul(true);
        j.parseExpression(def);
        if (j.hasError()) {
            JOptionPane.showMessageDialog(null, " error  al convertir la funcion");
        }
        
         g.addVariable("x", 0);
        g.addStandardConstants();
        g.addStandardFunctions();
         g.setImplicitMul(true);
        g.parseExpression(gx);
        if (g.hasError()) {
            JOptionPane.showMessageDialog(null, " error  al convertir la funcion");
        }  
    
    }
    
    public double eval(double x){
        double r;
        j.addVariable("x",x);
        r=j.getValue();
        if (j.hasError()) {
            JOptionPane.showMessageDialog(null, " error  al convertir la funcion");
        }
        return r;     
    }
        
     public double evaluar_gx(double x){
        double r;
        g.addVariable("x",x);
        r=g.getValue();
        if (g.hasError()) {
            JOptionPane.showMessageDialog(null, " error  al convertir la funcion");
        }
        return r;     
    }
    
}

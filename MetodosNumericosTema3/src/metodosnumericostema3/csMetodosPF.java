
package metodosnumericostema3;
import java.util.ArrayList;

public class csMetodosPF {
    //Metodo Punto Fijo 
    
    public ArrayList<csFilaPuntoFijo> PuntoFijo(double xo, double errorDeseado, int iteraciones){ 
        double xoo= this.funcion1(xo);
        double errorCalculado=1;
         double xanterior;
        
        ArrayList<csFilaPuntoFijo> lista;

        int i = 1; 
        
        lista = new ArrayList<csFilaPuntoFijo>();
        
        while (i <= iteraciones && errorCalculado > errorDeseado) {
           
            csFilaPuntoFijo fila = new csFilaPuntoFijo();
            fila.setI(i);
            fila.setXo(xo); 
            fila.setRes(this.funcion1(fila.getXo()));
            
            xo = fila.getRes();         
            if (i > 1) {
                     
                errorCalculado = Math.abs((this.funcion1(fila.getXo()) - fila.getXo()) / this.funcion1(fila.getXo()));
                fila.setError(errorCalculado);
            } else {
                fila.setError(errorCalculado);
            }
            lista.add(fila);
            i++;
        }
        
        return lista;   
    }
   
    private double funcion1(double x){
     
        return Math.pow(2.7182818284590452353602874713527, -x);
    }
}


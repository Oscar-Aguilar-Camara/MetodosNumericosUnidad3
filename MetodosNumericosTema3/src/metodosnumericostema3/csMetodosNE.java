
package metodosnumericostema3;
import java.util.ArrayList;

public class csMetodosNE {
    
    public ArrayList<csFilaNewton> Newton(double xo, double error){

        double errorCalculado = 1;
        double xanterior; 
        ArrayList<csFilaNewton> lista;
        int i = 1;
        lista = new ArrayList<csFilaNewton>();
        while (errorCalculado > error) {
            csFilaNewton fila = new csFilaNewton();
            fila.setI(i); 
            fila.setXo(xo); 
            double fxo = this.Funcion1(fila.getXo());
            double fxdo = this.Funcion2(fila.getXo());
            fila.setFx(fxo); 
            fila.setDfx(fxdo); 
            fila.setRes(fila.getXo() - (fxo / fxdo));
            xanterior = fila.getXo(); 
            xo = fila.getRes();          
            if (i > 1) {
                      
                errorCalculado = Math.abs((fila.getRes() - fila.getXo()) / fila.getRes());
                fila.setError(errorCalculado);

            } else {
                fila.setError(errorCalculado);
            }
            lista.add(fila);
            i++;
        }
        if (errorCalculado < error) {
            return lista;
        } else {
            return null;
        }

    }
       
public double Funcion1(double x) {
        return Math.pow(2.7182818284590452353602874713527, -x) - x;
    }

    public double Funcion2(double x) {
        return -Math.pow(2.7182818284590452353602874713527, -x) - 1;
    }
    
}
    
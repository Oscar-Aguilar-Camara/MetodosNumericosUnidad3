
package metodosnumericos;

import java.util.ArrayList;

public class PuntoFijo {

    private static ArrayList<String> iteraciones = new ArrayList<String>();

    public static ArrayList getIteraciones() {
        return iteraciones;
    }

    public String raiz(FuncionPF f, double x0,  int nMAx, double tolerancia) {
       String mensaje = null;
        double r = Double.NaN;// le damos un valor por defecto por siacaso no encontramos la raiz 
        double x = x0;
        int k = 0;
        iteraciones.add(0, Double.toString(x));// añade a la colecion la primera iteraion

        
            while (Math.abs(f.eval(x)) > tolerancia && k < nMAx) {

                x=f.evaluar_gx(x0);
                iteraciones.add(Double.toString(x));// añade a la colecion la tietacion k
                k++;
                x0=x;
            }

        


        if (k < nMAx) {
            r = x;
            mensaje=Double.toString(r);
        }else  {
            mensaje="la funcion x=g(x)\n No converge \n al punto fijo buscado\n o el número de iteraciones \nes insuficiente";
        }
        return mensaje;
    }

    public void borrarColeccion() {
        iteraciones.clear();
    }
}

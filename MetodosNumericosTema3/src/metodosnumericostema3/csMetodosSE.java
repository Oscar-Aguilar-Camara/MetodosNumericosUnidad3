
package metodosnumericostema3;
import java.util.ArrayList;
public class csMetodosSE {
    public ArrayList<csFilaSecante> Secante(double x0,double x1, double errorDeseado){
       double error = 1;
       double xanterior; 
       
        ArrayList<csFilaSecante> lista;
        int i = 1;
        lista = new ArrayList<csFilaSecante>();
     
        while (error> errorDeseado) {
            csFilaSecante fila = new csFilaSecante();
            fila.setId(i); 
            fila.setM1(x0);
            fila.setM2(x1);
            double funcionAB = this.FuncionSecante(fila.getM1());
            fila.setM3(funcionAB);
            double restDeno= fila.getM1() - fila.getM2();
            fila.setM4(restDeno);
            
            double funcionCD = this.FuncionSecante(fila.getM2());
            fila.setM5(funcionCD);
            double ProdF = fila.getM5() * fila.getM4();
            fila.setM6(ProdF);
           
            
            double restG = fila.getM3() - fila.getM5();
            fila.setM7(restG);
           
           
            
            
            double raizH = fila.getM2() - fila.getM6() / fila.getM7();
            fila.setM8(raizH);

            
                error = Math.abs((fila.getM8() - fila.getM2()) / fila.getM8());
                fila.setId(error);
            

            x0= fila.getM2();

           
            x1 = fila.getM8();
            lista.add(fila);
            i++;
        }
       
         return lista;
    }
    public double FuncionSecante(double x) {
        return Math.pow(2.7182818284590452353602874713527, -Math.pow(x, 2)) - x;
    }
}
    
    
package metodosnumericos;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaSecante extends AbstractTableModel {

    private String []columnas=
    {"i","Xi-1","Xi","f(xi-1)","(xi-1 - xi)","f(xi)","Numerador","Denominador", "Error"};
    private ArrayList<csFilaSecante> lista;

    public ModeloTablaSecante(ArrayList<csFilaSecante> lista) {
        this.lista = lista;
    }
        
    public ModeloTablaSecante() {
    }
    
    @Override
    public int getRowCount() {
      return this.lista.size();
    }
    
    @Override
    public int getColumnCount() {
     return this.columnas.length;
    }
    
    @Override
    public Object getValueAt(int fila, int columna) {
     switch(columna){
         case 0: return this.lista.get(fila).getId();
         case 1:return this.lista.get(fila).getM1();
         case 2:return this.lista.get(fila).getM2();
         case 3:return this.lista.get(fila).getM3();
         case 4:return this.lista.get(fila).getM4();
         case 5:return this.lista.get(fila).getM5();
         case 6:return this.lista.get(fila).getM6();
         case 7:return this.lista.get(fila).getM7();
         case 8:return this.lista.get(fila).getM8();
         default:return null;     
     }
    }

    @Override
    public String getColumnName(int i) {
      return this.columnas[i];
    }
}

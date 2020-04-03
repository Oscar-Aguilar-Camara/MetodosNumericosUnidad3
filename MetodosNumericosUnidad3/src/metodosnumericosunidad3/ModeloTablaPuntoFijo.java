
package metodosnumericosunidad3;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaPuntoFijo extends AbstractTableModel {
    
    private String []columnas=
    {"i","Xo","Xi=g(x)","Error"};
    private ArrayList<csFilaPuntoFijo> lista;

    public ModeloTablaPuntoFijo(ArrayList<csFilaPuntoFijo> lista) {
        this.lista = lista;
    }
        
    public ModeloTablaPuntoFijo() {
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return this.lista.size();
    }
    
    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return this.columnas.length;
    }
    
    @Override
    public Object getValueAt(int fila, int columna) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     switch(columna){
         case 0: return this.lista.get(fila).getI();
         case 1:return this.lista.get(fila).getXo();
         case 2:return this.lista.get(fila).getRes();
         case 3:return this.lista.get(fila).getError(); 
         default:return null;     
     }
    }
    @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
      return this.columnas[i];
    }
}


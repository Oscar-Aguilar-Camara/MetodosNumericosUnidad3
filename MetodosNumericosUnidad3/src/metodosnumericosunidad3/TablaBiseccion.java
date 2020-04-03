package metodosnumericos;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TablaBiseccion extends AbstractTableModel {

    private String[] columnas = {"i", "Xi", "Xs", "Xr", "Fxi","Fxs", "Fxr", "Signo", "Error"};
    private ArrayList<IteracionBiseccion> lista;

    public TablaBiseccion(ArrayList<IteracionBiseccion> lista) {
        this.lista = lista;
    }

    public TablaBiseccion() {
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

        switch (columna) {
            case 0:
                return this.lista.get(fila).getI();
            case 1:
                return this.lista.get(fila).getXi();
            case 2:
                return this.lista.get(fila).getXs();
            case 3:
                return this.lista.get(fila).getXr();
            case 4:
                return this.lista.get(fila).getFxi();
            case 5:
                return this.lista.get(fila).getFxs();
            case 6:
                return this.lista.get(fila).getFxr();
            case 7:
                return this.lista.get(fila).getSigno();
            case 8:
                return this.lista.get(fila).getError();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
        return this.columnas[i];
    }
}


package metodosnumericostema3;

public class csFilaPuntoFijo {
    private int i;
    private double xo;
    private double res;
    private double error;
    
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getXo() {
        return xo;
    }

    public void setXo(double xo) {
        this.xo = xo;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
    
    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "csFilaPuntoFijo{" + "i=" + i + ", xo=" + xo + ", res=" + res + ", error=" + error + '}';
    }
}


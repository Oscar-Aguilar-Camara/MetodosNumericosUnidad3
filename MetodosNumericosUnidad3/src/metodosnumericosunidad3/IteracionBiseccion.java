
package metodosnumericosunidad3;
public class IteracionBiseccion {

    private int i;
    private double xi;
    private double xs;
    private double xr;
    private double fxi;
    private double fxs;
    private double fxr;    
    private double signo;
    private double error;


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getXs() {
        return xs;
    }

    public void setXs(double xs) {
        this.xs = xs;
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getFxs() {
        return fxs;
    }

    public void setFxs(double fxs) {
        this.fxs = fxs;
    }

    public double getFxr() {
        return fxr;
    }

    public void setFxr(double fxr) {
        this.fxr = fxr;
    }

    public double getSigno() {
        return signo;
    }

    public void setSigno(double signo) {
        this.signo = signo;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }
 

    @Override
    public String toString() {
         return "IteracionBiseccion{" + "i=" + i + ", xi=" + xi + ", xs=" + xs + ", xr=" + xr + ", fxi=" + fxi + ", fxs=" + fxs + ", fxr=" + fxr + ", error=" + error + '}';
    }
}

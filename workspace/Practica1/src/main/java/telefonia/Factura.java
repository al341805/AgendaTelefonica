package telefonia;

public class Factura extends Tarifa {
    private int codigoFactura;

    public Factura(int codigoFactura){
        this.codigoFactura = codigoFactura;
    }
    public int getCodigoFactura() {
        return codigoFactura;
    }
}

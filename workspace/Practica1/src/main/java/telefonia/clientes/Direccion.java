package telefonia.clientes;

public class Direccion {
    private int codigoPostal;
    private String provincia;
    private String poblacion;

    public Direccion(int cp, String provincia, String poblacion){
        this.codigoPostal = cp;
        this.provincia = provincia;
        this.poblacion = poblacion;
    }
    public int getCodigoPostal() {
        return codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getPoblacion() {
        return poblacion;
    }
}

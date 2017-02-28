package telefonia.clientes;

/**
 * Created by al341805 on 21/02/17.
 */
public class DatosCliente {
    private String nif;
    private Direccion direccion;
    private String mail;
    private String nombre;

    public void withNombre(String nombre){this.nombre = nombre;}
    public void withNif(String nif){this.nif = nif;}
    public void withDireccion(Direccion direccion){this.direccion = direccion;}
    public void withMail(String mail){this.mail = mail;}

    public String getNif() {
        return nif;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public String getMail() {
        return mail;
    }

    public String getNombre() {
        return nombre;
    }
}

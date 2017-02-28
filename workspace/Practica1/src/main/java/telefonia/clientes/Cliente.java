package telefonia.clientes;

import telefonia.Factura;
import telefonia.Llamada;
import telefonia.Tarifa;

import java.util.HashMap;

public class Cliente{
    private DatosCliente datosCliente;
    private Tarifa tarifaContratada;
    private HashMap<Integer, Llamada> registroLlamadas;
    private HashMap<Integer, Factura> registroFacturas;

    public void withDatos(DatosCliente datosCliente){this.datosCliente = datosCliente;}
    public void withTarifa(Tarifa tarifa){this.tarifaContratada = tarifa;}

    public DatosCliente getDatosCliente() {
        return datosCliente;
    }

    public Tarifa getTarifaContratada() {
        return tarifaContratada;
    }

    public HashMap<Integer, Llamada> getRegistroLlamadas() {
        return registroLlamadas;
    }

    public HashMap<Integer, Factura> getRegistroFacturas() {
        return registroFacturas;
    }

    public boolean addLlamada(Llamada llamada) {
        try {
            registroLlamadas.put(llamada.getTelefonoDestino(), llamada);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}

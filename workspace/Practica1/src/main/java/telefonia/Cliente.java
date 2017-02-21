package telefonia;

import java.util.HashMap;

public class Cliente {
    private DatosCliente datosCliente;
    private Tarifa tarifaContratada;
    private HashMap<Integer,Llamada> registroLlamadas;
    private HashMap<Integer,Factura> registroFacturas;
}

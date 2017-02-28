package telefonia;

import telefonia.clientes.Cliente;

import java.time.LocalDateTime;

public class Factura{
    private int codigoFactura;
    private Cliente cliente;
    private LocalDateTime fechaEmision;
    private LocalDateTime inicioFacturacion;
    private LocalDateTime finFacturacion;
    private float costeTotal;

    public Factura(int codigoFactura, Cliente cliente){
        this.codigoFactura = codigoFactura;
        this.cliente = cliente;
        this.fechaEmision = LocalDateTime.now();
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public float calculaCoste(){
        return 0; //por implementar
    }

    public LocalDateTime getFechaEmision(){
        return fechaEmision;
    }
}

package telefonia;

import java.util.Date;

public class Llamada {
    private int telefonoDestino;
    private Date fecha; //es localDateTime
    private Date horaLlamada;//es localDateTime
    private int duracion;
    private Tarifa tarifa;

    public int getTelefonoDestino() {
        return telefonoDestino;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getHoraLlamada() {
        return horaLlamada;
    }

    public int getDuracion() {
        return duracion;
    }

    public float getCosteLlamada(){return duracionEnMinutos() * tarifa.getCosteTarifa();}

    private float duracionEnMinutos(){return duracion/60;}
}

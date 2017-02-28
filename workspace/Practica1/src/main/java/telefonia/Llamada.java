package telefonia;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalQueries;

public class Llamada {
    private int telefonoDestino;
    private LocalDateTime fechaLlamada;
    private LocalTime horaLlamada;
    private int duracion;
    private Tarifa tarifa;

    public void withTelefonoDestino(int telefonoDestino){this.telefonoDestino = telefonoDestino;}
    public void withFecha(){this.fechaLlamada = LocalDateTime.now();}
    public void withhoraLlamada(){this.horaLlamada = LocalDateTime.now().query(TemporalQueries.localTime());}
    public int getTelefonoDestino() {
        return telefonoDestino;
    }

    public LocalDateTime getFechaLlamada() {
        return fechaLlamada;
    }

    public LocalTime getHoraLlamada() {
        return horaLlamada;
    }

    public int getDuracion() {
        return duracion;
    }

    public float getCosteLlamada(){return duracionEnMinutos() * tarifa.getCosteTarifa();}

    private float duracionEnMinutos(){return duracion/60;}
}

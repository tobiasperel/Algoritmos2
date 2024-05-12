//package aed;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agenda {
    private Fecha fechaActual;
    private Map<Fecha, List<Recordatorio>> recordatorios;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = fechaActual;
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        recordatorios.get(fechaActual()).add(recordatorio);
    }


    @Override
    public String toString() {
        String recordatoriosString = fechaActual.dia() + "/" + fechaActual.mes() + "=====";
       
        for( Recordatorio recordatorio : recordatorios.get(fechaActual)){
                recordatoriosString = recordatoriosString + "\n" +  recordatorio.mensaje() + " @ " + fechaActual.dia() + "/" + fechaActual.mes() + recordatorio.horario().hora() + ":" + recordatorio.horario().minutos();
        }
        return recordatoriosString;
    }

    public void incrementarDia() {
        fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return fechaActual;
    }

}

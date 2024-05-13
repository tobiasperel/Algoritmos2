package aed;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Agenda {
    private Fecha fechaActual;
    private Map <Fecha, List<Recordatorio>> recordatorios = new HashMap<>();

    public Agenda(Fecha fechaActual) {
        this.fechaActual = fechaActual;
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        if(!recordatorios.containsKey(recordatorio.fecha())) {
            recordatorios.put(recordatorio.fecha(), new ArrayList<>(Arrays.asList(recordatorio)));
        }
        else{
            recordatorios.get(recordatorio.fecha()).add(recordatorio);
        }
    }
    
    @Override
    public String toString() {
        return fechaActual + "\n=====\n" +
            recordatorios.entrySet().stream()
                    .filter(entry -> entry.getKey().equals(fechaActual))
                    .flatMap(entry -> entry.getValue().stream())
                    .map(Recordatorio::toString)
                    .reduce("", (acc, recordatorio) -> acc + recordatorio + "\n");

    }

    public void incrementarDia() {
        fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return fechaActual;
    }

}

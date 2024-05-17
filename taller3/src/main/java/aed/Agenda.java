// package aed;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Agenda {
    private Fecha fechaActual;
    private List<Recordatorio> recordatoriosList = new ArrayList<>();

    public Agenda(Fecha fechaActual) {
        this.fechaActual = fechaActual;
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        recordatoriosList.add(recordatorio);      
    }
    
    @Override
    public String toString() {
        return fechaActual + "\n=====\n" +
        recordatoriosList.stream()
                .filter(recordatorio -> recordatorio.fecha().equals(fechaActual))
                .map(Recordatorio::toString)
                .reduce("", (a, b) -> a + b + "\n");
    }

    public void incrementarDia() {
        fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return fechaActual;
    }

}

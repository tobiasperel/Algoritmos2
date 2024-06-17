package aed;

public class Recordatorio {
    private String mensaje;
    private Fecha fecha;
    private Horario horario;
    
    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha = new Fecha(fecha.dia(), fecha.mes()); // Hacer una copia de `fecha`
        this.horario = new Horario(horario.hora(), horario.minutos()); // Hacer una copia de `horario`
    }

    public Horario horario() {
        return new Horario(horario.hora(), horario.minutos()); // Devolver una copia de `horario`
    }

    public Fecha fecha() {
        return new Fecha(fecha.dia(), fecha.mes()); // Devolver una copia de `fecha`
    }

    public String mensaje() {
        return mensaje;
    }
    @Override
    public String toString() {
        return this.mensaje  + " @ " + this.fecha.dia() + "/" + this.fecha.mes() + " " + this.horario.hora() + ":" + this.horario.minutos();
    }

    @Override
    public boolean equals(Object otro) {
        if(otro instanceof Recordatorio){
            Recordatorio otroRecordatorio = (Recordatorio) otro;
            return this.mensaje.equals(otroRecordatorio.mensaje) && this.fecha.equals(otroRecordatorio.fecha) && this.horario.equals(otroRecordatorio.horario);
        }
        return false;
    }

}

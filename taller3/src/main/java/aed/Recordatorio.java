//package aed;

public class Recordatorio {
    private String mensaje;
    private Fecha fecha;
    private Horario horario;
    
    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.horario = horario;
    }

    public Horario horario() {
        return this.horario;
    }

    public Fecha fecha() {
        return this.fecha;
    }

    public String mensaje() {
        return this.mensaje;
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

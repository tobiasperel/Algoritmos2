//package aed;

public class Fecha {
    private int dia;
    private int mes;

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        // Inicializar los campos dia y mes utilizando los valores del objeto fecha
        this.dia = fecha.dia(); 
        this.mes = fecha.mes();
    }

    public Integer dia() {
        return this.dia;
    }

    public Integer mes() {
        return this.mes;
    }

    public String toString() {
        return this.dia + "/" + this.mes;
    }

    @Override
    public boolean equals(Object otra) {
        // verifica que el objeto sea de la clase Fecha
        if (otra instanceof Fecha) {
            Fecha otraFecha = (Fecha) otra;
            return this.dia == otraFecha.dia && this.mes == otraFecha.mes;
        }
        return false;
    }

    public void incrementarDia() {
        if (this.dia == diasEnMes(this.mes)) {
            this.dia = 1;
            if (this.mes == 12) {
                this.mes = 1;
            } else {
                this.mes++;
            }
        } else {
            this.dia++;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}

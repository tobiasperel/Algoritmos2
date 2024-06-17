// package aed;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {
    private Recordatorio[] arreglo;
    
    public ArregloRedimensionableDeRecordatorios() {
        this.arreglo = new Recordatorio[0];

    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.arreglo = new Recordatorio[vector.longitud()];
        for (int i = 0; i < vector.longitud(); i++) {
            this.arreglo[i] = vector.obtener(i);
        }
    }

    public int longitud() {
        return arreglo.length;
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] nuevoArreglo = new Recordatorio[arreglo.length + 1];
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, arreglo.length);
        nuevoArreglo[arreglo.length] = i;
        arreglo = nuevoArreglo;
    
    }

    public Recordatorio obtener(int i) {
        return this.arreglo[i];
    }

    public void quitarAtras() {
        Recordatorio[] nuevoArreglo = new Recordatorio[arreglo.length -1];
        System.arraycopy(arreglo, 0, nuevoArreglo, 0, arreglo.length - 1);
        arreglo = nuevoArreglo;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        this.arreglo[indice] = valor;

    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        return new ArregloRedimensionableDeRecordatorios(this);
    }

}

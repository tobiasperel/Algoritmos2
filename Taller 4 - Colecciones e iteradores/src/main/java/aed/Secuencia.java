package aed;


class Nodo<T> {
    T dato;
    Nodo<T> siguiente;
    Nodo<T> anterior;
}

interface Secuencia<T> {
    private Nodo<T> cabeza = null;
    private Nodo<T> cola = null;
    private int contador = 0;
    /**
     * Devuelve el largo de la secuencia.
     * 
     */
    public int longitud();

    /**
     * Agrega un elemento al principio de la secuencia.
     * 
     */
    public void agregarAdelante(T elem);

    /**
     * Agrega un elemento al final de la secuencia.
     * 
     */
    public void agregarAtras(T elem);

    /**
     * Retorna el elemento en la i-esima posicion.
     * 
     */
    public T obtener(int indice);

    /**
     * Elimina el elemento en la i-esima posicion de la secuencia.
     * 
     */
    public void eliminar(int indice);

    /**
     * Cambia el valor de la i-esima posicion
     * por el valor dado por parametro.
     * 
     */
    public void modificarPosicion(int indice, T valor);

    /**
     * Retorna un lista con los mismos elementos
     * 
     */
    public ListaEnlazada<T> copiar();

}
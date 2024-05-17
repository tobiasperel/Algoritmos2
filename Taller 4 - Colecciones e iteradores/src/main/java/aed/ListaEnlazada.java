// package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> {
    // Completar atributos privados

    private int longitud = 0;
    private Secuencia<T> secuencia;

    private class Nodo {
        T dato;
        Nodo siguiente;
        Nodo anterior;
    
        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
            this.anterior = null;
        }
    }

    public ListaEnlazada() {
        secuencia = new ListaEnlazada<T>(this);
    }

    public int longitud() {
        return longitud;
    }

    public void agregarAdelante(T elem) {
        secuencia.agregarAdelante(elem);
        longitud++;
    }

    public void agregarAtras(T elem) {
        secuencia.agregarAdelante(elem);
        longitud++;

    }

    public T obtener(int i) {
       return secuencia.obtener(i);

    }

    public void eliminar(int i) {
        secuencia.eliminar(i);
        longitud--;
    }

    public void modificarPosicion(int indice, T elem) {
        secuencia.modificarPosicion(indice, elem);
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        new ListaEnlazada<>(lista);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Nodo actual = (Nodo) secuencia; // Change the type of 'actual' from Secuencia<T> to Nodo
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) {
                sb.append(", ");
            }
            actual = actual.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }

    private class ListaIterador implements Iterador<T> {
    	// Completar atributos privados
        private Nodo actual;
        private Nodo anterior;
        private Nodo siguiente;

        public boolean haySiguiente() {
	        return actual.siguiente != null;
        }
        
        public boolean hayAnterior() {
	        return actual.anterior != null;
        }

        public T siguiente() {
	        return actual.siguiente.dato;
        }
        

        public T anterior() {
	        return actual.siguiente.dato;
        }
    }

    public Iterador<T> iterador() {
        return new ListaIterador();
    }

}

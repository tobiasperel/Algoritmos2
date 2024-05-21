// package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> {
    // Completar atributos privados
    private Nodo<T> cabeza = null;
    private Nodo<T> cola = null;
    private int longitud = 0;

    private class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        Nodo<T> anterior;

        Nodo(T dato) {
            this.dato = dato;
        }
    }

    public ListaEnlazada() {
        this.longitud = 0;
    }

    public int longitud() {
        return this.longitud;
    }

    public void agregarAdelante(T elem) {
        Nodo<T> nuevoNodo = new Nodo<T>(elem);
        if (this.cabeza == null) {
            this.cabeza = nuevoNodo;
            this.cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = this.cabeza;
            this.cabeza.anterior = nuevoNodo;
            this.cabeza = nuevoNodo;
        }
        this.longitud++;
    }

    public void agregarAtras(T elem) {
        Nodo<T> nuevoNodo = new Nodo<T>(elem);
        if (this.cola == null) {
            this.cabeza = nuevoNodo;
            this.cola = nuevoNodo;
        } else {
            nuevoNodo.anterior = this.cola;
            this.cola.siguiente = nuevoNodo;
            this.cola = nuevoNodo;
        }
        this.longitud++;
    }

    public T obtener(int i) {
        if (i < 0 || i >= this.longitud) {
            throw new IndexOutOfBoundsException();
        }
        Nodo<T> actual = this.cabeza;
        for (int j = 0; j < i; j++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    public void eliminar(int i) {
        if (i < 0 || i >= this.longitud) {
            throw new IndexOutOfBoundsException();
        }
        if (this.longitud == 1) {
            this.cabeza = null;
            this.cola = null;
        } else if (i == 0) {
            this.cabeza = this.cabeza.siguiente;
            this.cabeza.anterior = null;
        } else if (i == this.longitud - 1) {
            this.cola = this.cola.anterior;
            this.cola.siguiente = null;
        } else {
            Nodo<T> actual = this.cabeza;
            for (int j = 0; j < i; j++) {
                actual = actual.siguiente;
            }
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        }
        this.longitud--;
    }

    public void modificarPosicion(int indice, T elem) {
        if (indice < 0 || indice >= this.longitud) {
            throw new IndexOutOfBoundsException();
        }
        Nodo<T> actual = this.cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        actual.dato = elem;
    }

    public ListaEnlazada<T> copiar() {
        ListaEnlazada<T> copia = new ListaEnlazada<T>();
        Nodo<T> actual = this.cabeza;
        while (actual != null) {
            copia.agregarAtras(actual.dato);
            actual = actual.siguiente;
        }
        return copia;
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        Nodo<T> actual = lista.cabeza;
        while (actual != null) {
            this.agregarAtras(actual.dato);
            actual = actual.siguiente;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Nodo<T> actual = this.cabeza;
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
        private Nodo<T> actual = cabeza;
        private boolean haySiguiente = true;
        private boolean hayAnterior = false;

        public boolean haySiguiente() {
            if (this.actual == null || this.actual.siguiente == null) {
                return false;
            }
            return this.haySiguiente;
        }
        
        public boolean hayAnterior() {
            if (this.actual == null || this.actual.anterior == null) {
                return false;
            }
            return this.hayAnterior;
        }

        public T siguiente() {
            if (!this.haySiguiente) {
                throw new NoSuchElementException();
            }
            T dato = this.actual.dato;
            this.actual = this.actual.siguiente;
            this.hayAnterior = true;
            if (this.actual == null) {
                this.haySiguiente = false;
            }
            return dato;
        }
        

        public T anterior() {
            if (!this.hayAnterior) {
                throw new NoSuchElementException();
            }
            this.actual = this.actual.anterior;
            this.haySiguiente = true;
            if (this.actual == null) {
                this.hayAnterior = false;
            }
            return this.actual.dato;
        }
    }

    public Iterador<T> iterador() {
        return new ListaIterador();
    }

}

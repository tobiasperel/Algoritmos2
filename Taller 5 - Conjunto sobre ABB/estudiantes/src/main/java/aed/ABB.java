package aed;

import java.util.*;

// Todos los tipos de datos "Comparables" tienen el método compareTo()
// elem1.compareTo(elem2) devuelve un entero. Si es mayor a 0, entonces elem1 > elem2
public class ABB<T extends Comparable<T>> implements Conjunto<T> {
    // Agregar atributos privados del Conjunto
    private Nodo<T> raiz;
    private int cardinal;
    private class Nodo {
        private T dato;
        private Nodo<T> izquierdo;
        private Nodo<T> derecho;

        public Nodo(T dato) {
            this.dato = dato;
            this.izquierdo = null;
            this.derecho = null;
        }
    }

    public ABB() {
        this.raiz = null;
        this.cardinal = 0;
    }

    public int cardinal() {
        return this.cardinal;
    }

    public T minimo(){
        if (this.raiz == null) {
            throw new NoSuchElementException();
        }
        Nodo<T> actual = this.raiz;
        while (actual.izquierdo != null) {
            actual = actual.izquierdo;
        }
        return actual.dato;
    }

    public T maximo(){
        if (this.raiz == null) {
            throw new NoSuchElementException();
        }
        Nodo<T> actual = this.raiz;
        while (actual.derecho != null) {
            actual = actual.derecho;
        }
        return actual.dato;
    }

    public void insertar(T elem){
        this.cardinal++;

        if (this.raiz == null) {
            this.raiz = new Nodo<T>(elem);
        } else {
            Nodo<T> actual = this.raiz;
            while (true) {
                if (elem.compareTo(actual.dato) < 0) {
                    if (actual.izquierdo == null) {
                        actual.izquierdo = new Nodo<T>(elem);
                        return;
                    } else {
                        actual = actual.izquierdo;
                    }
                } else if (elem.compareTo(actual.dato) > 0) {
                    if (actual.derecho == null) {
                        actual.derecho = new Nodo<T>(elem);
                        return;
                    } else {
                        actual = actual.derecho;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public boolean pertenece(T elem){
        Nodo<T> actual = this.raiz;
        while (actual != null) {
            if (elem.compareTo(actual.dato) < 0) {
                actual = actual.izquierdo;
            } else if (elem.compareTo(actual.dato) > 0) {
                actual = actual.derecho;
            } else {
                return true;
            }
        }
        return false;
    }

    public void eliminar(T elem){
        if(pertenece(elem)){
            raiz = eliminarElemento(raiz, elem);
            this.cardinal--;
        }
    }

    public String toString(){ // muestra los elementos del conjunto en orden
        String str = "";
        while (this.raiz != null) {
            str = "{" + this.raiz.dato;
            str += this.toString(this.raiz.izquierdo);
            str += this.toString(this.raiz.derecho);
            str += "}";
        }
    }

    private class ABB_Iterador implements Iterador<T> {
        private Nodo _actual;

        public boolean haySiguiente() {     
            throw new UnsupportedOperationException("No implementada aun");

        }
    
        public T siguiente() {
            throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public Iterador<T> iterador() {
        return new ABB_Iterador();
    }

}

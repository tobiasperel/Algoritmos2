package aed;

import java.util.*;

// Todos los tipos de datos "Comparables" tienen el método compareTo()
// elem1.compareTo(elem2) devuelve un entero. Si es mayor a 0, entonces elem1 > elem2
public class ABB<T extends Comparable<T>> implements Conjunto<T> {
    // Agregar atributos privados del Conjunto
    private Nodo<T> raiz = null;
    private int cardinal = 0;

    private class Nodo<T> {
        T dato;
        Nodo<T> izquierdo;
        Nodo<T> derecho;
        Nodo(T dato) {
            this.dato = dato;
        }
    }

    public ABB() {
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

    public void eliminar(T elem) {
        if (pertenece(elem)) {
            this.cardinal--;
            raiz = eliminarNodo(raiz, elem);
        }
    }
    
    private Nodo<T> eliminarNodo(Nodo<T> nodo, T elem) {
        if (nodo == null) {
            return nodo;
        }
    
        int comparacion = elem.compareTo(nodo.dato);
    
        if (comparacion < 0) {
            nodo.izquierdo = eliminarNodo(nodo.izquierdo, elem);
        } else if (comparacion > 0) {
            nodo.derecho = eliminarNodo(nodo.derecho, elem);
        } else { 
            if (nodo.izquierdo == null && nodo.derecho == null) {
                return null;
            }
    
            if (nodo.izquierdo == null) {
                return nodo.derecho;
            } else if (nodo.derecho == null) {
                return nodo.izquierdo;
            }
    
            Nodo<T> reemplazo = buscarMinimo(nodo.derecho); 
            nodo.dato = reemplazo.dato; 
    
            nodo.derecho = eliminarNodo(nodo.derecho, reemplazo.dato);
        }
    
        return nodo;
    }
    
    private Nodo<T> buscarMinimo(Nodo<T> nodo) {
        if (nodo.izquierdo == null) {
            return nodo;
        }
        return buscarMinimo(nodo.izquierdo);
    }
        

    public String toString() {
        return "{" + toString(raiz) + "}";
    }
    
    private String toString(Nodo<T> nodo) {
        if (nodo == null) {
            return "";
        }
    
        String str = "";
        if (nodo.izquierdo != null) {
            str += toString(nodo.izquierdo) + ",";
        }
    
        str += nodo.dato.toString();
    
        if (nodo.derecho != null) {
            str += "," + toString(nodo.derecho);
        }
    
        return str;
    }

    private class ABB_Iterador implements Iterador<T> {
        private Stack<Nodo<T>> pila = new Stack<>();

    public ABB_Iterador() {
        empujarIzquierda(raiz);
    }

    private void empujarIzquierda(Nodo<T> nodo) {
        while (nodo != null) {
            pila.push(nodo);
            nodo = nodo.izquierdo;
        }
    }

    public boolean haySiguiente() {
        return !pila.isEmpty();
    }

    public T siguiente() {
        if (!haySiguiente()) {
            throw new NoSuchElementException();
        }
        Nodo<T> nodo = pila.pop();
        T resultado = nodo.dato;
        if (nodo.derecho != null) {
            empujarIzquierda(nodo.derecho);
        }
        return resultado;
    }
    }

    public Iterador<T> iterador() {
        return new ABB_Iterador();
    }

}

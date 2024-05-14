package modelo;



public class Pila {
    Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void apilar(Nodo nodo) {
        nodo.siguiente = tope;
        tope = nodo;
    }

    public Nodo desapilar() {
        if (!estaVacia()) {
            Nodo nodoDesapilado = tope;
            tope = tope.siguiente;
            return nodoDesapilado;
        }
        return null; // Valor de retorno para indicar pila vacía
    }
}

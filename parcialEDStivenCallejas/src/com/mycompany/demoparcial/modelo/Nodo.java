package com.mycompany.demoparcial.modelo;

// Clase para representar un nodo en la lista (vagón del tren)
public class Nodo {
    // Datos almacenados en el nodo (vagón del tren)
    private Vagon vagon;
    // Enlace al siguiente nodo (vagón siguiente en el tren)
    private Nodo siguiente;

    // Constructor
    public Nodo(Vagon vagon) {
        this.vagon = vagon;
        this.siguiente = null;
    }

    // Métodos getter y setter
    public Vagon getVagon() {
        return vagon;
    }

    public void setVagon(Vagon vagon) {
        this.vagon = vagon;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
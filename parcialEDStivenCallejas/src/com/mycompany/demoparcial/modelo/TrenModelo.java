package com.mycompany.demoparcial.modelo;
public class TrenModelo {
    // Referencia al primer nodo (primer vagón) en el tren
    private Nodo cabeza;

    // Constructor
    public TrenModelo() {
        this.cabeza = null;
    }

    // Método para agregar un nuevo vagón al final del tren
    public void agregarVagon(String contenido) {
        Vagon nuevoVagon = new Vagon(contenido);
        Nodo nuevoNodo = new Nodo(nuevoVagon);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    // Método para obtener el contenido del tren como una cadena
    public String obtenerContenidoDelTren() {
        StringBuilder contenidoTren = new StringBuilder();
        Nodo actual = cabeza;
        while (actual != null) {
            contenidoTren.append(actual.getVagon().getContenido()).append(" -> ");
            actual = actual.getSiguiente();
        }
        contenidoTren.append("null");
        return contenidoTren.toString();
    }

    // Método para eliminar un vagón específico del tren
    public boolean eliminarVagon(String contenido) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.getVagon().getContenido().equals(contenido)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getVagon().getContenido().equals(contenido)) {
            actual = actual.getSiguiente();
        }
        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return true;
        }
       return false;
    }
}
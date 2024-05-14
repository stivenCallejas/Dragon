/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaja;

/**
 *
 * @author 57312
 */
public class Tren {
    Nodo cabeza;

    public Tren() {
        this.cabeza = null;
    }

    public void agregarVagon(int datos) {
        Nodo nuevoNodo = new Nodo(datos);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public void mostrarTren() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.datos + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }

    public void desengancharVagon(int datos) {
        if (cabeza == null) {
            System.out.println("El tren está vacío.");
            return;
        }

        if (cabeza.datos == datos) {
            cabeza = cabeza.siguiente;
            System.out.println("Vagón desenganchado: " + datos);
            return;
        }

        Nodo temp = cabeza;
        while (temp.siguiente != null && temp.siguiente.datos != datos) {
            temp = temp.siguiente;
        }

        if (temp.siguiente == null) {
            System.out.println("No se encontró el vagón con datos: " + datos);
        } else {
            temp.siguiente = temp.siguiente.siguiente;
            System.out.println("Vagón desenganchado: " + datos);
        }
    }
}

import java.util.Scanner;

public class ListaEstudiantes {
    Nodo cabeza;
    Nodo cola;

    public ListaEstudiantes() {
        this.cabeza = null;
        this.cola = null;
    }
    public void agregarAlFinal(Estudiante estudiante) {
        Nodo nuevoNodo = new Nodo(estudiante);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.anterior = cola;
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    public void agregarAlPrincipio(Estudiante estudiante) {
        Nodo nuevoNodo = new Nodo(estudiante);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
        }
    }

    public void eliminarDelFinal() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
        } else {
            if (cabeza == cola) {
                cabeza = null;
                cola = null;
            } else {
                cola = cola.anterior;
                cola.siguiente = null;
            }
            System.out.println("Estudiante eliminado del final.");
        }
    }

    public void eliminarDelPrincipio() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
        } else {
            if (cabeza == cola) {
                cabeza = null;
                cola = null;
            } else {
                cabeza = cabeza.siguiente;
                cabeza.anterior = null;
            }
            System.out.println("Estudiante eliminado del principio.");
        }
    }

    public void mostrarEstudiantes() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println("Nombre: " + actual.estudiante.nombre + ", Edad: " + actual.estudiante.edad);
            actual = actual.siguiente;
        }
    }
}

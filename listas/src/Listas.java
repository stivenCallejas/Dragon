

// Clase NodoLista
class NodoLista {
    int valor;
    NodoLista siguiente;

    // Constructor para crear un nuevo nodo con un valor dado
    public NodoLista(int valor) {
        this.valor = valor;
    }
}

// Clase ListaEnlazada
class ListaEnlazada {
    NodoLista cabeza; // Puntero al primer nodo de la lista

    // Método para agregar un nuevo nodo al final de la lista
    public void agregarNodo(int valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoLista actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    // Método para imprimir los valores de la lista
    public void imprimirLista() {
        NodoLista actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
    }

    // Método para eliminar duplicados en una lista enlazada ordenada
    public void removerDuplicados() {
        if (cabeza == null || cabeza.siguiente == null) {
            return; // Lista vacía o con un solo elemento, no hay duplicados que eliminar
        }

        NodoLista actual = cabeza;

        while (actual != null && actual.siguiente != null) {
            if (actual.valor == actual.siguiente.valor) {
                actual.siguiente = actual.siguiente.siguiente; // Salta el nodo duplicado
            } else {
                actual = actual.siguiente; // Avanza al siguiente nodo
            }
        }
    }
}
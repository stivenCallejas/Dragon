package modelo;

public class Nodo {
    private String valor;
    private Nodo siguiente;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    // Getters y setters
}
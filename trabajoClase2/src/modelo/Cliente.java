// Paquete modelo
package modelo;

public class Cliente {
    private String nombre;
    private int numeroTicket;

    public Cliente(String nombre, int numeroTicket) {
        this.nombre = nombre;
        this.numeroTicket = numeroTicket;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }
}

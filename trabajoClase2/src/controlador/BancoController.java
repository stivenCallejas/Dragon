package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

class BancoController {
    private List<Cliente> colaClientes;
    private int contadorTickets;

    public BancoController() {
        colaClientes = new ArrayList<>();
        contadorTickets = 1;
    }

    public void agregarCliente(String nombre) {
        colaClientes.add(new Cliente(nombre, contadorTickets++));
        System.out.println("Cliente agregado a la cola.");
    }

    public void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            Cliente cliente = colaClientes.remove(0);
            System.out.println("Atendiendo al cliente: " + cliente.getNombre() + ", Ticket: " + cliente.getNumeroTicket());
        } else {
            System.out.println("No hay clientes en espera.");
        }
    }
}
package vista;

import java.util.Scanner;
import modelo.JugadorModel;

public class ListaCircularView {
    private Scanner scanner;

    public ListaCircularView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("--- Juego de Ronda de Turnos ---");
        System.out.println("1. Agregar jugador");
        System.out.println("2. Siguiente jugador");
        System.out.println("3. Mostrar jugador actual");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public String obtenerNombreJugador() {
        System.out.print("Nombre del jugador: ");
        return scanner.nextLine();
    }

    public void mostrarJugadorActual(JugadorModel jugador) {
        if (jugador != null) {
            System.out.println("Jugador actual: " + jugador.getNombre());
        } else {
            System.out.println("No hay jugadores en la lista.");
        }
    }

    public String obtenerInput() {
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

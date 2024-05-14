package controlador;

import modelo.JugadorModel;
import modelo.ListaCircularModel;
import vista.ListaCircularView;

public class ListaCircularController {
    private ListaCircularModel modelo;
    private ListaCircularView vista;

    public ListaCircularController(ListaCircularModel modelo, ListaCircularView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void jugar() {
        boolean salir = false;
        while (!salir) {
            vista.mostrarMenu();
            int opcion = Integer.parseInt(vista.obtenerInput());

            switch (opcion) {
                case 1:
                    agregarJugador();
                    break;
                case 2:
                    siguienteJugador();
                    break;
                case 3:
                    mostrarJugadorActual();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    private void agregarJugador() {
        String nombre = vista.obtenerNombreJugador();
        JugadorModel jugador = new JugadorModel(nombre);
        modelo.agregarJugador(jugador);
        vista.mostrarMensaje("Jugador agregado: " + nombre);
    }

    private void siguienteJugador() {
        modelo.siguienteJugador();
        JugadorModel jugador = modelo.obtenerJugadorActual();
        if (jugador != null) {
            vista.mostrarMensaje("Siguiente jugador: " + jugador.getNombre());
        } else {
            vista.mostrarMensaje("No hay jugadores en la lista.");
        }
    }

    private void mostrarJugadorActual() {
        JugadorModel jugador = modelo.obtenerJugadorActual();
        vista.mostrarJugadorActual(jugador);
    }
}

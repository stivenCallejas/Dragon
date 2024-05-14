package modelo;

import java.util.LinkedList;

public class ListaCircularModel {
    private LinkedList<JugadorModel> listaJugadores;
    private int jugadorActualIndex;

    public ListaCircularModel() {
        listaJugadores = new LinkedList<>();
        jugadorActualIndex = -1; // Inicializar en -1 para indicar que la lista está vacía
    }

    public void agregarJugador(JugadorModel jugador) {
        listaJugadores.add(jugador);
        if (jugadorActualIndex == -1) {
            jugadorActualIndex = 0; // Establecer el primer jugador como el jugador actual si la lista estaba vacía
        }
    }

    public JugadorModel obtenerJugadorActual() {
        if (jugadorActualIndex != -1) {
            return listaJugadores.get(jugadorActualIndex);
        }
        return null;
    }

    public void siguienteJugador() {
        if (!listaJugadores.isEmpty()) {
            jugadorActualIndex = (jugadorActualIndex + 1) % listaJugadores.size();
        }
    }
}

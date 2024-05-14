import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {
    List<Jugador> jugadores;
    NodoSilla inicio;
    Scanner scanner;

    public Juego() {
        jugadores = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void iniciarJuego() {
        //  lista circular de sillas
        for (int i = 1; i <= jugadores.size(); i++) {
            if (inicio == null) {
                inicio = new NodoSilla("Silla " + i);
                inicio.siguiente = inicio; // Hace que la lista sea circular
            } else {
                inicio.siguiente = new NodoSilla("Silla " + i, inicio.siguiente);
            }
        }

        // Juego
        NodoSilla sillaActual = inicio;
        while (jugadores.size() > 1) {
            System.out.println("La música está sonando...");
            esperar();
            System.out.println("La música se detiene. Se quitó la silla: " + sillaActual.siguiente.nombre);
            Jugador jugadorEliminado = eliminarJugador();
            if (jugadorEliminado != null) {
                System.out.println("El jugador " + jugadorEliminado.getNombre() + " se ha quedado sin silla y es eliminado.");
            }
            sillaActual.siguiente = sillaActual.siguiente.siguiente; // Quita la siguiente silla en la lista circular

            if (jugadores.size() < obtenerCantidadSillas()) {
                Jugador jugadorEliminadoFinal = eliminarJugador();
                if (jugadorEliminadoFinal != null) {
                    System.out.println("El jugador " + jugadorEliminadoFinal.getNombre() + " se ha quedado sin silla y es eliminado.");
                }
            }

            sillaActual = sillaActual.siguiente;
        }

        //el metodo del ganador del  jugo 
        if (!jugadores.isEmpty()) {
            System.out.println("¡El jugador " + jugadores.get(0).getNombre() + " gana el juego!");
        } else {
            System.out.println("¡No hay jugadores restantes! El juego termina sin ganador.");
        }
    }

    private void esperar() {
        System.out.println("Presiona Enter para detener la música...");
        scanner.nextLine();
    }

    private Jugador eliminarJugador() {
        if (!jugadores.isEmpty()) {
            return jugadores.remove(0);
        }
        return null;
    }

    private int obtenerCantidadSillas() {
        return jugadores.size();
    }

    static class NodoSilla {
        String nombre;
        NodoSilla siguiente;

        public NodoSilla(String nombre) {
            this.nombre = nombre;
            this.siguiente = null;
        }

        public NodoSilla(String nombre, NodoSilla siguiente) {
            this.nombre = nombre;
            this.siguiente = siguiente;
        }
    }
}

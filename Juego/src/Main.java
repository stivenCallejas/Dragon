import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de las sillas musicales.");
        System.out.print("Ingresa el número de jugadores: ");
        int numJugadores = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de leer el número de jugadores

        for (int i = 1; i <= numJugadores; i++) {
            System.out.print("Ingresa el nombre del jugador " + i + ": ");
            String nombreJugador = scanner.nextLine();
            juego.agregarJugador(new Jugador(nombreJugador));
        }

        juego.iniciarJuego();
    }
}

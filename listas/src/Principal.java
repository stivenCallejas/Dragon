
import java.util.Scanner;

// Clase Principal (Main)
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEnlazada listaEnlazada = new ListaEnlazada();

        // Solicitar al usuario ingresar valores hasta que decida terminar
        while (true) {
            System.out.println("Ingrese un valor (o escriba 'fin' para terminar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                int valor = Integer.parseInt(input);
                listaEnlazada.agregarNodo(valor);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        System.out.println("Lista original:");
        listaEnlazada.imprimirLista();

        listaEnlazada.removerDuplicados();

        System.out.println("\nLista después de eliminar duplicados:");
        listaEnlazada.imprimirLista();
    }
}
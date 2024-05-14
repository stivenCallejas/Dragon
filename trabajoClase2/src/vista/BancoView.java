// Paquete vista
package vista;

import java.util.Scanner;



public class BancoView {
    private final BancoController controller;
    private Scanner scanner;

    public BancoView(BancoController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("----- Menú -----");
        System.out.println("1. Agregar cliente a la cola");
        System.out.println("2. Atender siguiente cliente");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    String nombreCliente = scanner.nextLine();
                    controller.agregarCliente(nombreCliente);
                    break;
                case 2:
                    controller.atenderCliente();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 3);
    }
}

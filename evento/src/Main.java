
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la secuencia de eventos
        SecuenciaEventos secuencia = new SecuenciaEventos();

        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Agregar evento");
            System.out.println("2. Listar eventos");
            System.out.println("3. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tipo de evento (publicación, comentario, reacción):");
                    String tipoEvento = scanner.nextLine();

                    System.out.println("Ingrese el ID del usuario:");
                    int idUsuario = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer del scanner

                    System.out.println("Ingrese la fecha y hora del evento (formato: yyyy-MM-dd HH:mm:ss):");
                    String fechaHora = scanner.nextLine();

                    System.out.println("Ingrese el contenido del evento:");
                    String contenido = scanner.nextLine();

                    Evento nuevoEvento = new Evento(tipoEvento, idUsuario, fechaHora, contenido);
                    secuencia.agregarEvento(nuevoEvento);
                    break;

                case 2:
                    System.out.println("Filtrar por tipo de evento (dejar en blanco para mostrar todos):");
                    String filtroTipo = scanner.nextLine();

                    System.out.println("Filtrar por ID de usuario (-1 para mostrar todos):");
                    int filtroIdUsuario = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer del scanner

                    secuencia.listarEventos(filtroTipo, filtroIdUsuario);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 3);
        
        scanner.close();
    }
}

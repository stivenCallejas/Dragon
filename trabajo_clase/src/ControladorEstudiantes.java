import java.util.Scanner;

public class ControladorEstudiantes {
    public static void main(String[] args) {
        ListaEstudiantes lista = new ListaEstudiantes();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar estudiante al final");
            System.out.println("2. Agregar estudiante al principio");
            System.out.println("3. Eliminar estudiante del final");
            System.out.println("4. Eliminar estudiante del principio");
            System.out.println("5. Mostrar listado de estudiantes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese edad del estudiante: ");
                    int edad = scanner.nextInt();
                    lista.agregarAlFinal(new Estudiante(nombre, edad));
                    break;
                case 2:
                    System.out.print("Ingrese nombre del estudiante: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese edad del estudiante: ");
                    edad = scanner.nextInt();
                    lista.agregarAlPrincipio(new Estudiante(nombre, edad));
                    break;
                case 3:
                    lista.eliminarDelFinal();
                    break;
                case 4:
                    lista.eliminarDelPrincipio();
                    break;
                case 5:
                    System.out.println("Listado de estudiantes:");
                    lista.mostrarEstudiantes();
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}

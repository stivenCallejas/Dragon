import java.io.*;
import java.util.Scanner;

class ListaTareas {
    private String[] tareas;
    private boolean[] completadas;
    private int cantidadTareas;

    public ListaTareas() {
        tareas = new String[100];
        completadas = new boolean[100];
        cantidadTareas = 0;
        cargarTareasDesdeArchivo();
    }

    private void cargarTareasDesdeArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader("tareas.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    agregarTarea(parts[0], Boolean.parseBoolean(parts[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar las tareas desde el archivo: " + e.getMessage());
        }
    }

    private void guardarTareasEnArchivo() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("tareas.txt"))) {
            for (int i = 0; i < cantidadTareas; i++) {
                writer.println(tareas[i] + "," + completadas[i]);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar las tareas en el archivo: " + e.getMessage());
        }
    }

    public void agregarTarea(String tarea, boolean completada) {
        tareas[cantidadTareas] = tarea;
        completadas[cantidadTareas] = completada;
        cantidadTareas++;
        System.out.println("Tarea agregada: " + tarea);
        guardarTareasEnArchivo();
    }

    public void completarTarea(String tarea) {
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i].equals(tarea)) {
                completadas[i] = true;
                System.out.println("Tarea completada: " + tarea);
                guardarTareasEnArchivo();
                return;
            }
        }
        System.out.println("Tarea no encontrada: " + tarea);
    }

    public void listarTareas() {
        System.out.println("Lista de tareas:");
        for (int i = 0; i < cantidadTareas; i++) {
            String estado = completadas[i] ? "Completada" : "Pendiente";
            System.out.println((i + 1) + ". " + tareas[i] + " - " + estado);
        }
    }

    public void eliminarTarea(String tarea) {
        for (int i = 0; i < cantidadTareas; i++) {
            if (tareas[i].equals(tarea)) {
                for (int j = i; j < cantidadTareas - 1; j++) {
                    tareas[j] = tareas[j + 1];
                    completadas[j] = completadas[j + 1];
                }
                cantidadTareas--;
                System.out.println("Tarea eliminada: " + tarea);
                guardarTareasEnArchivo();
                return;
            }
        }
        System.out.println("Tarea no encontrada: " + tarea);
    }

    public int contarTareasPendientes() {
        int count = 0;
        for (int i = 0; i < cantidadTareas; i++) {
            if (!completadas[i]) {
                count++;
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        ListaTareas listaTareas = new ListaTareas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Completar tarea");
            System.out.println("3. Listar tareas");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Contar tareas pendientes");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea a agregar: ");
                    String nuevaTarea = scanner.nextLine();
                    listaTareas.agregarTarea(nuevaTarea, false);
                    break;
                case 2:
                    System.out.print("Ingrese la tarea a completar: ");
                    String tareaCompletar = scanner.nextLine();
                    listaTareas.completarTarea(tareaCompletar);
                    break;
                case 3:
                    listaTareas.listarTareas();
                    break;
                case 4:
                    System.out.print("Ingrese la tarea a eliminar: ");
                    String tareaEliminar = scanner.nextLine();
                    listaTareas.eliminarTarea(tareaEliminar);
                    break;
                case 5:
                    int tareasPendientes = listaTareas.contarTareasPendientes();
                    System.out.println("Tareas pendientes: " + tareasPendientes);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

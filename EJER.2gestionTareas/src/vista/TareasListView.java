package vista;

import java.util.LinkedList;
import java.util.Scanner;
import modelo.TareaModel;

public class TareasListView {
    private Scanner scanner;

    public TareasListView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("--- Gestión de Tareas ---");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Mostrar todas las tareas");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public String obtenerNombreTarea() {
        System.out.print("Nombre de la tarea: ");
        return scanner.nextLine();
    }

    public String obtenerDescripcionTarea() {
        System.out.print("Descripción de la tarea: ");
        return scanner.nextLine();
    }

    public int obtenerIndiceTareaEliminar() {
        System.out.print("Ingrese el índice de la tarea a eliminar: ");
        return scanner.nextInt();
    }

    public void mostrarTareas(LinkedList<TareaModel> listaTareas) {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas.");
        } else {
            System.out.println("Lista de Tareas:");
            for (int i = 0; i < listaTareas.size(); i++) {
                TareaModel tarea = listaTareas.get(i);
                System.out.println("[" + i + "] Nombre: " + tarea.getNombre() + ", Descripción: " + tarea.getDescripcion());
            }
        }
    }

    public String obtenerInput() {
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

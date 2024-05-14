
import java.util.LinkedList;
import java.util.Scanner;








public class SecuenciaEventos {
    private NodoEvento inicio;
    private NodoEvento fin;

    public void agregarEvento(Evento evento) {
        NodoEvento nuevoNodo = new NodoEvento(evento);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            NodoEvento actual = inicio;
            while (actual != null) {
                if (evento.getFechaHora().compareTo(actual.getEvento().getFechaHora()) <= 0) {
                    // Insertar antes del nodo actual
                    nuevoNodo.setSiguiente(actual);
                    nuevoNodo.setAnterior(actual.getAnterior());
                    if (actual.getAnterior() != null) {
                        actual.getAnterior().setSiguiente(nuevoNodo);
                    } else {
                        inicio = nuevoNodo;
                    }
                    actual.setAnterior(nuevoNodo);
                    break;
                }
                actual = actual.getSiguiente();
            }
            if (actual == null) {
                // Insertar al final
                fin.setSiguiente(nuevoNodo);
                nuevoNodo.setAnterior(fin);
                fin = nuevoNodo;
            }
        }
    }

    public void eliminarEvento(int idEvento) {
        NodoEvento actual = inicio;
        while (actual != null) {
            if (actual.getEvento().getId() == idEvento) {
                // Eliminar el nodo actual
                if (actual.getAnterior() != null) {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                } else {
                    inicio = actual.getSiguiente();
                }
                if (actual.getSiguiente() != null) {
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                } else {
                    fin = actual.getAnterior();
                }
                break;
            }
            actual = actual.getSiguiente();
        }
    }

    public LinkedList<Evento> buscarEventos(String tipoEvento, int idUsuario) {
        LinkedList<Evento> eventosEncontrados = new LinkedList<>();
        NodoEvento actual = inicio;
        while (actual != null) {
            Evento evento = actual.getEvento();
            if ((tipoEvento.isEmpty() || evento.getTipoEvento().equals(tipoEvento))
                    && (idUsuario == -1 || evento.getIdUsuario() == idUsuario)) {
                eventosEncontrados.add(evento);
            }
            actual = actual.getSiguiente();
        }
        return eventosEncontrados;
    }

    public void listarEventos(String tipoEvento, int idUsuario) {
        NodoEvento actual = inicio;
        while (actual != null) {
            Evento evento = actual.getEvento();
            if ((tipoEvento.isEmpty() || evento.getTipoEvento().equals(tipoEvento))
                    && (idUsuario == -1 || evento.getIdUsuario() == idUsuario)) {
                System.out.println(evento);
            }
            actual = actual.getSiguiente();
        }
    }

    public void interactuarConUsuario() {
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
                    // Lógica para agregar evento desde la consola
                    agregarEventoDesdeConsola(scanner);
                    break;

                case 2:
                    // Lógica para listar eventos desde la consola
                    listarEventosDesdeConsola(scanner);
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

    private void agregarEventoDesdeConsola(Scanner scanner) {
        System.out.println("Ingrese el tipo de evento (publicación, comentario, reacción):");
    String tipoEvento = scanner.nextLine();

    System.out.println("Ingrese el ID del usuario que realiza el evento:");
    int idUsuario = scanner.nextInt();
    scanner.nextLine();  // Limpiar el buffer del scanner

    System.out.println("Ingrese la fecha y hora del evento (ej. 2024-03-12 10:30:00):");
    String fechaHora = scanner.nextLine();

    System.out.println("Ingrese el contenido del evento:");
    String contenido = scanner.nextLine();

    // Crea un nuevo evento con los datos proporcionados por el usuario
    Evento nuevoEvento = new Evento(tipoEvento, idUsuario, fechaHora, contenido);

    // Agrega el evento a la secuencia
    agregarEvento(nuevoEvento);

    System.out.println("Evento agregado correctamente.");
}

    private void listarEventosDesdeConsola(Scanner scanner) {
       System.out.println("Ingrese el tipo de evento (deje en blanco para mostrar todos los eventos):");
    String tipoEvento = scanner.nextLine();

    System.out.println("Ingrese el ID del usuario (ingrese -1 para mostrar eventos de todos los usuarios):");
    int idUsuario = scanner.nextInt();
    scanner.nextLine();  // Limpiar el buffer del scanner

    // Lista los eventos según los criterios proporcionados por el usuario
    LinkedList<Evento> eventos = buscarEventos(tipoEvento, idUsuario);

    if (eventos.isEmpty()) {
        System.out.println("No se encontraron eventos que coincidan con los criterios proporcionados.");
    } else {
        System.out.println("Eventos encontrados:");
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }
}
    }


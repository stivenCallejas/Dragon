
import modelo.TareasListaModel;
import vista.TareasListView;

public class TareasListaController {
    private TareasListaModel modelo;
    private TareasListView vista;

    public TareasListaController(TareasListaModel modelo, TareasListView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            vista.mostrarMenu();
            int opcion = Integer.parseInt(vista.obtenerInput());

            switch (opcion) {
                case 1:
                    agregarTarea();
                    break;
                case 2:
                    eliminarTarea();
                    break;
                case 3:
                    mostrarTareas();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    private void agregarTarea() {
        String nombre = vista.obtenerNombreTarea();
        String descripcion = vista.obtenerDescripcionTarea();
        modelo.agregarTarea(nombre, descripcion);
        vista.mostrarMensaje("Tarea agregada exitosamente.");
    }

    private void eliminarTarea() {
        vista.mostrarTareas(modelo.getListaTareas());
        int indice = vista.obtenerIndiceTareaEliminar() - 1;
        if (indice >= 0 && indice < modelo.getListaTareas().size()) {
            modelo.eliminarTarea(indice);
            vista.mostrarMensaje("Tarea eliminada exitosamente.");
        } else {
            vista.mostrarMensaje("Índice de tarea no válido.");
        }
    }

    private void mostrarTareas() {
        vista.mostrarTareas(modelo.getListaTareas());
    }
}

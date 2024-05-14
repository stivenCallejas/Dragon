import modelo.TareasListaModel;
import vista.TareasListView;

public class MainGestionTareas {
    public static void main(String[] args) {
        TareasListaModel modelo = new TareasListaModel();
        TareasListView vista = new TareasListView();
        TareasListaController controlador = new TareasListaController(modelo, vista);

        controlador.iniciar();
    }
}

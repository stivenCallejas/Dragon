package trabajoestructuras;

import controlador.ControladorHistorial;
import modelo.HistorialNavegacion;
import vista.VistaHistorial;

public class Main {
    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();
        ControladorHistorial controlador = new ControladorHistorial(historial, new VistaHistorial()); // Aquí se inicializa controlador correctamente
        VistaHistorial vista = new VistaHistorial(controlador);
        vista.mostrar();
    }
}

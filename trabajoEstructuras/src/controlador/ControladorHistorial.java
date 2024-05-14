package controlador;

import modelo.HistorialNavegacion;
import vista.VistaHistorial;
import modelo.PaginaWeb;

public class ControladorHistorial {
    private HistorialNavegacion historial;
    private VistaHistorial vista;
    private ControladorHistorial controlador;

    public ControladorHistorial(HistorialNavegacion historial, VistaHistorial vista) {
        this.historial = historial;
        this.vista = vista;
        this.vista.mostrar();
    }

    public void visitarPagina(String url) {
        PaginaWeb pagina = new PaginaWeb(url, "Título de la página");
        historial.visitarPagina(pagina);
        mostrarPaginaActual();
    }

    public void retroceder() {
        historial.retroceder();
        mostrarPaginaActual();
    }

    public void avanzar() {
        historial.avanzar();
        mostrarPaginaActual();
    }

    private void mostrarPaginaActual() {
        vista.mostrarPaginaActual(historial.getPaginaActual().getTitulo());
    }

    public void setControlador(ControladorHistorial controlador) {
        this.controlador = controlador;
    }
}

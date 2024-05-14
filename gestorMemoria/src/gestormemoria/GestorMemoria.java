package gestormemoria;

import modelo.MemoriaModelo;
import vista.MemoriaVista;
import controlador.MemoriaControlador;

public class GestorMemoria {
    public static void main(String[] args) {
        MemoriaModelo modelo = new MemoriaModelo();
        MemoriaVista vista = new MemoriaVista();
        MemoriaControlador controlador = new MemoriaControlador(modelo, vista);

        controlador.iniciar();
    }
}

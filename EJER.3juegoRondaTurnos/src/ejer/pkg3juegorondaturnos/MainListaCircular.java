package ejer.pkg3juegorondaturnos;

import controlador.ListaCircularController;
import modelo.ListaCircularModel;
import vista.ListaCircularView;

public class MainListaCircular {
    public static void main(String[] args) {
        ListaCircularModel modelo = new ListaCircularModel();
        ListaCircularView vista = new ListaCircularView();
        ListaCircularController controlador = new ListaCircularController(modelo, vista);

        controlador.jugar();
    }
}

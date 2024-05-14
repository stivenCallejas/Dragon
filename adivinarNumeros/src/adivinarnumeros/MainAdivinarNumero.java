package adivinarnumeros;

import controlador.AdivinarNumeroController;
import modelo.AdivinarNumeroModel;
import vista.AdivinarNumeroView;

public class MainAdivinarNumero {
    public static void main(String[] args) {
        AdivinarNumeroModel modelo = new AdivinarNumeroModel();
        AdivinarNumeroView vista = new AdivinarNumeroView();
        AdivinarNumeroController controlador = new AdivinarNumeroController(modelo, vista);

        controlador.jugar();
    }
}

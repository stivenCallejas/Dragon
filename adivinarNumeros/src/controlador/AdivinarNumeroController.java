package controlador;

import java.util.ArrayList;
import modelo.AdivinarNumeroModel;
import vista.AdivinarNumeroView;

public class AdivinarNumeroController {
    private AdivinarNumeroModel modelo;
    private AdivinarNumeroView vista;

    public AdivinarNumeroController(AdivinarNumeroModel modelo, AdivinarNumeroView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void jugar() {
        ArrayList<Integer> numerosAdivinados = new ArrayList<>();
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            int numero = vista.obtenerNumero();
            boolean acierto = modelo.adivinar(numero);
            numerosAdivinados.add(numero);

            if (acierto) {
                vista.mostrarMensaje("¡Felicidades! Has adivinado el número.");
                juegoTerminado = true;
            } else {
                vista.mostrarMensaje("Intenta de nuevo.");
            }
        }

        vista.mostrarNumerosAdivinados(numerosAdivinados);
    }
}

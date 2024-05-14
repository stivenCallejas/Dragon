package vista;

import java.util.ArrayList;
import java.util.Scanner;

public class AdivinarNumeroView {
    private Scanner scanner;

    public AdivinarNumeroView() {
        scanner = new Scanner(System.in);
    }

    public int obtenerNumero() {
        System.out.print("Adivina el número: ");
        return scanner.nextInt();
    }

    public void mostrarNumerosAdivinados(ArrayList<Integer> numerosAdivinados) {
        System.out.println("Números adivinados: " + numerosAdivinados);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

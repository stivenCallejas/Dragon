package vista;

import java.util.Scanner;

public class Vista {
    public String obtenerEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de caracteres para verificar el balanceo de paréntesis: ");
        return scanner.nextLine();
    }

    public void mostrarResultado(boolean resultado) {
        if (resultado) {
            System.out.println("La cadena está correctamente balanceada.");
        } else {
            System.out.println("La cadena NO está correctamente balanceada.");
        }
    }
}

package ejercicioclase;

import controlador.Controlador;

import java.util.Scanner;

public class EjercicioClase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de caracteres para verificar el balanceo de paréntesis: ");
        String entrada = scanner.nextLine();

        Controlador controlador = new Controlador();
        controlador.ejecutar(entrada);
    }
}

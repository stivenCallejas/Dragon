package controlador;

import java.util.Scanner;
import modelo.VerificadorBalanceo;
import vista.Vista;

public class Controlador {
    private VerificadorBalanceo verificador;
    private Vista vista;

    public Controlador() {
        this.verificador = new VerificadorBalanceo();
        this.vista = new Vista();
    }

    public void ejecutar(String entrada) {
        boolean resultado = verificador.verificarBalanceo(entrada);
        vista.mostrarResultado(resultado);
    }

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de caracteres para verificar el balanceo de paréntesis: ");
        String entrada = scanner.nextLine();
        controlador.ejecutar(entrada);
    }
}

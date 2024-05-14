package vista;

import java.util.Scanner;

public class EncriptadorVista {
    private Scanner scanner;

    public EncriptadorVista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String solicitarContraseña() {
        System.out.print("Ingrese su contraseña: ");
        return scanner.nextLine();
    }

    public void mostrarContraseñaEncriptada(String contraseñaEncriptada) {
        System.out.println("La contraseña encriptada es: " + contraseñaEncriptada);
    }

    public void mostrarContraseñaDesencriptada(String contraseñaDesencriptada) {
        System.out.println("La contraseña desencriptada es: " + contraseñaDesencriptada);
    }
}

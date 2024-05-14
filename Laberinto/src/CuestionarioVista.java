import java.util.Scanner;

public class CuestionarioVista {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String obtenerRespuestaUsuario() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

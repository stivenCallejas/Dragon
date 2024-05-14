public class Main {
    public static void main(String[] args) {
        CuestionarioModelo modelo = new CuestionarioModelo();
        CuestionarioVista vista = new CuestionarioVista();
        CuestionarioControlador controlador = new CuestionarioControlador(modelo, vista);

        controlador.iniciarCuestionario();
    }
}

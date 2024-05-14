public class CuestionarioControlador {
    private CuestionarioModelo modelo;
    private CuestionarioVista vista;

    public CuestionarioControlador(CuestionarioModelo modelo, CuestionarioVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarCuestionario() {
        while (!modelo.haTerminadoCuestionario()) {
            CuestionarioModelo.PreguntaRespuesta preguntaActual = modelo.obtenerPreguntaActual();

            if (preguntaActual != null) {
                vista.mostrarMensaje(preguntaActual.getEnunciado());
                String respuestaUsuario = vista.obtenerRespuestaUsuario();

                if (modelo.verificarRespuesta(respuestaUsuario)) {
                    vista.mostrarMensaje("¡Respuesta correcta! Puedes pasar a la siguiente pregunta.");
                } else {
                    vista.mostrarMensaje("Respuesta incorrecta. Inténtalo de nuevo.");
                }
            } else {
                // Manejar el caso donde no hay más preguntas
                break;
            }
        }

        vista.mostrarMensaje("¡Felicidades! Has completado el cuestionario.");
    }

    public static void main(String[] args) {
        CuestionarioModelo modelo = new CuestionarioModelo();
        CuestionarioVista vista = new CuestionarioVista();
        CuestionarioControlador controlador = new CuestionarioControlador(modelo, vista);

        controlador.iniciarCuestionario();
    }
}

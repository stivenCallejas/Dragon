import java.util.HashMap;
import java.util.Map;

public class CuestionarioModelo {
    private Map<String, PreguntaRespuesta> preguntasRespuestas;
    private int numeroPreguntaActual;

    public CuestionarioModelo() {
        preguntasRespuestas = new HashMap<>();
        preguntasRespuestas.put("Pregunta 1", new PreguntaRespuesta("¿Cuál es la capital de Francia?", "París"));
        preguntasRespuestas.put("Pregunta 2", new PreguntaRespuesta("¿Cuántos planetas hay en nuestro sistema solar?", "8"));
        preguntasRespuestas.put("Pregunta 3", new PreguntaRespuesta("¿En qué año se firmó la Declaración de Independencia de los Estados Unidos?", "1776"));

        numeroPreguntaActual = 1;
    }

    public PreguntaRespuesta obtenerPreguntaActual() {
        if (numeroPreguntaActual > preguntasRespuestas.size()) {
            return null;  // Devuelve null si el cuestionario ha terminado
        }

        return preguntasRespuestas.get("Pregunta " + numeroPreguntaActual);
    }

    public boolean verificarRespuesta(String respuesta) {
        PreguntaRespuesta preguntaActual = obtenerPreguntaActual();

        if (preguntaActual == null) {
            return false;  // Si el cuestionario ya ha terminado, siempre devuelve falso.
        }

        boolean esCorrecta = respuesta.equalsIgnoreCase(preguntaActual.getRespuestaCorrecta());

        if (esCorrecta) {
            numeroPreguntaActual++;
        }

        return esCorrecta;
    }

    public boolean haTerminadoCuestionario() {
        return numeroPreguntaActual > preguntasRespuestas.size();
    }

    public static class PreguntaRespuesta {
        private String enunciado;
        private String respuestaCorrecta;

        public PreguntaRespuesta(String enunciado, String respuestaCorrecta) {
            this.enunciado = enunciado;
            this.respuestaCorrecta = respuestaCorrecta;
        }

        public String getEnunciado() {
            return enunciado;
        }

        public String getRespuestaCorrecta() {
            return respuestaCorrecta;
        }
    }
}

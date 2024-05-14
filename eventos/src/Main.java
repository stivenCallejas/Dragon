public class Main {
    public static void main(String[] args) {
        // Ejemplo de cómo utilizar las clases y realizar operaciones
        SecuenciaEventos secuencia = new SecuenciaEventos();

        // Agregar eventos de ejemplo
        Evento evento1 = new Evento("publicación", 1, "2024-03-12 10:30:00", "Contenido de la publicación");
        Evento evento2 = new Evento("comentario", 2, "2024-03-12 11:15:00", "Comentario en la publicación");
        secuencia.agregarEvento(evento1);
        secuencia.agregarEvento(evento2);

        // Realizar otras operaciones según tus necesidades

        // Imprimir el estado actual de la secuencia
        System.out.println("Estado actual de la secuencia:");
        secuencia.listarEventos("", -1);
    }
}
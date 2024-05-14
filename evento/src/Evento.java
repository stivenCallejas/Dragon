

public class Evento {
    private static int contadorId = 1;
    private int id;
    private String tipoEvento;
    private int idUsuario;
    private String fechaHora;
    private String contenido;

    public Evento(String tipoEvento, int idUsuario, String fechaHora, String contenido) {
        this.id = contadorId++;
        this.tipoEvento = tipoEvento;
        this.idUsuario = idUsuario;
        this.fechaHora = fechaHora;
        this.contenido = contenido;
    }

    public int getId() {
        return id;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", tipoEvento='" + tipoEvento + '\'' +
                ", idUsuario=" + idUsuario +
                ", fechaHora='" + fechaHora + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}

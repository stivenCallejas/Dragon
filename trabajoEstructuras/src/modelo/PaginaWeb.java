package modelo;



// Modelo
class PageWeb {
    private String url;
    private String titulo;

    public PageWeb(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public String getTitulo() {
        return titulo;
    }
}

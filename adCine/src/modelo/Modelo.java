package modelo;

import java.util.List;

public class Pelicula {
    private String titulo;
    private int duracion;
    private String clasificacion;

    
}

public class Sala {
    private int numero;
    private int capacidad;

    public Sala(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


}

public class ModeloCine {
    public List<Pelicula> obtenerListaPeliculas() {
      
        return null;
    }

    public Sala obtenerInfoSala(int numeroSala) {
        
        return

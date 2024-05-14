package controlador;

import java.util.List;
import modelo.ModeloCine;
import modelo.Pelicula;
import modelo.Sala;
import vista.VistaPeliculas;


public class ControladorPelicula {
    private VistaPeliculas vistaPeliculas;
    private ModeloCine modeloCine;

    public ControladorPelicula(VistaPeliculas vista, ModeloCine modelo) {
        this.vistaPeliculas = vista;
        this.modeloCine = modelo;
    }

   

    public void obtenerYMostrarListaPeliculas() {
        List<Pelicula> peliculas = modeloCine.obtenerListaPeliculas();
        vistaPeliculas.mostrarListaPeliculas(peliculas);
    }
}



  

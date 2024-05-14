package Controlador;

import java.util.ArrayList;
import java.util.List;


public class Controlador {
    private List<Controlador> autos;

    public Controlador() {
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Controlador auto) {
        autos.add(auto);
    }

    public List<Controlador> getAutos() {
        return autos;
    }

    // Otros métodos de control si los necesitas
}

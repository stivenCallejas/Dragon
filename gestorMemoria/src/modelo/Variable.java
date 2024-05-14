// Paquete modelo
package modelo;

import com.sun.source.tree.Scope;

public class Variable {
    private String nombre;
    private int tamaño;
    private Scope ambito;

    public Variable(String nombre, int tamaño, Scope ambito) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.ambito = ambito;
    }

    // Métodos getter y setter para nombre, tamaño y ámbito
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Scope getAmbito() {
        return ambito;
    }

    public void setAmbito(Scope ambito) {
        this.ambito = ambito;
    }
}

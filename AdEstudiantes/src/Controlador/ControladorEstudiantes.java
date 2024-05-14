/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Angela Marquez
 */
public class ControladorEstudiantes {
    private Estudiante estudiante;
    private VistaEstudiante vistaEstudiante;

    public ControladorEstudiantes(Estudiante estudiante, VistaEstudiante vistaEstudiante) {
        this.estudiante = estudiante;
        this.vistaEstudiante = vistaEstudiante;
    }

    public void setEstudianteNombre(String nombre) {
        estudiante.setNombre(nombre);
    }

    public void setEstudianteId(String id) {
        estudiante.setId(id);
    }

    public void actualizarVista() {
        vistaEstudiante.printDetallesEstudiante(estudiante.getNombre(), estudiante.getId());
    }
}

    
}

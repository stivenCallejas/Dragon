/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JButton;
import javax.swing.JLabel;
import modelo.Pregunta;
import modelo.PreguntasReading;
import modelo.PreguntasWriting;
import vista.VistaPrincipal;
import vista.VistaR1;
import vista.VistaW1;

/**
 *
 * @author 57312
 */
public class Controlador {
    
    private VistaR1 vistaR1;
    private VistaW1 vistaW1;
    private PreguntasReading preguntasReading;
    private PreguntasWriting preguntasWriting;

    public Controlador() {
    }
    
    public Controlador(VistaR1 vistaR1) {
        this.vistaR1 = vistaR1;
    }
    
    public Controlador(VistaW1 vistaW1) {
        this.vistaW1 = vistaW1;
    }

    public void inicio() {
        VistaPrincipal vistaPrincipal = new VistaPrincipal();
        vistaPrincipal.setVisible(true);
    }
    
    public void mostrarPregunta(JLabel preguntaLbl, JButton[] botones, Pregunta pregunta) {
        pregunta.mostrarPregunta(preguntaLbl, botones);
    }
    
    
    public boolean verificarRespuesta(int respuestaUsuario, int respuestaCorrecta) {
        return respuestaUsuario == respuestaCorrecta;
    }
    
    public Pregunta[] cargarPreguntasLectura() {
        preguntasReading = new PreguntasReading();
        Pregunta[] preguntas = preguntasReading.cargarPreguntas();
        return preguntas;
    }
    
    public Pregunta[] cargarPreguntasEscritura() {
        preguntasWriting = new PreguntasWriting();
        Pregunta[] preguntas = preguntasWriting.cargarPreguntas();
        return preguntas;
    }
}

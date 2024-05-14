/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 57312
 */
public class PreguntasReading {
    
    public PreguntasReading(){
        
    }

    public Pregunta[] cargarPreguntas() {
        // Crea varias preguntas
        Pregunta pregunta1 = new PreguntaSeleccionMultiple(
                "¿Como se dice leer?",
                new String[]{"Read", "Reader", "Write"},
                0,"read.wav"
        );

        Pregunta pregunta2 = new PreguntaSeleccionMultiple(
                "¿Como se dice flor?",
                new String[]{"Flow", "Flower", "Following"},
                1,"Flower.wav"
        );

        Pregunta pregunta3 = new PreguntaSeleccionMultiple(
                "Como se dice Computador",
                new String[]{"Lamp", "Mouse", "Computer"},
                2,"Computer.wav"
        );
        
        Pregunta pregunta4 = new PreguntaSeleccionMultiple(
                "¿Como se dice Ventana?",
                new String[]{"Dor", "Table", "Window"},
                2,"Window.wav"
        );
        
        Pregunta pregunta5 = new PreguntaSeleccionMultiple(
                "como se dice Telefono",
                new String[]{"Phone", "Cellphone", "Cellular"},
                0,"Phone.wav"
        );
        Pregunta pregunta6 = new PreguntaSeleccionMultiple(
                "como se dice Vaso",
                new String[]{"Glass", "Vaso", "Drink"},
                0,"Glass.wav"
        );
        
        Pregunta pregunta7 = new PreguntaSeleccionMultiple(
                "como se dice ojo",
                new String[]{"eye", "arm", "fot"},
                0,"Eye.wav"
        );
        

        // Crea un array para almacenar las preguntas
        Pregunta[] preguntas = {pregunta1, pregunta2, pregunta3, pregunta4, pregunta5, pregunta6, pregunta7};
        return preguntas;
    }

}

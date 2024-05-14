/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



/**
 *
 * @author 57312
 */
public class PreguntasWriting {
    
    public PreguntasWriting(){
        
    }
    
    
    public Pregunta[] cargarPreguntas() {
        
          Pregunta pregunta1 = new PreguntaSeleccionMultiple(
                "¿Como se escribe manzana?",
                new String[]{"apple"},
                0,"carro.wav"
        );
          
          Pregunta pregunta2 = new PreguntaSeleccionMultiple(
                "¿Como se escribe carro?",
                new String[]{"car"},
                0,"avion.wav"
        );
          
          Pregunta pregunta3 = new PreguntaSeleccionMultiple(
                "¿Como se escribe avion?",
                new String[]{"airplane"},
                0,"balon.wav"
        );
          
          Pregunta pregunta4 = new PreguntaSeleccionMultiple(
                "¿Como se escribe balon?",
                new String[]{"ball"},
                0,"perro.wav"
        );
          
          Pregunta pregunta5 = new PreguntaSeleccionMultiple(
                "¿Como se escribe perro?",
                new String[]{"dog"},
                0,"casa.wav"
        );
          
          Pregunta pregunta6 = new PreguntaSeleccionMultiple(
                "¿Como se escribe casa?",
                new String[]{"house"},
                0,"sombrilla.wav"
        );
          
          Pregunta pregunta7 = new PreguntaSeleccionMultiple(
                "¿Como se escribe sombrilla?",
                new String[]{"umbrella"},
                0,"sombrilla.wav"
        );

        
      
     
        Pregunta[] preguntasEscritura = {pregunta1, pregunta2,pregunta3,pregunta4,pregunta5,pregunta6,pregunta7};
        return preguntasEscritura;
    }
    
}

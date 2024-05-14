/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author 57312
 */
public class PreguntaSeleccionMultiple extends Pregunta {

    public PreguntaSeleccionMultiple(String enunciado, String[] opciones, int respuestaCorrecta, String sonido) {
        super(enunciado, opciones, respuestaCorrecta, sonido);
    }

    @Override
    public void mostrarPregunta(JLabel preguntaLbl, JButton[] botones) {
        System.out.println(enunciado);
        preguntaLbl.setText(enunciado);
        if (botones != null) {
            for (int i = 0; i < opciones.length; i++) {
                botones[i].setText(opciones[i]);
            }
        }

    }
    
    
    

//    public boolean verificarRespuesta(int respuestaUsuario) {
//        return respuestaUsuario == respuestaCorrecta;
//    }
}

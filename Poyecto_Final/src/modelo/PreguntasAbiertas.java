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
public class PreguntasAbiertas extends Pregunta {

    public PreguntasAbiertas(String enunciado, String[] opciones, int respuestaCorrecta, String sonido) {
        super(enunciado, opciones, respuestaCorrecta, sonido);
    }

    @Override
    public void mostrarPregunta(JLabel preguntaLbl, JButton[] botones) {
        System.out.println(enunciado);
        preguntaLbl.setText(enunciado);
        
    }

//    public boolean verificarRespuesta(int respuestaUsuario) {
//        return respuestaUsuario == respuestaCorrecta;
//    }

}

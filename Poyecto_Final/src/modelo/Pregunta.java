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
 * @param <T>
 */
public abstract class Pregunta<T> {

    protected String enunciado;
    protected String[] opciones;
    protected T respuestaCorrecta;
    protected String sonido;
     
     
    
//`costructor 
    public Pregunta(String enunciado, String[] opciones, T respuestaCorrecta, String sonido) {
        this.enunciado = enunciado;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
        this.sonido=sonido;
       
    }
    
    public Integer convertirAEntero(T valor) {
        if (valor instanceof Integer) {
            return (Integer) valor;
        } else if (valor instanceof String) {
            return Integer.parseInt((String) valor);
        } else {
            throw new IllegalArgumentException("No se puede convertir a entero");
        }
    }

    public String convertirAString(T valor) {
        return valor.toString();
    }
    
    
    public abstract void mostrarPregunta(JLabel preguntaLbl, JButton[] botones);

    
    public T getRespuestaCorrecta() {
        return respuestaCorrecta;
    }
    
    public String[] getOpciones(){
        return opciones;
    } 
    
    public String getSonido(){
        return sonido;
    } 
     
   
}

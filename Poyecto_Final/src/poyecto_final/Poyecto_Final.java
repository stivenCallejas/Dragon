/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poyecto_final;

import controlador.Controlador;
import modelo.Audio;

/**
 *
 * @author 57312
 */
public class Poyecto_Final {

    /**
     * @param args the command line arguments
     */
    //esta es la clase principal donde se ejecuta el proyecto
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.inicio();
        
        Audio audio=new Audio();
        audio.reproducir("Bienvenido.wav");


    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoclase;

import controlador.EncriptadorControlador;
import modelo.EncriptadorModelo;
import vista.EncriptadorVista;

/**
 *
 * @author 57312
 */
public class TrabajoClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    EncriptadorModelo modelo = new EncriptadorModelo();
    EncriptadorVista vista = new EncriptadorVista();
    EncriptadorControlador controlador = new EncriptadorControlador(modelo, vista);
    controlador.iniciar();
}

}

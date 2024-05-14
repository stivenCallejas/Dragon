/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jaja;

/**
 *
 * @author 57312
 */
public class Jaja {

    /**
     * @param args the command line arguments
     */
   public class Main {
    public static void main(String[] args) {
        Tren miTren = new Tren();

        miTren.agregarVagon(1);
        miTren.agregarVagon(2);
        miTren.agregarVagon(3);

        System.out.println("Tren inicial:");
        miTren.mostrarTren();

        miTren.desengancharVagon(2);

        System.out.println("Tren después de desenganchar el vagón 2:");
        miTren.mostrarTren();
    }
   }
}

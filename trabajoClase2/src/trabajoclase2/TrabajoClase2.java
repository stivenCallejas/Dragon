/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoclase2;

import vista.BancoView;
import vista.BancoController;


/**
 *
 * @author 57312
 */
public class TrabajoClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BancoController controller = new BancoController();
        BancoView view = new BancoView(controller);
        view.iniciar();
    }
}

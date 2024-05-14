import Controlador.Controlador;
import vista.vista;
public class GAATI {

    public static void main(String[] args) {
        vista miVista = new vista();
        Controlador Controlador = new Controlador();
        
        // Asigna el controlador a la vista si es necesario
        miVista.setControlador(Controlador);
        
        miVista.setVisible(true);
    }
}

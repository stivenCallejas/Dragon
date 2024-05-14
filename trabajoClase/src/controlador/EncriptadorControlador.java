package controlador;

import modelo.EncriptadorModelo;
import vista.EncriptadorVista;

public class EncriptadorControlador {
    private EncriptadorModelo modelo;
    private EncriptadorVista vista;

    public EncriptadorControlador(EncriptadorModelo modelo, EncriptadorVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        vista.mostrarMensaje("Bienvenido al encriptador de contraseñas");

        String contraseña = vista.solicitarContraseña();
        String contraseñaEncriptada = modelo.encriptar(contraseña);
        vista.mostrarContraseñaEncriptada(contraseñaEncriptada);

        String contraseñaDesencriptada = modelo.desencriptar(contraseñaEncriptada);
        vista.mostrarContraseñaDesencriptada(contraseñaDesencriptada);
    }

    public static void main(String[] args) {
        EncriptadorModelo modelo = new EncriptadorModelo();
        EncriptadorVista vista = new EncriptadorVista();
        EncriptadorControlador controlador = new EncriptadorControlador(modelo, vista);
        controlador.iniciar();
    }
}

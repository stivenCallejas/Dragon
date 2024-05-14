package com.mycompany.demoparcial.controlador;

import com.mycompany.demoparcial.modelo.TrenModelo;
import com.mycompany.demoparcial.vista.Vista;

public class Controlador {
    private Vista vista;
    private TrenModelo trenModelo;

    public Controlador() {
        this.vista = new Vista();
        this.trenModelo = new TrenModelo();
    }

    // Método para iniciar el programa
    public void init() {
        boolean continuar = true;
        while (continuar) {
            int opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    agregarVagon();
                    break;
                case 2:
                    eliminarVagon();
                    break;
                case 3:
                    mostrarTren();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    // Método para mostrar el menú y solicitar la opción al usuario
    private int mostrarMenu() {
        vista.mostrarMensaje("1. Agregar vagon");
        vista.mostrarMensaje("2. Eliminar vagon");
        vista.mostrarMensaje("3. Mostrar tren");
        vista.mostrarMensaje("4. Salir");
        return Integer.parseInt(vista.solicitarString("Seleccione una opción:"));
    }

    // Método para agregar un vagon al tren
    private void agregarVagon() {
        String contenido = vista.solicitarString("Ingrese el contenido del nuevo vagon:");
        trenModelo.agregarVagon(contenido);
        vista.mostrarMensaje("Vagon agregado correctamente.");
    }

    // Método para eliminar un vagon del tren
    private void eliminarVagon() {
        String contenido = vista.solicitarString("Ingrese el contenido del vagon que desea eliminar:");
        if (trenModelo.eliminarVagon(contenido)) {
            vista.mostrarMensaje("Vagon eliminado correctamente.");
        } else {
            vista.mostrarMensaje("El vagon no fue encontrado en el tren.");
        }
    }

    // Método para mostrar el contenido del tren
    private void mostrarTren() {
        vista.mostrarMensaje("c:");
        vista.mostrarMensaje(trenModelo.obtenerContenidoDelTren());
    }
}

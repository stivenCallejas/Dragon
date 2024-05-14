package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MemoriaModelo;
import vista.MemoriaVista;

public class MemoriaControlador {
    private MemoriaModelo modelo;
    private MemoriaVista vista;

    public MemoriaControlador(MemoriaModelo modelo, MemoriaVista vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Configurar listeners para los botones u otros componentes de la vista
        vista.getAsignarMemoriaButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la asignación de memoria
            }
        });

        vista.getLiberarMemoriaButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar la liberación de memoria
            }
        });
    }

    public void iniciar() {
        vista.mostrar();
    }
}

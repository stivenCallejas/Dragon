package vista;

import javax.swing.*;
import java.awt.FlowLayout;

public class MemoriaVista {
    private JFrame frame;
    private JButton asignarMemoriaButton;
    private JButton liberarMemoriaButton;

    public MemoriaVista() {
        frame = new JFrame("Gestión de Memoria");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        asignarMemoriaButton = new JButton("Asignar Memoria");
        liberarMemoriaButton = new JButton("Liberar Memoria");

        // Configurar el administrador de diseño y agregar los botones al JFrame
        frame.setLayout(new FlowLayout());
        frame.add(asignarMemoriaButton);
        frame.add(liberarMemoriaButton);
    }

    public void mostrar() {
        frame.pack(); // Ajusta automáticamente el tamaño de la ventana
        frame.setVisible(true);
    }

    public JButton getAsignarMemoriaButton() {
        return asignarMemoriaButton;
    }

    public JButton getLiberarMemoriaButton() {
        return liberarMemoriaButton;
    }
}

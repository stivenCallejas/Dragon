package vista;

import controlador.Controlador;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPolacaInversa extends JFrame implements ActionListener {
    private JTextField campoExpresion;
    private JButton botonEvaluar;
    private JLabel labelResultado;
    private Controlador controlador;

    public VistaPolacaInversa() {
        super("Evaluador de Notación Polaca Inversa");
        setLayout(new FlowLayout());

        campoExpresion = new JTextField(20);
        add(new JLabel("Expresión: "));
        add(campoExpresion);

        botonEvaluar = new JButton("Evaluar");
        botonEvaluar.addActionListener(this);
        add(botonEvaluar);

        labelResultado = new JLabel();
        add(labelResultado);

        controlador = new Controlador();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonEvaluar) {
            String expresion = campoExpresion.getText();
            int resultado = controlador.evaluarExpresion(expresion);
            labelResultado.setText("Resultado: " + resultado);
        }
    }

    public static void main(String[] args) {
        new VistaPolacaInversa();
    }
}
package controlador;

import java.util.Stack;

public class Controlador {

    public int evaluarExpresion(String expresion) {
        Stack<Integer> pila = new Stack<>();
        String[] tokens = expresion.split(" ");

        for (String token : tokens) {
            if (esOperando(token)) {
                pila.push(Integer.parseInt(token));
            } else {
                if (pila.size() < 2) {
                    throw new IllegalArgumentException("Expresión inválida: No hay suficientes operandos");
                }
                int operando2 = pila.pop();
                int operando1 = pila.pop();
                int resultado = realizarOperacion(token, operando1, operando2);
                pila.push(resultado);
            }
        }

        if (pila.size() != 1) {
            throw new IllegalArgumentException("Expresión inválida: Número incorrecto de operandos y operadores");
        }

        return pila.pop();
    }

    private boolean esOperando(String token) {
        return token.matches("\\d+");
    }

    private int realizarOperacion(String operador, int operando1, int operando2) {
        switch (operador) {
            case "+":
                return operando1 + operando2;
            case "-":
                return operando1 - operando2;
            case "*":
                return operando1 * operando2;
            case "/":
                if (operando2 == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return operando1 / operando2;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}
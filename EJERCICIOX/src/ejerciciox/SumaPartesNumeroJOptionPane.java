package ejerciciox;

import javax.swing.JOptionPane;

public class SumaPartesNumeroJOptionPane {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar un número con decimales
        String input = JOptionPane.showInputDialog(null, "Ingrese un número con decimales:");
        // Reemplazar comas con puntos para garantizar un formato válido
        input = input.replace(',', '.');
        
        try {
            double numero = Double.parseDouble(input);

            // Obtener la parte entera del número
            int parteEntera = (int) numero;

            // Obtener la parte decimal del número
            double parteDecimal = numero - parteEntera;

            // Calcular la suma de los dígitos de la parte entera
            int sumaParteEntera = sumarDigitos(parteEntera);

            // Calcular la suma de los dígitos de la parte decimal
            int sumaParteDecimal = sumarDigitos((int) (parteDecimal * 100)); // Multiplicar por 100 para convertir la parte decimal en un número entero

            // Calcular la suma total
            double sumaTotal = numero + sumaParteEntera + sumaParteDecimal;

            // Mostrar el resultado final
            JOptionPane.showMessageDialog(null,
                    "El número ingresado es: " + numero + "\n" +
                    "La suma de los dígitos de la parte entera es: " + sumaParteEntera + "\n" +
                    "La suma de los dígitos de la parte decimal es: " + sumaParteDecimal + "\n" +
                    "El resultado final es: " + sumaTotal);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato de número no válido. Por favor, ingrese un número válido.");
        }
    }

    // Función para sumar los dígitos de un número entero
    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10; // Obtener el último dígito y sumarlo
            numero /= 10; // Eliminar el último dígito
        }
        return suma;
    }
}

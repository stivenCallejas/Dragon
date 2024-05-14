package modelo;

public class VerificadorBalanceo {
    public boolean verificarBalanceo(String cadena) {
        int contador = 0;
        for (char caracter : cadena.toCharArray()) {
            if (caracter == '(') {
                contador++;
            } else if (caracter == ')') {
                if (contador == 0) {
                    return false;
                }
                contador--;
            }
        }
        return contador == 0;
    }
}

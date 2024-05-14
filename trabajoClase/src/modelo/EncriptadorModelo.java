package modelo;

import java.util.HashMap;
import java.util.Map;

public class EncriptadorModelo {
    private Map<Character, Character> claveEncriptacion;

    public EncriptadorModelo() {
        claveEncriptacion = new HashMap<>();
        // Definir la clave de encriptación
        claveEncriptacion.put('a', '!');
        claveEncriptacion.put('b', '#');
        claveEncriptacion.put('c', '$');
        claveEncriptacion.put('d', '%');
        claveEncriptacion.put('e', '&');
        // Agregar más caracteres y sus correspondientes encriptados según sea necesario
    }

    public String encriptar(String contraseña) {
        Pila pilaEncriptada = new Pila();
        for (char caracter : contraseña.toCharArray()) {
            if (claveEncriptacion.containsKey(caracter)) {
                pilaEncriptada.apilar(new Nodo(claveEncriptacion.get(caracter)));
            } else {
                pilaEncriptada.apilar(new Nodo(caracter));
            }
        }
        StringBuilder contraseñaEncriptada = new StringBuilder();
        while (!pilaEncriptada.estaVacia()) {
            contraseñaEncriptada.append(pilaEncriptada.desapilar().dato);
        }
        return contraseñaEncriptada.toString();
    }

    public String desencriptar(String contraseñaEncriptada) {
        Pila pilaDesencriptada = new Pila();
        for (char caracter : contraseñaEncriptada.toCharArray()) {
            if (claveEncriptacion.containsValue(caracter)) {
                for (Map.Entry<Character, Character> entry : claveEncriptacion.entrySet()) {
                    if (entry.getValue() == caracter) {
                        pilaDesencriptada.apilar(new Nodo(entry.getKey()));
                        break;
                    }
                }
            } else {
                pilaDesencriptada.apilar(new Nodo(caracter));
            }
        }
        StringBuilder contraseñaDesencriptada = new StringBuilder();
        while (!pilaDesencriptada.estaVacia()) {
            contraseñaDesencriptada.append(pilaDesencriptada.desapilar().dato);
        }
        return contraseñaDesencriptada.toString();
    }
}

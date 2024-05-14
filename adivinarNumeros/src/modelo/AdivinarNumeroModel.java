package modelo;

import java.util.ArrayList;
import java.util.Random;

public class AdivinarNumeroModel {
    private int numeroSecreto;
    private ArrayList<Integer> numerosAdivinados;

    public AdivinarNumeroModel() {
        Random random = new Random();
        numeroSecreto = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        numerosAdivinados = new ArrayList<>();
    }

    public boolean adivinar(int numero) {
        numerosAdivinados.add(numero);
        return numero == numeroSecreto;
    }

    public ArrayList<Integer> getNumerosAdivinados() {
        return numerosAdivinados;
    }
}

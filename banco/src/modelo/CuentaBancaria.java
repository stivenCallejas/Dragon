
/*
 * fundacion universitaria juan de castellanos
 */




/**
 *
 * @author Yeison Stiven Callejas 
 */
//aca se realza la logica del programa
package modelo;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            return false; // Fondos insuficientes
        }
    }
}

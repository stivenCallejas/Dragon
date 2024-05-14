package controlador;

import modelo.CuentaBancaria;
import vista.VistaCuentaBancaria;

public class ControladorCuentaBancaria {
    private CuentaBancaria cuentaBancaria;
    private VistaCuentaBancaria vista;

   /*
 * fundacion universitaria juan de castellanos
 */




/**
 *
 * @author Yeison Stiven Callejas 
 */
    public ControladorCuentaBancaria(CuentaBancaria cuentaBancaria, VistaCuentaBancaria vista) {
        this.cuentaBancaria = cuentaBancaria;
        this.vista = vista;
    }

    public void depositar(double monto) {
        cuentaBancaria.depositar(monto);
        vista.mostrarSaldo(cuentaBancaria.getSaldo());
        vista.mostrarMensaje("Depósito exitoso.");
    }

    public void retirar(double monto) {
        if (cuentaBancaria.retirar(monto)) {
            vista.mostrarSaldo(cuentaBancaria.getSaldo());
            vista.mostrarMensaje("Retiro exitoso.");
        } else {
            vista.mostrarMensaje("Fondos insuficientes para realizar el retiro.");
        }
    }
}

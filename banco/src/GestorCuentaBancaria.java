/*fundacion universitaria juan de castellanos 
 * 
 */




/**
 *
 * @author Yeison Stiven Callejas 
 */
//aca se realiza la otra parte logica del programa 
import java.util.Scanner;
import modelo.CuentaBancaria;
import vista.VistaCuentaBancaria;
import controlador.ControladorCuentaBancaria;

public class GestorCuentaBancaria {
    private CuentaBancaria cuenta;
    private VistaCuentaBancaria vista;
    private ControladorCuentaBancaria controlador;

    public GestorCuentaBancaria() {
        this.cuenta = new CuentaBancaria(1000.0);
        this.vista = new VistaCuentaBancaria();
        this.controlador = new ControladorCuentaBancaria(cuenta, vista);
    }

    public void iniciarGestion() {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 0);

        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Realizar depósito");
        System.out.println("3. Realizar retiro");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                vista.mostrarSaldo(cuenta.getSaldo());
                break;
            case 2:
                realizarDeposito();
                break;
            case 3:
                realizarRetiro();
                break;
            case 0:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                break;
        }
    }

    private void realizarDeposito() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto a depositar: $");
        double montoDeposito = scanner.nextDouble();
        controlador.depositar(montoDeposito);
    }

    private void realizarRetiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto a retirar: $");
        double montoRetiro = scanner.nextDouble();
        controlador.retirar(montoRetiro);
    }
}

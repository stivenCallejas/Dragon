/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adestudiantes;

import Modelo.ModeloEstudiantes;
import java.util.Scanner;

/**
 *
 * @author Angela Marquez
 */
public class AdEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancia del gestor de estudiantes
        ModeloEstudiantes gestorEstudiantes = new Modelo.ModeloEstudiantes();

        // Interfaz de usuario
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Actualizar Estudiante");
        System.out.println("3. Ver Estudiante");
        System.out.println("4. Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                gestorEstudiantes.agregarEstudiante(scanner);
                break;

            case 2:
                gestorEstudiantes.actualizarEstudiante(scanner);
                break;

            case 3:
                gestorEstudiantes.verEstudiante();
                break;

            case 4:
                System.exit(0);

            default:
                System.out.println("Opción no válida");
        }
    
    }
    
}

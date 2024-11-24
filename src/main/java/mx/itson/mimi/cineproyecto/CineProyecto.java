/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.mimi.cineproyecto;

/**
 *
 * @author Propietario
 */
import java.util.Scanner;

public class CineProyecto {
    public static void main(String[] args) {
        Cine cine = new Cine(); // Crear instancia del cine
        Scanner scanner = new Scanner(System.in);
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("\n=== Bienvenido al Cine VIP ===");
            System.out.println("1. Mostrar cartelera");
            System.out.println("2. Comprar boletos");
            System.out.println("3. Ver reporte general");
            System.out.println("4. Ver reporte por función");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    cine.mostrarCartelera();
                    break;
                case 2:
                    cine.comprarBoletos(scanner);
                    break;
                case 3:
                    cine.mostrarReporteGeneral();
                    break;
                case 4:
                    cine.mostrarReportePorFuncion();
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el sistema de cine! Adiós.");
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

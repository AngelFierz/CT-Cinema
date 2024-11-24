/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mimi.cineproyecto;

/**
 *
 * @author Propietario
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cine {
    private List<Pelicula> peliculas;
    private boolean[][] asientos;
    private List<Boleto> boletosVendidos;

    public Cine() {
        inicializarCartelera();
        inicializarAsientos();
        boletosVendidos = new ArrayList<>();
    }

    private void inicializarCartelera() {
        peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("Venom: El Último Baile", "2:00 PM", 120));
        peliculas.add(new Pelicula("Sonríe 2", "5:00 PM", 100));
        peliculas.add(new Pelicula("Gladiador (Reestreno)", "8:00 PM", 150));
        peliculas.add(new Pelicula("Solitude Antenna (Estreno)", "10:00 PM", 200));
    }

    private void inicializarAsientos() {
        asientos = new boolean[4][4];
    }

    public void mostrarCartelera() {
        System.out.println("\nCartelera");
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            System.out.printf("%d. %s - %s - $%.2f\n", i + 1, pelicula.getTitulo(), pelicula.getHorario(), pelicula.getPrecio());
        }
    }

    public void comprarBoletos(Scanner scanner) {
        mostrarCartelera();
        System.out.print("Seleccione el numero de la pelicula en cartelera: ");
        int seleccion = scanner.nextInt();
        if (seleccion < 1 || seleccion > peliculas.size()) {
            System.out.println("Pongalo bien we");
            return;
        }

        Pelicula pelicula = peliculas.get(seleccion - 1);

        mostrarAsientos();
        System.out.print("Ingrese la fila del asiento (1-4): ");
        int fila = scanner.nextInt() - 1;
        System.out.print("Ingrese la columna del asiento (1-4): ");
        int columna = scanner.nextInt() - 1;

        if (fila < 0 || fila >= 4 || columna < 0 || columna >= 4 || asientos[fila][columna]) {
            System.out.println("Asiento ocupado");
            return;
        }

        scanner.nextLine(); 
        System.out.print("Ingrese el nombre del cliente (opcional): ");
        String cliente = scanner.nextLine();

        asientos[fila][columna] = true; 
        Boleto boleto = new Boleto(cliente, pelicula, fila, columna);
        boletosVendidos.add(boleto);

        pelicula.incrementarBoletosVendidos();
        System.out.println("¡Boleto comprado wujuu");
    }

    public void mostrarReporteGeneral() {
        System.out.println("\n=== Reporte General de Ventas ===");
        double gananciaTotal = 0;

        for (Boleto boleto : boletosVendidos) {
            System.out.printf("Cliente: %s, Película: %s, Asiento: Fila %d, Columna %d, Precio: $%.2f\n",
                boleto.getCliente(), boleto.getPelicula().getTitulo(), boleto.getFila() + 1, boleto.getColumna() + 1, boleto.getPelicula().getPrecio());
            gananciaTotal += boleto.getPelicula().getPrecio();
        }

        System.out.printf("Total de boletos vendidos: %d\n", boletosVendidos.size());
        System.out.printf("Ganancia total: $%.2f\n", gananciaTotal);
    }

    public void mostrarReportePorFuncion() {
        System.out.println("\n=== Reporte por Función ===");
        for (Pelicula pelicula : peliculas) {
            System.out.printf("Película: %s, Boletos Vendidos: %d, Ganancia: $%.2f\n",
                pelicula.getTitulo(), pelicula.getBoletosVendidos(), pelicula.getGananciaTotal());
        }
    }

    private void mostrarAsientos() {
        System.out.println("\n=== Disponibilidad de Asientos ===");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] ? "[X] " : "[ ] ");
            }
            System.out.println();
        }
    }
}


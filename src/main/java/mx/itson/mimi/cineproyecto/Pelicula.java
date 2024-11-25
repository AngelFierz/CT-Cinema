/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mimi.cineproyecto;

/**
 *
 * @author Propietario
 */
public class Pelicula {
    private String nombre;
    private String horario;
    private double precio;
    private boolean[][] asientos;

    public Pelicula(String nombre, String horario, double precio) {
        this.nombre = nombre;
        this.horario = horario;
        this.precio = precio;
        this.asientos = new boolean[4][4]; // Inicializa una matriz de 4x4 para los asientos
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean[][] getAsientos() {
        return asientos;
    }
}

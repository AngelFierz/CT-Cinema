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
    private String titulo;
    private String horario;
    private double precio;
    private int boletosVendidos;

    public Pelicula(String titulo, String horario, double precio) {
        this.titulo = titulo;
        this.horario = horario;
        this.precio = precio;
        this.boletosVendidos = 0;
    }

    public String getTitulo() { return titulo; }
    public String getHorario() { return horario; }
    public double getPrecio() { return precio; }
    public int getBoletosVendidos() { return boletosVendidos; }

    public void incrementarBoletosVendidos() {
        boletosVendidos++;
    }

    public double getGananciaTotal() {
        return boletosVendidos * precio;
    }
}


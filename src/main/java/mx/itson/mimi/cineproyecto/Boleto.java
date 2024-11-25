/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mimi.cineproyecto;

/**
 *
 * @author Propietario
 */
public class Boleto {
    private String cliente;
    private String pelicula;
    private String asiento;
    private double precio;

    public Boleto(String cliente, String pelicula, String asiento, double precio) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.asiento = asiento;
        this.precio = precio;
    }

    // Getters
    public String getCliente() {
        return cliente;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getAsiento() {
        return asiento;
    }

    public double getPrecio() {
        return precio;
    }
}

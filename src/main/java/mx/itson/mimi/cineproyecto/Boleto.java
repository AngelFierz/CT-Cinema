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
    private Pelicula pelicula;
    private int fila;
    private int columna;

    public Boleto(String cliente, Pelicula pelicula, int fila, int columna) {
        this.cliente = cliente.isEmpty() ? "Sin nombre" : cliente;
        this.pelicula = pelicula;
        this.fila = fila;
        this.columna = columna;
    }

    public String getCliente() { return cliente; }
    public Pelicula getPelicula() { return pelicula; }
    public int getFila() { return fila; }
    public int getColumna() { return columna; }
}


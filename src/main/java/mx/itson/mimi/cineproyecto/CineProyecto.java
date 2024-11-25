/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.mimi.cineproyecto;

/**
 *
 * @author Propietario
 */
import java.util.*;

public class CineProyecto {
    private Map<String, Pelicula> peliculas;
    private List<Boleto> listaBoletos;

    public CineProyecto() {
        peliculas = new HashMap<>();
        listaBoletos = new ArrayList<>();
        inicializarPeliculas();
    }

    // Inicializar películas en cartelera
    private void inicializarPeliculas() {
        peliculas.put("Venom: El Último Baile", new Pelicula("Venom: El Último Baile", "2:00 PM", 120));
        peliculas.put("Sonríe 2", new Pelicula("Sonríe 2", "5:00 PM", 100));
        peliculas.put("Gladiador (Reestreno)", new Pelicula("Gladiador (Reestreno)", "8:00 PM", 150));
    }

    // Obtener películas disponibles
    public Map<String, Pelicula> obtenerPeliculas() {
        return peliculas;
    }

    // Obtener los asientos de una película
    public boolean[][] obtenerAsientos(String pelicula) {
        if (!peliculas.containsKey(pelicula)) {
            throw new IllegalArgumentException("Película no encontrada: " + pelicula);
        }
        return peliculas.get(pelicula).getAsientos();
    }

    // Registrar un boleto vendido
    public void registrarCompra(String cliente, String pelicula, String asiento, double precio) {
        listaBoletos.add(new Boleto(cliente, pelicula, asiento, precio));
    }

    // Obtener la lista de boletos vendidos
    public List<Boleto> obtenerBoletosVendidos() {
        return listaBoletos;
    }
}

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

    // películas en cartelera
    private void inicializarPeliculas() {
        peliculas.put("Venom: El Último Baile", new Pelicula("Venom: El Último Baile", "2:00 PM", 120));
        peliculas.put("Sonríe 2", new Pelicula("Sonríe 2", "5:00 PM", 100));
        peliculas.put("Gladiador (Reestreno)", new Pelicula("Gladiador (Reestreno)", "8:00 PM", 150));
        peliculas.put("Requiem Por Un Sueño", new Pelicula("Requiem Por Un Sueño", "5:00 PM", 100));
        peliculas.put("CT Rewrite", new Pelicula("CT Rewrite", "5:00 PM", 300));
    }

 
    public Map<String, Pelicula> obtenerPeliculas() {
        return peliculas;
    }


    public boolean[][] obtenerAsientos(String pelicula) {
        if (!peliculas.containsKey(pelicula)) {
            throw new IllegalArgumentException("Esa pelicula cual es eh: " + pelicula);
        }
        return peliculas.get(pelicula).getAsientos();
    }


    public void registrarCompra(String cliente, String pelicula, String asiento, double precio) {
        listaBoletos.add(new Boleto(cliente, pelicula, asiento, precio));
    }


    public List<Boleto> obtenerBoletosVendidos() {
        return listaBoletos;
    }
}

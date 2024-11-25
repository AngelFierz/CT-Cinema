/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mimi.cineproyecto;

/**
 *
 * @author Propietario
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cine {
    private Map<String, boolean[][]> mapaAsientos;
    private List<Boleto> listaBoletos;

    public Cine(List<Boleto> listaBoletos) {
        this.listaBoletos = listaBoletos;
        mapaAsientos = new HashMap<>();
        inicializarAsientos();
    }

    // Inicializar los asientos para cada película
    private void inicializarAsientos() {
        mapaAsientos.put("Venom: El Último Baile", new boolean[4][4]);
        mapaAsientos.put("Sonríe 2", new boolean[4][4]);
        mapaAsientos.put("Gladiador (Reestreno)", new boolean[4][4]);
    }

    // Métodos para obtener los asientos de una película específica
    public boolean[][] obtenerAsientos(String pelicula) {
        return mapaAsientos.get(pelicula);
    }

    // Registrar un boleto vendido
    public void registrarBoleto(String cliente, String pelicula, String asiento, double precio) {
        listaBoletos.add(new Boleto(cliente, pelicula, asiento, precio));
    }

    // Obtener la lista de boletos vendidos
    public List<Boleto> obtenerBoletosVendidos() {
        return listaBoletos;
    }
}

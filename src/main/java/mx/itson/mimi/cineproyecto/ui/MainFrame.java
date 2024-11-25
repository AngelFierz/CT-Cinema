/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.mimi.cineproyecto.ui;

/**
 *
 * @author Propietario
 */
import javax.swing.*;
import java.awt.*;
import mx.itson.mimi.cineproyecto.CineProyecto;

public class MainFrame extends JFrame {

    private CineProyecto cineProyecto; 

    public MainFrame(CineProyecto cineProyecto) {
        this.cineProyecto = cineProyecto;

    
        setTitle("Sunlines Ambient Menu");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1, 10, 10));

        // Botones para diferentes funcionalidades
        JButton btnCartelera = new JButton("Ver Cartelera/Comprar");
        JButton btnComprarBoletos = new JButton("Comprar Boletos Fast");
        JButton btnReporteGeneral = new JButton("Reporte General");
        JButton btnReportePorFuncion = new JButton("Reporte por Función");
        JButton btnSalir = new JButton("Largarse");

        // Eventos de los botones
        btnCartelera.addActionListener(e -> {
            new CarteleraFrame(cineProyecto).setVisible(true);  
            dispose(); 
        });

        btnComprarBoletos.addActionListener(e -> {
            new CompraFrame(cineProyecto).setVisible(true);  
            dispose();  
        });

        btnReporteGeneral.addActionListener(e -> {
            new ReporteGeneralFrame(cineProyecto.obtenerBoletosVendidos(), cineProyecto).setVisible(true);  
            dispose();  
        });

        btnReportePorFuncion.addActionListener(e -> {
            new ReportePorFuncionFrame(cineProyecto.obtenerBoletosVendidos(), cineProyecto).setVisible(true); 
            dispose(); 
        });

        btnSalir.addActionListener(e -> System.exit(0));  

     
        add(btnCartelera);
        add(btnComprarBoletos);
        add(btnReporteGeneral);
        add(btnReportePorFuncion);
        add(btnSalir);
    }

    public static void main(String[] args) {
        CineProyecto cineProyecto = new CineProyecto();
        SwingUtilities.invokeLater(() -> new MainFrame(cineProyecto).setVisible(true));
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncartelera = new javax.swing.JButton();
        btnboletos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btncartelera.setText("Ver Cartelera");

        btnboletos.setText("Comprar Boletotes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnboletos)
                    .addComponent(btncartelera))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btncartelera)
                .addGap(40, 40, 40)
                .addComponent(btnboletos)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnboletos;
    private javax.swing.JButton btncartelera;
    // End of variables declaration//GEN-END:variables
    }

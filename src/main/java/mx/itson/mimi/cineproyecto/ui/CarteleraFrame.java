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

public class CarteleraFrame extends JFrame {

    private CineProyecto cineProyecto;

    public CarteleraFrame(CineProyecto cineProyecto) {
        this.cineProyecto = cineProyecto;

        // Configuración básica
        setTitle("Cartelera");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10));

        // Crear los botones para cada película
        JButton btnVenom = new JButton("Venom: El Último Baile");
        JButton btnSonrie = new JButton("Sonríe 2");
        JButton btnGladiador = new JButton("Gladiador (Reestreno)");

        // Acción de los botones para abrir CompraFrame
        btnVenom.addActionListener(e -> {
            new CompraFrame(cineProyecto).setVisible(true);  // Abrir CompraFrame
            dispose();  // Cerrar CarteleraFrame
        });
        btnSonrie.addActionListener(e -> {
            new CompraFrame(cineProyecto).setVisible(true);  // Abrir CompraFrame
            dispose();  // Cerrar CarteleraFrame
        });
        btnGladiador.addActionListener(e -> {
            new CompraFrame(cineProyecto).setVisible(true);  // Abrir CompraFrame
            dispose();  // Cerrar CarteleraFrame
        });

        // Agregar los botones al frame
        add(btnVenom);
        add(btnSonrie);
        add(btnGladiador);

        setLocationRelativeTo(null);  // Centrar la ventana
    }

    private CarteleraFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnvolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pelicula", "Horario", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnvolver.setText("Volver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnvolver)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnvolver)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CarteleraFrame(new CineProyecto()).setVisible(true));
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarteleraFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnvolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
} 

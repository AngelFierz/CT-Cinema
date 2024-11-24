/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.mimi.cineproyecto.ui;

/**
 *
 * @author Propietario
 * 
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompraFrame extends JFrame {
    
    private JTable tablaAsientos;
    private DefaultTableModel modeloTabla;
    private JComboBox<String> cmbPeliculas;
    private boolean[][] asientosOcupados; // Estado de los asientos (true = ocupado)
    private JTextField txtNombreCliente;

    public CompraFrame() {
        // Configuración básica
        setTitle("Compra de Boletos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Inicializar estado de los asientos (4x4)
        asientosOcupados = new boolean[4][4];

        // Configurar JTable
        String[] columnas = {"1", "2", "3", "4"}; // Etiquetas de las columnas
        Object[][] datos = generarDatosAsientos(); // Generar datos iniciales
        modeloTabla = new DefaultTableModel(datos, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Las celdas no serán editables
            }
        };
        tablaAsientos = new JTable(modeloTabla);
        tablaAsientos.setRowHeight(50); // Ajustar altura de las filas

        // Selector de películas
        cmbPeliculas = new JComboBox<>(new String[]{
            "Venom: El Último Baile", "Sonríe 2", "Gladiador (Reestreno)"
        });

        // Campo de texto para cliente
        txtNombreCliente = new JTextField();
        txtNombreCliente.setBorder(BorderFactory.createTitledBorder("Nombre del Cliente (Opcional)"));

        // Botones
        JButton btnConfirmar = new JButton("Confirmar Compra");
        JButton btnVolver = new JButton("Volver");

        // Eventos de selección de asiento
        tablaAsientos.getSelectionModel().addListSelectionListener(e -> {
            int fila = tablaAsientos.getSelectedRow();
            int columna = tablaAsientos.getSelectedColumn();
            if (fila != -1 && columna != -1) {
                if (asientosOcupados[fila][columna]) {
                    JOptionPane.showMessageDialog(null, "Este asiento ya está ocupado.");
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccionaste el asiento: Fila " + (fila + 1) + ", Columna " + (columna + 1));
                }
            }
        });

        // Evento de Confirmar Compra
        btnConfirmar.addActionListener(e -> confirmarCompra());

        // Evento de Volver
        btnVolver.addActionListener(e -> {
            new MainFrame().setVisible(true);
            dispose();
        });

        // Layout
        JPanel panelInferior = new JPanel(new GridLayout(2, 1, 10, 10));
        panelInferior.add(txtNombreCliente);
        panelInferior.add(btnConfirmar);

        add(cmbPeliculas, BorderLayout.NORTH);
        add(new JScrollPane(tablaAsientos), BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
        add(btnVolver, BorderLayout.EAST);

        setLocationRelativeTo(null);
    }

    // Generar los datos iniciales para el JTable
    private Object[][] generarDatosAsientos() {
        Object[][] datos = new Object[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                datos[i][j] = "A" + (i + 1) + (j + 1); // Etiqueta del asiento
            }
        }
        return datos;
    }

    // Lógica para confirmar la compra
    private void confirmarCompra() {
        int fila = tablaAsientos.getSelectedRow();
        int columna = tablaAsientos.getSelectedColumn();

        if (fila == -1 || columna == -1) {
            JOptionPane.showMessageDialog(this, "Por favor selecciona un asiento.");
            return;
        }

        if (asientosOcupados[fila][columna]) {
            JOptionPane.showMessageDialog(this, "Este asiento ya está ocupado.");
            return;
        }

        String cliente = txtNombreCliente.getText().isEmpty() ? "Sin nombre" : txtNombreCliente.getText();
        String pelicula = (String) cmbPeliculas.getSelectedItem();
        String asiento = "Fila " + (fila + 1) + ", Columna " + (columna + 1);

        // Marcar asiento como ocupado
        asientosOcupados[fila][columna] = true;
        modeloTabla.setValueAt("X", fila, columna); // Actualizar visualmente en el JTable

        // Mostrar confirmación
        JOptionPane.showMessageDialog(this, "Compra realizada con éxito.\nCliente: " + cliente +
            "\nPelícula: " + pelicula + "\nAsiento: " + asiento);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CompraFrame().setVisible(true));
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbPelicula = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnconfirmar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbPelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setLayout(new java.awt.GridLayout(1, 4));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnconfirmar.setText("Confirmar Compra");
        btnconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarActionPerformed(evt);
            }
        });

        btnvolver.setText("Volver al Menu");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(cmbPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnconfirmar)
                .addGap(146, 146, 146)
                .addComponent(btnvolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cmbPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnvolver, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnconfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconfirmarActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconfirmar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JComboBox<String> cmbPelicula;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

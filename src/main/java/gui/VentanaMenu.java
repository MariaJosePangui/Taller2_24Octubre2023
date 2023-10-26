package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu extends JFrame {
    public VentanaMenu() {
        // Configurar la ventana
        setTitle("Menú Principal");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear un panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        // Botón para buscar selección
        JButton buscarSeleccionButton = new JButton("Buscar Selección");
        buscarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir la ventana de búsqueda de selección
                VentanaBuscarSeleccion ventanaBuscarSeleccion = new VentanaBuscarSeleccion();
            }
        });

        // Botón para agregar selección
        JButton agregarSeleccionButton = new JButton("Agregar Selección");
        agregarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir la ventana para agregar selección
                VentanaAgregarSeleccion ventanaAgregarSeleccion = new VentanaAgregarSeleccion();
            }
        });

        // Botón para mostrar selección
        JButton mostrarSeleccionButton = new JButton("Mostrar Selección");
        mostrarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir la ventana para mostrar selección
                VentanaMostrarSeleccion ventanaMostrarSeleccion = new VentanaMostrarSeleccion();
            }
        });

        // Agregar botones al panel
        panel.add(buscarSeleccionButton);
        panel.add(agregarSeleccionButton);
        panel.add(mostrarSeleccionButton);

        // Agregar el panel a la ventana
        add(panel);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaMenu());
    }
}
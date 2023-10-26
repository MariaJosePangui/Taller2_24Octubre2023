package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VentanaEliminarJugador extends JFrame {
    private List<String> jugadores = new ArrayList();

    public VentanaEliminarJugador() {
        // Agregar jugadores de ejemplo
        jugadores.add("Jugador 1");
        jugadores.add("Jugador 2");
        jugadores.add("Jugador 3");

        // Configurar la ventana
        setTitle("Eliminar Jugador");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear un panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(jugadores.size() + 2, 2));

        // Etiqueta de encabezado


        // Crear botones de eliminación para cada jugador
        for (String jugador : jugadores) {
            JLabel nombreJugador = new JLabel(jugador);
            panel.add(nombreJugador);
            JButton eliminarButton = new JButton("Eliminar");
            eliminarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Eliminar el jugador de la lista y actualizar la interfaz
                    jugadores.remove(jugador);
                    panel.remove(nombreJugador);
                    panel.remove(eliminarButton);
                    revalidate();
                    repaint();
                }
            });
            panel.add(eliminarButton);
        }

        // Botón para regresar al menú principal
        JButton volverMenuButton = new JButton("Menú Principal");
        volverMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana actual
                VentanaMenu ventanaMenu = new VentanaMenu(); // Abre el menú principal
            }
        });
        panel.add(volverMenuButton);

        // Botón para regresar a la página anterior
        JButton volverPaginaAnteriorButton = new JButton("Regresar");
        volverPaginaAnteriorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana actual
                // Agregar aquí la lógica para volver a la página anterior si es necesario
            }
        });
        panel.add(volverPaginaAnteriorButton);

        // Agregar el panel a la ventana
        add(panel);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaEliminarJugador());
    }
}
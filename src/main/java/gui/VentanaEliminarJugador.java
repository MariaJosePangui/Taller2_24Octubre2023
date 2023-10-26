package gui;

import controller.GestorSeleccion;
import model.jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEliminarJugadores extends JFrame {
    private JPanel panel;

    public VentanaEliminarJugadores() {
        setTitle("Eliminar Jugadores");
        setBounds(50, 50, 400, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void iniciarComponentes() {
        generarPanel();
        eliminarJugadores();
    }

    public void generarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);
    }

    public JLabel crearEtiqueta(String texto, int x, int y, int ancho, int alto, String estiloTexto) {
        JLabel etiqueta = new JLabel();
        etiqueta.setText(texto);
        etiqueta.setBounds(x, y, ancho, alto);
        etiqueta.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setFont(new Font(estiloTexto, 1, alto);
        return etiqueta;
    }

    public JTextField crearCajaTexto(int x, int y, int ancho, int alto) {
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(x, y, ancho, alto);
        return cajaTexto;
    }

    public JButton crearBoton(String texto, int x, int y, int ancho, int alto, String estiloTexto) {
        JButton boton = new JButton();
        boton.setText(texto);
        boton.setBounds(x, y, ancho, alto);
        boton.setForeground(Color.black);
        boton.setFont(new Font(estiloTexto, 1, (alto)));
        return boton;
    }

    public void eliminarJugadores() {
        JLabel etiqueta1 = crearEtiqueta("Eliminar Jugadores", 120, 10, 200, 20, "Calibri");
        panel.add(etiqueta1);

    }
}

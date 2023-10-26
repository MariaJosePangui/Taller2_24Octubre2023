package gui;
import controller.GestorSeleccion;
import model.Seleccion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarSeleccion extends JFrame {
    private JPanel panel;

    public VentanaAgregarSeleccion() {
        setTitle("Agregar Selección");
        setBounds(50, 50, 400, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void iniciarComponentes() {
        generarPanel();
        agregarSeleccion();
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
        etiqueta.setFont(new Font(estiloTexto, 1, alto));
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

    public void agregarSeleccion() {
        JLabel etiqueta1 = crearEtiqueta("id", 120, 10, 200, 20, "Calibri");
        panel.add(etiqueta1);

        JLabel etiqueta2 = crearEtiqueta("Nombre Pais: ", 10, 50, 200, 14, "Calibri");
        panel.add(etiqueta2);

        JLabel etiqueta3 = crearEtiqueta("Ranking Fifa: ", 10, 90, 200, 14, "Calibri");
        panel.add(etiqueta3);

        JTextField cajaTexto1 = crearCajaTexto(220, 47, 150, 20);
        panel.add(cajaTexto1);

        JTextField cajaTexto2 = crearCajaTexto(220, 87, 150, 20);
        panel.add(cajaTexto2);

        JTextField cajaTexto3 = crearCajaTexto(220, 127, 150, 20);
        panel.add(cajaTexto3);

        JButton boton1 = crearBoton("Agregar", 40, 270, 150, 18, "Calibri");
        panel.add(boton1);

        JButton boton2 = crearBoton("Volver a menú", 200, 270, 150, 18, "Calibri");
        panel.add(boton2);

        ActionListener eventoClick1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestorSeleccion gestorSeleccion = new GestorSeleccion();

                String id= cajaTexto1.getText();
                String nombrePais = cajaTexto2.getText();
                String rankingFifa = cajaTexto3.getText();
                Seleccion seleccion = new Seleccion(id, nombrePais, rankingFifa);
                gestorSeleccion.agregarSeleccion(seleccion);
            }
        };
        boton1.addActionListener(eventoClick1);

        ActionListener eventoClick2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VentanaMenu ventanaMenu = new VentanaMenu();
                ventanaMenu.setVisible(true);
            }
        };
        boton2.addActionListener(eventoClick2);
    }
}

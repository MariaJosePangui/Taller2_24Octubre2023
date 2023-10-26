package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu extends JFrame {
    private JPanel panel;

    public VentanaMenu() {
        setTitle("Menu");
        setBounds(50, 50, 400, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void iniciarComponentes() {
        generarPanel();
        menu();
    }

    public void generarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);
    }

    public JButton crearBoton(String texto, int x, int y, int ancho, int alto, String estiloTexto) {
        JButton boton = new JButton();
        boton.setText(texto);
        boton.setBounds(x, y, ancho, alto);
        boton.setForeground(Color.black);
        boton.setFont(new Font(estiloTexto, 1, (alto)));
        return boton;
    }

    public void menu() {
        JButton boton1 = crearBoton("EliminarJugador", 45, 20, 300, 20, "Calibri");
        panel.add(boton1);

        JButton boton2 = crearBoton("MostrarSeleccion", 45, 70, 300, 20, "Calibri");
        panel.add(boton2);

        JButton boton3 = crearBoton("AgregarSeleccion", 45, 120, 300, 20, "Calibri");
        panel.add(boton3);

        JButton boton4 = crearBoton("BuscarSeleccion", 45, 170, 300, 20, "Calibri");
        panel.add(boton4);

        ActionListener eventoClick1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VentanaEliminarJugador ventanaEliminarJugador = new VentanaEliminarJugador();
                ventanaEliminarJugador.setVisible(true);
            }
        };
        boton1.addActionListener(eventoClick1);

        ActionListener eventoClick2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VentanaMostrarSeleccion ventanaMostrarSeleccion = new VentanaMostrarSeleccion();
                ventanaMostrarSeleccion.setVisible(true);
            }
        };
        boton2.addActionListener(eventoClick2);

        ActionListener eventoClick3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VentanaAgregarSeleccion ventanaAgregarSeleccion = new VentanaAgregarSeleccion();
                ventanaAgregarSeleccion.setVisible(true);
            }
        };
        boton3.addActionListener(eventoClick3);

        ActionListener eventoClick4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VentanaBuscarSeleccion ventanaBuscarSeleccion = new VentanaBuscarSeleccion();
                ventanaBuscarSeleccion.setVisible(true);
            }
        };
        boton4.addActionListener(eventoClick4);
    }
}

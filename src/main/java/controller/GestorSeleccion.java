package controller;
import model.Jugador;
import model.Seleccion;

import java.util.ArrayList;
import java.util.List;

public class GestorSeleccion {

    private List<Seleccion> selecciones;

    public GestorSeleccion() {
        this.selecciones = new ArrayList<>();
    }

    public void agregarSeleccion(Seleccion seleccion) {
        selecciones.add(seleccion);
    }

    public void eliminarJugador(Seleccion seleccion, Jugador jugador) {
        if (seleccion != null && jugador != null) {
            seleccion.getJugador().remove(jugador);
        }
    }

    public void mostrarSeleccion(Seleccion seleccion) {
        if (seleccion != null) {
            System.out.println("Nombre de la selección: " + seleccion.getNombre());
            System.out.println("Jugadores de la selección:");
            for (Jugador jugador : seleccion.getJugador()) {
                System.out.println(jugador);
            }
        } else {
            System.out.println("La selección no existe o no se ha encontrado.");
        }
    }

    public Seleccion buscarSeleccion(String nombre) {
        for (Seleccion seleccion : selecciones) {
            if (seleccion.getNombre().equalsIgnoreCase(nombre)) {
                return seleccion;
            }
        }
        return null;
    }
}

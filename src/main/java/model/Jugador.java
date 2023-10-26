package model;

public class Jugador {
    private String numero;
    private String nombrejugador;
    private String posicion;

    public Jugador(String numero, String nombrejugador, String posicion) {
        this.numero = numero;
        this.nombrejugador = nombrejugador;
        this.posicion = posicion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombrejugador() {
        return nombrejugador;
    }

    public void setNombrejugador(String nombrejugador) {
        this.nombrejugador = nombrejugador;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numero='" + numero + '\'' +
                ", nombrejugador='" + nombrejugador + '\'' +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}

package model.data.dao;
import model.Jugador;


public class JugadorDAO {
    public static void eliminarJugador(DSLContext query, Carrera carrera) {
        Table tablaCarrera = table(name("Jugador"));
        Field[] columnas = tablaCarrera.fields("numero", "nombre", "posicion");
        query.insertInto(tablaCarrera, columnas[0], columnas[1], columnas[2])
                .values(carrera.getNumero(), carrera.getNombre(), carrera.getPosicion())
                .execute();
    }
}

import ormRPGgame.Controller;
import ormRPGgame.model.Jugador;
import ormRPGgame.model.Daga;
import ormRPGgame.model.Mago;
import ormRPGgame.model.Personaje;

import java.sql.SQLException;

public class Main {

    public static void main (String [] args) {
        try {
            Controller controlador= new Controller();
            //@TODO añada las llamadas a las funciones de la clase Controller.java necesarias
            //para la creación de la daga y el mago.
            Jugador jugador=controlador.createJugador(1,"jugador");
            Daga daga=controlador.createDaga(1,"Daga de madera");
            Personaje personaje1=controlador.createPersonaje(jugador,"prueba",daga);
            Mago mago=controlador.createMago(jugador,"Stanto",daga);
        } catch(SQLException e) {
            System.err.println("Se ha producido un error en la conexión con la base de datos");
            e.printStackTrace();
        }
    }
}

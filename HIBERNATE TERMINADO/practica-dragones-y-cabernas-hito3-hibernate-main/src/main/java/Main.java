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
            Jugador jugador=controlador.createJugador(1,"PLAYER_00");
            Daga daga=controlador.createDaga(1,"Daga de madera");
            Personaje personaje=controlador.createPersonaje(jugador,"VIANA",daga);
            Mago mago=controlador.createMago(jugador,"Stanto",daga);
            if(jugador!=null && daga!=null && personaje!=null && mago!=null){
                System.out.println("Se ha creado un mago de nombre: "+mago.getNombrePersonaje());
                if(daga.getId() == jugador.getId()){
                    System.out.println("Su daga es: "+daga.getnombre());
                }
            }
        } catch(SQLException e) {
            System.err.println("Se ha producido un error en la conexión con la base de datos");
            e.printStackTrace();
        }
    }
}

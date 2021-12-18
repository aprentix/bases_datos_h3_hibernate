package ormRPGgame;

import ormRPGgame.model.Jugador;
import ormRPGgame.model.Daga;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import ormRPGgame.model.Mago;
import ormRPGgame.model.Personaje;

import java.sql.*;


/**
 * Controlador de la aplicación. Por favor, revise detenidamente la clase y complete las partes omitidas
 * atendiendo a los comentarios indicados mediante @TODO
 */
public class Controller {

    private Session session;

    /**
     * Crea un nuevo controlador
     */
    public Controller () {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();

        this.session = sessionFactory.openSession();
    }

    /**
     * Crea un nuevo mago
     * param nickname nombre de usuario
     * @return el nuevo usuario creado
     * @throws SQLException
     */
    public Jugador createJugador(int id, String nombre) throws SQLException{
        Jugador jugador= new Jugador(id,nombre);
        session.beginTransaction();
        session.saveOrUpdate(jugador);
        session.getTransaction().commit();
        return jugador;
    }

    public Daga createDaga(int id,String nombre) throws SQLException{
        // @TODO complete este metodo para crear de forma presistente una daga
        Daga daga = new Daga(id,nombre);
        session.beginTransaction();
        session.saveOrUpdate(daga);
        session.getTransaction().commit();
        return daga;
    }

    public Personaje createPersonaje(Jugador jugador,String nombre,Daga daga) throws SQLException{

        Personaje personaje=new Personaje(jugador,nombre,daga);
        session.beginTransaction();
        session.saveOrUpdate(personaje);
        session.getTransaction().commit();
        return personaje;
    }

    public Mago createMago(Jugador jugador,String nombre,Daga daga) throws SQLException{

        Personaje personaje=createPersonaje(jugador,nombre,daga);
        Mago mago=new Mago(personaje);
        session.beginTransaction();
        session.saveOrUpdate(mago);
        session.getTransaction().commit();
        return mago;
    }


}

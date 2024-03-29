package ormRPGgame;

import ormRPGgame.model.Mago;
import ormRPGgame.model.Daga;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

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
    public void FinishSession(){
        this.session.close();
    }

    /**
     * Crea un nuevo mago
     * param nickname nombre de usuario
     * @return el nuevo usuario creado
     * @throws SQLException
     */
    public Daga createDaga(String nombre) throws SQLException{
        // @TODO complete este metodo para crear de forma presistente una daga
        Daga daga = new Daga(nombre);
        session.beginTransaction();
        session.save(daga);
        session.getTransaction().commit();
        return daga;
    }

    public Mago createMago(String magician, Daga daga) throws SQLException {
        // @TODO complete este metodo para crear de forma presistente un mago
        Mago mago = new Mago(magician, daga);
        session.beginTransaction();
        session.save(mago);
        session.getTransaction().commit();
        return mago;
    }
}


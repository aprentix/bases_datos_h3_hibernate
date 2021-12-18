package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
@Entity
@Table(name="jugador")
public class Jugador {
    // @TODO completar las anotaciones de todos los atributos
    @Id
    @Column(name="id_jugador")
    private int id;

    @Column (name="nombre_jugador")
    private String nombre;

    @OneToMany(mappedBy = "jugador")
    private Set<Personaje> personajes;

    public Jugador(){}

    public Jugador(int id,String nombre){
        // @TODO completar el constructor de la clase.
        //  Para ello es necesario un string con el nombre del mago y un objeto de la clase daga
        //  Inicialice el resto de atributos a los valores que considere oportunos
        this.nombre=nombre;
        this.id=id;
    }

    public String getnombre(){ return this.nombre;}

    public int getId() { return id;}
}

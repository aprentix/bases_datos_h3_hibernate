package ormRPGgame.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name="daga")
public class Daga implements Serializable {
    // @TODO completar las anotaciones de todos los atributos
    @Id
    @Column (name="id_daga")
    private int id;

    @Column (name="nombre_daga")
    private String nombre;

    @OneToMany(mappedBy = "daga")
    private Set<Personaje> personajes;

    @ManyToMany(mappedBy = "dagas")
    private Set<Tienda> tiendas;

    public Daga (){}

    public Daga(int id,String nombre){
        // @TODO completar el constructor de la clase.
        this.id=id;
        this.nombre=nombre;
    }

    public String getnombre(){ return this.nombre;}
    public int getId(){return this.id;}
}

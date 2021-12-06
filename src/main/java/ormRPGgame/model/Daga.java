package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
@Entity @Table(name = "daga")
public class Daga {
    // @TODO completar las anotaciones de todos los atributos
    @Id
    @Column(name = "nombre_daga")
    private String nombre;
    public Daga(String nombre){
        // @TODO completar el constructor de la clase.
        this.nombre=nombre;
    }

    public String getnombre(){ return this.nombre;}
}

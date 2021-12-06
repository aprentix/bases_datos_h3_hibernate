package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
@Entity
@Table(name = "mago")
public class Mago {
    // @TODO completar las anotaciones de todos los atributos
    @Id
    @Column(name = "id")
    private String name;
    @Column(name = "daga")
    Daga daga;
    public Mago(String nombre, Daga daga){
        // @TODO completar el constructor de la clase.
        //  Para ello es necesario un string con el nombre del mago y un objeto de la clase daga
        //  Inicialice el resto de atributos a los valores que considere oportunos
        this.name=nombre;
        this.daga=daga;
    }

    public String getnombre(){ return this.name;}
}


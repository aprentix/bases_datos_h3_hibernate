package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "Tanque")
public class Tanque {
    @Id
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Personaje personaje;

    @Column(name = "mana")
    private int mana;

    @Column(name = "vida")
    private int vida;

    public Tanque(){

    }

    public Tanque(String nombre, Daga daga){
        // @TODO completar el constructor de la clase.
        //  Para ello es necesario un string con el nombre del mago y un objeto de la clase daga
        //  Inicialice el resto de atributos a los valores que considere oportunos
    }

    public String getnombre(){ return this.nombre;}
}

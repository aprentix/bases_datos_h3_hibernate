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


}

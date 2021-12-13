package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "Guerrero")
public class Guerrero {
    @Id
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Personaje personaje;

    @Column(name = "mana")
    private int mana;

    @Column(name = "vida")
    private int vida;

    public Guerrero(){

    }


}

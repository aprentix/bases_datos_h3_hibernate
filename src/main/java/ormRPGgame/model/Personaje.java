package ormRPGgame.model;

import javax.persistence.*;
@Entity
@Table(name = "Personaje")
public class Personaje {
    @Id
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "oro")
    private int oro;

    @Column(name = "nivel")
    private int nivel;

    @Column(name = "fuerza")
    private int fuerza;

    @ManyToOne
    @JoinColumn(name="id")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name="id")
    private Daga daga;

    public Personaje(){

    }

    public Personaje(String nombre, int oro, int nivel, int fuerza, Jugador jugador, Daga daga){

        this.nombre = nombre;
        this.oro = oro;
        this.nivel = nivel;
        this.fuerza = fuerza;
        this.jugador = jugador;
        this.daga = daga;
    }


}

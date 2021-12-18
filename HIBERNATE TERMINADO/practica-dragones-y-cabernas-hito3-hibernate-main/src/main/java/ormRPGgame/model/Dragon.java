package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="dragon")
public class Dragon {
    @Basic
    @Column(name = "vida")
    private int vida;

    @Id
    @Column(name = "nombre_dragon")
    private String nombreDragon;
    @Basic
    @Column(name = "orden")
    private int orden;
    @ManyToMany(mappedBy = "dragones")
    private Set<Personaje> personajes;
    @ManyToMany(mappedBy = "dragones")
    private Set<Escuadron> escuadrones;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombreDragon() {
        return nombreDragon;
    }

    public void setNombreDragon(String nombreDragon) {
        this.nombreDragon = nombreDragon;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
}

package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="pocion")
public class Pocion {

    @Id
    @Column(name = "nombre_pocion")
    private String nombrePocion;
    @Basic
    @Column(name = "vida")
    private int vida;
    @Basic
    @Column(name = "mana")
    private int mana;
    @OneToMany(mappedBy = "pocionByNombrePocion")
    private Set<Druida> druidasByNombrePocion;

    public Pocion(){}

    public String getNombrePocion() {
        return nombrePocion;
    }

    public void setNombrePocion(String nombrePocion) {
        this.nombrePocion = nombrePocion;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}

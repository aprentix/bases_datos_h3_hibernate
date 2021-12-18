package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="tanque")
public class Tanque {
    @Basic
    @Column(name = "mana")
    private int mana;
    @Basic
    @Column(name = "vida")
    private int vida;
    @Id
    @Column(name = "nombre_personaje")
    private String nombrePersonaje;
    @ManyToMany()
    @JoinTable(name="desbloquea_habilidades_tanque")
    private Set<HabilidadesTanque> habilidadesTanques;
    @ManyToMany()
    @JoinTable(name="enfrenta_troll")
    private Set<Troll> trolls;
    @OneToOne
    @JoinColumn(name = "nombre_personaje", referencedColumnName = "nombre_personaje", nullable = false)
    private Personaje personajeByNombrePersonaje;
    @ManyToMany()
    @JoinTable(name="usa_hacha")
    private Set<Hacha> hachas;

    public Tanque(){}

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }
}
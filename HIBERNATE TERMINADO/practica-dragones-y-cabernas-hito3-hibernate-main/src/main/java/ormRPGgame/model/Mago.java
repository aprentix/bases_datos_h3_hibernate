package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="mago")
public class Mago {
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
    @JoinTable(name="desbloquea_habilidades_mago")
    private Set<HabilidadesMago> habilidadesMagos;
    @ManyToMany()
    @JoinTable(name="enfrenta_espectro")
    private Set<Espectro> espectros;
    @OneToOne
    @JoinColumn(name = "nombre_personaje", referencedColumnName = "nombre_personaje", nullable = false,updatable = false,insertable = false)
    private Personaje personajeByNombrePersonaje;
    @ManyToMany()
    @JoinTable(name="usa_baculo")
    private Set<Baculo> baculos;

    public Mago(){}
    public Mago(Personaje personaje){
        this.nombrePersonaje=personaje.getNombrePersonaje();
    }

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
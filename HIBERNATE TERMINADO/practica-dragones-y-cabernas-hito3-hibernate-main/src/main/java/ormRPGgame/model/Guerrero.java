package ormRPGgame.model;
import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "guerrero")
public class Guerrero {
    @Basic
    @Column(name = "vida")
    private int vida;
    @Basic
    @Column(name = "mana")
    private int mana;

    @Id
    @Column(name = "nombre_personaje")
    private String nombrePersonaje;
    @ManyToMany()
    @JoinTable(name="desbloquea_habilidades_guerrero")
    private Set<HabilidadesGuerrero> habilidadesGuerreros;
    @ManyToMany()
    @JoinTable(name="enfrenta_goblin")
    private Set<Goblin> goblins;
    @OneToOne
    @JoinColumn(name = "nombre_personaje", referencedColumnName = "nombre_personaje", nullable = false)
    private Personaje personajeByNombrePersonaje;
    @ManyToMany()
    @JoinTable(name="usa_espada")
    private Set<Espada> espadas;

    public Guerrero(){}

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

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }
}
package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table
public class Pocion {
    @Id
    @Column(name = "pocion_id")
    private Long id;

    @Column(name = "pocion_nombre")
    private String nombre;

    @Column(name = "vida")
    private int vida;

    @Column(name = "mana")
    private int mana;

    @ManyToOne
    @JoinColumn(name ="druida")
    private Druida druida;

    public Pocion(){

    }

    public Pocion(Long id, String nombre, int vida, int mana, Druida druida) {
        this.id = id;
        this.nombre = nombre;
        this.vida = vida;
        this.mana = mana;
        this.druida = druida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Druida getDruida() {
        return druida;
    }

    public void setDruida(Druida druida) {
        this.druida = druida;
    }
}

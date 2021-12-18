package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="espada")
public class Espada {
    @Id
    @Column(name = "nombre_espada")
    private String nombreEspada;
    @Basic
    @Column(name = "daño")
    private int daño;
    @Basic
    @Column(name = "peso")
    private int peso;
    @ManyToMany(mappedBy = "hachas")
    private Set<Forja> forjas;
    @ManyToMany(mappedBy = "espadas")
    private Set<Guerrero> guerreros;

    public String getNombreBaculo() {
        return nombreEspada;
    }

    public void setNombreBaculo(String nombreBaculo) {
        this.nombreEspada = nombreBaculo;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
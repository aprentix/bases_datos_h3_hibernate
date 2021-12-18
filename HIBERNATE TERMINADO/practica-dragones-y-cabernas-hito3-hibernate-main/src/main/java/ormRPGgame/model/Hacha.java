package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="hacha")
public class Hacha {

    @Id
    @Column(name = "nombre_hacha")
    private String nombreHacha;
    @Basic
    @Column(name = "daño")
    private int daño;
    @Basic
    @Column(name = "peso")
    private int peso;
    @ManyToMany(mappedBy = "hachas")
    private Set<Forja> forjas;
    @ManyToMany(mappedBy = "hachas")
    private Set<Tanque> tanques;

    public String getNombreBaculo() {
        return nombreHacha;
    }

    public void setNombreBaculo(String nombreBaculo) {
        this.nombreHacha = nombreBaculo;
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
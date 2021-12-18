package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="baculo")
public class Baculo {

    @Id
    @Column(name = "nombre_baculo")
    private String nombreBaculo;
    @Basic
    @Column(name = "daño")
    private int daño;
    @Basic
    @Column(name = "peso")
    private int peso;
    @ManyToMany(mappedBy = "baculos")
    private Set<Forja> forjas;
    @ManyToMany(mappedBy = "baculos")
    private Set<Mago> magos;

    public String getNombreBaculo() {
        return nombreBaculo;
    }

    public void setNombreBaculo(String nombreBaculo) {
        this.nombreBaculo = nombreBaculo;
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
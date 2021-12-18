package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="druida")
public class Druida {
    @Id
    @Column(name = "nombre_druida")
    private String nombreDruida;
    @Basic
    @Column(name = "nombre_pocion")
    private String nombrePocion;
    @ManyToOne
    @JoinColumn(name = "nombre_pocion", referencedColumnName = "nombre_pocion", nullable = false,updatable = false,insertable = false)
    private Pocion pocionByNombrePocion;
    @ManyToMany(mappedBy = "druidas")
    private Set<Personaje> personajes;

    public Druida(){}

    public String getNombreDruida() {
        return nombreDruida;
    }

    public void setNombreDruida(String nombreDruida) {
        this.nombreDruida = nombreDruida;
    }

    public String getNombrePocion() {
        return nombrePocion;
    }

    public void setNombrePocion(String nombrePocion) {
        this.nombrePocion = nombrePocion;
    }
}

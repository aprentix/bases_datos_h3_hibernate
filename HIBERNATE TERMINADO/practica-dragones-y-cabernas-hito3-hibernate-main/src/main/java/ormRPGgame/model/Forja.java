package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="forja")
public class Forja {
    @Id
    @Column(name = "nombre_forja")
    private String nombreForja;
    @Basic
    @Column(name = "nombre_ciudad")
    private String nombreCiudad;
    @ManyToOne()
    @JoinColumn(name = "nombre_ciudad", referencedColumnName = "nombre_ciudad",updatable = false,insertable = false)
    private Ciudad ciudadByNombreCiudad;
    @ManyToMany()
    @JoinTable(name="forja_baculo")
    private Set<Baculo> baculos;
    @ManyToMany()
    @JoinTable(name="forja_espada")
    private Set<Espada> espadas;
    @ManyToMany()
    @JoinTable(name="forja_hacha")
    private Set<Hacha> hachas;

    public String getNombreForja() {
        return nombreForja;
    }

    public void setNombreForja(String nombreForja) {
        this.nombreForja = nombreForja;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
}

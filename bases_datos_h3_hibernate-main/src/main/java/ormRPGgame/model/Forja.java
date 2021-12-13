package ormRPGgame.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Forja {
    @Id
    @Column(name = "nombre_forja", nullable = false)
    private String nombre;

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Ciudad ciudad;

    @ManyToMany(mappedBy= "forjas")
    private Set<Ciudad> ciudades;

    public Forja(){

    }
    public Forja(String nombre, Ciudad ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}

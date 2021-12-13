package ormRPGgame.model;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table
public class Ciudad {
    @Id
    @Column(name = "nombre_ciudad", nullable = false)
    private String nombre;

    @ManyToMany()
    @JoinTable(name= "ciudad_tiene_tienda")
    private Set<Tienda> tiendas;

    @ManyToMany()
    @JoinTable(name= "ciudad_tiene_forja")
    private Set<Forja> forjas;

    public Ciudad(){

    }
    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

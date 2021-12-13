package ormRPGgame.model;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "druida")
public class Druida {

    @Column(name = "nombre_druida")
    private String nombre;

    @OneToMany(mappedBy = "druida")
    private Set<Pocion> pociones;

    public Druida(){

    }

    public Druida(String nombre, Set<Pocion> pociones) {
        this.nombre = nombre;
        this.pociones = pociones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Pocion> getPociones() {
        return pociones;
    }

    public void setPociones(Set<Pocion> pociones) {
        this.pociones = pociones;
    }
}

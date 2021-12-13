package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "espada")
public class Espada {
    @Id
    @Column(name = "espada_id")
    private Long id;

    @Column(name = "espada_nombre")
    private String nombre;

    @Column(name = "peso")
    private int peso;

    public Espada() {

    }

    public Espada(Long id, String nombre, int peso) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
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
}

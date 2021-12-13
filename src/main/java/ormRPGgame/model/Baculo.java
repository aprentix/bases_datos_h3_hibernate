package ormRPGgame.model;

import javax.persistence.*;


@Entity
@Table(name = "daga")
public class Baculo {
    @Id
    @Column(name = "daga_id")
    private Long id;

    @Column(name = "daga_nombre")
    private String nombre;

    @Column(name = "peso")
    private int peso;

    public Baculo() {

    }

    public Baculo(Long id, String nombre, int peso) {
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

package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table
public class Dragon {
    @Id
    @Column(name = "nombre_dragon")
    private String nombre;

    @Column(name="vida")
    private int vida;

    public Dragon(){

    }
    public Dragon(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}

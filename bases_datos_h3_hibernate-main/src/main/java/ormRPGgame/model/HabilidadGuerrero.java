package ormRPGgame.model;
import javax.persistence.*;

@Entity
@Table
public class HabilidadGuerrero {
    private String nombre;

    public HabilidadGuerrero(){

    }
    public HabilidadGuerrero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

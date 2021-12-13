package ormRPGgame.model;
import javax.persistence.*;

@Entity
@Table
public class HabilidadTanque {
    private String nombre;

    public HabilidadTanque(){

    }
    public HabilidadTanque(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

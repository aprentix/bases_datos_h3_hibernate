package ormRPGgame.model;
import javax.persistence.*;

@Entity
@Table
public class HabilidadMago {
    private String nombre;

    public HabilidadMago (){

    }
    public HabilidadMago(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

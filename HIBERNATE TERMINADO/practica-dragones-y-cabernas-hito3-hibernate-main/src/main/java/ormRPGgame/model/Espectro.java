package ormRPGgame.model;
import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="espectro")
public class Espectro {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_espectro")
    private int id;
    @Basic
    @Column(name = "nombre_espectro")
    private String nombre;
    @ManyToMany(mappedBy = "espectros")
    private Set<Mago> magos;

    public Espectro(){}

    public int getIdGoblin() {
        return id;
    }

    public void setIdGoblin(int id) {
        this.id = id;
    }

    public String getNombreGoblin() {
        return nombre;
    }

    public void setNombreGoblin(String nombre) {
        this.nombre = nombre;
    }

}

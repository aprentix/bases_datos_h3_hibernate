package ormRPGgame.model;
import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "goblin")
public class Goblin {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_goblin")
    private int id;
    @Basic
    @Column(name = "nombre_goblin")
    private String nombre;
    @ManyToMany(mappedBy = "goblins")
    private Set<Guerrero> guerreros;

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

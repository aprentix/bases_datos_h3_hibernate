package ormRPGgame.model;
import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="troll")
public class Troll {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_troll")
    private int id;
    @Basic
    @Column(name = "nombre_troll")
    private String nombre;
    @ManyToMany(mappedBy = "trolls")
    private Set<Tanque> tanques;

    public int getIdGoblin() {
        return id;
    }

    public void setIdGoblin(int idGoblin) {
        this.id = idGoblin;
    }

    public String getNombreGoblin() {
        return nombre;
    }

    public void setNombreGoblin(String nombreGoblin) {
        this.nombre = nombreGoblin;
    }

}

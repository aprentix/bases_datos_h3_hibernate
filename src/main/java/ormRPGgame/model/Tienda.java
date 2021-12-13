package ormRPGgame.model;
import javax.persistence.*;
import java.util.Set;
import java.util.HashSet;


@Entity
@Table
public class Tienda {
    @Id
    @Column(name = "nombre_tienda", nullable = false)
    private String nombre;

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Ciudad ciudad;

    @ManyToMany(mappedBy= "tiendas")
    private Set<Ciudad> ciudades;

    public Tienda(){

    }
    public Tienda(String nombre, Ciudad ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}

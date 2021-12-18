package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="ciudad")
public class Ciudad {
    @Id
    @Column(name = "nombre_ciudad")
    private String nombreCiudad;
    @ManyToMany()
    @JoinTable(name="ciudad_tiene_tienda")
    private Set<Tienda> tiendas;
    @OneToMany(mappedBy = "ciudadByNombreCiudad")
    private Collection<Forja> forjas;

    public Ciudad(){}

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

}

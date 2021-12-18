package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="tienda")
public class Tienda {
    @Id
    @Column(name = "nombre_tienda")
    private String nombreTienda;
    @ManyToMany(mappedBy = "tiendas")
    private Set<Ciudad> ciudades;
    @ManyToMany()
    @JoinTable(name="tienda_vende_daga")
    private Set<Daga> dagas;

    public Tienda(){}

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    }
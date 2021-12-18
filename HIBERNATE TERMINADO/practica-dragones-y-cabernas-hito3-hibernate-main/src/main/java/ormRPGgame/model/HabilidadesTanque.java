package ormRPGgame.model;


import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "habilidades_tanque")
public class HabilidadesTanque {

    @Id
    @Column(name = "nombre_habilidades_tanque")
    private String nombreHabilidadesTanque;
    @ManyToMany(mappedBy = "habilidadesTanques")
    private Set<Tanque> tanques;

    public String getNombreHabilidadesGuerrero() {
        return nombreHabilidadesTanque;
    }

    public void setNombreHabilidadesGuerrero(String nombreHabilidadesMago) {
        this.nombreHabilidadesTanque = nombreHabilidadesMago;
    }

    public HabilidadesTanque(){}

}
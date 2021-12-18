package ormRPGgame.model;


import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "habilidades_mago")
public class HabilidadesMago {

    @Id
    @Column(name = "nombre_habilidades_mago")
    private String nombreHabilidadesMago;

    @ManyToMany(mappedBy = "habilidadesMagos")
    private Set<Mago> magos;

    public HabilidadesMago(){}

    public String getNombreHabilidadesGuerrero() {
        return nombreHabilidadesMago;
    }

    public void setNombreHabilidadesGuerrero(String nombreHabilidadesMago) {
        this.nombreHabilidadesMago = nombreHabilidadesMago;
    }

}
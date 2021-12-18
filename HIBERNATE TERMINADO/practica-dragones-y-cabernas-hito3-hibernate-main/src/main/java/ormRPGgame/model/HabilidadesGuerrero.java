package ormRPGgame.model;


import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "habilidades_guerrero")
public class HabilidadesGuerrero {

    @Id
    @Column(name = "nombre_habilidades_guerrero")
    private String nombreHabilidadesGuerrero;
    @ManyToMany(mappedBy = "habilidadesGuerreros")
    private Set<Guerrero> guerreros;

    public String getNombreHabilidadesGuerrero() {
        return nombreHabilidadesGuerrero;
    }

    public void setNombreHabilidadesGuerrero(String nombreHabilidadesGuerrero) {
        this.nombreHabilidadesGuerrero = nombreHabilidadesGuerrero;
    }

}
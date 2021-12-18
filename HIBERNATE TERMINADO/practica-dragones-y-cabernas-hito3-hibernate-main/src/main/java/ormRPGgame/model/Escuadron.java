package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="escuadron")
public class Escuadron {
    @Id
    @Column(name = "id_escuadron")
    private int idEscuadron;
    @ManyToMany()
    @JoinTable(name="escuadron_derrota_dragon")
    private Set<Dragon> dragones;
    @ManyToMany(mappedBy = "escuadrones")
    private Set<Personaje> personajes;

    public int getIdEscuadron() {
        return idEscuadron;
    }

    public void setIdEscuadron(int idEscuadron) {
        this.idEscuadron = idEscuadron;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Escuadron escuadron = (Escuadron) o;

        if (idEscuadron != escuadron.idEscuadron) return false;

        return true;
    }
}

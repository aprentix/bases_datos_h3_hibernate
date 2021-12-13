package ormRPGgame.model;
import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name = "jugador")
public class Jugador {
    @Id
    @Column(name="id_jugador")
    private Long id;

    @Column(name = "nombre_jugador")
    private String nombre;

    @OneToMany(mappedBy = "jugador", cascade= CascadeType.ALL)
    private Set<Personaje> personajes;

    public Jugador(){

    }
    public Jugador(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}

package ormRPGgame.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "personaje")
public class Personaje {

    @Id
    @Column(name = "nombre_personaje")
    private String nombre;
    @Basic
    @Column(name = "oro")
    private int oro;
    @Basic
    @Column(name = "nivel")
    private int nivel;
    @Basic
    @Column(name = "fuerza")
    private int fuerza;
    @Basic
    @Column(name = "id_jugador")
    private int idJugador;
    @Basic
    @Column(name = "id_daga")
    private int idDaga;
    @ManyToMany()
    @JoinTable(name="dragones_derrotados")
    private Set<Dragon> dragones;
    @OneToOne(mappedBy = "personajeByNombrePersonaje")
    private Guerrero guerreroByNombrePersonaje;
    @OneToOne(mappedBy = "personajeByNombrePersonaje")
    private Mago magoByNombrePersonaje;
    @ManyToOne
    @JoinColumn(name = "id_jugador", referencedColumnName = "id_jugador", nullable = false,updatable = false,insertable = false)
    private Jugador jugador;
    @ManyToOne
    @JoinColumn(name = "id_daga", referencedColumnName = "id_daga", nullable = false,updatable = false,insertable = false)
    private Daga daga;
    @ManyToMany()
    @JoinTable(name="personaje_forma_escuadron")
    private Set<Escuadron> escuadrones;
   @ManyToMany()
   @JoinTable(name="personaje_interactua_druida")
   private Set<Druida> druidas;
    @OneToOne(mappedBy = "personajeByNombrePersonaje")
    private Tanque tanqueByNombrePersonaje;

    public Personaje(){}
    public Personaje(Jugador jugador, String nombre,Daga daga){
        this.idDaga=daga.getId();
        this.idJugador=jugador.getId();
        this.nombre=nombre;

    }

    public String getNombrePersonaje() {
        return nombre;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombre = nombrePersonaje;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getIdDaga() {
        return idDaga;
    }

    public void setIdDaga(int idDaga) {
        this.idDaga = idDaga;
    }

}

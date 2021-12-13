package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "almacen")
public class Almacen {
    @Id
    @Column(name="nombre_personaje")
    private String nombre_personaje;

    @Column(name= "items")
    private String items;


}

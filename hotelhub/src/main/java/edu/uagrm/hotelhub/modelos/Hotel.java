package edu.uagrm.hotelhub.modelos;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Hotel {
    //Atibutos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String pais;
    private int estrellas;

    @OneToMany(mappedBy = "hotel")
    private List<Habitacion> habitaciones;

    public Hotel(){}

    public Hotel(String nombre, String direccion, String pais, String ciudad, int estrellas){
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
        this.ciudad = ciudad;
        this.estrellas = estrellas;
    }


}

package edu.uagrm.hotelhub.modelos;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo; // Ejemplo: Simple, Doble, Suite
    private double precioPorNoche;
    private boolean disponible;

    @ManyToOne
    private Hotel hotel;
}
package edu.uagrm.hotelhub.modelos;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "habitacion")
    private List<Reserva> reservas;
}
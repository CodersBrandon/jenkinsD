package edu.uagrm.hotelhub.modelos;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fechaInicio;
    private Date fechaFin;
    private double precioTotal;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Habitacion habitacion;

    // Getters, Setters y otros métodos...
}
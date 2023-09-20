package edu.uagrm.hotelhub.modelos;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reservas;
}
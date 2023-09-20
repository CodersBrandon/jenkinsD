package edu.uagrm.hotelhub.servicios;

import edu.uagrm.hotelhub.modelos.Habitacion;
import edu.uagrm.hotelhub.repositorios.HabitacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabitacionServicio {

    @Autowired
    private HabitacionRepositorio habitacionRepositorio;

    public List<Habitacion> obtenerTodas() {
        return habitacionRepositorio.findAll();
    }

    public Optional<Habitacion> obtenerPorId(Long id) {
        return habitacionRepositorio.findById(id);
    }

    public Habitacion guardar(Habitacion habitacion) {
        return habitacionRepositorio.save(habitacion);
    }

    public void eliminar(Long id) {
        habitacionRepositorio.deleteById(id);
    }
}
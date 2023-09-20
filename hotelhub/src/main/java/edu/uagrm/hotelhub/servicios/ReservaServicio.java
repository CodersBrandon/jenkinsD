package edu.uagrm.hotelhub.servicios;

import edu.uagrm.hotelhub.modelos.Reserva;
import edu.uagrm.hotelhub.repositorios.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaServicio {

    @Autowired
    private ReservaRepositorio reservaRepositorio;

    public List<Reserva> obtenerTodas() {
        return reservaRepositorio.findAll();
    }

    public Optional<Reserva> obtenerPorId(Long id) {
        return reservaRepositorio.findById(id);
    }

    public Reserva guardar(Reserva reserva) {
        return reservaRepositorio.save(reserva);
    }

    public void eliminar(Long id) {
        reservaRepositorio.deleteById(id);
    }
}

package edu.uagrm.hotelhub.repositorios;

import edu.uagrm.hotelhub.modelos.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionRepositorio extends JpaRepository<Habitacion, Long> {
}
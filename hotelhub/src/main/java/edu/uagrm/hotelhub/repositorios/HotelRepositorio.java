package edu.uagrm.hotelhub.repositorios;

import edu.uagrm.hotelhub.modelos.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepositorio extends JpaRepository<Hotel, Long> {
}
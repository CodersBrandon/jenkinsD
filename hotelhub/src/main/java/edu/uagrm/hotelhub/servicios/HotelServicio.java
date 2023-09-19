package edu.uagrm.hotelhub.servicios;

import edu.uagrm.hotelhub.modelos.Hotel;
import edu.uagrm.hotelhub.repositorios.HotelRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class HotelServicio {

    @Autowired
    private HotelRepositorio hotelRepositorio;

    public List<Hotel> obtenerTodos() {
        return hotelRepositorio.findAll();
    }

    public Optional<Hotel> obtenerPorId(Long id) {
        return hotelRepositorio.findById(id);
    }

    public Hotel guardar(Hotel hotel) {
        return hotelRepositorio.save(hotel);
    }

    public void eliminar(Long id) {
        hotelRepositorio.deleteById(id);
    }

    //
    public static List<Hotel> buscarHotel(String ciudad) {
        //La logica de un buscador
        if("Tarija".equals(ciudad))
            //return Arrays.asList(new Hotel());
            //return Arrays.asList(new Hotel("Hotel Casa Real", "Av. 16 de Julio",100.0 ));
            return Arrays.asList(new Hotel("Hotel Casa Real", "Av. 16 de Julio","Bolivia","Tarija",5));

        return new ArrayList<>();
    }
}
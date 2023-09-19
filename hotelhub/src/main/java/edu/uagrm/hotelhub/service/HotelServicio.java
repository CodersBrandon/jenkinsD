package edu.uagrm.hotelhub.service;

import edu.uagrm.hotelhub.model.Hotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotelServicio {
    public static List<Hotel> buscarHotel(String ciudad) {
        //La logica de un buscador
        if("Tarija".equals(ciudad))
            //return Arrays.asList(new Hotel());
            //return Arrays.asList(new Hotel("Hotel Casa Real", "Av. 16 de Julio",100.0 ));
            return Arrays.asList(new Hotel("Hotel Casa Real", "Av. 16 de Julio",100.0,4.5 ));

        return new ArrayList<>();
    }
}

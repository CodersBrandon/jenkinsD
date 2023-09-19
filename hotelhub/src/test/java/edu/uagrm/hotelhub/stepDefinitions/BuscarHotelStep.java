package edu.uagrm.hotelhub.stepDefinitions;

import edu.uagrm.hotelhub.model.Hotel;
import edu.uagrm.hotelhub.service.HotelServicio;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class BuscarHotelStep {
    private List<Hotel> hotelesList;

    @Given("el usuario esta en la página principal del sistema")
    public void el_usuario_esta_en_la_página_principal_del_sistema() {
        // Selenium -
        // Servicio
        //


        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("el usuario busca hoteles en la ciudad de {string}")
    public void el_usuario_busca_hoteles_en_la_ciudad_de(String ciudad) {
        // implementar un servicio para buscar hoteles
        hotelesList = HotelServicio.buscarHotel(ciudad);
    }

    @Then("el sistema muestra una lista de hoteles disponibles en la ciudad {string}")
    public void el_sistema_muestra_una_lista_de_hoteles_disponibles_en_la_ciudad(String ciudad) {
        // Verificamos que el resultado de la búsqueda no sea vacia.
        assertFalse(hotelesList.isEmpty());
    }

    @Then("cada hotel muestra su nombre, direccion, precio por noche y calificacion.")
    public void cada_hotel_muestra_su_nombre_direccion_precio_por_noche_y_calificacion() {
        for( Hotel hotel : hotelesList){
            System.out.println(hotel.getNombre());
            assertNotNull(hotel.getNombre());
            assertNotNull(hotel.getDirecion());
            assertNotNull(hotel.getPrecioPorNoche());
            assertNotNull(hotel.getCalificacion());
        }
    }

    @Then("el sistema muestra un mensaje indicando que no hay hoteles disponibles en {string}")
    public void el_sistema_muestra_un_mensaje_indicando_que_no_hay_hoteles_disponibles_en(String ciudad) {
        assertTrue(hotelesList.isEmpty());
    }
}

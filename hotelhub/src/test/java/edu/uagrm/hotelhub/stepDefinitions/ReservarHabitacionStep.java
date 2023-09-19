package edu.uagrm.hotelhub.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class ReservarHabitacionStep {
    @Dado("que estoy registrado en el sistema")
    public void que_estoy_registrado_en_el_sistema() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Dado("he iniciado sesión con mi cuenta de usuario")
    public void he_iniciado_sesión_con_mi_cuenta_de_usuario() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @Dado("hay hoteles con habitaciones disponibles")
    public void hay_hoteles_con_habitaciones_disponibles() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Cuando("selecciono el hotel {string}")
    public void selecciono_el_hotel(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Cuando("elijo la habitación tipo {string}")
    public void elijo_la_habitación_tipo(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Cuando("selecciono la fecha de inicio {string} y fecha final {string}")
    public void selecciono_la_fecha_de_inicio_y_fecha_final(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Cuando("presiono el botón {string}")
    public void presiono_el_botón(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Entonces("debería ver un mensaje confirmando {string}")
    public void debería_ver_un_mensaje_confirmando(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Entonces("la habitación {string} del hotel {string} debería estar marcada como {string} para esas fechas")
    public void la_habitación_del_hotel_debería_estar_marcada_como_para_esas_fechas(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Cuando("elijo una habitación que ya está reservada tipo {string}")
    public void elijo_una_habitación_que_ya_está_reservada_tipo(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Entonces("debería ver un mensaje de error {string}")
    public void debería_ver_un_mensaje_de_error(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}

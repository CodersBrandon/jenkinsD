package edu.uagrm.hotelhub.controladores;

import edu.uagrm.hotelhub.modelos.Hotel;
import edu.uagrm.hotelhub.servicios.HotelServicio;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "HotelHub API")
@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/hoteles")
public class HotelControlador {

    @Autowired
    private HotelServicio hotelServicio;

    @GetMapping
    public ResponseEntity<List<Hotel>> obtenerTodos() {
        return ResponseEntity.ok(hotelServicio.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> obtenerPorId(@PathVariable Long id) {
        return hotelServicio.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Hotel> crear(@RequestBody Hotel hotel) {
        return ResponseEntity.ok(hotelServicio.guardar(hotel));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hotel> actualizar(@PathVariable Long id, @RequestBody Hotel hotelActualizado) {
        if (!hotelServicio.obtenerPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        hotelActualizado.setId(id);
        return ResponseEntity.ok(hotelServicio.guardar(hotelActualizado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (!hotelServicio.obtenerPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        hotelServicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
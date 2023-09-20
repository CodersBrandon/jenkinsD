package edu.uagrm.hotelhub.controladores;

import edu.uagrm.hotelhub.modelos.Reserva;
import edu.uagrm.hotelhub.servicios.ReservaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaControlador {

    @Autowired
    private ReservaServicio reservaServicio;

    @GetMapping
    public ResponseEntity<List<Reserva>> obtenerTodas() {
        return ResponseEntity.ok(reservaServicio.obtenerTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reserva> obtenerPorId(@PathVariable Long id) {
        return reservaServicio.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Reserva> crear(@RequestBody Reserva reserva) {
        return ResponseEntity.ok(reservaServicio.guardar(reserva));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reserva> actualizar(@PathVariable Long id, @RequestBody Reserva reservaActualizada) {
        if (!reservaServicio.obtenerPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        reservaActualizada.setId(id);
        return ResponseEntity.ok(reservaServicio.guardar(reservaActualizada));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (!reservaServicio.obtenerPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        reservaServicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}

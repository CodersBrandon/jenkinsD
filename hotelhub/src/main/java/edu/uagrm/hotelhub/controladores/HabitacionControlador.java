package edu.uagrm.hotelhub.controladores;

import edu.uagrm.hotelhub.modelos.Habitacion;
import edu.uagrm.hotelhub.servicios.HabitacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/habitaciones")
public class HabitacionControlador {

    @Autowired
    private HabitacionServicio habitacionServicio;

    @GetMapping
    public ResponseEntity<List<Habitacion>> obtenerTodas() {
        return ResponseEntity.ok(habitacionServicio.obtenerTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Habitacion> obtenerPorId(@PathVariable Long id) {
        return habitacionServicio.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Habitacion> crear(@RequestBody Habitacion habitacion) {
        return ResponseEntity.ok(habitacionServicio.guardar(habitacion));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Habitacion> actualizar(@PathVariable Long id, @RequestBody Habitacion habitacionActualizada) {
        if (!habitacionServicio.obtenerPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        habitacionActualizada.setId(id);
        return ResponseEntity.ok(habitacionServicio.guardar(habitacionActualizada));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (!habitacionServicio.obtenerPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        habitacionServicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
package edu.uagrm.hotelhub.controladores;

import edu.uagrm.hotelhub.modelos.Cliente;
import edu.uagrm.hotelhub.servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteControlador {

    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping
    public ResponseEntity<List<Cliente>> obtenerTodos() {
        return ResponseEntity.ok(clienteServicio.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obtenerPorId(@PathVariable Long id) {
        return clienteServicio.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Cliente> crear(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteServicio.guardar(cliente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> actualizar(@PathVariable Long id, @RequestBody Cliente clienteActualizado) {
        if (!clienteServicio.obtenerPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        clienteActualizado.setId(id);
        return ResponseEntity.ok(clienteServicio.guardar(clienteActualizado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (!clienteServicio.obtenerPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        clienteServicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
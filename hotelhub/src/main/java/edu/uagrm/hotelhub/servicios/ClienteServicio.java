package edu.uagrm.hotelhub.servicios;

import edu.uagrm.hotelhub.modelos.Cliente;
import edu.uagrm.hotelhub.repositorios.ClienteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> obtenerTodos() {
        return clienteRepositorio.findAll();
    }

    public Optional<Cliente> obtenerPorId(Long id) {
        return clienteRepositorio.findById(id);
    }

    public Cliente guardar(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    public void eliminar(Long id) {
        clienteRepositorio.deleteById(id);
    }
}
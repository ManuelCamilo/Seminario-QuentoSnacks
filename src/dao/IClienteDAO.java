package dao;

import model.Cliente;

public interface IClienteDAO {
    Cliente buscarCliente(int idCliente);
    void crearCliente(Cliente cliente);
    // Otros métodos necesarios
}

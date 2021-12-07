package Domain.Interfaces.Repository;

import Domain.Entity.Cliente;

import java.util.List;

public interface IClienteRepository {
    public void createCliente(Cliente cliente);
    public Cliente readById(int id);
    public List<Cliente> readAll();
    public void updateCliente(int id, Cliente cliente);
    public void deleteCliente(int id);
}

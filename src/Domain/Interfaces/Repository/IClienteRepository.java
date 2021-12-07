package Domain.Interfaces.Repository;

import Domain.Entity.*;

import java.util.ArrayList;

public interface IClienteRepository {
    public void createCliente(Cliente cliente);
    public Cliente readById(int id);
    public ArrayList<Cliente> readAll();
    public void updateCliente(int id, Cliente cliente);
    public void deleteCliente(int id);
}

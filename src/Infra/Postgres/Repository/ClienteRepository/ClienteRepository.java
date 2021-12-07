package Infra.Postgres.Repository.ClienteRepository;

import Domain.Entity.Cliente;
import Domain.Interfaces.Repository.IClienteRepository;
import Infra.Postgres.Context.PostgresContext;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ClienteRepository implements IClienteRepository {
    PostgresContext context = new PostgresContext();
    @Override
    public void createCliente(Cliente cliente) {
        Statement conexao = context.createConnection();
        String SQLQuery = "INSERT INTO cliente (nomecompleto, telefone, email) VALUES ('"+cliente.getNome()+"', '"+cliente.getTelefone()+"', '"+cliente.getEmail()+"');";
        try {
            conexao.executeUpdate(SQLQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cliente readById(int id) {
        return null;
    }

    @Override
    public List<Cliente> readAll() {
        return null;
    }

    @Override
    public void updateCliente(int id, Cliente cliente) {

    }

    @Override
    public void deleteCliente(int id) {

    }
}

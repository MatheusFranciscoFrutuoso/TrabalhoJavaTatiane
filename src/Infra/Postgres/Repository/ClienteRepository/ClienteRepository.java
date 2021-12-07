package Infra.Postgres.Repository.ClienteRepository;

import Domain.Entity.*;
import Domain.Interfaces.Repository.IClienteRepository;
import Infra.Postgres.Context.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ClienteRepository implements IClienteRepository {
    PostgresContext context = new PostgresContext();
    @Override
    public void createCliente(Cliente cliente) {
        Statement conexao = context.createConnection();
        String SQLQuery = "INSERT INTO cliente (nomecompleto, telefone, email) VALUES ('"+cliente.getNome()+"', '"+cliente.getTelefone()+"', '"+cliente.getEmail()+"');";
        try {
            conexao.executeUpdate(SQLQuery);
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cliente readById(int id) {
        ResultSet rs;
        Cliente model = new Cliente();
        Statement conexao = context.createConnection();
        String SQLQuery = "SELECT * FROM cliente where id = "+id+" ";
        try {
            rs = conexao.executeQuery(SQLQuery);
            while(rs.next()){
                model.setNome(rs.getString("nomecompleto"));
                model.setTelefone(rs.getString("telefone"));
                model.setEmail(rs.getString("email"));
            }
            return model;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return model;
    }

    @Override
    public ArrayList<Cliente> readAll() {
        ResultSet rs;
        ArrayList<Cliente> listClientes = new ArrayList<Cliente>();

        Statement conexao = context.createConnection();
        String SQLQuery = "SELECT * FROM cliente";
        try {
            rs = conexao.executeQuery(SQLQuery);
            while(rs.next()){
                Cliente model = new Cliente();
                model.setNome(rs.getString("nomecompleto"));
                model.setTelefone(rs.getString("telefone"));
                model.setEmail(rs.getString("email"));
                listClientes.add(model);
            }
            return listClientes;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listClientes;
    }

    @Override
    public void updateCliente(int id, Cliente cliente) {
        Statement conexao = context.createConnection();
        String SQLQuery = "UPDATE cliente SET nomecompleto='"+cliente.getNome()+"', telefone='"+cliente.getTelefone()+"', email='"+cliente.getEmail()+"'  WHERE id='"+id+"'";
        try {
            conexao.executeUpdate(SQLQuery);
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCliente(int id) {
        Statement conexao = context.createConnection();
        String SQLQuery = "DELETE FROM cliente WHERE id='"+id+"'";
        try {
            conexao.executeUpdate(SQLQuery);
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package Infra.Postgres.Repository.ReservaRepository;

import Domain.Entity.*;
import Domain.Interfaces.Repository.IReservaRepository;
import Infra.Postgres.Context.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ReservaRepository implements IReservaRepository {
    PostgresContext context = new PostgresContext();
    @Override
    public void createReserva(Reserva reserva) {
        Statement conexao = context.createConnection();
        String SQLQuery = "INSERT INTO reserva (idcliente, idquarto, dataentrada, datasaida) VALUES ('"+reserva.getIdCliente()+"', '"+reserva.getIdQuarto()+"', '"+reserva.getDataEntrada()+"', '"+reserva.getDataSaida()+"');";
        try {
            conexao.executeUpdate(SQLQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Reserva readById(int id) {
        ResultSet rs;
        Reserva model = new Reserva();
        Statement conexao = context.createConnection();
        String SQLQuery = "SELECT * FROM reserva where id = "+id+" ";
        try {
            rs = conexao.executeQuery(SQLQuery);
            while(rs.next()){
                model.setIdCliente(rs.getInt("idcliente"));
                model.setIdQuarto(rs.getInt("idquarto"));
                model.setDataEntrada(rs.getDate("dataentrada"));
                model.setDataSaida(rs.getDate("datasaida"));
            }
            return model;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return model;
    }

    @Override
    public ArrayList<Reserva> readAll() {
        ResultSet rs;
        ArrayList<Reserva> listClientes = new ArrayList<Reserva>();

        Statement conexao = context.createConnection();
        String SQLQuery = "SELECT * FROM reserva";
        try {
            rs = conexao.executeQuery(SQLQuery);
            while(rs.next()){
                Reserva model = new Reserva();
                model.setIdCliente(rs.getInt("idcliente"));
                model.setIdQuarto(rs.getInt("idquarto"));
                model.setDataEntrada(rs.getDate("dataentrada"));
                model.setDataSaida(rs.getDate("datasaida"));
                listClientes.add(model);
            }
            return listClientes;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listClientes;
    }

    @Override
    public void updateReserva(int id, Reserva reserva) {
        Statement conexao = context.createConnection();
        String SQLQuery = "UPDATE reserva SET idcliente='"+reserva.getIdCliente()+"', idquarto='"+reserva.getIdQuarto()+"', dataentrada='"+reserva.getDataEntrada()+"', datasaida='"+reserva.getDataSaida()+"'  WHERE id='"+id+"'";
        try {
            conexao.executeUpdate(SQLQuery);
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteReserva(int id) {
        Statement conexao = context.createConnection();
        String SQLQuery = "DELETE FROM reserva WHERE id='"+id+"'";
        try {
            conexao.executeUpdate(SQLQuery);
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

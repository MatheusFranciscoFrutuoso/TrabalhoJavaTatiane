package Infra.Postgres.Repository.ReservaRepository;

import Domain.Entity.Reserva;
import Domain.Interfaces.Repository.IReservaRepository;
import Infra.Postgres.Context.PostgresContext;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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
        return null;
    }

    @Override
    public List<Reserva> readAll() {
        return null;
    }

    @Override
    public void updateReserva(int id, Reserva reserva) {

    }

    @Override
    public void deleteReserva(int id) {

    }
}

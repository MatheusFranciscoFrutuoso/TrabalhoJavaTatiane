package Infra.Postgres.Repository.QuartoRepository;

import Domain.Entity.Quarto;
import Domain.Interfaces.Repository.IQuartoRepository;
import Infra.Postgres.Context.PostgresContext;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class QuartoRepository implements IQuartoRepository {
    PostgresContext context = new PostgresContext();
    @Override
    public void createQuarto(Quarto quarto) {
        Statement conexao = context.createConnection();
        String SQLQuery = "INSERT INTO quarto (numero, tipo, numerotelefonequarto, reserva) VALUES ('"+quarto.getNumeroQuarto()+"', '"+quarto.getTipo()+"', '"+quarto.getTelefoneQuarto()+"', '"+quarto.isReservado()+"');";
        try {
            conexao.executeUpdate(SQLQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Quarto readById(int id) {
        return null;
    }

    @Override
    public List<Quarto> readAll() {
        return null;
    }

    @Override
    public void updateQuarto(int id, Quarto quarto) {

    }

    @Override
    public void deleteQuarto(int id) {

    }
}

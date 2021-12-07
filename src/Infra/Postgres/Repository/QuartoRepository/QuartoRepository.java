package Infra.Postgres.Repository.QuartoRepository;

import Domain.Entity.*;
import Domain.Interfaces.Repository.IQuartoRepository;
import Infra.Postgres.Context.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QuartoRepository implements IQuartoRepository {
    PostgresContext context = new PostgresContext();
    @Override
    public void createQuarto(Quarto quarto) {
        Statement conexao = context.createConnection();
        String SQLQuery = "INSERT INTO quarto (numero, tipo, numerotelefonequarto, quarto) VALUES ('"+quarto.getNumeroQuarto()+"', '"+quarto.getTipo()+"', '"+quarto.getTelefoneQuarto()+"', '"+quarto.isReservado()+"');";
        try {
            conexao.executeUpdate(SQLQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Quarto readById(int id) {
        ResultSet rs;
        Quarto model = new Quarto();
        Statement conexao = context.createConnection();
        String SQLQuery = "SELECT * FROM quarto where id = "+id+" ";
        try {
            rs = conexao.executeQuery(SQLQuery);
            while(rs.next()){
                model.setNumeroQuarto(rs.getInt("numero"));
                model.setTipo(rs.getInt("tipo"));
                model.setTelefoneQuarto(rs.getString("numerotelefonequarto"));
                model.setReservado(rs.getBoolean("reservado"));
            }
            return model;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return model;
    }

    @Override
    public ArrayList<Quarto> readAll() {
        ResultSet rs;
        ArrayList<Quarto> listQuartos = new ArrayList<Quarto>();

        Statement conexao = context.createConnection();
        String SQLQuery = "SELECT * FROM quarto";
        try {
            rs = conexao.executeQuery(SQLQuery);
            while(rs.next()){
                Quarto model = new Quarto();
                model.setNumeroQuarto(rs.getInt("numero"));
                model.setTipo(rs.getInt("tipo"));
                model.setTelefoneQuarto(rs.getString("numerotelefonequarto"));
                model.setReservado(rs.getBoolean("reservado"));
                listQuartos.add(model);
            }
            return listQuartos;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listQuartos;
    }

    @Override
    public void updateQuarto(int id, Quarto quarto) {
        Statement conexao = context.createConnection();
        String SQLQuery = "UPDATE quarto SET numero='"+quarto.getNumeroQuarto()+"', tipo='"+quarto.getTipo()+"', numerotelefonequarto='"+quarto.getTelefoneQuarto()+"', reservado='"+quarto.isReservado()+"'  WHERE id='"+id+"'";
        try {
            conexao.executeUpdate(SQLQuery);
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteQuarto(int id) {
        Statement conexao = context.createConnection();
        String SQLQuery = "DELETE FROM quarto WHERE id='"+id+"'";
        try {
            conexao.executeUpdate(SQLQuery);
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

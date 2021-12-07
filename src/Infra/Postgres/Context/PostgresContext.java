package Infra.Postgres.Context;

import java.sql.*;

public class PostgresContext {

    public Statement createConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "senha123");
            Statement s = conn.createStatement();
            System.out.println("conectado");
            return s;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

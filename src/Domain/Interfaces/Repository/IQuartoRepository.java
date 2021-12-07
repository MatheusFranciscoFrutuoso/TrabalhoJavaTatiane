package Domain.Interfaces.Repository;

import Domain.Entity.*;

import java.util.ArrayList;

public interface IQuartoRepository {
    public void createQuarto(Quarto quarto);
    public Quarto readById(int id);
    public ArrayList<Quarto> readAll();
    public void updateQuarto(int id, Quarto quarto);
    public void deleteQuarto(int id);
}

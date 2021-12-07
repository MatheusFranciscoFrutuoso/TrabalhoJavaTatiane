package Domain.Interfaces.Repository;

import Domain.Entity.Quarto;

import java.util.List;

public interface IQuartoRepository {
    public void createQuarto(Quarto quarto);
    public Quarto readById(int id);
    public List<Quarto> readAll();
    public void updateQuarto(int id, Quarto quarto);
    public void deleteQuarto(int id);
}

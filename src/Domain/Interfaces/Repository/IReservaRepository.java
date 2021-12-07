package Domain.Interfaces.Repository;

import Domain.Entity.*;

import java.util.ArrayList;

public interface IReservaRepository {
    public void createReserva(Reserva reserva);
    public Reserva readById(int id);
    public ArrayList<Reserva> readAll();
    public void updateReserva(int id, Reserva reserva);
    public void deleteReserva(int id);
}

package Domain.Interfaces.Repository;

import Domain.Entity.Reserva;

import java.util.List;

public interface IReservaRepository {
    public void createReserva(Reserva reserva);
    public Reserva readById(int id);
    public List<Reserva> readAll();
    public void updateReserva(int id, Reserva reserva);
    public void deleteReserva(int id);
}

package Domain.Entity;

public class Quarto {
    private int id;
    private int NumeroQuarto;
    private int Tipo;
    private String TelefoneQuarto;
    private boolean Reservado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getNumeroQuarto() {
        return NumeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        NumeroQuarto = numeroQuarto;
    }

    public String getTelefoneQuarto() {
        return TelefoneQuarto;
    }

    public void setTelefoneQuarto(String telefoneQuarto) {
        TelefoneQuarto = telefoneQuarto;
    }

    public boolean isReservado() {
        return Reservado;
    }

    public void setReservado(boolean reservado) {
        Reservado = reservado;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int tipo) {
        Tipo = tipo;
    }
}

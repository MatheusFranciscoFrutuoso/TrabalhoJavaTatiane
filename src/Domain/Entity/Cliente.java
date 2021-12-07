package Domain.Entity;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Cliente {
    private SimpleIntegerProperty id;
    private SimpleStringProperty Nome;
    private SimpleStringProperty Telefone;
    private SimpleStringProperty Email;

    public SimpleIntegerProperty getId() {
        return id;
    }

    public void setId(SimpleIntegerProperty id) {
        this.id = id;
    }

    public SimpleStringProperty getNome() {
        return Nome;
    }

    public void setNome(SimpleStringProperty nome) {
        Nome = nome;
    }

    public SimpleStringProperty getTelefone() {
        return Telefone;
    }

    public void setTelefone(SimpleStringProperty telefone) {
        Telefone = telefone;
    }

    public SimpleStringProperty getEmail() {
        return Email;
    }

    public void setEmail(SimpleStringProperty email) {
        Email = email;
    }
}

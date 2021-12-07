package com.company;

import Domain.Entity.*;
import Infra.Postgres.Repository.ClienteRepository.ClienteRepository;
import javafx.beans.property.SimpleStringProperty;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClienteRepository repo = new ClienteRepository();
        Cliente c = new Cliente();
        c.setNome(new SimpleStringProperty("Matheus Gostoso"));
        c.setTelefone(new SimpleStringProperty("121213131"));
        c.setEmail(new SimpleStringProperty("felipef12@gmail.com"));
        repo.createCliente(c);
        System.out.println(repo.readById(1));
        System.out.println(repo.readAll());
        Cliente cn = new Cliente();
        cn.setNome(new SimpleStringProperty("Matheus alterado"));
        cn.setTelefone(new SimpleStringProperty("3131"));
        cn.setEmail(new SimpleStringProperty("Matheus alterado@gmail.com"));
        repo.updateCliente(2, cn);
        repo.deleteCliente(3);
    }
}

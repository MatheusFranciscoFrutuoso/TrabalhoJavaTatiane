package com.company;

import Domain.Entity.*;
import Infra.Postgres.Repository.ClienteRepository.ClienteRepository;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClienteRepository repo = new ClienteRepository();
        Cliente c = new Cliente();
        c.setNome("Matheus Gostoso");
        c.setTelefone("121213131");
        c.setEmail("felipef12@gmail.com");
        repo.createCliente(c);
        System.out.println(repo.readById(1));
        System.out.println(repo.readAll());
        Cliente cn = new Cliente();
        cn.setNome("Matheus alterado");
        cn.setTelefone("3131");
        cn.setEmail("Matheus alterado@gmail.com");
        repo.updateCliente(2, cn);
        repo.deleteCliente(3);
    }
}

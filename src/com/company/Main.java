package com.company;

import Domain.Entity.Cliente;
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

    }
}

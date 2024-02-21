package io.gitub.servercard.msclientes.application;

import io.gitub.servercard.msclientes.domain.Cliente;
import io.gitub.servercard.msclientes.infra.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository repository;

    @Transactional
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    public Optional<Cliente> getCpf(String cpf) {
        return repository.getByCpf(cpf);
    }


}

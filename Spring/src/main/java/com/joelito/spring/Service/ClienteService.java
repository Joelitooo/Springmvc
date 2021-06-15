package com.joelito.spring.Service;

import com.joelito.spring.DAL.ClienteEntity;
import com.joelito.spring.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    public List<ClienteEntity> getClienteEntity() {
        return clienteRepository.findAll();
    }


}


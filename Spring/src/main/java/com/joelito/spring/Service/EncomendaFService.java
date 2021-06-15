package com.joelito.spring.Service;

import com.joelito.spring.DAL.EncomendafEntity;
import com.joelito.spring.Repository.EncomendaFRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncomendaFService {

    private final EncomendaFRepository encomendaFRepository;

    @Autowired
    public EncomendaFService(EncomendaFRepository encomendaFRepository) {
        this.encomendaFRepository = encomendaFRepository;
    }

    public List<EncomendafEntity> getEncomendaFEntity() {
        return encomendaFRepository.findAll();
    }
}

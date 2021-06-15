package com.joelito.spring.Service;


import com.joelito.spring.DAL.LinhaencomendafEntity;
import com.joelito.spring.Repository.LinhaEncomendaFRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinhaEncomendaFService {
    private final LinhaEncomendaFRepository linhaEncomendaFRepository;

    @Autowired
    public LinhaEncomendaFService(LinhaEncomendaFRepository linhaEncomendaFRepository) {
        this.linhaEncomendaFRepository = linhaEncomendaFRepository;
    }

    public List<LinhaencomendafEntity> getLinhaEncomendaFEntity() {
        return linhaEncomendaFRepository.findAll();
    }

}

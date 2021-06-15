package com.joelito.spring.Service;

import com.joelito.spring.DAL.EncomendacEntity;
import com.joelito.spring.Repository.EncomendaCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncomendaCService  {

    private final EncomendaCRepository encomendaCRepository;

    @Autowired
    public EncomendaCService(EncomendaCRepository encomendaCRepository) {
        this.encomendaCRepository = encomendaCRepository;
    }

    public List<EncomendacEntity> getEncomendaCEntity() {
        return encomendaCRepository.findAll();
    }

}

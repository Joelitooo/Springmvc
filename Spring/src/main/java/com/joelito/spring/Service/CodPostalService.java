package com.joelito.spring.Service;


import com.joelito.spring.DAL.CodpostalEntity;
import com.joelito.spring.Repository.CodPostalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodPostalService {

    private final CodPostalRepository codPostalRepository;

    @Autowired
    public CodPostalService(CodPostalRepository codPostalRepository) {
        this.codPostalRepository = codPostalRepository;
    }

    public List<CodpostalEntity> getCodPostalEntity() {
        return codPostalRepository.findAll();
    }
}

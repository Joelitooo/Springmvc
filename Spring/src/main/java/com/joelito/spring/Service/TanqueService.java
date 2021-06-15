package com.joelito.spring.Service;

import com.joelito.spring.DAL.TanqueEntity;
import com.joelito.spring.Repository.TanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TanqueService {

    private final TanqueRepository tanqueRepository;

    @Autowired
    public TanqueService(TanqueRepository tanqueRepository) {
        this.tanqueRepository = tanqueRepository;
    }

    public List<TanqueEntity> getTanqueEntity() {
        return tanqueRepository.findAll();
    }
}

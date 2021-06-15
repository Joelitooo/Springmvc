package com.joelito.spring.Service;

import com.joelito.spring.DAL.EspecieEntity;
import com.joelito.spring.Repository.EspecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecieService {

    private final EspecieRepository especieRepository;

    @Autowired
    public EspecieService(EspecieRepository especieRepository) {
        this.especieRepository = especieRepository;
    }

    public List<EspecieEntity> getEspecieEntity() {
        return especieRepository.findAll();
    }



}

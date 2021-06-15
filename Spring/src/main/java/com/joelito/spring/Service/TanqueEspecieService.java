package com.joelito.spring.Service;

import com.joelito.spring.DAL.TanqueespecieEntity;
import com.joelito.spring.Repository.TanqueEspecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TanqueEspecieService {

    private final TanqueEspecieRepository tanqueEspecieRepository;

    @Autowired
    public TanqueEspecieService(TanqueEspecieRepository tanqueEspecieRepository) {
        this.tanqueEspecieRepository = tanqueEspecieRepository;
    }

    public List<TanqueespecieEntity> getTanqueEspecieEntity() {
        return tanqueEspecieRepository.findAll();
    }


}

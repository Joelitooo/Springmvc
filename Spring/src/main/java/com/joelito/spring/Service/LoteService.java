package com.joelito.spring.Service;

import com.joelito.spring.DAL.LoteEntity;
import com.joelito.spring.Repository.LoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoteService {

    private final LoteRepository loteRepository;

    @Autowired
    public LoteService(LoteRepository loteRepository) {
        this.loteRepository = loteRepository;
    }

    public List<LoteEntity> getLoteEntity() {
        return loteRepository.findAll();
    }

}

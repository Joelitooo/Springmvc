package com.joelito.spring.Service;


import com.joelito.spring.DAL.ControlodequalidadeEntity;
import com.joelito.spring.Repository.ControloDeQualidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControloDeQualidadeService {

    private final ControloDeQualidadeRepository controloDeQualidadeRepository;

    @Autowired
    public ControloDeQualidadeService(ControloDeQualidadeRepository controloDeQualidadeRepository) {
        this.controloDeQualidadeRepository = controloDeQualidadeRepository;

    }

    public List<ControlodequalidadeEntity> getControloDeQualidadeEntity() {
        return controloDeQualidadeRepository.findAll();
    }

}

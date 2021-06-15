package com.joelito.spring.Service;

import com.joelito.spring.DAL.RacaoEntity;
import com.joelito.spring.Repository.RacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RacaoService {

private final RacaoRepository racaoRepository;

    @Autowired
    public RacaoService(RacaoRepository racaoRepository) {
        this.racaoRepository = racaoRepository;
    }

    public List<RacaoEntity> getRacaoEntity() {
        return racaoRepository.findAll();
    }
}



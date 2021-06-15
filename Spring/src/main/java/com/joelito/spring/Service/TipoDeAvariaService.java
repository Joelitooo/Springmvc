package com.joelito.spring.Service;

import com.joelito.spring.DAL.TipoDeAvariaEntity;
import com.joelito.spring.Repository.TipoDeAvariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDeAvariaService {

    private final TipoDeAvariaRepository tipoDeAvariaRepository;

    @Autowired
    public TipoDeAvariaService(TipoDeAvariaRepository tipoDeAvariaRepository) {
        this.tipoDeAvariaRepository = tipoDeAvariaRepository;
    }

    public List<TipoDeAvariaEntity> getTipoDeAvariaEntity() {
        return tipoDeAvariaRepository.findAll();
    }


}


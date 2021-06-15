package com.joelito.spring.Service;

import com.joelito.spring.DAL.TipoDeControloEntity;
import com.joelito.spring.Repository.TipoDeControlo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDeControloService {

    private final TipoDeControlo tipoDeControlo;

    @Autowired
    public TipoDeControloService(TipoDeControlo tipoDeControlo) {
        this.tipoDeControlo = tipoDeControlo;
    }

    public List<TipoDeControloEntity> getTipoDeControloEntity() {
        return tipoDeControlo.findAll();
    }
}

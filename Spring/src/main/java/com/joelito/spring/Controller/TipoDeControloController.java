package com.joelito.spring.Controller;

import com.joelito.spring.DAL.TipoDeControloEntity;
import com.joelito.spring.Service.TipoDeControloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/tipodecontrolo")
public class TipoDeControloController {

    private final TipoDeControloService tipoDeControloService;

    @Autowired
    public TipoDeControloController(TipoDeControloService tipoDeControloService) {
        this.tipoDeControloService = tipoDeControloService;
    }

    @GetMapping
    public List<TipoDeControloEntity> getTipoDeControloEntity() {
        return tipoDeControloService.getTipoDeControloEntity();
    }
}

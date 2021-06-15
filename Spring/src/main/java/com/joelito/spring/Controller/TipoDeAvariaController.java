package com.joelito.spring.Controller;


import com.joelito.spring.DAL.TipoDeAvariaEntity;
import com.joelito.spring.Service.TipoDeAvariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/tipodeavaria")
public class TipoDeAvariaController {

    private final TipoDeAvariaService tipoDeAvariaService;

    @Autowired
    public TipoDeAvariaController(TipoDeAvariaService tipoDeAvariaService) {
        this.tipoDeAvariaService = tipoDeAvariaService;
    }

    @GetMapping
    public List<TipoDeAvariaEntity> getTipoDeAvariaEntity() {
        return tipoDeAvariaService.getTipoDeAvariaEntity();
    }
}

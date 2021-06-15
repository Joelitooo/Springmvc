package com.joelito.spring.Controller;


import com.joelito.spring.DAL.EncomendacEntity;
import com.joelito.spring.Service.EncomendaCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/encomendacliente")
public class EncomendaCController {

    private final EncomendaCService encomendaCService;

    @Autowired
    public EncomendaCController(EncomendaCService encomendaCService) {
        this.encomendaCService = encomendaCService;
    }

    @GetMapping
    public List<EncomendacEntity> getEncomendaCEntity() {
        return encomendaCService.getEncomendaCEntity();
    }

}

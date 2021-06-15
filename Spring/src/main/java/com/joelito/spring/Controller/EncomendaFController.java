package com.joelito.spring.Controller;

import com.joelito.spring.DAL.EncomendafEntity;
import com.joelito.spring.Service.EncomendaFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping(path = "/encomendafornecedor")
public class EncomendaFController {

    private final EncomendaFService encomendaFService;


    @Autowired
    public EncomendaFController(EncomendaFService encomendaFService) {
        this.encomendaFService = encomendaFService;
    }

    @GetMapping
    public List<EncomendafEntity> getEncomendaFEntity() {
        return encomendaFService.getEncomendaFEntity();
    }

}

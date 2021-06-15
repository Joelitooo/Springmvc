package com.joelito.spring.Controller;


import com.joelito.spring.DAL.EncomendafEntity;
import com.joelito.spring.Service.LinhaEncomendaFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "linhaencomendac")
public class LinhaEncomendaFController {

    private final LinhaEncomendaFService linhaEncomendaFService;


    @Autowired
    public LinhaEncomendaFController(LinhaEncomendaFService linhaEncomendaFService) {
        this.linhaEncomendaFService = linhaEncomendaFService;
    }

    /*public List<EncomendafEntity> getLinhaEncomendaFEntity() {
        return linhaEncomendaFService.getLinhaEncomendaFEntity();
    }*/
}

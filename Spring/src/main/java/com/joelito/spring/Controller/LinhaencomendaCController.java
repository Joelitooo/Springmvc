package com.joelito.spring.Controller;

import com.joelito.spring.DAL.EncomendacEntity;
import com.joelito.spring.Service.LinhaEncomendaCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/linhaencomenda")
public class LinhaencomendaCController {

    private final LinhaEncomendaCService linhaEncomendaCService;

    @Autowired
    public LinhaencomendaCController(LinhaEncomendaCService linhaEncomendaCService) {
        this.linhaEncomendaCService = linhaEncomendaCService;
    }

    /*@GetMapping
    public List<EncomendacEntity> getLinhaEncomendaCEntity() {
        return linhaEncomendaCService.getLinhaEncomendaCEntity();
    }*/
}

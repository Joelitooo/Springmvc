package com.joelito.spring.Controller;


import com.joelito.spring.DAL.AguaEntity;
import com.joelito.spring.Service.AguaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/agua")
public class AguaController {
    private final AguaService aguaService;

    @Autowired
    public AguaController(AguaService aguaService) {
        this.aguaService = aguaService;
    }

    @GetMapping
    public List<AguaEntity> getAguaEntity(){
        return aguaService.getAguaEntity();
    }
}

package com.joelito.spring.Controller;


import com.joelito.spring.DAL.EspecieEntity;
import com.joelito.spring.Service.EspecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/especie")
public class EspecieController {

    private final EspecieService especieService;

    @Autowired
    public EspecieController(EspecieService especieService) {
        this.especieService = especieService;
    }

    @GetMapping
    public List<EspecieEntity> getEspecieEntity(){return especieService.getEspecieEntity();}
}

package com.joelito.spring.Controller;


import com.joelito.spring.DAL.ControlodequalidadeEntity;
import com.joelito.spring.Service.ControloDeQualidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/controlodequalidade")
public class ControloDeQualidadeController {

    private final ControloDeQualidadeService controloDeQualidadeService;

    @Autowired
    public ControloDeQualidadeController(ControloDeQualidadeService controloDeQualidadeService) {
        this.controloDeQualidadeService = controloDeQualidadeService;
    }

    @GetMapping
    public List<ControlodequalidadeEntity> getControloDeQualidadeEntity() {
        return controloDeQualidadeService.getControloDeQualidadeEntity();
    }

}


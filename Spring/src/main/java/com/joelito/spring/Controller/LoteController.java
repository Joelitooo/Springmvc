package com.joelito.spring.Controller;

import com.joelito.spring.DAL.LoteEntity;
import com.joelito.spring.Service.LoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/lote")
public class LoteController {

    private final LoteService loteService;

    @Autowired
    public LoteController(LoteService loteService) {
        this.loteService = loteService;
    }

    @GetMapping
    public List<LoteEntity> getLoteEntity() {
        return loteService.getLoteEntity();
    }
}

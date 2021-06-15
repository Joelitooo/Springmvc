package com.joelito.spring.Controller;

import com.joelito.spring.DAL.TanqueespecieEntity;
import com.joelito.spring.Service.TanqueEspecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "tanqueespecie")
public class TanqueEspecieController {


    private final TanqueEspecieService tanqueEspecieService;

    @Autowired
    public TanqueEspecieController(TanqueEspecieService tanqueEspecieService) {
        this.tanqueEspecieService = tanqueEspecieService;
    }

    @GetMapping
    public List<TanqueespecieEntity> getTanqueEspecieEntity() {
        return tanqueEspecieService.getTanqueEspecieEntity();
    }
}

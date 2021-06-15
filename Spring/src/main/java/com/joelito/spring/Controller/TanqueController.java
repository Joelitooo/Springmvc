package com.joelito.spring.Controller;

import com.joelito.spring.DAL.TanqueEntity;
import com.joelito.spring.DAL.TanqueespecieEntity;
import com.joelito.spring.Service.TanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/tanque")
public class TanqueController {


    private final TanqueService tanqueService;

    @Autowired
    public TanqueController(TanqueService tanqueService) {
        this.tanqueService = tanqueService;
    }

    @GetMapping
    public List<TanqueEntity> getTanqueEntity() {
        return tanqueService.getTanqueEntity();
    }
}

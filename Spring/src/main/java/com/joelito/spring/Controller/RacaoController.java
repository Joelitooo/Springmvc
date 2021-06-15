package com.joelito.spring.Controller;

import com.joelito.spring.DAL.RacaoEntity;
import com.joelito.spring.Service.RacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/racao")
public class RacaoController {

    private final RacaoService racaoService;

    @Autowired
    public RacaoController(RacaoService racaoService) {
        this.racaoService = racaoService;
    }

    @RequestMapping
    public List<RacaoEntity> getRacaoEntity() {
        return racaoService.getRacaoEntity();
    }
}

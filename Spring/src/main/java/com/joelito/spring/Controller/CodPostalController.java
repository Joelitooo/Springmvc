package com.joelito.spring.Controller;


import com.joelito.spring.DAL.CodpostalEntity;
import com.joelito.spring.Service.CodPostalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/codpostal")
public class CodPostalController {

    private final CodPostalService codPostalService;

    @Autowired
    public CodPostalController(CodPostalService codPostalService) {
        this.codPostalService = codPostalService;
    }

    @GetMapping
    public List<CodpostalEntity> getCodPostalEntity() {
        return codPostalService.getCodPostalEntity();
    }

}

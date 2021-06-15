package com.joelito.spring.Controller;

import com.joelito.spring.DAL.TanqueloteEntity;
import com.joelito.spring.Service.TanqueLoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/tanquelote")
public class TanqueLoteController {

    private final TanqueLoteService tanqueLoteService;

    @Autowired
    public TanqueLoteController(TanqueLoteService tanqueLoteService) {
        this.tanqueLoteService = tanqueLoteService;
    }

    @GetMapping
    public List<TanqueloteEntity> getTanqueLoteEntity() {
        return tanqueLoteService.getTanqueLoteEntity();
    }

}

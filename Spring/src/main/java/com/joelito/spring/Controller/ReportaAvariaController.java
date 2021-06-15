package com.joelito.spring.Controller;


import com.joelito.spring.DAL.ReportaavariaEntity;
import com.joelito.spring.Service.ReportaAvariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/reportaravarias")
public class ReportaAvariaController {

    private final ReportaAvariaService reportaAvariaService;


    @Autowired
    public ReportaAvariaController(ReportaAvariaService reportaAvariaService) {
        this.reportaAvariaService = reportaAvariaService;
    }

    @GetMapping
    public List<ReportaavariaEntity> getReportaAvariaEntity() {
        return reportaAvariaService.getReportaAvariaEntity();
    }

}

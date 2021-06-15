package com.joelito.spring.Service;

import com.joelito.spring.DAL.ReportaavariaEntity;
import com.joelito.spring.Repository.ReportaAvariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportaAvariaService {

    private final ReportaAvariaRepository reportaAvariaRepository;

    @Autowired
    public ReportaAvariaService(ReportaAvariaRepository reportaAvariaRepository) {
        this.reportaAvariaRepository = reportaAvariaRepository;
    }

    public List<ReportaavariaEntity> getReportaAvariaEntity() {
        return reportaAvariaRepository.findAll();
    }

}

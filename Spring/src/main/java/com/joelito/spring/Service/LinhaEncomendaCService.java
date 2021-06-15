package com.joelito.spring.Service;

import com.joelito.spring.DAL.LinhadeencomendacEntity;
import com.joelito.spring.Repository.LinhaEncomendaCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinhaEncomendaCService {

private final LinhaEncomendaCRepository linhaEncomendaCRepository;

    @Autowired
    public LinhaEncomendaCService(LinhaEncomendaCRepository linhaEncomendaCRepository) {
        this.linhaEncomendaCRepository = linhaEncomendaCRepository;
    }

    public List<LinhadeencomendacEntity> getLinhaEncomendaCEntity() {
        return linhaEncomendaCRepository.findAll();
    }
}

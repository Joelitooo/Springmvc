package com.joelito.spring.Service;


import com.joelito.spring.DAL.FornecedorEntity;
import com.joelito.spring.Repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    private final FornecedorRepository fornecedorRepository;

    @Autowired
    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public List<FornecedorEntity> getFornecedorEntity() {
        return fornecedorRepository.findAll();
    }


}

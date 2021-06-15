package com.joelito.spring.Service;

import com.joelito.spring.DAL.FuncionarioEntity;
import com.joelito.spring.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<FuncionarioEntity> getFuncionarioEntity() {
        return funcionarioRepository.findAll();
    }
}

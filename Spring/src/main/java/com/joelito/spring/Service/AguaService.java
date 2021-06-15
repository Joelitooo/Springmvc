package com.joelito.spring.Service;

import com.joelito.spring.DAL.AguaEntity;
import com.joelito.spring.Repository.AguaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AguaService {
    private final AguaRepository aguaRepository;

    @Autowired
    public AguaService(AguaRepository aguaRepository) {
        this.aguaRepository= aguaRepository;
    }


    public List<AguaEntity> getAguaEntity(){
        return aguaRepository.findAll();
    }



}

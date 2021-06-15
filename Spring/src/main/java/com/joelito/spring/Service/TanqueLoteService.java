package com.joelito.spring.Service;


import com.joelito.spring.DAL.TanqueloteEntity;
import com.joelito.spring.Repository.TanqueLoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TanqueLoteService {

    private final TanqueLoteRepository tanqueLoteRepository;

    @Autowired
    public TanqueLoteService(TanqueLoteRepository tanqueLoteRepository) {
        this.tanqueLoteRepository = tanqueLoteRepository;
    }

    public List<TanqueloteEntity> getTanqueLoteEntity() {
        return tanqueLoteRepository.findAll();
    }
}

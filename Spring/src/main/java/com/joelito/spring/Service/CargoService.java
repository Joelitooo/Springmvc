package com.joelito.spring.Service;


import com.joelito.spring.DAL.CargoEntity;
import com.joelito.spring.Repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {

    private final CargoRepository cargoRepository;
    @Autowired
    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public List<CargoEntity> getCargoEntity(){
        return cargoRepository.findAll();
    }
}

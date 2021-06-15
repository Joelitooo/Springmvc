package com.joelito.spring.Controller;


import com.joelito.spring.DAL.CargoEntity;
import com.joelito.spring.Service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/cargo")
public class CargoController {

    private final CargoService cargoService;

    @Autowired
    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }


    @GetMapping
    public List<CargoEntity> getCargoEntity(){
        return cargoService.getCargoEntity();
    }

}

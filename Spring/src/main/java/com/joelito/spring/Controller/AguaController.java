package com.joelito.spring.Controller;


import com.joelito.spring.DAL.AguaEntity;
import com.joelito.spring.Service.AguaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping(path = "/agua")
public class AguaController {
    private final AguaService aguaService;

    @Autowired
    public AguaController(AguaService aguaService) {
        this.aguaService = aguaService;
    }

    @GetMapping
    public String getAgua(Model model){
        model.addAttribute("messages",aguaService.getAguaEntity());
        model.addAttribute("idagua",aguaService.getAguaEntity().get(0).getIdagua());
        return "AguaView";
    }


    /*public List<AguaEntity> getAguaEntity(){
        return aguaService.getAguaEntity();
    }*/
}

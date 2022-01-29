package com.example.kargo.controller;

import com.example.kargo.entity.Tariff;
import com.example.kargo.service.TariffService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tariffs")
public class TariffController {

    private final TariffService service;

    public TariffController(TariffService service) {
        this.service = service;
    }
    @GetMapping
    public List<Tariff> getTariffs(){
        return service.getTariffs();
    }
    @PostMapping
    public void save(@RequestBody Tariff tariff){
        service.save(tariff);
    }
}

package com.example.kargo.controller;

import com.example.kargo.entity.Service;
import com.example.kargo.service.ServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {

    private final ServiceService service;

    public ServiceController(ServiceService service) {
        this.service = service;
    }
    @GetMapping
    public List<Service> getAllServices(){
        return service.getAllServices();
    }

    @PostMapping
    public void save(@RequestBody Service service1){
        service.save(service1);
    }
}

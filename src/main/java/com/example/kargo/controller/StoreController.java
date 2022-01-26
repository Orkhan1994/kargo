package com.example.kargo.controller;

import com.example.kargo.entity.Store;
import com.example.kargo.service.StoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stories")
public class StoreController {

    private final StoreService service;

    public StoreController(StoreService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Store> getStories(){
       return service.getStories();
    }

    @PostMapping
    public void save(@RequestBody Store store){
        service.save(store);
    }
}

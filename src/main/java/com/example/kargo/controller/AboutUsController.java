package com.example.kargo.controller;

import com.example.kargo.entity.AboutUs;
import com.example.kargo.service.AboutUsService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aboutUs")
public class AboutUsController {

    private final AboutUsService service;

    public AboutUsController(AboutUsService service) {
        this.service = service;
    }

    @GetMapping
    public List<AboutUs> getAboutUs(){
        return  service.getAboutUs();
    }

    @PostMapping
    public void save(@RequestBody AboutUs aboutUs){
        service.save(aboutUs);
    }
}

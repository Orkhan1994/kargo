package com.example.kargo.service.impl;

import com.example.kargo.entity.AboutUs;
import com.example.kargo.repository.AboutUsRepo;
import com.example.kargo.service.AboutUsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutUsServiceImpl implements AboutUsService {

    private final AboutUsRepo usRepo;

    public AboutUsServiceImpl(AboutUsRepo usRepo) {
        this.usRepo = usRepo;
    }

    @Override
    public List<AboutUs> getAboutUs() {
        return usRepo.findAll();
    }

    @Override
    public void save(AboutUs aboutUs) {
        usRepo.save(aboutUs);

    }
}

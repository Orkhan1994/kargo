package com.example.kargo.service;

import com.example.kargo.entity.AboutUs;

import java.util.List;

public interface AboutUsService {

    List<AboutUs> getAboutUs();

    void save(AboutUs aboutUs);
}

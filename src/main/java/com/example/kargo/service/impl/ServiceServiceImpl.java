package com.example.kargo.service.impl;

import com.example.kargo.entity.Service;
import com.example.kargo.repository.ServiceRepo;
import com.example.kargo.service.ServiceService;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

    private  final ServiceRepo repo;

    public ServiceServiceImpl(ServiceRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Service> getAllServices() {
        return repo.findAll();
    }

    @Override
    public void save(Service service) {
        repo.save(service);
    }
}

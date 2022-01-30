package com.example.kargo.service;

import com.example.kargo.entity.Service;

import java.util.List;

public interface ServiceService {

    List<Service> getAllServices();

      void save(Service service);
}

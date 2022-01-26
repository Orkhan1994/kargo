package com.example.kargo.service.impl;

import com.example.kargo.entity.Store;
import com.example.kargo.repository.StoreRepo;
import com.example.kargo.service.StoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    private final StoreRepo storeRepo;

    public StoreServiceImpl(StoreRepo storiesRepo) {
        this.storeRepo = storiesRepo;
    }

    @Override
    public List<Store> getStories() {
        return storeRepo.findAll();
    }

    @Override
    public void save(Store store) {
       storeRepo.save(store);
    }
}

package com.example.kargo.service;

import com.example.kargo.entity.Store;

import java.util.List;

public interface StoreService {

    List<Store> getStories();

    void save(Store store);
}

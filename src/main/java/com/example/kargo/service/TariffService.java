package com.example.kargo.service;

import com.example.kargo.entity.Tariff;

import java.util.List;

public interface TariffService {

    List<Tariff> getTariffs();

    void save(Tariff tariff);
}

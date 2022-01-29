package com.example.kargo.service.impl;

import com.example.kargo.entity.Tariff;
import com.example.kargo.repository.TariffRepo;
import com.example.kargo.service.TariffService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TariffServiceImpl implements TariffService {

    public final TariffRepo repo;

    public TariffServiceImpl(TariffRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Tariff> getTariffs() {
        return repo.findAll();
    }

    @Override
    public void save(Tariff tariff) {
       repo.save(tariff);
    }
}

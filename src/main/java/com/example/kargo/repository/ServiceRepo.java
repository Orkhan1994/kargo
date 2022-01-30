package com.example.kargo.repository;

import com.example.kargo.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepo extends JpaRepository<Service,Long> {
}

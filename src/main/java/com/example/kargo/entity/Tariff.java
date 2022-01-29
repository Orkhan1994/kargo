package com.example.kargo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tariffs")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tariff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "weight")
    private String weight;

    @Column(name = "value")
    private String value;
}

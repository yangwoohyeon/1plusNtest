package com.example.nplus1test.domain.country.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String country;

    @BatchSize(size = 250)
    @OneToMany(mappedBy = "countryEntity")
    private List<CityEntity> cityEntities = new ArrayList<>();

    @BatchSize(size = 250)
    @OneToMany(mappedBy = "countryEntity")
    private List<ReligionEntity> religionEntities = new ArrayList<>();

    public void addCityEntity(CityEntity cityEntity) {
        cityEntities.add(cityEntity);
        cityEntity.setCountryEntity(this);
    }
}

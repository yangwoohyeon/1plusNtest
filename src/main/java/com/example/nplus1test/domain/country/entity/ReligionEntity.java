package com.example.nplus1test.domain.country.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ReligionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String religion;

    @ManyToOne
    private CountryEntity countryEntity;
}

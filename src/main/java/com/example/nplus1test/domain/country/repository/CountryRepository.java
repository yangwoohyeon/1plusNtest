package com.example.nplus1test.domain.country.repository;

import com.example.nplus1test.domain.country.entity.CountryEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<CountryEntity, Long> {

    Optional<CountryEntity> findByCountry(String country);

//    @Query("SELECT co FROM CountryEntity co "+
//            "LEFT JOIN FETCH co.cityEntities ci "+
//            "LEFT JOIN  co.religionEntities re")
//    List<CountryEntity> findAllFetch();
        @Query("SELECT co FROM CountryEntity co "+
                "LEFT JOIN FETCH co.cityEntities ci ")
        List<CountryEntity> findAllFetch(Pageable pageable);
}

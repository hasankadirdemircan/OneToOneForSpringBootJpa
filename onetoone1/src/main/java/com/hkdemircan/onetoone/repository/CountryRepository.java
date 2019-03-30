package com.hkdemircan.onetoone.repository;

import com.hkdemircan.onetoone.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findFirstById(int id);
    List<Country> findAllById(int id);
}

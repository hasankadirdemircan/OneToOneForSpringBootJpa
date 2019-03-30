package com.hkdemircan.onetoone.controller;

import com.hkdemircan.onetoone.model.Country;
import com.hkdemircan.onetoone.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class CountryController {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping("/country/{id}")
    public List<Country> getCountry(@PathVariable("id") int id){
        return countryRepository.findAllById(id);
    }

}

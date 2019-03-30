package com.hkdemircan.onetoone.model;

import javax.persistence.*;

@Entity
@Table(name = "city", catalog = "onetoone")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int country_id;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

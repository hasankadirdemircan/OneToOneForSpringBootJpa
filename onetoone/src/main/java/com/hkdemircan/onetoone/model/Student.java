package com.hkdemircan.onetoone.model;

import javax.persistence.*;

@Entity
@Table(name = "student", catalog = "school")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToOne()
    @JoinColumn(name = "id", referencedColumnName = "student_id")
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

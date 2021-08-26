package com.tnc.repository.shelter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shelter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;

    public Shelter() {
    }

    public Shelter(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public Shelter setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Shelter setName(String name) {
        this.name = name;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Shelter setLocation(String location) {
        this.location = location;
        return this;
    }
}

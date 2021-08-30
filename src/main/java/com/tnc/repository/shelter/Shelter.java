package com.tnc.repository.shelter;

import com.tnc.repository.cat.Cat;
import com.tnc.repository.dog.Dog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Shelter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "shelter_id")
    List<Cat> cats = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "shelter_id")
    List<Dog> dogs = new ArrayList<>();


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

    public List<Cat> getCats() {
        return cats;
    }

    public Shelter setCats(List<Cat> cats) {
        this.cats = cats;
        return this;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public Shelter setDogs(List<Dog> dogs) {
        this.dogs = dogs;
        return this;
    }
}

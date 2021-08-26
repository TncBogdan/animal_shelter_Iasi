package com.tnc.service.animalService;

import com.tnc.repository.animal.Animal;

import java.util.List;

public interface AnimalService {

    Animal findById(Long id);

    List<Animal> findAll();

    Animal add(Animal animal);

    Animal update(Animal animal);

    void deleteById(Long id);
}

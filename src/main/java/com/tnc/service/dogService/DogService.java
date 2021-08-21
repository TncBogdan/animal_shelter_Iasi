package com.tnc.service.dogService;

import com.tnc.repository.dog.Dog;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DogService {

    Dog findById(Long id);

    List<Dog> findAll();

    Dog add(Dog dog);

    Dog update(Dog dog);

    void deleteById(Long id);
}

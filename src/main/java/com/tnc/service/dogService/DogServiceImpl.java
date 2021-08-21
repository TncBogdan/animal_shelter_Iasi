package com.tnc.service.dogService;

import com.tnc.repository.dog.Dog;
import com.tnc.repository.dog.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService{

    private final DogRepository dogRepository;

    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public Dog findById(Long id) {
        return dogRepository.getById(id);
    }

    @Override
    public List<Dog> findAll() {
        return dogRepository.findAll();
    }

    @Override
    public Dog add(Dog dog) {
        return dogRepository.save(dog);
    }

    @Override
    public Dog update(Dog dog) {
        return dogRepository.save(dog);
    }

    @Override
    public void deleteById(Long id) {
        dogRepository.deleteById(id);
    }
}

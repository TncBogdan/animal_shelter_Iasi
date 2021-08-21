package com.tnc.service.catService;

import com.tnc.repository.cat.Cat;

import java.util.List;

public interface CatService {

    Cat findById(Long id);

    List<Cat> findAll();

    Cat add(Cat cat);

    Cat update(Cat cat);

    void deleteById(Long id);
}

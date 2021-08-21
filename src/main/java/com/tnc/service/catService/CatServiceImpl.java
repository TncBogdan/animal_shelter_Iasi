package com.tnc.service.catService;

import com.tnc.repository.cat.Cat;
import com.tnc.repository.cat.CatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImpl implements CatService {

    private final CatRepository catRepository;

    public CatServiceImpl(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @Override
    public Cat findById(Long id) {
        return catRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Cat> findAll() {
        return catRepository.findAll();
    }

    @Override
    public Cat add(Cat cat) {
        return catRepository.save(cat);
    }

    @Override
    public Cat update(Cat cat) {
        return catRepository.save(cat);
    }

    @Override
    public void deleteById(Long id) {
        catRepository.deleteById(id);
    }
}

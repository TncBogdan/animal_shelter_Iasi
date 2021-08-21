package com.tnc.service.shelterService;

import com.tnc.repository.shelter.Shelter;

import java.util.List;

public interface ShelterService {
    Shelter findById(Long id);

    List<Shelter> findAll();

    Shelter add(Shelter shelter);

    Shelter update(Shelter shelter);

    void deleteById(Long id);
}

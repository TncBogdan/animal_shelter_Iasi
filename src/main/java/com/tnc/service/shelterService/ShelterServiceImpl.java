package com.tnc.service.shelterService;

import com.tnc.repository.shelter.Shelter;
import com.tnc.repository.shelter.ShelterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterServiceImpl implements ShelterService {

    private final ShelterRepository shelterRepository;

    public ShelterServiceImpl(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }

    @Override
    public Shelter findById(Long id) {
        return shelterRepository.getById(id);
    }

    @Override
    public List<Shelter> findAll() {
        return shelterRepository.findAll();
    }

    @Override
    public Shelter add(Shelter shelter) {
        return shelterRepository.save(shelter);
    }

    @Override
    public Shelter update(Shelter shelter) {
        return shelterRepository.save(shelter);
    }

    @Override
    public void deleteById(Long id) {
        shelterRepository.deleteById(id);
    }
}

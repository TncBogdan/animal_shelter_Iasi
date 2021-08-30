package com.tnc.service.shelterService;

import com.tnc.repository.cat.Cat;
import com.tnc.repository.shelter.Shelter;
import com.tnc.repository.shelter.ShelterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<Cat> findAllCatByShelter(Long id) {
        Shelter shelter = shelterRepository.getById(id);
        return shelter.getCats();
    }

    public List<Cat> addNewCatToShelter(Long id, Cat cat) {
        Shelter shelter = shelterRepository.getById(id);
        shelter.getCats().add(cat);
        shelterRepository.save(shelter);
        return shelter.getCats();
    }

    public Cat updateCat(Long id, Long catId, Cat cat) {
        var shelter = shelterRepository.getById(id);

        List<Cat> newCat = shelter.getCats().stream().map(c -> {
            if (c.getId().equals(catId)) {
                cat.setId(catId);
                return cat;
            }
            return c;
        }).collect(Collectors.toList());
        shelter.setCats(newCat);
        shelterRepository.save(shelter);
        return cat;
    }

    public void deleteCatInShelter(Long shelterId, Long catId) {

        var shelter = shelterRepository.getById(shelterId);

        boolean remove = shelter.getCats().removeIf(
                c-> c.getId().equals(catId));

        shelterRepository.save(shelter);

        if (!remove){
            throw new RuntimeException("Already deleted or entity missing. ");
        }
    }
}

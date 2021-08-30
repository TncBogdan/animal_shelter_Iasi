package com.tnc.service.adapters;

import com.tnc.repository.animal.Animal;
import com.tnc.service.dto.AnimalDTO;

import java.util.ArrayList;
import java.util.List;

public class AnimalAdapter {

    public static Animal toAnimal(AnimalDTO animalDTO) {
        return new Animal().setName(animalDTO.getName())
                .setPhoto(animalDTO.getPhoto());
    }

    public static AnimalDTO toDTO(Animal animal) {
        return new AnimalDTO(animal.getId(), animal.getName(), animal.getPhoto());
    }

    public static List<AnimalDTO> toDTOList(List<Animal> animals) {
        List<AnimalDTO> dtoList = new ArrayList<>();
        animals.forEach(animal -> dtoList.add(toDTO(animal)));
        return dtoList;
    }
}

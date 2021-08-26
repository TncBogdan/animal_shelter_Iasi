package com.tnc.service.adapters;

import com.tnc.repository.animal.Animal;
import com.tnc.service.dto.AnimalDTO;

public class AnimalAdapter {

    public static Animal toAnimal(AnimalDTO animalDTO) {
        return new Animal().setName(animalDTO.getName())
                .setPhoto(animalDTO.getPhoto());

    }

    public static AnimalDTO toAnimalDTO(Animal animal) {
        return new AnimalDTO(animal.getId(), animal.getName(), animal.getPhoto());
    }
}

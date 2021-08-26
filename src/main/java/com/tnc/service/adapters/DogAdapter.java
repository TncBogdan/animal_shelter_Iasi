package com.tnc.service.adapters;

import com.tnc.repository.dog.Dog;
import com.tnc.service.dto.DogDTO;

import java.util.ArrayList;
import java.util.List;

public class DogAdapter {

    public static Dog toDog(DogDTO dogDTO){
        return (Dog) new Dog().setName(dogDTO.getName()).setPhoto(dogDTO.getPhoto());
    }

    public static DogDTO toDto(Dog dog){
        return new DogDTO(dog.getId(), dog.getName(), dog.getPhoto());
    }

    public static List<DogDTO>dogDTOList(List<Dog>dogs){
        var dogList = new ArrayList<DogDTO>();
        dogs.forEach(dog -> dogList.add(toDto(dog)));
        return dogList;
    }
}

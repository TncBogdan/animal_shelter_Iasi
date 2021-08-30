package com.tnc.service.adapters;

import com.tnc.repository.cat.Cat;
import com.tnc.service.dto.CatDTO;

import java.util.ArrayList;
import java.util.List;

public class CatAdapter {

    public static Cat toCat(CatDTO catDTO) {
        return (Cat) new Cat().setName(catDTO.getName())
                .setPhoto(catDTO.getPhoto());
    }

    public static CatDTO toDTO(Cat cat) {
        return new CatDTO(cat.getId(), cat.getName(), cat.getPhoto());
    }

    public static List<CatDTO> catDTOList(List<Cat> cats) {
        List<CatDTO> catDTOS = new ArrayList<>();
        cats.forEach(cat -> catDTOS.add(toDTO(cat)));
        return catDTOS;
    }

}



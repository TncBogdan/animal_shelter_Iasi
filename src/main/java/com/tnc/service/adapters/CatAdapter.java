package com.tnc.service.adapters;

import com.tnc.repository.cat.Cat;
import com.tnc.service.dto.CatDTO;

public class CatAdapter {

    public static Cat toCat(CatDTO catDTO) {
        return (Cat) new Cat().setName(catDTO.getName())
                .setPhoto(catDTO.getPhoto());

    }

    public static CatDTO toCatDTO(Cat cat){
        return new CatDTO(cat.getId(), cat.getName(), cat.getPhoto());
    }

}



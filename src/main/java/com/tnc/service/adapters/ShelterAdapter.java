package com.tnc.service.adapters;

import com.tnc.repository.shelter.Shelter;
import com.tnc.service.dto.ShelterDTO;

import java.util.ArrayList;
import java.util.List;

public class ShelterAdapter {

    public static Shelter toShelter(ShelterDTO shelterDTO){
        return new Shelter().setId(shelterDTO.getId()).setName(shelterDTO.getName()).setLocation(shelterDTO.getLocation());
    }

    public static ShelterDTO toDto(Shelter shelter){
        return new ShelterDTO(shelter.getId(), shelter.getName(), shelter.getLocation());
    }

    public static List<ShelterDTO> toDtoList(List<Shelter>shelters){
        var shelterDto = new ArrayList<ShelterDTO>();
        shelters.forEach(shelter -> shelterDto.add(toDto(shelter)));
        return shelterDto;
    }
}

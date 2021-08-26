package com.tnc.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DogDTO {

    private Long id;
    private String name;
    private String photo;

}

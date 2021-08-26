package com.tnc.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
public class AnimalDTO {

    private Long id;
    private String name;
    private String photo;
}

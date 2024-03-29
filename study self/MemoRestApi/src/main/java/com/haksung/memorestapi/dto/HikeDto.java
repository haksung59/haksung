package com.haksung.memorestapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class HikeDto {

    private String name;
    private int id;
    private float distance;
    private float difficulty;
    private List<ObservationDto> observations;

}

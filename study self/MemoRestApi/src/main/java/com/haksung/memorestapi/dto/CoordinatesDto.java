package com.haksung.memorestapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CoordinatesDto {

//    @JsonIgnore
//    private int id;

    private double longitude;

    private double latitude;

}

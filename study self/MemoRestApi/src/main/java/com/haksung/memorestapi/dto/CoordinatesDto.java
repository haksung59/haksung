package com.haksung.memorestapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CoordinatesDto {

    @JsonIgnore
    int id;

    double longitude;

    double latitude;

}

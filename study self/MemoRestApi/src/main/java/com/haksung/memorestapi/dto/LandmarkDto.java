package com.haksung.memorestapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LandmarkDto {

    String name;
    String category;
    String city;
    String state;
    int id;
    @JsonProperty("isFeatured")
    boolean isFeatured;
    @JsonProperty("isFavorite")
    boolean isFavorite;
    String park;
    CoordinatesDto coordinates;
    String description;
    String imageName;

}

package com.haksung.memorestapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LandmarkDto {

    private String name;
    private String category;
    private String city;
    private String state;
    private int id;
    @JsonProperty("isFeatured")
    private boolean isFeatured;
    @JsonProperty("isFavorite")
    private boolean isFavorite;
    private String park;
    private CoordinatesDto coordinates;
    private String description;
    private String imageName;

}

package com.haksung.memorestapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class ObservationDto {

    @JsonIgnore
    private int seq;
    private double[] elevation;
    private double[] pace;
    private double[] heartRate;
    private int distanceFromStart;

    @JsonIgnore
    private double elevation1;
    @JsonIgnore
    private double elevation2;

    public void setElevation(double[] elevation) {
        this.elevation = elevation;
        this.elevation1 = elevation[0];
        this.elevation2 = elevation[1];
    }

    @JsonIgnore
    private double pace1;
    @JsonIgnore
    private double pace2;

    public void setPace(double[] pace) {
        this.pace = pace;
        this.pace1 = pace[0];
        this.pace2 = pace[1];
    }

    @JsonIgnore
    private double heartRate1;
    @JsonIgnore
    private double heartRate2;

    public void setHeartRate(double[] heartRate) {
        this.heartRate = heartRate;
        this.heartRate1 = heartRate[0];
        this.heartRate2 = heartRate[1];
    }

}

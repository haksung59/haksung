package com.haksung.memorestapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class ObservationDto {

    @JsonIgnore
    private int seq;
    private double[] elevation = new double[2];
    public void setElevation(double[] elevation){
        this.elevation = elevation;
        this.elevation1 = elevation[0];
        this.elevation2 = elevation[1];
    }
    private double[] pace = new double[2];
    public void setPace(double[] pace){
        this.pace = pace;
        this.pace1 = pace[0];
        this.pace2 = pace[1];
    }
    private double[] heartRate = new double[2];
    public void setHeartRate(double[] heartRate){
        this.heartRate = heartRate;
        this.heartRate1 = heartRate[0];
        this.heartRate2 = heartRate[1];
    }
    private float distanceFromStart;

    @JsonIgnore
    private double elevation1;
    public void setElevation1(double elevation1){
        this.elevation1 = elevation1;
        this.elevation[0] = elevation1;
    }
    @JsonIgnore
    private double elevation2;
    public void setElevation2(double elevation2){
        this.elevation2 = elevation2;
        this.elevation[1] = elevation2;
    }

    @JsonIgnore
    private double pace1;
    public void setPace1(double pace1){
        this.pace1 = pace1;
        this.pace[0] = pace1;
    }
    @JsonIgnore
    private double pace2;
    public void setPace2(double pace2) {
        this.pace2 = pace2;
        this.pace[1] = pace2;
    }

    @JsonIgnore
    private double heartRate1;
    public void setHeartRate1(double heartRate1){
        this.heartRate1 = heartRate1;
        this.heartRate[0] = heartRate1;
    }
    @JsonIgnore
    private double heartRate2;
    public void setHeartRate2(double heartRate2) {
        this.heartRate2 = heartRate2;
        this.heartRate[1] = heartRate2;
    }

}

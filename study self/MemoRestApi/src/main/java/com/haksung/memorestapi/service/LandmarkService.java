package com.haksung.memorestapi.service;

import com.haksung.memorestapi.dto.LandmarkDto;
import com.haksung.memorestapi.mapper.LandmarkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandmarkService {

    @Autowired
    private LandmarkMapper mapper;

    public String postLandmark(LandmarkDto request) {

        try {
            mapper.postLandmark(request);
            request.getCoordinates().setId(request.getId());
            mapper.postCoordinate(request.getCoordinates());
            return "success";
        }catch (Exception e){
            return e.getMessage();
        }

    }

    public String postLandmarkList(List<LandmarkDto> requestList) {

        try {
            for(LandmarkDto request : requestList) {
                mapper.postLandmark(request);
                request.getCoordinates().setId(request.getId());
                mapper.postCoordinate(request.getCoordinates());
            }
            return "success";
        }catch (Exception e){
            return e.getMessage();
        }

    }

    public List<LandmarkDto> getLandmarks() {
        List<LandmarkDto> response;

        try {
            response = mapper.getLandmarks();
        }catch(Exception e){
            return null;
        }

        return response;
    }

    public String putLandmark(LandmarkDto request){
        try {
            mapper.putLandmark(request);
            return "success";
        }catch (Exception e){
            return e.getMessage();
        }
    }

}

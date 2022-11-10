package com.haksung.memorestapi.service;

import com.haksung.memorestapi.dto.HikeDto;
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
            return "success";
        }catch (Exception e){
            return e.getMessage();
        }

    }

    public String postLandmarkList(List<LandmarkDto> requestList) {

        try {
            for(LandmarkDto request : requestList) {
                mapper.postLandmark(request);
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

    public String postHike(HikeDto request){
        try {
            for(int i=0; i<request.getObservations().size(); i++){
                request.getObservations().get(i).setSeq(i+1);
            }
            mapper.postHike(request);
            return "success";
        }catch (Exception e) {
            return e.getMessage();
        }
    }

    public String postHikeList(List<HikeDto> request){
        try {
            for (HikeDto hike : request) {
                postHike(hike);
            }
            return "success";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    public List<HikeDto> getHikes() {
        List<HikeDto> response;

        try {
            response = mapper.getHikes();
        }catch (Exception e){
            System.out.println(e.getMessage());
            response = null;
        }

        return response;
    }

}

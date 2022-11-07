package com.haksung.memorestapi.controller;

import com.haksung.memorestapi.dto.LandmarkDto;
import com.haksung.memorestapi.service.LandmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LandmarkController {

    @Autowired
    public LandmarkService service;

    @PostMapping("/landmark")
    String postLandmark(@RequestBody LandmarkDto request){ return service.postLandmark(request); }

    @PostMapping("/landmarks")
    String postLandmarkList(@RequestBody List<LandmarkDto> request){ return service.postLandmarkList(request); }

    @GetMapping("/landmarks")
    List<LandmarkDto> getLandmarks() { return service.getLandmarks(); }

}

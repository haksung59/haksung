package com.haksung.memorestapi.mapper;

import com.haksung.memorestapi.dto.CoordinatesDto;
import com.haksung.memorestapi.dto.LandmarkDto;
import com.haksung.memorestapi.dto.MemoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LandmarkMapper {

    void postLandmark(LandmarkDto request);
    void postCoordinate(CoordinatesDto request);

    List<LandmarkDto> getLandmarks();

}

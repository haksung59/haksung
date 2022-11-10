package com.haksung.memorestapi.mapper;

import com.haksung.memorestapi.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LandmarkMapper {

    void postLandmark(LandmarkDto request);

    List<LandmarkDto> getLandmarks();

    void putLandmark(LandmarkDto request);

    void postHike(HikeDto request);

}

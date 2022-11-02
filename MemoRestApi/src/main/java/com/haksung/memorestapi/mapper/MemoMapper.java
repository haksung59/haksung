package com.haksung.memorestapi.mapper;

import com.haksung.memorestapi.dto.MemoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoMapper {

    List<MemoDto> getMemo();

}

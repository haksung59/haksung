package com.haksung.memorestapi.service;

import com.haksung.memorestapi.dto.MemoDto;
import com.haksung.memorestapi.mapper.MemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoService {

    @Autowired
    private MemoMapper mapper;

    public List<MemoDto> getMemo(){
        return mapper.getMemo();
    }

}

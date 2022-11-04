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

    public MemoDto getMemoDetail(int id){
        return mapper.getMemoDetail(id);
    }

    public String postMemo(MemoDto memo) {
        try {
            mapper.postMemo(memo);
            return "success";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    public String putMemo(MemoDto memo){
        try {
            mapper.putMemo(memo);
            return "update success";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    public String deleteMemo(MemoDto memo){
        try{
            mapper.deleteMemo(memo);
            return "delete success";
        }catch (Exception e){
            return e.getMessage();
        }
    }

}

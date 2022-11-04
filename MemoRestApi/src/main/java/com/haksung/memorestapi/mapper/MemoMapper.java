package com.haksung.memorestapi.mapper;

import com.haksung.memorestapi.dto.MemoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoMapper {

    List<MemoDto> getMemo();

    MemoDto getMemoDetail(int id);

    void postMemo(MemoDto memo);

    void putMemo(MemoDto memo);

    void deleteMemo(MemoDto memo);

}

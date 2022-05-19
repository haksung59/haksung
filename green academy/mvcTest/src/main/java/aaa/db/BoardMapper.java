package aaa.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardVO;

@Mapper
public interface BoardMapper {
	
	List<BoardVO> bblist();

}

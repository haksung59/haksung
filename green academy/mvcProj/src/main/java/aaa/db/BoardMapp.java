package aaa.db;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardVO;
import aaa.model.BoardVOList;
import aaa.model.PageInfo;

@Mapper
public interface BoardMapp {

	List<BoardVO> bblist(PageInfo pageInfo);
	
	int bbTotal();
	
	List<BoardVO> bblist2(BoardVO vo);
	
	void addCount(BoardVO vo);
	
	BoardVO bbDetail(BoardVO vo);
	
	int bbInsert(BoardVO vo);
	int bbInsert2(BoardVO vo);
	
	int bbmodify(BoardVO vo);
	
	int bbdelete(BoardVO vo);
	
	int bbInsertList(BoardVOList vo);
}
